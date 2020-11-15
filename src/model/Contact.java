package model;
import processing.core.PApplet;

public class Contact extends Person implements Comparable <Contact>{

private PApplet app;
private String name, lastn, email, nation;
private float phone;

	public Contact(String name, String lastn, String email, String nation, float phone,PApplet app) {
		super(name, lastn, email, nation, phone);
		this.app=app;
		this.email=email;
		this.lastn=lastn;
		this.name=name;
		this.nation=nation;
		this.phone=phone;
	}

	
	//tomar el nombre y compararlo
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
	
	public void drawName(int x, int y) {
		app.text(this.name, x, y);
	}
	
	public void drawApellido(int x, int y) {
		app.text(this.lastn, x, y);
	}
	
	public void drawEmail(int x, int y) {
		app.text(this.email, x, y);
	}
	
	public void drawNation(int x, int y) {
		app.text(this.nation, x, y);
	}
	
	public void drawPhone(int x, int y) {
		app.text(this.phone, x, y);
	}


	public PApplet getApp() {
		return app;
	}


	public void setApp(PApplet app) {
		this.app = app;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastn() {
		return lastn;
	}


	public void setLastn(String lastn) {
		this.lastn = lastn;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public float getPhone() {
		return phone;
	}


	public void setPhone(float phone) {
		this.phone = phone;
	}
	
	
}
