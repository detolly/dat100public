package no.hvl.dat100.temperature;

public class TemperaturSensor {

	private static final int MINMAX = 20;

	private static void delay() {

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static double read() {

		delay();
		
		long seconds = System.currentTimeMillis();

		double temp = MINMAX * Math.sin(seconds / 1000);

		return temp;
	}
}
