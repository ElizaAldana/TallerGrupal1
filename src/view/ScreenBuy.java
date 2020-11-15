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
		
	}
	public void drawBuy() {
		app.imageMode(PConstants.CORNER);
		app.image(buy,0,0,app.width,app.height);
		if((206>app.mouseX&&app.mouseX>93)&&(438>app.mouseY&&app.mouseY>404)){
			//Añadir tarjeta Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonAdd,0,0,app.width,app.height);
		}
		if((406>app.mouseX&&app.mouseX>296)&&(438>app.mouseY&&app.mouseY>404)){
			//Comprar Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonCom,0,0,app.width,app.height);
		}
		}
}
