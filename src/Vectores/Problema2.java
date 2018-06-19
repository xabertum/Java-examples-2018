package Vectores;

import java.util.Scanner;

public class Problema2 {

    private Scanner scanner;
    private float[] altura;
    private float promedio;
    
    
    public void inicializarVector() {
	scanner = new Scanner(System.in);
	altura = new float[5];
	
	for (int i = 0; i < altura.length; i++) {
	    System.out.println("Introduce la altura " + i + ":" );
	    altura[i] = scanner.nextFloat();
	}	
    }
    
    public void media() {
	float suma = 0;	
	for (int i = 0; i < altura.length; i++) {
	   suma += altura[i];	   
	}
	
	promedio = suma/altura.length;
	
	System.out.println("La altura promedio es: " + promedio);
    }
    
    public void MayoresMenores () {
	int mayor = 0;
	int menor = 0;
	
	for (int i = 0; i < altura.length; i++) {
	    if (altura[i] > promedio) mayor++;
	    else menor++;
	}
	
	System.out.println("Mayores que el promedio: " + mayor);
	System.out.println("Menores que el promedio: " + menor);	
    }
    
    
    
    public static void main(String[] args) {
	Problema2 problema2 = new Problema2();
	problema2.inicializarVector();
	problema2.media();
	problema2.MayoresMenores();	

    }

}
