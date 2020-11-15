package view;

import controlP5.ControlP5;
import controlP5.Label;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenRegCard {

	PApplet app;
	PImage regiCard;
	PImage buttonAny;
	ControlP5 cp5;
	String titular, date;
	int number, cvv;

	public ScreenRegCard(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		regiCard = app.loadImage("pngs/10.png");
		buttonAny = app.loadImage("pngs/buttons/10b.png");				
		}
			
	public void textFields() {
		cp5.addTextfield("titular")
		  .setPosition(67,188)
		  .setSize(333,44)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
		 
		 cp5.addTextfield("cvv")
	     .setPosition(501,286)
	     .setSize(333,44)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("date")
	     .setPosition(67,286)
	     .setSize(333,44)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("number")
	     .setPosition(501,189)
	     .setSize(333,44)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
	 //Esconder las etiquetas
		Label labelT = cp5.get(Textfield.class,"titular").getCaptionLabel();
		labelT.hide();
		Label labelD = cp5.get(Textfield.class,"date").getCaptionLabel();
		labelD.hide();
		Label labelN = cp5.get(Textfield.class,"number").getCaptionLabel();
		labelN.hide();
		Label labelC = cp5.get(Textfield.class,"cvv").getCaptionLabel();
		labelC.hide();
	}
	
	
	public void drawCard() {
		app.imageMode(PConstants.CORNER);
		app.image(regiCard,0,0,app.width,app.height);
		if((543>app.mouseX&&app.mouseX>349)&&(440>app.mouseY&&app.mouseY>380)){
			//A�adir tarjeta Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonAny,0,0,app.width,app.height);
		}
		}
	public void regCard() {
		
		titular = cp5.get(Textfield.class,"titular").getText();
		date = cp5.get(Textfield.class,"date").getText();
		number =Integer.parseInt(cp5.get(Textfield.class,"number").getText());
		cvv =Integer.parseInt(cp5.get(Textfield.class,"cvv").getText());

	}
	
	public void hide() {
		cp5.get("titular").hide();
		cp5.get("date").hide();
		cp5.get("number").hide();
		cp5.get("cvv").hide();
	}
	
	public void clear() {
		cp5.get(Textfield.class,"titular").clear();
		cp5.get(Textfield.class,"date").clear();
		cp5.get(Textfield.class,"number").clear();
		cp5.get(Textfield.class,"cvv").clear();
	
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	
}
