package wordCount.visitors;

import wordCount.dsForStrings.Node;
import wordCount.dsForStrings.SubjectI;
import wordCount.util.FileProcessor;

public class WordCountVisitor implements Visitor{

	private FileProcessor myFp;
	
	public void visit(SubjectI o, FileProcessor fp) {
		myFp = fp;
		int numWords = 0;
		int numDistinct = 0;
		int numChars = 0;
		for (Node value : o.getMap().values()){
			numDistinct++;
			numWords += value.getCount();
			numChars += value.getCount() * value.getStr().length();
		}
		myFp.writeLine("Number of words:" + numWords + '\n');
		myFp.writeLine("Number of distinct words:" + numDistinct + '\n');
		myFp.writeLine("Number of characters:" + numChars + '\n');
		
	}
	
}
