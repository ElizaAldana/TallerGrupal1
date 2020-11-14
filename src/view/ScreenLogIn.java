package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class ScreenLogIn {

	PApplet app;
	PImage log;
	ControlP5 cp5;
	//Main main;
	String username;
	
	public ScreenLogIn(PApplet app) {
		log= app.loadImage("pngs/2.png");
		
		cp5 = new ControlP5(app);
		
		//Nota: Arreglar posición de input field con la imagen de login
		cp5.addTextfield("Username")
		  .setPosition(50,0)
		  .setSize(250,60)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
		
	}
	
	public void logIn(Main main) {
		username = cp5.get(Textfield.class,"Username").getText();
		
		}
		
		
	}

