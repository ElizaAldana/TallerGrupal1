package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenLogIn {

	PApplet app;
	PImage log;
	PImage buttonReg;
	PImage buttonIng;
	ControlP5 cp5;
	//Main main;
	String username, password;
	
	public ScreenLogIn(PApplet app) {
		this.app=app;
		log= app.loadImage("pngs/2.png");
		buttonReg= app.loadImage("pngs/buttons/2bRegis.png");
		buttonIng= app.loadImage("pngs/buttons/2bIngresar.png");
		cp5 = new ControlP5(app);
		
		

		
		
	}
	public void textFields() {
		//Nota: Arreglar posición de input field con la imagen de login
		
		cp5.addTextfield("Email")
		  .setPosition(50,0)
		  .setSize(250,60)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
		
		cp5.addTextfield("Password")
		  .setPosition(100,0)
		  .setSize(250,60)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
	}
	public void hide() {
		cp5.get("Email").hide();
		cp5.get("Password").hide();
	}
	public void drawLog() {
		app.imageMode(PConstants.CORNER);
		app.image(log,0,0,app.width,app.height);
		if((527>app.mouseX&&app.mouseX>373)&&(404>app.mouseY&&app.mouseY>357)){
			//Ingresar Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonIng,0,0,app.width,app.height);
		}
		if((505>app.mouseX&&app.mouseX>394)&&(473>app.mouseY&&app.mouseY>440)){
			//Registrarse Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonReg,0,0,app.width,app.height);
		}
	}

	
	
	public void logIn(Main main) {
		username = cp5.get(Textfield.class,"Username").getText();
		
		}
		
		
	}

