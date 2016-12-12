package wordCount.visitors;

import wordCount.dsForStrings.Backup;
import wordCount.dsForStrings.Node;
import wordCount.dsForStrings.ObserverI;
import wordCount.dsForStrings.SubjectI;
import wordCount.util.FileProcessor;

public class CloneAndObserveVisitor implements Visitor{

	
	public void visit(SubjectI o, FileProcessor fp) {
		ObserverI backup = new Backup();
		o.registerObserver(backup);
		o.notifyObservers();
		
		int numWords = 0;
		int numDistinct = 0;
		int numChars = 0;
		for (Node value : backup.getMap().values()){
			numDistinct++;
			numWords += value.getCount();
			numChars += value.getCount() * value.getStr().length();
		}
		System.out.print("BACKUP: Number of words:" + numWords + '\n');
		System.out.print("BACKUP: Number of distinct words:" + numDistinct + '\n');
		System.out.print("BACKUP: Number of characters:" + numChars + '\n');
	}
	
}
