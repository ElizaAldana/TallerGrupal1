package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class ScreenRegCard {

	PApplet app;
	PImage regiCard;
	ControlP5 cp5;
	String titular, date;
	int number, cvv;

	public ScreenRegCard(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		regiCard = app.loadImage("pngs/10.png");
		
			
			//cambiar las coordenadas para que den con los espacios de los png
			cp5.addTextfield("titular")
			  .setPosition(50,0)
			  .setSize(250,60)
			  .setFont(app.createFont("arial",20))
			  .setAutoClear(false);
			 
			 cp5.addTextfield("date")
		     .setPosition(50,100)
		     .setSize(250,60)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			 
			 cp5.addTextfield("number")
		     .setPosition(50,200)
		     .setSize(250,60)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			 
			 cp5.addTextfield("cvv")
		     .setPosition(50,300)
		     .setSize(250,60)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
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
