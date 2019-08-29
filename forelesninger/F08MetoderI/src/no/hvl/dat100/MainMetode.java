package no.hvl.dat100;

public class MainMetode {

	public static void main(String[] args) {

		System.out.println("En setning før første løkke");

		skrivStjerner();

		System.out.println("En setning mellom de to løkker");

		skrivStjerner();

		System.out.println("En setning før programmet er slutt");
	}

	private static void skrivStjerner() {
		for (int i = 1; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
