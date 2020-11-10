package view;

import processing.core.PApplet;
import processing.core.PImage;

public class ScreenInfo {

	PApplet app;
	PImage infoV;
	PImage infoL;
	PImage infoM;


	public void setup() {
		infoV= app.loadImage("pngs/5.png");
		infoL= app.loadImage("pngs/6.png");
		infoM= app.loadImage("pngs/7.png");

	}
}
