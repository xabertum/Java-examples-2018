package Matrices;

import java.util.Scanner;

public class Problema1 {

    private Scanner scanner;
    private int [][] matriz;
    
    public void inicializarMAtriz() {
	
	scanner = new Scanner(System.in);
	System.out.println("Filas de matriz: ");
	int filas = scanner.nextInt();
	
	System.out.println("Columnas de matriz: ");
	int columnas = scanner.nextInt();
	matriz = new int [filas][columnas];
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		System.out.println("Ingrese componente: ");
		matriz [i][j] = scanner.nextInt();
		
	    }
	}
	
    }
    
    public void imprimir() {
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println();
	}	
    }
    
    public void imprimirUltimaFila() {
	for (int i = 0; i < matriz[matriz.length -1].length; i++) {
	    System.out.println(matriz[matriz.length-1][i]);
	}
    }
    
    
    
    
    public static void main(String[] args) {
	Problema1 matriz = new Problema1();
	matriz.inicializarMAtriz();
	matriz.imprimir();
	matriz.imprimirUltimaFila();

    }

}
