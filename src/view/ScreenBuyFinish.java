package view;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenBuyFinish {

	PApplet app;
	PImage buyF;
	PImage buttonFin;

	public ScreenBuyFinish(PApplet app) {
		this.app = app;
		buyF= app.loadImage("pngs/11.png");
		buttonFin= app.loadImage("pngs/buttons/11b.png");
		
	}
	public void drawBuyF() {
		app.imageMode(PConstants.CORNER);
		app.image(buyF,0,0,app.width,app.height);
		if((741>app.mouseX&&app.mouseX>571)&&(520>app.mouseY&&app.mouseY>466)){
			app.imageMode(PConstants.CORNER);
			app.image(buttonFin,0,0,app.width,app.height);
			}
	}
}
