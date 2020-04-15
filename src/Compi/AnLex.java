package Compi;

import java.io.*;
import java.util.regex.Pattern;
import java.util.*;

public class AnLex {
	
	private String text;
	private ArrayList token = new ArrayList();
	private Hashtable listFinaliz = new Hashtable();
	private String ruta_txt = "C://Users//casf2000//Desktop//token.txt";
	
	public AnLex(String text){
		this.text = text;
	}
	
	public ArrayList generateTokens() {
		StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader(text));
		try {
			while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
				
			    if(streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
			        System.out.println(streamTokenizer.sval);
			        this.token.add(streamTokenizer.sval);
			    
			    } else if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
			        System.out.println(streamTokenizer.nval);
			        this.token.add(streamTokenizer.nval);
			    
			    }else if(streamTokenizer.ttype > 0) {
			    	char ch;
			    	ch =  (char) streamTokenizer.ttype;
			    	System.out.println(ch);
			    	String ch_st = String.valueOf(ch);
			    	this.token.add(ch_st);
			    }
			}
			
		} catch (IOException e) {e.printStackTrace();}
		return this.token;
	}
	
	public Hashtable Compare(ArrayList list_token) {
		TableSimbol tb = new TableSimbol();
		Hashtable htb = tb.getTableSimbol();
		FileComponent fc = new FileComponent(ruta_txt);
		
		System.out.println("-----------Tabla de token-------------\n");
		
		for(int i=0; i<list_token.size(); i++) {
			
			String token_name = list_token.get(i).toString();
			int token_length = list_token.get(i).toString().length();
			String token_type = list_token.get(i).getClass().getTypeName();
			
			boolean clave = htb.containsKey(token_name);
			
			  if(clave) {
				  System.out.println(token_name + "   " + htb.get(token_name));
				  fc.WriteFile(token_name + "   " + htb.get(token_name));
				  listFinaliz.put(token_name, htb.get(token_name));
				  
			  }if(token_type.equalsIgnoreCase("java.lang.Double")) {
				  System.out.println(token_name + "   numero");
				  fc.WriteFile(token_name + "   numero");
				  listFinaliz.put(token_name ,"numero");
				  
			  }if((Pattern.matches("[a-zA-Z]",token_name) && token_length == 1)){
				  System.out.println(token_name + "   identificador");
				  fc.WriteFile(token_name + "   identificador");
				  listFinaliz.put(token_name, "identificador");
				  
			  }if(!clave && token_length > 1 && token_type.equalsIgnoreCase("java.lang.String")) {
				  System.out.println(token_name + "   identificador");
				  fc.WriteFile(token_name + "   identificador");
				  listFinaliz.put(token_name, "identificador");
			  }
		}		
		System.out.println("---------------------------------------\n");
		fc.close();
		return listFinaliz;
	}
}