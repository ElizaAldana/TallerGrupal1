package view;

import controlP5.ControlP5;
import controlP5.Label;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ScreenRegister {

	PApplet app;
	PImage register;
	PImage button3;
	ControlP5 cp5;
	String name,lastn, email,nation, password;
	float phone;

		public  ScreenRegister(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		
		register= app.loadImage("pngs/3.png");
		button3 = app.loadImage("pngs/buttons/3b.png");
		
		//cambiar las coordenadas para que den con los espacios de los png
	
	}
		public void textFields() {
			cp5.addTextfield("name")
			  .setPosition(67,136)
			  .setSize(332 ,44)
			  .setFont(app.createFont("arial",20))
			  .setAutoClear(false);
			 
			 cp5.addTextfield("email")
		     .setPosition(67,231)
		     .setSize(332,46)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			 
			 cp5.addTextfield("phone")
		     .setPosition(67,332)
		     .setSize(332,44)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			 
			 cp5.addTextfield("lastn")
		     .setPosition(502,136)
		     .setSize(332,44)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			 
			 cp5.addTextfield("nation")
		     .setPosition(502,232)
		     .setSize(332,44)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			 
			 cp5.addTextfield("password")
		     .setPosition(502,331)
		     .setSize(332,44)
		     .setFont(app.createFont("arial",20))
		     .setAutoClear(false);
			//Esconder las etiquetas
				Label labelN = cp5.get(Textfield.class,"name").getCaptionLabel();
				labelN.hide();
				Label labelL = cp5.get(Textfield.class,"lastn").getCaptionLabel();
				labelL.hide();
				Label labelE = cp5.get(Textfield.class,"email").getCaptionLabel();
				labelE.hide();
				Label labelNa = cp5.get(Textfield.class,"nation").getCaptionLabel();
				labelNa.hide();
				Label labelP = cp5.get(Textfield.class,"phone").getCaptionLabel();
				labelP.hide();
				Label labelPa = cp5.get(Textfield.class,"password").getCaptionLabel();
				labelPa.hide();
		}
		public boolean isNumber() {
		    try {
		        double d = Float.parseFloat(cp5.get(Textfield.class,"phone").getText());
		    } catch (NumberFormatException nfe) {
		        return false;
		    }
		    return true;
		}
		public boolean isAlphab(String word) {
		    for (int i = 0; i < word.length(); i++) {
		        char c = word.charAt(i);
		        if (!Character.isLetter(c)) {
		            return false;
		        }
		    }
		    return true;
		}
		public void drawReg() {
			app.imageMode(PConstants.CORNER);
			app.image(register,0,0,app.width,app.height);
			if((532>app.mouseX&&app.mouseX>378)&&(467>app.mouseY&&app.mouseY>416)){
				app.imageMode(PConstants.CORNER);
				app.image(button3,0,0,app.width,app.height);
				}
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

