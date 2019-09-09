package no.hvl.dat100;

public class Parametre {

	public static void main(String[] args) {
		
		double[] obs = {1.2, -3.5, 4.8, 7.9, 41.2, 10.1};
		
		SkrivUt(obs);
		
		nullstillNegative(obs); 
		
		SkrivUt(obs);
		
		double[] obs1 = {1.2, 3.5, 4.8, 7.9, 41.2, 10.1};
		
		SkrivUt(obs1);
		System.out.println(obs1);
		
		double[] obs2 = kopier(obs1);
		
		SkrivUt(obs2);
		System.out.println(obs2);
		
		double[] obs3 = diff(obs1);
		SkrivUt(obs3);
		
		System.out.println(finnesOver(obs,80));
		System.out.println(finnesOver(obs,40));
		
		System.out.println(antallOver(obs,80));
		System.out.println(antallOver(obs,5));
	
		System.out.println(antallOver2(obs,80));
		System.out.println(antallOver2(obs,5));

	}

	public static void SkrivUt(double[] tabell) {
		
		System.out.print("[ ");
		
		for (int i = 0; i<tabell.length; i++) {
					
			System.out.print(tabell[i] + " ");
					
		}
		
		System.out.println("]");
	}

	public static void nullstillNegative(double[] tab) {
		
		for (int i = 0; i<tab.length; i++) {
			
			tab[i] = Math.max(0, tab[i]);

		}
	}
	
	public static double[] kopier(double[] tab) {

		double[] nytab = new double[tab.length];

		for (int pos = 0; pos<tab.length; pos++) {

			nytab[pos] = tab[pos];

		}

		return nytab;
	}

	public static double[] diff(double[] tab) {
		
		double[] nytab = new double[tab.length-1];
		
		for (int pos = 0; pos<nytab.length; pos++) {

			nytab[pos] = tab[pos+1]-tab[pos];

		}
		
		return nytab;
	}
	
	public static boolean finnesOver(double[] tab, int grense) {
		
		boolean funnet = false;
		
		int i = 0;
		while ((i<tab.length) && (!funnet)) {
			
			if (tab[i] > grense) {
				funnet = true;
			}
			
			i++;
		}
		
		return funnet;
	}
	
	
	public static int antallOver(double[] tab, int grense) {
		
		int antall = 0;
		
		for (int i = 0; i<tab.length; i++) {
			
			if (tab[i] > grense) {
				antall++;
			}
		}
		
		return antall;
	}
	
	
	public static int antallOver2(double[] tab, int grense) {

		int antall = 0;

		for (double o : tab) {

			if (o > grense) {
				antall++;
			}
		}

		return antall;
	}
}
