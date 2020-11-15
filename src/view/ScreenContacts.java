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
	public ScreenContacts(PApplet app) {
		this.app=app;
		contact= app.loadImage("pngs/c1.png");
		buttonNom= app.loadImage("pngs/buttons/c1bNom.png");
		buttonApe= app.loadImage("pngs/buttons/c1bApe.png");
		buttonEma= app.loadImage("pngs/buttons/c1bEma.png");
		buttonNac= app.loadImage("pngs/buttons/c1bNac.png");
		buttonTel= app.loadImage("pngs/buttons/c1bTel.png");
		buttonAny= app.loadImage("pngs/buttons/c1bAnyad.png");
		cp5 = new ControlP5(app);
	}
	public void drawContact() {
		app.imageMode(PConstants.CORNER);
		app.image(contact,0,0,app.width,app.height);
		if((844>app.mouseX&&app.mouseX>716)&&(122>app.mouseY&&app.mouseY>83)){
			//Nombre Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonNom,0,0,app.width,app.height);
		}
		if((844>app.mouseX&&app.mouseX>716)&&(190>app.mouseY&&app.mouseY>150)){
			//Apellido Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonApe,0,0,app.width,app.height);
		}
		if((844>app.mouseX&&app.mouseX>716)&&(260>app.mouseY&&app.mouseY>220)){
			//Email Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonEma,0,0,app.width,app.height);
		}
		if((844>app.mouseX&&app.mouseX>716)&&(326>app.mouseY&&app.mouseY>287)){
			//Telefono Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonTel,0,0,app.width,app.height);
		}
		if((844>app.mouseX&&app.mouseX>716)&&(394>app.mouseY&&app.mouseY>354)){
			//Nacionalidad Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonNac,0,0,app.width,app.height);
		}
		if((866>app.mouseX&&app.mouseX>716)&&(514>app.mouseY&&app.mouseY>465)){
			//Añadir contacto Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonAny,0,0,app.width,app.height);
		}
	}
}
