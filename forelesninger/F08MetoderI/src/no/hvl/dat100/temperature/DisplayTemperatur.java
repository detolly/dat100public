package no.hvl.dat100.temperature;

public class DisplayTemperatur {

	public static void main(String[] args) {
		
		double min,max, sum, current;
		
		current = TemperaturSensor.read();
		min = max = sum = current;
		
		for (int i = 1; i<1000; i++) {
		
			current = TemperaturSensor.read();
			
			min = Math.min(min, current);
			
			max = Math.max(max, current);
			
			sum = current + sum;
			
			System.out.println(i + ":" + current + " " + max + " " + sum/i);
		}

	}

}
