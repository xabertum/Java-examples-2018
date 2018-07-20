package Constructor26;

import java.util.Scanner;

public class Problema2 {

    private Scanner scanner;
    private String nombre;
    private int edad;

    public Problema2() {
	scanner = new Scanner(System.in);
	System.out.println("Ingrese nombre: ");
	nombre = scanner.next();
	System.out.println("Ingrese edad: ");
	edad = scanner.nextInt();
    }

    public void imprimir() {
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Edad: " + this.edad);
    }

    public void esMayorEdad() {
	if (edad > 18)
	    System.out.println(this.nombre + " es mayor de edad");
	else
	    System.out.println(this.nombre + " NO es mayor de edad.");

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
