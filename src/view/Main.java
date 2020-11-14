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
	
	ScreenRegC screenRcont;
	ScreenLogIn screenLogIn;
	ScreenRegister screenReg;
	
	public void settings() {
		size(900,600);
	
	}
	
	public void setup() {
		PFont font = createFont("arial",20);
		 textFont(font);
		cp5 = new ControlP5(this);
		screenRcont = new ScreenRegC(this);
		//screenReg = new ScreenRegister(this); Activar cuando ya est�n las pantallas
		control = new Controller(this,cp5);
	}
	
	public void draw() {
		background(250);
		
		fill(255,0,0);
		rect(0,450,width/2,100);
		
		fill(0,0,255);
		rect(width/2,450,width/2,100);
		
		text(mouseX+","+mouseY,mouseX,mouseY); //To know the coordinates
		
		
		
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
			
		//para esconder los cuadros - usar en los cambios de pantalla
		hide();
		}
	}
	
	//Activar cuando est�n las pantallas
		/*if(mouseY>450&&mouseX<width/2) {
		regU();
		clear();
	}
		if(mouseY>450&&mouseX<width/2) {
		hide();
	}
	}*/
	
		//funcion para registrar contactos
		public void regC() {
				
		//esta zona toma los valores que se escriban en los cuadros de texto y lo convierte en variables
		//EXCEPCIONES
		screenRcont.regC();
		String
		name = screenRcont.getName(),
		lastn = screenRcont.getLastn(),
		email = screenRcont.getEmail(),
		nation = screenRcont.getNation();
		float phone = screenRcont.getPhone();
		
		control.regC(name,lastn,email,nation,phone);
		}
		
		//Esto tambi�n para cuando est� la pantalla
		/*public void regU() {
		screenReg.regU();
		String 
		name = screenReg.getName(),
		lastn = screenReg.getLastn(),
		email = screenReg.getLastn(),
		nation = screenReg.getNation(),
		password = screenReg.getPassword();
		float phone = screenReg.getPhone();
		
		control.regU(name, lastn, email, nation, phone, password);
		}
	*/
	public void LogIn() {
		screenLogIn.logIn(this);
	}
	
	public void hide() {
		/*con esta funcion hide puedes esconder los cuadros de ingreso de texto, 
		usar en los cambios de pantalla o cuando se hayan dejado de usar*/
		screenRcont.hide();
	}
	public void clear() {
		screenRcont.clear();
	}
	public void keyPressed() {
		control.sortContact(key);
	}	
	
	
}