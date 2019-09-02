package no.hvl.dat100.temperature;

public class Sensor {

	private static final int MINMAX = 20;

	public static double read() {
		
		long seconds = System.currentTimeMillis();

		double temp = MINMAX * (Math.sin(seconds / 1000)) + (Math.random());

		return temp;
	}
}