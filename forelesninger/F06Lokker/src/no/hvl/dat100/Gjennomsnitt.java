package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Gjennomsnitt {

	public static void main(String[] args) {
		String melding = "Høyde i cm, avslutt med 0.";
		int hoeyde;
		
		// les inn første
		hoeyde = Integer.parseInt(showInputDialog(melding));
		
		int sum = 0;
		int antall = 0;
		while (hoeyde != 0) {
			sum = hoeyde;
			antall++;
			hoeyde = Integer.parseInt(showInputDialog(melding));
		}
		
		double snitt = (double) sum / antall;
		
					
		showMessageDialog(null, "Gjennomsnitt: " + snitt);

	}

}
