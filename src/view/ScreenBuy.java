package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenBuy {

	PApplet app;
	ControlP5 cp5;
	PImage buy;
	PImage buttonAdd;
	PImage buttonCom;

	public ScreenBuy(PApplet app) {
		this.app=app;
		buy= app.loadImage("pngs/9.png");
		buttonAdd = app.loadImage("pngs/buttons/9bAnyad.png");	
		buttonCom = app.loadImage("pngs/buttons/9bCompr.png");	
		cp5 = new ControlP5(app);
	}
	public void drawBuy() {
		app.imageMode(PConstants.CORNER);
		app.image(buy,0,0,app.width,app.height);
		if((678>app.mouseX&&app.mouseX>538)&&(307>app.mouseY&&app.mouseY>259)){
			//Añadir tarjeta Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonAdd,0,0,app.width,app.height);
		}
		if((518>app.mouseX&&app.mouseX>379)&&(472>app.mouseY&&app.mouseY>432)){
			//Comprar Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonCom,0,0,app.width,app.height);
		}
		}
}
