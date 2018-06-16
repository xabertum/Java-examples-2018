package Condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
	
	int sueldo;
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Introduce el sueldo: ");
	sueldo = scanner.nextInt();
	
	if (sueldo > 3000) {
	    System.out.println("El sueldo es mayor de 3000");
	} else {
	    System.out.println("El sueldo es menor de 3000");
	}
	
	

    }

}
