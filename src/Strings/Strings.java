package Strings;

import java.util.Scanner;

public class Strings {

    public static void problema2() {
	
	int edad1, edad2;
	String nombre1, nombre2;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("introduce el nombre: ");
	nombre1 = scanner.nextLine();
	System.out.println("ingrese la edad: ");
	edad1 = scanner.nextInt();
	
	System.out.println("introduce el nombre2: ");
	scanner.nextLine();
	nombre2 = scanner.nextLine();
	System.out.println("introduce la edad2: ");
	edad2 = scanner.nextInt();
	
	if (edad1 > edad2) System.out.println("EL mayor es: " + nombre1);
	else System.out.println("El mayor es: " + nombre2);
	
    }
    
    
    
    
    public static void main(String[] args) {

	problema2();

    }

}
