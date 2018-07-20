package Constructor26;

import java.util.Scanner;

public class Problema1 {

    private Scanner scanner;
    private int[] sueldos;
    
    
    public Problema1 () {

	scanner = new Scanner(System.in);
	sueldos = new int[5];
	for (int i = 0; i < sueldos.length; i++) {
	    System.out.println("Ingrese valor: ");
	    sueldos[i] = scanner.nextInt();
	}
	
    }
    
    
    public void imprimir () {
	for (int i = 0; i < sueldos.length; i++) {
	    System.out.print(sueldos[i] + "-");
	}
    }
    
    
    
    public static void main(String[] args) {
	Problema1 problema1 = new Problema1();
	problema1.imprimir();

    }

}
