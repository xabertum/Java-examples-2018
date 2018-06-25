package Vectores;

import java.util.Scanner;

public class Problema7_ordenar {

    private Scanner scanner;
    private int[] vector;

    public void inicializarVector() {
	scanner = new Scanner(System.in);
	int tamano;

	System.out.println("Tamaño del vector: ");
	tamano = scanner.nextInt();
	vector = new int[tamano];

	for (int i = 0; i < vector.length; i++) {
	    System.out.println("introduce la posicion " + i + ":");
	    vector[i] = scanner.nextInt();
	}
    }

    public void ordenarVector() {
	for (int i = 0; i < vector.length; i++) {
	    for (int j = 0; j < vector.length - i; j++) {
		if (vector[j] > vector[j + 1]) {
		    int aux = vector[j];
		    vector[j] = vector[j + 1];
		    vector[j + 1] = aux;
		}
	    }
	}
    }
    
    public void imprimirVector() {
	System.out.println("El vector ordenado de menor a mayor: ");
	for (int i = 0; i < vector.length; i++) {
	    System.out.println(vector[i]);
	}	
    }
    

    public static void main(String[] args) {
	Problema7_ordenar pOrdenar = new Problema7_ordenar();
	pOrdenar.inicializarVector();
	pOrdenar.ordenarVector();
	pOrdenar.imprimirVector();

    }

}
