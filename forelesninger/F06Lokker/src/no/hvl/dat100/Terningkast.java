package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Terningkast {

	public static void main(String[] args) {
		String melding = "Resultat av terningkast: ";
		final int GRENSE = 20;
		int sum =  0;
		int antall = 0;
		do {
			int verdi = Integer.parseInt(showInputDialog(melding));
			if (1 <= verdi && verdi <= 6) {
				sum += verdi;
				antall++;
			} else {
				showMessageDialog(null, "Ulovlig verdi. Kast annulert");
			}
			
		} while (sum < GRENSE);

		showMessageDialog(null, "Antall kast: " + antall);
	}
}