package view;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenInfo {

	int screenInf;
	PApplet app;
	PImage infoV;
	PImage infoL;
	PImage infoM;


	public void setup() {
		screenInf=0;
		infoV= app.loadImage("pngs/5.png");
		infoL= app.loadImage("pngs/6.png");
		infoM= app.loadImage("pngs/7.png");
	}
	
	public void drawInf() {
		
	//Screen changes
			switch(screenInf) {
			case 0:
				app.imageMode(PConstants.CORNER);
				app.image(infoV,0,0,app.width,app.height);
			break;
			case 1:
			break;
			}
}
}