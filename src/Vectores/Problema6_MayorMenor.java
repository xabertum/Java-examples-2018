package Vectores;

import java.util.Scanner;

public class Problema6_MayorMenor {

    private Scanner scanner;
    private int numElementos;
    private int[] vector;

    public void inicializarVector() {

	scanner = new Scanner(System.in);
	System.out.println("Cuantos elementos tendrá el vector: ");
	numElementos = scanner.nextInt();
	vector = new int[numElementos];

	for (int i = 0; i < vector.length; i++) {
	    System.out.println("Valor de la posición " + i + " :");
	    vector[i] = scanner.nextInt();
	}
    }

    public int menorValor() {

	int menor = vector[0];
	for (int i = 0; i < vector.length; i++) {

	    if (vector[i] < menor) {
		menor = vector[i];
	    }
	}

	return menor;
    }

    public boolean seRepite() {
	
	boolean seRepite = false;

	for (int i = 0; i < vector.length; i++) {
	    for (int j = i + 1; j < vector.length; j++) {

		if (vector[i] == vector[j])
		    seRepite = true;
	    }
	}

	return seRepite;
    }

    public static void main(String[] args) {

	Problema6_MayorMenor problema6_MayorMenor = new Problema6_MayorMenor();
	problema6_MayorMenor.inicializarVector();
	System.out.println("El menor valor es: " + problema6_MayorMenor.menorValor());
	System.out.println("Se repiten valores: " + problema6_MayorMenor.seRepite());

    }

}
