package view;

import controller.Controller;
import processing.core.PApplet;
import controlP5.*;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	int pantalla;
	PImage splash;
	Controller control;
	ControlP5 cp5;
	
	ScreenRegC screenRcont;
	ScreenLogIn screenLog;
	ScreenRegister screenReg;
	ScreenHome screenHome;
	
	public void settings() {
		size(900,600);
	
	}
	
	public void setup() {
		pantalla=1;
		splash= loadImage("pngs/1.png");
		PFont font = createFont("arial",20);
		 textFont(font);
		cp5 = new ControlP5(this);
		screenRcont = new ScreenRegC(this);
		screenReg = new ScreenRegister(this);
		screenLog = new ScreenLogIn(this);
		screenHome = new ScreenHome(this);
		control = new Controller(this,cp5);
	}
	
	public void draw() {
		System.out.println(mouseX);
		System.out.println(mouseY);
		//text(mouseX+","+mouseY,mouseX,mouseY); //To know the coordinates
		switch(pantalla) {
		case 1:
			//SPLASH SCREEN
			imageMode(CORNER);
			image(splash,0,0,width,height);
			break;
		case 2:
			//LOG IN SCREEN
			screenLog.drawLog();
			break;
		case 3:
			//REGISTER SCREEN
			screenReg.drawReg();
			break;
		case 4:
			//HOME SCREEN
		screenHome.drawHome();
		break;
		}
		/*background(250);
		
		fill(255,0,0);
		rect(0,450,width/2,100);
		
		fill(0,0,255);
		rect(width/2,450,width/2,100);
		
		
		
		
		
		for (int i=0 ;i < control.getList().size() ;i++) {
			control.getList().get(i).draw(150*i,100);
			}
			fill(0);
			text("esconder",width/2,500);
			text("registrar",0,500);*/
		}
	public void mouseClicked() {
		if(pantalla==1) {
		
		screenLog.textFields();	
		pantalla=2;	
		}
		if(pantalla==2&&(505>mouseX&&mouseX>394)&&(473>mouseY&&mouseY>440)) {
			screenLog.hide();
			screenReg.textFields();
			pantalla=3;
		
		}
		if(pantalla==2&&(527>mouseX&&mouseX>373)&&(404>mouseY&&mouseY>357)) {
			screenLog.hide();
			
			pantalla=4;
		
		}
		
		//regC();
				//para vaciar el texto de los cuadros
				//clear();
		//para esconder los cuadros - usar en los cambios de pantalla
				//hide();
	}
	
	//Activar cuando estén las pantallas
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
		
		//Esto también para cuando esté la pantalla
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
		screenLog.logIn(this);
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