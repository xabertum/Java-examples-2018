package ClasesObjetos;

import java.util.Scanner;

public class PuntoPlanoProblema3 {

    private Scanner scanner;
    private int x, y;

    public void inicializar() {
	scanner = new Scanner(System.in);

	System.out.println("Introduce el punto x:");
	x = scanner.nextInt();

	System.out.println("Introduce el punto y: ");
	y = scanner.nextInt();

    }

    public void imprimirCuadrante() {
	if (x > 0 && y > 0)
	    System.out.println("Primer cuadrante");
	else {
	    if (x < 0 && y > 0)
		System.out.println("sengudo cuadrante");
	    else {
		if (x < 0 && y < 0)
		    System.out.println("Tercer Cuadrante");
		else {
		    if (x > 0 && y < 0)
			System.out.println("Cuarto Cuadrante");
		    else
			System.out.println("datos erroneos");
		}
	    }
	}

    }

    public static void main(String[] args) {
	PuntoPlanoProblema3 puntoPlanoProblema3 = new PuntoPlanoProblema3();
	puntoPlanoProblema3.inicializar();
	puntoPlanoProblema3.imprimirCuadrante();
	

    }

}
