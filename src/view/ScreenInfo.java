package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenInfo {

	
	PApplet app;
	ControlP5 cp5;
	PImage infoI;
	PImage infoL;
	PImage infoM;


	public ScreenInfo(PApplet app) {
		this.app=app;
		infoI= app.loadImage("pngs/5.png");
		infoL= app.loadImage("pngs/6.png");
		infoM= app.loadImage("pngs/7.png");
		cp5 = new ControlP5(app);
	}
	
	public void drawInf(int screenInf) {
		
	//Screen changes
			switch(screenInf) {
			case 0:
				app.imageMode(PConstants.CORNER);
				app.image(infoI,0,0,app.width,app.height);
			break;
			case 1:
				app.imageMode(PConstants.CORNER);
				app.image(infoL,0,0,app.width,app.height);
			break;
			case 2:
				app.imageMode(PConstants.CORNER);
				app.image(infoM,0,0,app.width,app.height);
			break;
			
			}
}
}