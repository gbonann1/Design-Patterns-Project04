package wordCount.dsForStrings;

import java.util.HashMap;

public class Original implements SubjectI{

	private HashMap<String, Node> m; 
	private ObserverI b;
	
	public Original(){
		m = new HashMap<String, Node>();
	}
	
	public void registerObserver(ObserverI bIn){
		b = bIn;
	}
	
	public void removeObserver(){
		b = null;
	}
	
	public void notifyObservers(){
		for (Node value : m.values()){
			Node temp = null;
			try {
				temp = (Node) value.clone();
			} catch (CloneNotSupportedException e) {
				System.out.println("Clone Error");
			}
			b.update(temp);
		}
	}
	
	public HashMap<String, Node> getMap(){
		return m;
	}
	
	public void insert(Node nodeIn){
		String key = nodeIn.getStr();
		//if key is in m
			//increment the node's count
		if (m.containsKey(key)){
			m.get(key).incCount();
		}
		else{
			m.put(key, nodeIn);
		}
	}
	
	public void incAll(){
		for (Node value : m.values()){
			value.incCount();
		}
	}
	
	
}
