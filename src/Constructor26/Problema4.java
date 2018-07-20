package Constructor26;

import java.util.Scanner;

public class Problema4 {

    private Scanner scanner;
    private int numA;
    private int numB;
    
    public Problema4 (int a, int b) {
	this.numA = a;
	this.numB = b;
    }

    public int sumar() {
	return numA + numB;
    }
    
    public int restar() {
	return numA - numB;
    }
    
    public int dividir() {
	return numA / numB;
    }

    
    
    public static void main(String[] args) {
	

    }

}
