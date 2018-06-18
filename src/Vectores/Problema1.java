package Vectores;

import java.util.Scanner;

public class Problema1 {

    private Scanner scanner;
    private int [] sueldos;
    
    public void inicializarVector() {
	scanner = new Scanner(System.in);
	sueldos = new int[5];
	
	for (int i = 0; i < sueldos.length; i++) {
	    System.out.println("ingrese el sueldo : " + i );
	    sueldos[i] = scanner.nextInt();
	}
	
    }
    
    public void imprimir () {
	for (int i = 0; i < sueldos.length; i++) {
	    System.out.println("El sueldo es: " + sueldos[i]);
	}
    }
    
    
    public static void main(String[] args) {
	Problema1 problema1 = new Problema1();
	problema1.inicializarVector();
	problema1.imprimir();

    }

}
