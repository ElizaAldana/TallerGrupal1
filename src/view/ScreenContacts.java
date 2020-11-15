package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenContacts {

	PApplet app;
	PImage contact;
	PImage buttonNom;
	PImage buttonApe;
	PImage buttonEma;
	PImage buttonNac;
	PImage buttonTel;
	PImage buttonAny;
	ControlP5 cp5;
	public void setup(PApplet app) {
		this.app=app;
		contact= app.loadImage("pngs/c1.png");
		cp5 = new ControlP5(app);
	}
}
