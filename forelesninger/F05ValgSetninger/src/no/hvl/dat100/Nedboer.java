package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Nedboer {

	public static void main(String[] args) {
		String melding = "Nedbør i antall mm for dag ";
		final int ANT_DAGER = 3;
		int sum = 0;
		int nedboer;
		int dagnr = 1;
		for ( ; dagnr <= ANT_DAGER; ) {
			nedboer = Integer.parseInt(showInputDialog(melding + dagnr));
			sum += nedboer;
			dagnr++;
		}
		
		
		showMessageDialog(null, "Sum nedbør: " + sum);

	}

}
