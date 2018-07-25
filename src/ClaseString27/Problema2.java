package ClaseString27;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.Scanner;

public class Problema2 {

    private Scanner scanner;
    private String mail;
    
    /**
     * Constructor
     */
    public Problema2 () {
	scanner = new Scanner(System.in);
	
	System.out.println("Ingrese la direccion: ");
	mail = scanner.nextLine();
		
	
    }
    
    public void comprobarArroba () {
	boolean tieneArroba = false;
	for (int i = 0; i < mail.length(); i++) {
	    if (mail.charAt(i) == '@') tieneArroba = true;
	}
	
	if (tieneArroba) System.out.println("la direccion contiene la arroba.");
	else System.out.println("No hay arroba");
	
    }
    
    
    public static void main(String[] args) {
	Problema2 problema2 = new Problema2();
	problema2.comprobarArroba();
	

    }

}
