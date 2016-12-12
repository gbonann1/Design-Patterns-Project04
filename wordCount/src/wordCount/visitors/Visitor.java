package wordCount.visitors;

import wordCount.dsForStrings.SubjectI;
import wordCount.util.FileProcessor;

public interface Visitor {
	
	public void visit(SubjectI o, FileProcessor fp);
}
