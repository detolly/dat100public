package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Sekunder {

	public static void main(String[] args) {
		
		String sekundTxt = showInputDialog("Angi sekunder");
		
		int antallSekunder = parseInt(sekundTxt);
		
		int timer = antallSekunder / 3600;
		int restsekunder = antallSekunder % 3600;
		
		int minutter = restsekunder / 60;
		
		restsekunder = restsekunder % 60;
		
		String utTxt = timer + " timer," + minutter + " minutter," + restsekunder + " sekunder";
		
		showMessageDialog(null,utTxt);
	}
}
