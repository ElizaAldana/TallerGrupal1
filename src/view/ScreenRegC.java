package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

public class ScreenRegC {

	PApplet app;
	PImage regcon;
	PImage buttonAny;
	ControlP5 cp5;
	String name,lastn, email, nation;
	float phone;
	
	
	public ScreenRegC(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		//PFont font = app.createFont("arial",20);
		regcon= app.loadImage("pngs/8.png");
		buttonAny= app.loadImage("pngs/buttons/8b.png");
		
		
		
	}
	public void drawRegC() {	
		app.imageMode(PConstants.CORNER);
		app.image(regcon,0,0,app.width,app.height);
		if((531>app.mouseX&&app.mouseX>378)&&(466>app.mouseY&&app.mouseY>416)){
			//Añadir  Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonAny,0,0,app.width,app.height);
	}
	}
	public void textFields() {
		cp5.addTextfield("name")
		  .setPosition(50,0)
		  .setSize(250,60)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
		 
		 cp5.addTextfield("lastn")
	     .setPosition(50,100)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("email")
	     .setPosition(50,200)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("nation")
	     .setPosition(50,300)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("phone")
	     .setPosition(50,400)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
	}
	public void regC() {
		name = cp5.get(Textfield.class,"name").getText();
		lastn = cp5.get(Textfield.class,"lastn").getText();
		email = cp5.get(Textfield.class,"email").getText();
		nation = cp5.get(Textfield.class,"nation").getText();	
				
		//esta tuve que ponerle el "Integer.parseInt" para pasar de String a numeros
		phone =Float.parseFloat (cp5.get(Textfield.class,"phone").getText());
	}
	
	public void hide() {
		cp5.get("name").hide();
		cp5.get("lastn").hide();
		cp5.get("email").hide();
		cp5.get("nation").hide();
		cp5.get("phone").hide();
	}
	
	public void clear() {
		cp5.get(Textfield.class,"name").clear();
		 cp5.get(Textfield.class,"lastn").clear();
		 cp5.get(Textfield.class,"email").clear();
		 cp5.get(Textfield.class,"nation").clear();
		 cp5.get(Textfield.class,"phone").clear();
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
