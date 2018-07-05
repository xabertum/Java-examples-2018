package Matrices;

import java.util.Scanner;

public class Problema2 {

    private Scanner scanner;
    private int [][] matriz;
    
    
    public void inicializarMatriz() {
	scanner = new Scanner(System.in);
	matriz = new int [4][4];
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz.length; j++) {
		System.out.println("ingrese componente:");
		matriz[i][j] = scanner.nextInt();
	    }
	}	
    }
    
    public void imprimirDiagonalPrincipal () {
	for (int i = 0; i < matriz.length; i++) {
	    System.out.println(matriz[i][i] +  " ");
	}
    }
       
    
    
    public static void main(String[] args) {
	
	Problema2 matriz = new Problema2();
	matriz.inicializarMatriz();
	matriz.imprimirDiagonalPrincipal();

    }

}
