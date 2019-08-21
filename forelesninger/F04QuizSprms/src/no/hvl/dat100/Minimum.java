package no.hvl.dat100;

public class Minimum {

	public static void main(String[] args) {
		
		// kunne leses inn via dialogboks
		int a = 1;
		int b = 2;
		int c = 11;
		int d = 4;
		
		int minimum;
		
		// beregning minimum - et om gangen
		minimum = Math.min(a, b);
		
		minimum = Math.min(minimum, c);
		
		minimum = Math.min(minimum, d);
		
		System.out.println("Minimum 1:" + minimum);
		
		// to og to - og kombinere
		int min1, min2;
		
		min1 = Math.min(a,b);
		min2 = Math.min(c, d);
		minimum = Math.min(min1, min2);
		
		System.out.println("Minimum 2:" + minimum);
		
		// sammensatte uttrykk
		
		minimum = Math.min(Math.min(a,b), Math.min(c, d));
		
		System.out.println("Minimum 3:" + minimum);
	}

}
