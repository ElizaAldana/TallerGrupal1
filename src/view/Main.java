package view;

import controller.Controller;
import processing.core.PApplet;
import controlP5.*;
import processing.core.PFont;

public class Main extends PApplet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Controller control;
	ControlP5 cp5;

	public void settings() {
		size(900,600);
	
	}
	
	public void setup() {
		PFont font = createFont("arial",20);
		 textFont(font);
		cp5 = new ControlP5(this);
		
		
		//estos son los campos de texto
		 cp5.addTextfield("name")
		   .setPosition(50,0)
		   .setSize(250,60)
		   .setFont(createFont("arial",20))
		   .setAutoClear(false);
		 
		 cp5.addTextfield("lastn")
	     .setPosition(50,100)
	     .setSize(250,60)
	     .setFont(createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("email")
	     .setPosition(50,200)
	     .setSize(250,60)
	     .setFont(createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("nation")
	     .setPosition(50,300)
	     .setSize(250,60)
	     .setFont(createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("phone")
	     .setPosition(50,400)
	     .setSize(250,60)
	     .setFont(createFont("arial",20))
	     .setAutoClear(false);
		
		control = new Controller(this,cp5);
	}
	
	public void draw() {
		background(250);
		
		fill(255,0,0);
		rect(0,450,width/2,100);
		
		fill(0,0,255);
		rect(width/2,450,width/2,100);
		
	
		
		
		
			for (int i=0 ;i < control.getList().size() ;i++) {
				control.getList().get(i).draw(150*i,100);
			}
			fill(0);
			text("esconder",width/2,500);
			text("registrar",0,500);
}
	public void mouseClicked() {
		if(mouseY>450&&mouseX<width/2) {
			regC();
		
		
		//para vaciar el texto de los cuadros
		clear();
		}
	if(mouseY>450&&mouseX>width/2) {
			
	//para esconder los cuadros- usar en los cambios de pantalla
		hide();
		}
	}
	
	//funcion para registrar
	public void regC() {
				
		//esta zona toma los valores que se escriban en los cuadros de texto y lo convierte en variables
		String 
		name = cp5.get(Textfield.class,"name").getText(),
		lastn = cp5.get(Textfield.class,"lastn").getText(),
		email = cp5.get(Textfield.class,"email").getText(),
		nation = cp5.get(Textfield.class,"nation").getText();
		
		//esta tuve que ponerle el "Integer.parseInt" para pasar de String a numeros
		int phone =Integer.parseInt (cp5.get(Textfield.class,"phone").getText());
		//esta de abajo toma las varibles y las manda para hacer el arreglo
		control.regC(name,lastn,email,nation,phone);
		
		
		
		}
	public void hide() {
		//con esta funcion hide puedes esconder los cuadros de ingreso de texto, usar en los cambios de pantalla o cuando se hayan dejado de usar
		cp5.get("name").hide();
		cp5.get("lastn").hide();
		cp5.get("email").hide();
		cp5.get("nation").hide();
		cp5.get("phone").hide();
	}
	public void clear() {
		 cp5.get(Textfield.class,"name").clear();
		 cp5.get(Textfield.class,"lastn").clear();
		 cp5.get(Textfield.class,"email").clear();
		 cp5.get(Textfield.class,"nation").clear();
		 cp5.get(Textfield.class,"phone").clear();
	}
}