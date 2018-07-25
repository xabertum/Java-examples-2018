package ClaseString27;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String cadena1;
	String cadena2;

	System.out.println("ingrese la primera cadena: ");
	cadena1 = scanner.nextLine();

	System.out.println("ingrese la segunda cadena: ");
	cadena2 = scanner.nextLine();
	
	scanner.close();

	if (cadena1.equals(cadena2) == true)
	    System.out.println("equals  true");
	else
	    System.out.println("equals false");

	if (cadena1.compareTo(cadena2) == 0)
	    System.out.println("compare to == 0");
	else if (cadena1.compareTo(cadena2) > 0)
	    System.out.println("compare to > 0");
	else {
	    System.out.println("compare to < 0");
	}

    }

}
