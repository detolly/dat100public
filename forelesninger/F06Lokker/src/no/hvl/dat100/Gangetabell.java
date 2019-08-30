package no.hvl.dat100;

public class Gangetabell {

	public static void main(String[] args) {
		final int MAKS = 9;
		// Overskrift
		System.out.print(" * ");
		for (int j = 1; j <= MAKS; j++) {
			System.out.print(" " + j + " ");
		}
		System.out.println();

		// Sjølve tabellen
		for (int i = 1; i <= MAKS; i++) {
			System.out.print(" " + i + " ");
			for (int j = 1; j <= MAKS; j++) {
				if (i * j < 10) {
					System.out.print(" ");
				}
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
