package no.hvl.dat100;

public class Tid {

	public static void main(String[] args) {
		int sekunder = 3712;

		int t = sekunder / 3600;
		int sekTilovers = sekunder % 3600;
		int m = sekTilovers / 60;
		int s = sekTilovers % 60;

		String svar = "";
//		if (t == 1) {
//			svar +=  " time, ";
//		} else {
//			svar +=  " timer, ";
//		}

		switch (t) {
		case 0:
			break;
		case 1:
			svar += t + " time, ";
			break;
		default:
			svar += t + " timer, ";
		}
		svar += m + " minutter, " + s + " sekunder";
		System.out.println(svar);

	}

}
