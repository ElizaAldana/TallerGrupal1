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
			break;
		case 10:
			screenRcard.drawCard();
			break;
		case 11:
			screenBuyF.drawBuyF();
			break;
		case 12:
			screenCont.drawContact();
			for (int i=0 ;i < control.getList().size() ;i++) {
				control.getList().get(i).draw(91*i,145);
				}
				break;

		}
		}

	
	public void mouseClicked() {
		//Ordenar contactos
		
		//Cambio de pantallas
		switch(pantalla) {
		case 3:
			//DE REGISTER A LOG IN
			if((532>mouseX&&mouseX>378)&&(467>mouseY&&mouseY>416)) {
				screenReg.hide();
				screenLog.textFields();
				pantalla=2;
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
				if((527>mouseX&&mouseX>373)&&(404>mouseY&&mouseY>357)) {
					screenLog.hide();
					pantalla=4;
					}
				//DE LOG IN A HOME
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
				screenRcont.hide();
				pantalla=12;
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
				screenRcard.hide();
				pantalla=9;
			}
			break;
		case 11:
			//DE FINALIZAR COMPRA A HOME
			if((741>mouseX&&mouseX>571)&&(520>mouseY&&mouseY>466)) {
				pantalla=4;
			}
			break;
		case 12:
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
	
}