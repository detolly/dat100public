package no.hvl.dat100;

public class MetodeEksempel {

	public static void main(String[] args) {
		
		System.out.println("En setning før første løkke");
		
		for (int i = 1; i<=10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("En setning mellom de to løkker");
		
		for (int i = 1; i<=10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("En setning før programmet er slutt");
	}

}
