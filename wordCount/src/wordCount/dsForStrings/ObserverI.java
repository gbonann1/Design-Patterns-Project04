package wordCount.dsForStrings;

import java.util.HashMap;

public interface ObserverI {
	public void update(Node nodeIn);
	public HashMap<String, Node> getMap();
	
}
