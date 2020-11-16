package view;

import controller.Controller;
import processing.core.PApplet;

import java.util.Collections;

import javax.swing.JOptionPane;

import controlP5.*;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	int pantalla;
	int contactos;
	PImage splash;
	Controller control;
	ControlP5 cp5;
	
	ScreenRegC screenRcont;
	ScreenLogIn screenLog;
	ScreenRegister screenReg;
	ScreenHome screenHome;
	ScreenInfo screenInf;
	ScreenBuy screenBuy;
	ScreenRegCard screenRcard;
	ScreenBuyFinish screenBuyF;
	ScreenContacts screenCont;
	
	int compareClick;
	
	public void settings() {
		size(900,600);
	
	}
	
	public void setup() {
		pantalla=1;
		contactos=1;
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
		screenCont = new ScreenContacts(this);
		screenRcard = new ScreenRegCard(this);
		screenBuyF = new ScreenBuyFinish(this);
		control = new Controller(this,cp5);
	}
	
	public void draw() {
		//System.out.println(pantalla);
		System.out.println(mouseX);
		System.out.println(mouseY);
		
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
			text(mouseX +","+ mouseY ,mouseX,mouseY);
			text(screenInf.getCost(),678,191);
			text(screenInf.getCost(),186,365);
			text(screenInf.getInfo(),308,187);
			if(control.getCard()==null) {
				text("Sin registrar", 298, 272);
			}else {
				//dibujar los valores de la targeta
			control.getCard().drawNumber(298, 272);
			}
			break;
		case 10:
			screenRcard.drawCard();
			break;
		case 11:
			screenBuyF.drawBuyF();
			text(mouseX +","+ mouseY ,mouseX,mouseY);
			//este if evita que de un error antes de que "card" sea ingrsado y permite poner un mensaje de que el usuario debe hacerlo
			if(control.getCard()==null) {
				text("No has ingresado ninguna tarjeta", 200, 70);
			}else {
				//dibujar los valores de la targeta
			control.getCard().drawTitular(295, 152);
			text(screenInf.getInfo(),283, 229);
			control.getCard().drawNumber(268, 326);
			text(screenInf.getCost(),235,409);
			
			}
			break;
		case 12:
			screenCont.drawContact();
			for (int i=0 ;i < control.getList().size() ;i++) {
				control.getList().get(i).drawName(91,137+(i*50));
				
				switch(compareClick) {
				case 0:
					control.getList().get(i).drawName(295,137+(i*50));
					break;
				case 1:
					control.getList().get(i).drawApellido(295,137+(i*50));
					break;
				case 2:
					control.getList().get(i).drawEmail(295,137+(i*50));
					break;
				case 3:
					control.getList().get(i).drawPhone(295,137+(i*50));
					break;
				case 4:
					control.getList().get(i).drawNation(295,137+(i*50));
					break;
				}
				
				}
			
			break;

		}
		}

	
	public void mouseClicked() {		
		//Cambio de pantallas
		switch(pantalla) {
		case 3:
			//DE REGISTER A LOG IN
			if((532>mouseX&&mouseX>378)&&(467>mouseY&&mouseY>416)) {
				if(!screenReg.isNull()&&screenReg.isNumber()&&screenReg.isAlphabName()&&screenReg.isAlphabLastn()&&screenReg.isAlphabNation()) {
				screenReg.regU();
				screenReg.hide();
				screenLog.textFields();
				pantalla=2;
			}
				}
			break;
		case 2:
			//DE LOG IN A REGISTER
			if((505>mouseX&&mouseX>394)&&(473>mouseY&&mouseY>440)) {
				screenLog.hide();
				screenReg.textFields();
				pantalla=3;
			}
			//DE LOG IN A HOME
			//aca debo poner la cosa para que ingrese con el login lo de register
			if((527>mouseX&&mouseX>373)&&(404>mouseY&&mouseY>357)) {
				screenLog.hide();
				pantalla=4;
					
					}
				
			break;
		case 1:
			//DE SPLASH A LOG IN
			screenLog.textFields();	
			pantalla=2;	
			break;
		case 4:
			//DE HOME A LISTA
			if((808>mouseX&&mouseX>695)&&(438>mouseY&&mouseY>404)) {
				pantalla=12;
			}
			//DE HOME A INTERCONTINENTAL
			if((206>mouseX&&mouseX>93)&&(438>mouseY&&mouseY>404)) {
				pantalla=5;
			}
			//DE HOME A LUNA
			if((406>mouseX&&mouseX>296)&&(438>mouseY&&mouseY>404)) {
				pantalla=6;
			}
			//DE HOME A MARTE
			if((606>mouseX&&mouseX>491)&&(438>mouseY&&mouseY>404)) {
				pantalla=7;
			}
			break;
		case 5:
			//REGRESAR AL HOME
			if((130>mouseX&&mouseX>107)&&(81>mouseY&&mouseY>43)) {
				pantalla=4;
			}
			//DE CUALQUIER VIAJE A AÑADIR CONTACTO
			if((366>mouseX&&mouseX>217)&&(526>mouseY&&mouseY>478)) {
				screenRcont.textFields();
				pantalla=8;
			}
			//DE INTERCONTINENTAL A COMPRAR
			if((640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
				pantalla=9;
			}
			//DE INTERCONTINENTAL A COMPRAR
			if((640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
				pantalla=9;
			}
			break;
		case 6:
			//REGRESAR AL HOME
			if((130>mouseX&&mouseX>107)&&(81>mouseY&&mouseY>43)) {
				pantalla=4;
			}
			if((366>mouseX&&mouseX>217)&&(526>mouseY&&mouseY>478)) {
				screenRcont.textFields();
				pantalla=8;
			}
			//DE LUNA A COMPRAR
			if((640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
				pantalla=9;
			}
			break;
		case 7:
			//REGRESAR AL HOME
			if((130>mouseX&&mouseX>107)&&(81>mouseY&&mouseY>43)) {
				pantalla=4;
			}
			if((366>mouseX&&mouseX>217)&&(526>mouseY&&mouseY>478)) {
				screenRcont.textFields();
				pantalla=8;
			}
			//DE MARTE A COMPRAR
			if((640>mouseX&&mouseX>490)&&(526>mouseY&&mouseY>478)) {
				pantalla=9;
			}
			break;
		case 8:
			if((531>mouseX&&mouseX>378)&&(466>mouseY&&mouseY>416)) {
				if(!screenRcont.isNull()&&
						screenRcont.isNumber()&&
						screenRcont.isAlphabName()&&
						screenRcont.isAlphabLastn()&&
						screenRcont.isAlphabNation()) {
				screenRcont.hide();
				regC();
				pantalla=12;
			}
			}
			
			break;
		case 9:
			//DE COMPRAR A AÑADIR TARJETA
			if((678>mouseX&&mouseX>538)&&(307>mouseY&&mouseY>259)) {
				screenRcard.textFields();
				pantalla=10;
			}
			//DE COMPRAR A FINALIZAR COMPRA
			if((518>mouseX&&mouseX>379)&&(472>mouseY&&mouseY>432)) {
				pantalla=11;
			}
			break;
		case 10:
			//DE AÑADIR TARJETA A COMPRAR
			if((543>mouseX&&mouseX>349)&&(440>mouseY&&mouseY>380)) {
				if(!screenRcard.isNull()&&screenRcard.isNumberNumber()&&screenRcard.isAlphabTitular()&&screenRcard.isNumberCvv()) {
				regCard();
				screenRcard.hide();
				pantalla=9;
			}}
			break;
		case 11:
			//DE FINALIZAR COMPRA A HOME
			if((741>mouseX&&mouseX>571)&&(520>mouseY&&mouseY>466)) {
				pantalla=4;
			}
			break;
		case 12:
			
			//Metodo de sort en el caso 12
			control.sortContact();
			compareClickdesu();
			
			//REGRESAR AL HOME
			if((130>mouseX&&mouseX>107)&&(81>mouseY&&mouseY>43)) {
				pantalla=4;
			}
			//AÑADIR CONTACTO
			if((866>mouseX&&mouseX>716)&&(514>mouseY&&mouseY>465)) {
				screenRcont.textFields();
				pantalla=8;
			}
			break;
		}
		}

	
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
		
	
	public void LogIn() {
		screenLog.logIn(this);
	}
	
	
	public void regCard() {
		
		screenRcard.regCard();
		String 
		titular = screenRcard.getTitular(), 
		date = screenRcard.getDate();
		int
		number = screenRcard.getNumber(),
		cvv = screenRcard.getCvv();
		
		control.regCard(titular, date,number ,cvv );
	}
	
	public void hide() {
		/*con esta funcion hide puedes esconder los cuadros de ingreso de texto, 
		usar en los cambios de pantalla o cuando se hayan dejado de usar*/
		screenRcont.hide();
	}
	public void clear() {
		screenRcont.clear();
	}
	
	public void compareClickdesu() {
		if(mouseX > 717 && mouseX<848 && mouseY > 80 && mouseY < 122) {
			compareClick = 0;
		}
		if(mouseX > 717 && mouseX<848 && mouseY > 137 && mouseY < 191) {
			compareClick = 1;
		}
		if(mouseX > 717 && mouseX<848 && mouseY > 215 && mouseY < 257) {
			compareClick = 2;
		}
		if(mouseX > 717 && mouseX<848 && mouseY > 293 && mouseY < 323) {
			compareClick = 3;
		}
		if(mouseX > 717 && mouseX<848 && mouseY > 361 && mouseY < 393) {
			compareClick = 4;
		}
	}
	
}