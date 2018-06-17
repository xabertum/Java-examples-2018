package ClasesObjetos;

import java.util.Scanner;

public class CuadradoProblema4 {

    private Scanner scanner;
    private int lado;
    
    
    public void inicializar() {
	scanner = new Scanner(System.in);
	System.out.println("introduce el valor de lado: ");
	lado = scanner.nextInt();
	
    }
    
    public void imprimir() {
	System.out.println("Perimetro: " + lado*4);
	System.out.println("Superficie: " + lado*2);
    }
    
    
    public static void main(String[] args) {
	CuadradoProblema4 cuadradoProblema4 = new CuadradoProblema4();
	cuadradoProblema4.inicializar();
	cuadradoProblema4.imprimir();
    }

}
