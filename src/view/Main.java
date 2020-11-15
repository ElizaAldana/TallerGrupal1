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
	ScreenInfo screenInf;
	ScreenBuy screenBuy;
	
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
		screenInf = new ScreenInfo(this);
		screenBuy = new ScreenBuy(this);
		control = new Controller(this,cp5);
	}
	
	public void draw() {
		System.out.println(pantalla);
		//System.out.println(mouseX);
		//System.out.println(mouseY);
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
		case 5:
			//INTERCONTINENTAL SCREEN
			screenInf.drawInf(0);
			break;
		case 6:
			//MOON SCREEN
			screenInf.drawInf(1);
			break;
		case 7:
			//MARS SCREEN
			screenInf.drawInf(2);
			break;
		case 8:
			screenRcont.drawRegC();
			break;
		case 9:
			screenBuy.drawBuy();
			break;
		case 12:
			
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
		//Cambio de pantallas
		//DE LOG IN A REGISTER
				if(pantalla==2&&(505>mouseX&&mouseX>394)&&(473>mouseY&&mouseY>440)) {
					screenLog.hide();
					screenReg.textFields();
					pantalla=3;
				}
				//DE LOG IN A HOME
				if(pantalla==2&&(527>mouseX&&mouseX>373)&&(404>mouseY&&mouseY>357)) {
					screenLog.hide();
					pantalla=4;
				}
		//DE SPLASH A LOG IN
		if(pantalla==1) {
		screenLog.textFields();	
		pantalla=2;	
		}
		
		if(pantalla==4&&(808>mouseX&&mouseX>695)&&(438>mouseY&&mouseY>404)) {
			//DE HOME A LISTA
			pantalla=12;
		}
		//DE HOME A INTERCONTINENTAL
		if(pantalla==4&&(206>mouseX&&mouseX>93)&&(438>mouseY&&mouseY>404)) {
			pantalla=5;
		}
		//DE HOME A LUNA
		if(pantalla==4&&(406>mouseX&&mouseX>296)&&(438>mouseY&&mouseY>404)) {
			pantalla=6;
		}
		//DE HOME A MARTE
		if(pantalla==4&&(606>mouseX&&mouseX>491)&&(438>mouseY&&mouseY>404)) {
			pantalla=7;
		}
		//REGRESAR AL HOME
		if((pantalla==5||pantalla==6||pantalla==7||pantalla==12)&&(130>mouseX&&mouseX>107)&&(81>mouseY&&mouseY>43)) {
			pantalla=4;
		}
		//DE CUALQUIER VIAJE A AÑADIR CONTACTO
		if((pantalla==5||pantalla==6||pantalla==7)&&(366>mouseX&&mouseX>217)&&(526>mouseY&&mouseY>478)) {
			screenRcont.textFields();
			pantalla=8;
		}
		//DE INTERCONTINENTAL A COMPRAR
		if(pantalla==5&&(640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
			pantalla=9;
		}
		//DE LUNA A COMPRAR
		if(pantalla==6&&(640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
			pantalla=9;
		}
		//DE MARTE A COMPRAR
		if(pantalla==7&&(640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
			pantalla=9;
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