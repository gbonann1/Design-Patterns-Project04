package wordCount.dsForStrings;

public class Node implements Cloneable {
	
	private String str;
	private int count;
	
	public Node(){
		count = 1;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public String getStr(){
		return str;
	}
	
	public int getCount(){
		return count;
	}
	
	public void incCount(){
		count++;
	}
	
	public void setStr(String strIn){
		str = strIn;
	}
	

}
