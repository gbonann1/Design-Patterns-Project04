package wordCount.visitors;

import wordCount.dsForStrings.Node;
import wordCount.dsForStrings.SubjectI;
import wordCount.util.FileProcessor;

public class PopulateVisitor implements Visitor{

	private FileProcessor myFp;
	
	public void visit(SubjectI o, FileProcessor fp) {
		myFp = fp;
		String thisLine = myFp.readLine();
		while(thisLine != null){
			
			String[] tokens = thisLine.split("\\s+");
			for (int i = 0; i < tokens.length; i++){
				Node newNode = new Node();
				newNode.setStr(tokens[i]);
				if (! tokens[i].equals(""))
					o.insert(newNode);
			}
			thisLine = myFp.readLine();
		
		}
	}
	
}
