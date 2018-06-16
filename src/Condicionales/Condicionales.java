package Condicionales;

import java.util.Scanner;


public class Condicionales {

    
    public static void sueldo() {
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
    
    
    public static void mayorDeDos() {
	
	int num1, num2;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("introduce el numero 1");
	num1 = scanner.nextInt();
	
	System.out.println("introduce el numero 2");
	num2 = scanner.nextInt();
	
	if (num1 > num2) System.out.println("El numero mayor es: " + num1);
	else {
	    System.out.println("El numero mayor es: " + num2);
	}
    }
    
    public static void numeroDigitos() {
	
	int num;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("introduce el numero: ");
	num = scanner.nextInt();
	
	if (num < 10) System.out.println("El numero tiene un digito ");
	else System.out.println("El numero tiene mas de un digito");
	
    }
    
    public static void numeroDigitosDivisiones () {
	
	int num, digitos = 0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("introduce el numero: ");
	num = scanner.nextInt();
	
	while (num !=0) {
	    
	    num = num / 10;
	    digitos++;
	    	    
	}
	
	System.out.println("El numero tiene " + digitos + " digitos");
	
		
    }
    
    public static void numeroDigitosString() {
	
	int num;
	String string;
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("introduce el numero: ");
	num = scanner.nextInt();
	
	string = Integer.toString(num);
	
	System.out.println("El numero de digitos es: " + string.length());
		
		
    }
    
    public static void sueldoAntiguedad() {
	
	float sueldo, antiguedad;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Introduce el sueldo: ");
	sueldo = scanner.nextFloat();
	
	System.out.println("Introduce la antiguedad: ");
	antiguedad = scanner.nextFloat();
	
	if ( sueldo < 500 && antiguedad > 10) {
	    	    
	    float sueldoAntiguedad = (float) (sueldo + (sueldo * 0.2));	    
	    System.out.println("Aumento del 20%, el sueldo actual es: " + sueldoAntiguedad);
	    
	} else if (sueldo < 500 && antiguedad < 10) {
	    
	    float sueldoAntiguedad = (float) (sueldo + (sueldo*0.05));
	    System.out.println("Aumento del 5%, el sueldo actual es: " + sueldoAntiguedad);
	    
	} else if (sueldo > 500) {
	    System.out.println("Ya cobras mas de 500... :-(");
	    
	}
	
	
    }
    
    
    
    public static void main(String[] args) {
	
	sueldoAntiguedad();
	

    }

}
