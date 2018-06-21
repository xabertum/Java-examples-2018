package Vectores;

import java.util.Scanner;

public class Problema4 {

    private Scanner scanner;
    private int [] vector;
    private int n;
    
    
    public void cargarVector() {
	scanner = new Scanner(System.in);
	System.out.println("Introduce tamaño de vector: ");
	n = scanner.nextInt();
	vector = new int [n];
	
	for (int i = 0; i < vector.length; i++) {
	    System.out.println("Ingrese posicion " + i +": ");
	    vector[i] = scanner.nextInt();
	}
	
    }
    
    public void imprimirVector() {
	for (int i = 0; i < vector.length; i++) {
	    System.out.println("Posicion " + i + ": " + vector[i]);
	}
		
    }
    
    
    public static void main(String[] args) {
	Problema4 problema4 = new Problema4();
	problema4.cargarVector();
	problema4.imprimirVector();

    }

}
