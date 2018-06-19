package Vectores;

import java.util.Scanner;

public class Problema3 {

    private Scanner scanner;
    private float[] turnoManana;
    private float[] turnoTarde;

    public void inicializar() {
	scanner = new Scanner(System.in);
	turnoManana = new float[4];
	turnoTarde = new float[4];

	System.out.println("-- Sueldos turno mañana --");
	for (int i = 0; i < turnoManana.length; i++) {
	    System.out.println("ingrese sueldo");
	    turnoManana[i] = scanner.nextFloat();
	}

	System.out.println("-- Sueldos turno tarde --");
	for (int i = 0; i < turnoTarde.length; i++) {
	    System.out.println("ingrese sueldo");
	    turnoTarde[i] = scanner.nextFloat();
	}

    }
    public void calcularGastos() {
	float mañana = 0;
	float tarde = 0;
	
	for (int i = 0; i < turnoManana.length; i++) {
	    mañana += turnoManana[i];
	    tarde += turnoTarde[i];
	}
	
	System.out.println("Total turno de mañana: " + mañana);
	System.out.println("Total turno de tarde: " + tarde);
	
    }
    
    
    

    public static void main(String[] args) {
	Problema3 problema3 = new Problema3();
	problema3.inicializar();
	problema3.calcularGastos();

    }

}
