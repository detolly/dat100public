package no.hvl.dat100;

import easygraphics.*;

public class Sirkler extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		final int RADIUS = 20;
		final int ANTALL = 10;
		final int BREDDE = 2 * RADIUS * ANTALL;
		final int HOEYDE = 300;

		int x = RADIUS;
		int y = HOEYDE / 2;
		boolean medFyll = true;
		makeWindow("Sirkler", BREDDE, HOEYDE);
		for (int i = 1; i <= ANTALL; i++) {
			if (medFyll) {
				fillCircle(x, y, RADIUS);
			} else {
				drawCircle(x, y, RADIUS);
			}
			x += 2 * RADIUS;
			medFyll = !medFyll;
		}
	}
}
