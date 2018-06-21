package Vectores;

import java.util.Scanner;

public class Problema5_MayorMenor {

    private Scanner scanner;
    private float[] sueldos;
    private String[] nombres;
    
    public void inicializarVector() {
	scanner = new Scanner(System.in);
	sueldos = new float[5];
	nombres = new String[5];
	
	for (int i = 0; i < nombres.length; i++) {
	    System.out.println("Ingrese el nombre del empleado: ");
	    nombres[i] = scanner.next();
	    System.out.println("Ingrese el sueldo: ");
	    sueldos[i] = scanner.nextFloat();
	}	
    }
    
    public void MayorSueldo() {
	float mayor = sueldos[0];
	int posicion = 0;
	
	for (int i = 0; i < nombres.length; i++) {
	    if (sueldos[i] > mayor) {
		mayor = sueldos[i];
		posicion = i;
	    }	    
	}
	
	System.out.println("El empleado con mayor sueldo es: " + nombres[posicion]);
	System.out.println("Tiene un sueldo: " + mayor);
	
    }
    
    
    
    public static void main(String[] args) {
	
	Problema5_MayorMenor problema5_MayorMenor = new Problema5_MayorMenor();
	problema5_MayorMenor.inicializarVector();
	problema5_MayorMenor.MayorSueldo();	

    }

}
