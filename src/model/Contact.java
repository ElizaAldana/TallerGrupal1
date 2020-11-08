package model;
import processing.core.PApplet;

public class Contact extends Person implements Comparable <Contact>{

private PApplet app;

	public Contact(String name, String lastn, String email, String nation, int phone,PApplet app) {
		super(name, lastn, email, nation, phone);
		this.app=app;
	}

	
	
	public int compareTo(Contact c) {
		return this.getName().compareTo(c.getName()); 
	}

	public void draw(int x, int y) {
		app.fill(0);
		app.text(this.name, x, y);
		y+=70;
		app.text(this.lastn, x, y);
		y+=70;
		app.text(this.email, x, y);
		y+=70;
		app.text(this.nation, x, y);
		y+=70;
		app.text(this.phone, x, y);
		y=y-280;
	}
}
