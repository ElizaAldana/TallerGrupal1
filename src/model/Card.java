package model;
import processing.core.PApplet;

public class Card {
	
	private PApplet app;
	private String titular, date;
	private int number, cvv;
	
	public Card (String titular, String date, int number, int cvv,PApplet app ) {
		this.app=app;
		
		this.date=date;
		this.cvv=cvv;
		this.number=number;
		this.titular=titular;
		
		
	}
	public void draw(int x, int y) {
	
		app.fill(255);
		app.text(this.titular, x, y);
		y+=70;
		app.text(this.date, x, y);
		y+=70;
		app.text(this.number, x, y);
		y+=70;
		app.text(this.cvv, x, y);
		y=y-280;
	}
	public void drawTitular(int x, int y) {
		app.text(this.titular, x, y);
	}

	public void drawDate(int x, int y) {
		app.text(this.date, x, y);
	}

	public void drawNumber(int x, int y) {
		app.text(this.number, x, y);
	}

	public void drawCvv(int x, int y) {
		app.text(this.cvv, x, y);
	}

}