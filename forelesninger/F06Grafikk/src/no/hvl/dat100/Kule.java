package no.hvl.dat100;

import easygraphics.*;

public class Kule extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		final int ANT_GANGER = 1000;
		final int BREDDE = 350;
		final int HOGDE = 150;
		final int RADIUS = 30;

		int x = 50;
		int y = 50;
		int dx = 2;
		int dy = 3;

		makeWindow("Kule", BREDDE, HOGDE);
		int sirkel = fillCircle(x, y, RADIUS);
		
		for (int i = 1; i <= ANT_GANGER; i++) {
			if (x + dx <= RADIUS || x + dx + RADIUS >= BREDDE) {
				dx = -dx;
			}
			if (y + RADIUS + dy >= HOGDE || y + dy <= RADIUS) {
				dy = -dy;
			}
			x += dx;
			y += dy;
			move(sirkel, x, y);
			pause(20);
		}
	}
}