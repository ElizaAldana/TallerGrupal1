package view;

import javax.swing.JOptionPane;

import controlP5.ControlP5;
import controlP5.Label;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

public class ScreenRegC {

	PApplet app;
	PImage regcon;
	PImage buttonAny;
	ControlP5 cp5;
	String name,lastn, email, nation;
	float phone;
	
	
	public ScreenRegC(PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		//PFont font = app.createFont("arial",20);
		regcon= app.loadImage("pngs/8.png");
		buttonAny= app.loadImage("pngs/buttons/8b.png");
		
		
		
	}
	public void drawRegC() {	
		app.imageMode(PConstants.CORNER);
		app.image(regcon,0,0,app.width,app.height);
		if((531>app.mouseX&&app.mouseX>378)&&(466>app.mouseY&&app.mouseY>416)){
			//Añadir  Button
			app.imageMode(PConstants.CORNER);
			app.image(buttonAny,0,0,app.width,app.height);
	}
	}
	public boolean isNumber() {
	    try {
	        double d = Float.parseFloat(cp5.get(Textfield.class,"phone").getText());
	    } catch (NumberFormatException nfe) {
	    	cp5.get(Textfield.class,"phone").clear();
	    	JOptionPane.showMessageDialog(null, "El teléfono debe ser un número");
	        return false;
	    }
	    return true;
	}
	public boolean isAlphabName() {
	    for (int i = 0; i < cp5.get(Textfield.class,"name").getText().length(); i++) {
	        char c = cp5.get(Textfield.class,"name").getText().charAt(i);
	        if (!Character.isLetter(c)) {
	        	cp5.get(Textfield.class,"name").clear();
	        	JOptionPane.showMessageDialog(null, "El nombre sólo puede tener caracteres alfabéticos");
	            return false;
	        }
	    }
	    return true;
	}
	public boolean isAlphabLastn() {
	    for (int i = 0; i < cp5.get(Textfield.class,"lastn").getText().length(); i++) {
	        char c = cp5.get(Textfield.class,"lastn").getText().charAt(i);
	        if (!Character.isLetter(c)) {
	        	cp5.get(Textfield.class,"lastn").clear();
	        	JOptionPane.showMessageDialog(null, "El apellido sólo puede tener caracteres alfabéticos");
	            return false;
	        }
	    }
	    return true;
	}
	public boolean isAlphabNation() {
	    for (int i = 0; i < cp5.get(Textfield.class,"nation").getText().length(); i++) {
	        char c = cp5.get(Textfield.class,"nation").getText().charAt(i);
	        if (!Character.isLetter(c)) {
	        	cp5.get(Textfield.class,"nation").clear();
	        	JOptionPane.showMessageDialog(null, "La nacionalidad sólo puede tener caracteres alfabéticos");
	            return false;
	        }
	    }
	    return true;
	}
	public boolean isNull() {
		if(cp5.get(Textfield.class,"name").getText().trim().isEmpty() ||
		   cp5.get(Textfield.class,"lastn").getText().trim().isEmpty() ||
		   cp5.get(Textfield.class,"email").getText().trim().isEmpty() ||
		   cp5.get(Textfield.class,"nation").getText().trim().isEmpty() || 
		   cp5.get(Textfield.class,"phone").getText().trim().isEmpty())
	        {
			JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.", "Woops", JOptionPane.ERROR_MESSAGE);
	           return true;
	        }else {
	        	return false;
	        }
	}
	public void textFields() {
		cp5.addTextfield("name")
		  .setPosition(68,162)
		  .setSize(331,44)
		  .setFont(app.createFont("arial",20))
		  .setAutoClear(false);
		 
		 cp5.addTextfield("lastn")
	     .setPosition(501,162)
	     .setSize(331,44)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("email")
	     .setPosition(68,255)
	     .setSize(331,44)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("nation")
	     .setPosition(501,255)
	     .setSize(331,44)
	     .setFont(app.createFont("arial",20))
	     .setAutoClear(false);
		 
		 cp5.addTextfield("phone")
	     .setPosition(291,349)
	     .setSize(331,44)
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
	}
	public void regC() {
		name = cp5.get(Textfield.class,"name").getText();
		lastn = cp5.get(Textfield.class,"lastn").getText();
		email = cp5.get(Textfield.class,"email").getText();
		nation = cp5.get(Textfield.class,"nation").getText();	
				
		//esta tuve que ponerle el "Integer.parseInt" para pasar de String a numeros
		phone =Float.parseFloat (cp5.get(Textfield.class,"phone").getText());
	}
	
	public void hide() {
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

	public float getPhone() {
		return phone;
	}

	public void setPhone(float phone) {
		this.phone = phone;
	}
	
	
		
}
