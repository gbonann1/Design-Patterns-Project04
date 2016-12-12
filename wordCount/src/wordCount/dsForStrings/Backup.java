package wordCount.dsForStrings;

import java.util.HashMap;

public class Backup implements ObserverI {
	
	private HashMap<String, Node> m;
	
	public Backup(){
		m = new HashMap<String, Node>();
	}
	
	public void update(Node nodeIn){
		String key = nodeIn.getStr();
		if (m.containsKey(key)){
			m.get(key).incCount();
		}
		else{
			m.put(key, nodeIn);
		}
	}
	
	public HashMap<String, Node> getMap(){
		return m;
	}
	
}
