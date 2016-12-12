package wordCount.util;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;


public class FileProcessor{
	private FileReader input = null;
	private BufferedReader buffer = null;
	private FileWriter output = null;
	
	
	public FileProcessor(URL inputUrl, URL outputUrl) {
		try {
				input = new FileReader(inputUrl.getPath());
				buffer = new BufferedReader(input);	
				output = new FileWriter(outputUrl.getPath());
		}
		
		catch (IOException e) {
			System.out.println("File not found");
			System.exit(0);
		}
		catch (NullPointerException e){
			System.out.println("File not found");
			System.exit(0);
		}
		
	}
	
	public String readLine() {
		String thisLine = null;
		try {
			thisLine = buffer.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return thisLine;
	}
	
	public void writeLine(String line) {
		try {
			output.write(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void clean(){
		if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		if (buffer != null){
				try {
					buffer.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
		}
		if (output != null){
				try {
					output.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}
}
