package ClasesObjetos;

import java.util.Scanner;

public class TrianguloProblema2 {

    private Scanner scanner;
    private int lado1, lado2, lado3;
    
    public void inicializar() {
	scanner = new Scanner(System.in);
	
	System.out.println("introduce el lado 1:");
	lado1 = scanner.nextInt();
	
	System.out.println("introduce el lado2:");
	lado2 = scanner.nextInt();
	
	System.out.println("introduce el lado3:");
	lado3 = scanner.nextInt();
	
    }
    
    public void imprimirLadoMayor() {
	
	if (lado1 > lado2 && lado1 > lado3) System.out.println("el mayor es lado1: " + lado1);
	else {
	    if (lado2 > lado3) System.out.println("el mayor es lado2: " +  lado2);
	    else System.out.println("el mayor es lado3: " + lado3);		    
	}	
    }
    
    public boolean esEquilatero() {

	boolean esEquilatero = false;
	
	if (lado1 == lado2 && lado2 == lado3) esEquilatero = true;	
	
	return esEquilatero;
	
    }
    
    
    public static void main(String[] args) {

	TrianguloProblema2 trianguloProblema2 = new TrianguloProblema2();
	trianguloProblema2.inicializar();
	trianguloProblema2.imprimirLadoMayor();
	System.out.println(trianguloProblema2.esEquilatero());
	
	
	

    }

}
