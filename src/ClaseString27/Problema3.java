package ClaseString27;

import java.util.Scanner;

public class Problema3 {

    private Scanner scanner;
    private String clave;
    private String claveMaestra = "123abc";
    
    public void cargarClave() {
	scanner = new Scanner(System.in);
	System.out.println("Introduce la clave");
	clave = scanner.nextLine();	
    }
    
    public void comprobarClave () {
	
	if (clave.contentEquals(claveMaestra)) {
	    System.out.println("ok");
	} else {
	    System.out.println("NO");
	}	
    }
    
    public void compareTo() {
	if (clave.compareTo(claveMaestra) == 0) {
	    System.out.println("ok");
	} else {
	    System.out.println("no");
	}
    }
    
    
    public static void main(String[] args) {
	Problema3 problema3 = new Problema3();
	problema3.cargarClave();
	problema3.comprobarClave();
	System.out.println();
	problema3.compareTo();

    }

}
