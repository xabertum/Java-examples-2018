package Constructor26;

import java.util.Scanner;

public class PRoblema3 {

    private Scanner scanner;
    private String nombre;
    private int sueldo;
    
    public PRoblema3 () {
	scanner = new Scanner(System.in);
	System.out.println("Ingrese nombre: ");
	nombre = scanner.next();
	System.out.println("Ingrese sueldo: ");
	sueldo = scanner.nextInt();
    }
    
    public void imprimir() {
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Sueldo: " +  this.sueldo);
    }
    
    public void pagaImpuestos() {
	if (sueldo > 3000) System.out.println(this.nombre + " paga impuestos!");
	
    }
    
    public static void main(String[] args) {
	PRoblema3 pRoblema3 = new PRoblema3();
	pRoblema3.imprimir();
	pRoblema3.pagaImpuestos();

    }

}
