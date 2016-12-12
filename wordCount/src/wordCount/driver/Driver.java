package wordCount.driver;

import java.net.URL;

import wordCount.dsForStrings.Original;
import wordCount.dsForStrings.SubjectI;
import wordCount.util.FileProcessor;
import wordCount.visitors.CloneAndObserveVisitor;
import wordCount.visitors.PopulateVisitor;
import wordCount.visitors.Visitor;
import wordCount.visitors.WordCountVisitor;

public class Driver {

	public static void main(String[] args){
		
		String inputPath = null;
		String outputPath = null;
		int numIterations = 0;
		try {
			inputPath = args[0];
			outputPath = args[1];
			numIterations = Integer.valueOf(args[2]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide 3 arguments");
			System.exit(0);
		}
		
		URL inputUrl = Driver.class.getClassLoader().getResource(inputPath);
		URL outputUrl = Driver.class.getClassLoader().getResource(outputPath);
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numIterations; i++){
			FileProcessor myFp = new FileProcessor(inputUrl, outputUrl);
			SubjectI first = new Original();
			Visitor v1 = new PopulateVisitor();
			Visitor v2 = new WordCountVisitor();
			v1.visit(first, myFp);
			v2.visit(first, myFp);
			myFp.clean();
		}
		long finishTime = System.currentTimeMillis();
		long totalTime = (finishTime - startTime) / numIterations;
		System.out.println("Total time: " + totalTime);
		
		//Testing backup
		SubjectI test = new Original();
		Visitor v3 = new PopulateVisitor();
		Visitor v4 = new WordCountVisitor();
		outputUrl = Driver.class.getClassLoader().getResource("backupTest.txt");
		FileProcessor myFp2 = new FileProcessor(inputUrl, outputUrl);
		v3.visit(test, myFp2);
		test.incAll();
		v4.visit(test, myFp2);
		
		Visitor v5 = new CloneAndObserveVisitor();
		v5.visit(test, myFp2);
		myFp2.clean();
		
		
	}
}
