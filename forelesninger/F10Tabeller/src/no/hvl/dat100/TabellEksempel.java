package no.hvl.dat100;

public class TabellEksempel {

	public static void main(String[] args) {
		
		double[] obs = {1.2, -3.5, 4.8, 7.9, 41.2, 10.1};

		// oppslag 
		double o2 = obs[2];

		System.out.println(o2);
		
		// oppdatering
		obs[2] = 5.0;
				
		// utskrift
		
		System.out.println(obs);
		
		// utskrift - versjon 0
		System.out.println(obs[0]);
		System.out.println(obs[1]);
		System.out.println(obs[2]);;
		System.out.println(obs[3]);
		System.out.println(obs[4]);
		System.out.println(obs[5]);
		
		// utskrift - versjon 1
		for (int i = 0; i<=5;i++) {
			
			System.out.println(obs[i]);
			
		}
		
		// utskrift - versjon 2
		for (int i = 0; i<obs.length; i++) {
			
			System.out.println("Observasjon "+ i + " : " + obs[i]);
			
		}
		
		// oppdatering - versjon 1
		for (int i = 0; i<obs.length; i++) {
			
			if (obs[i] < 0) {
				obs[i] = 0;
			}	
		}
		
		// oppdatering - versjon 2
		for (int i = 0; i<obs.length; i++) {
			
			obs[i] = Math.max(0, obs[i]);
	
		}
		
		for (int i = 0; i<obs.length; i++) {
			
			System.out.println("Observasjon "+ i + " : " + obs[i]);
			
		}
	
		double[] tabellnavn = null;

		
		// tabell variable - tildeling
		double[] obs1 = {1.2, -3.5, 4.8, 7.9, 41.2, 10.1}; 
		double[] obs2 = {2.2, 6.5, 1.8, 9.9, 52.2, 17.1}; 
		
		System.out.println(obs1);
		System.out.println(obs2);
		
		obs1 = obs2;
		
		System.out.println(obs1);
		System.out.println(obs2);
		
		// oppdaterings eksperiment
		System.out.println(obs2[1]);
		
		obs1[1] = 2.0;
		
		System.out.println(obs2[1]);
			
		System.out.println(obs2[1]);
	}

}
