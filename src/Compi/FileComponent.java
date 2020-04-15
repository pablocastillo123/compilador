package Compi;

import java.io.*;

public class FileComponent {
	
	public FileWriter fichero;
    public PrintWriter pw;
	
    
    public FileComponent(String name_file) {
    	try {
    		
    		this.fichero = new FileWriter(name_file);
    		this.pw = new PrintWriter(this.fichero);
		
    	} catch (Exception e) {e.printStackTrace();}
    }
    
    public void WriteFile(String text) {
    	this.pw.write("\n"+text);
    }
    
    public void close() {
    	try {
			this.fichero.close();
			this.pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
