package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class ScreenRegister {

	PApplet app;
	PImage register;
	ControlP5 cp5;
	String name,lastn, email,nation, password;
	float phone;

		public  ScreenRegister(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		
		register= app.loadImage("pngs/3.png");
		
		//cambiar las coordenadas para que den con los espacios de los png
		cp5.addTextfield("name")
		  .setPosition(50,0)
		  .setSize(250,60)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
		 
		 cp5.addTextfield("lastn")
	     .setPosition(50,100)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("email")
	     .setPosition(50,200)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("nation")
	     .setPosition(50,300)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("phone")
	     .setPosition(50,400)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("password")
	     .setPosition(50,500)
	     .setSize(250,60)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
	}
		
			
		public void regU() {
			
		name = cp5.get(Textfield.class,"name").getText();
		lastn = cp5.get(Textfield.class,"lastn").getText();
		email = cp5.get(Textfield.class,"email").getText();
		nation = cp5.get(Textfield.class,"nation").getText();	
		password = cp5.get(Textfield.class,"password").getText();
		phone =Float.parseFloat (cp5.get(Textfield.class,"phone").getText());
		}
		
		public void hide() {
			cp5.get("name").hide();
			cp5.get("lastn").hide();
			cp5.get("email").hide();
			cp5.get("nation").hide();
			cp5.get("phone").hide();
			cp5.get("password").hide();
		}
		
		public void clear() {
			cp5.get(Textfield.class,"name").clear();
			cp5.get(Textfield.class,"lastn").clear();
			cp5.get(Textfield.class,"email").clear();
			cp5.get(Textfield.class,"nation").clear();
			cp5.get(Textfield.class,"phone").clear();
			cp5.get(Textfield.class,"password").clear();
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getLastn() {
			return lastn;
		}


		public void setLastn(String lastn) {
			this.lastn = lastn;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getNation() {
			return nation;
		}


		public void setNation(String nation) {
			this.nation = nation;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public float getPhone() {
			return phone;
		}


		public void setPhone(float phone) {
			this.phone = phone;
		}
		
		
	}

