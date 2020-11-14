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
	
	//También para register (no sé si cambiarlo a user en model)
	String datos;
	String datos1;
	String datos2;
	String datos3;
	String datos4;
	ScreenReg screenReg;
	ScreenLogIn screenLogIn;
	
	public void settings() {
		size(900,600);
	
	}
	
	public void setup() {
		PFont font = createFont("arial",20);
		 textFont(font);
		cp5 = new ControlP5(this);
		screenReg = new ScreenReg(this);
		//screenLogIn = new ScreenLogIn(this);
		
		//se puede borrar si me dicen que sí lo dejemos así separado xd
		//estos son los campos de texto
		/*cp5.addTextfield("name")
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
	     .setAutoClear(false);*/
		
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
			
		//para esconder los cuadros- usar en los cambios de pantalla
		hide();
		}
	}
	
		//funcion para registrar
		public void regC() {
				
		//esta zona toma los valores que se escriban en los cuadros de texto y lo convierte en variables
		//EXCEPCIONES
		screenReg.regScreen();
		String
		name = screenReg.getName(),
		lastn = screenReg.getLastn(),
		email = screenReg.getEmail(),
		nation = screenReg.getNation();
		float phone = screenReg.getPhone();
		
		control.regC(name,lastn,email,nation,phone);
		
		//Para register (es la base de datos) tampoco sé si ponerlo en user
		datos = datos + ":" + name;
		datos1 = datos1 + ":" + lastn;
		datos2 = datos2 + ":" + email;
		datos3 = datos3 + ":" + nation;
		datos4 = datos4 + ":" + phone;
		
		}
	
	public void LogIn() {
		screenLogIn.logIn(this);
	}
	
	public void hide() {
		/*con esta funcion hide puedes esconder los cuadros de ingreso de texto, 
		usar en los cambios de pantalla o cuando se hayan dejado de usar*/
		screenReg.hide();
	}
	public void clear() {
		screenReg.clear();
	}
	public void keyPressed() {
		control.sortContact(key);
	}

	//son para los datos del register
	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}
	
	
	
}