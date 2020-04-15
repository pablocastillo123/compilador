package Compi;

import java.util.Hashtable;

public class TableSimbol {
	
	public Hashtable<String,String> table_simbol = new Hashtable<String,String>();
	
	public  TableSimbol() {
		table_simbol.put("Inicio.", "iniciador de programa");
		table_simbol.put("Fin.","fin de programa");
		table_simbol.put("+","operador de suma");
		table_simbol.put("-","operador de resta");
		table_simbol.put("*","operador de multiplicacion");
		table_simbol.put("/","operador de divicion");
		
		table_simbol.put("Ent","palabra reservada");
		table_simbol.put("Real","palabra reservada");
		table_simbol.put("if","palabra reservada");
		table_simbol.put("else","palabra reservada");
		table_simbol.put("while","palabra reservada");
		table_simbol.put("for","palabra reservada");
		table_simbol.put("var","palabra reservada");
		
		table_simbol.put("$","fin de sentencia");
		table_simbol.put("(","parentesis izquierdo");
		table_simbol.put(")","parentesis derecho");
		table_simbol.put(":","asignacion");
		table_simbol.put(",","separador");
		table_simbol.put("=","asignacion de tipo de dato");
		
		table_simbol.put("!","Signo de admiracion");
		table_simbol.put("\"","Comillas dobles , comillas altas o inglesas");
		table_simbol.put("#","Signo numeral o almohadilla");
		table_simbol.put("%","Signo de porcentaje - por ciento");
		table_simbol.put("&","Y - ampersand - et latina");
		table_simbol.put("'","Comillas simples, apóstrofe");
		table_simbol.put(".","Punto");
		table_simbol.put("<","Menor que");
		table_simbol.put(">","Mayor que");
		table_simbol.put("?","Cierra signo interrogación");
		table_simbol.put("@","Arroba");
		table_simbol.put("[","Abre corchetes");
		table_simbol.put("\\","Barra invertida , contrabarra , barra inversa");
		table_simbol.put("]","Cierra corchetes");
		table_simbol.put("^","Intercalación - acento circunflejo");
		table_simbol.put("_","Guión bajo , subrayado , subguión");
		table_simbol.put("`","Acento grave");
		table_simbol.put("{","Abre llave curva - llaves curvas");
		table_simbol.put("|","Barra vertical, pleca , linea vertical");
		table_simbol.put("}","Cierra llave - llaves curvas");
		table_simbol.put("~","Signo de equivalencia , tilde o virgulilla de la ñ");
		
	}
	
	public Hashtable getTableSimbol() {
		return this.table_simbol;
	}
}
