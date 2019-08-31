package no.hvl.dat100.temperature;

public class DisplayTemperature {

	private static final int N = 1000;
	
	public static void main(String[] args) {
		
		double current, min, max, sum;
		
		current = TemperatureSensor.read();
		min = max = sum = current;
		
		for (int i = 1; i<=N; i++) {
		
			current = TemperatureSensor.read();
			
			min = Math.min(min, current);
			
			max = Math.max(max, current);
			
			sum = current + sum;
			
			display(i,current,min,max,sum);
			
			delay();
		}

	}

	private static String toString (double x) {
		return Double.toString(Math.round(x*100) / 100.0);
	}
	
	private static void display(int i, double current, double min, double max, double sum) {

		System.out.println(i + ":" + toString(current) + "[" + toString(min) + " " + toString(max) + "]" + toString(sum/i));

	}

	private static void delay() {

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
