package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenHome {
	
	PApplet app;
	PImage home;
	PImage BInter;
	PImage BLuna;
	PImage BMarte;
	PImage BLista;
	ControlP5 cp5;

	public ScreenHome(PApplet app) {
		this.app = app;
		home= app.loadImage("pngs/4.png");
		BInter= app.loadImage("pngs/buttons/4bInter.png");
		BLuna= app.loadImage("pngs/buttons/4bLuna.png");
		BMarte= app.loadImage("pngs/buttons/4bMarte.png");
		BLista= app.loadImage("pngs/buttons/4bLista.png");
		cp5 = new ControlP5(app);
	}
	public void drawHome() {
		app.imageMode(PConstants.CORNER);
		app.image(home,0,0,app.width,app.height);
		if((206>app.mouseX&&app.mouseX>93)&&(438>app.mouseY&&app.mouseY>404)){
			//Intercontinental Button
			app.imageMode(PConstants.CORNER);
			app.image(BInter,0,0,app.width,app.height);
		}
		if((406>app.mouseX&&app.mouseX>296)&&(438>app.mouseY&&app.mouseY>404)){
			//Luna Button
			app.imageMode(PConstants.CORNER);
			app.image(BLuna,0,0,app.width,app.height);
		}
		if((606>app.mouseX&&app.mouseX>491)&&(438>app.mouseY&&app.mouseY>404)){
			//Marte Button
			app.imageMode(PConstants.CORNER);
			app.image(BMarte,0,0,app.width,app.height);
		}
		if((808>app.mouseX&&app.mouseX>695)&&(438>app.mouseY&&app.mouseY>404)){
			//Ver lista Button
			app.imageMode(PConstants.CORNER);
			app.image(BLista,0,0,app.width,app.height);
		}
	}

}
