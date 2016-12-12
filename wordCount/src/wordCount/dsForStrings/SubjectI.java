package wordCount.dsForStrings;

import java.util.HashMap;

public interface SubjectI {
	public void registerObserver(ObserverI b);
	public void removeObserver();
	public void notifyObservers();
	public HashMap<String, Node> getMap();
	public void insert(Node newNode);
	public void incAll();
}
