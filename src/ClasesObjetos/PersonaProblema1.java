package ClasesObjetos;

import java.util.Scanner;

public class PersonaProblema1 {

    private Scanner scanner;
    private String nombre;
    private int edad;
    
    public void inicializar() {
	scanner = new Scanner(System.in);
	System.out.println("introduce el nombre:");
	nombre = scanner.next();
	
	System.out.println("introduce la edad:");
	edad = scanner.nextInt();
	
    }
    
    public void imprimir() {
	System.out.println("Nombre: " + nombre);
	System.out.println("Edad: " + edad);
	
    }
    
    public void esMayorEdad() {
	
	if (edad >= 18) System.out.println("es mayor de edad");
	else System.out.println("NO es mayor de edad");
	
    }
    
    
    
    public static void main(String[] args) {
	PersonaProblema1 personaProblema1 = new PersonaProblema1();
	personaProblema1.inicializar();
	personaProblema1.imprimir();
	personaProblema1.esMayorEdad();

    }

}
