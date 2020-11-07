package model;

import processing.core.PApplet;
import processing.core.PFont;
import java.util.ArrayList;
import controlP5.*;


public class Logic {
	
private PApplet app ;
private ControlP5 p5;
public Contact contacto;
private ArrayList<Contact> contacts;


	public Logic(PApplet app, ControlP5 p5) {
		this.app=app;
		this.p5=p5;
		
		
		contacts = new ArrayList<Contact>();
	}
	
	public void userReg(String name, String lastn, String email, String nation, int phone, String password){
		
		User user = new User(name, lastn, email, nation, phone, password);
		
	}
	
	public void addContact(String name, String lastn, String email, String nation, int phone){
	
		
		 contacto = new Contact(name, lastn, email, nation, phone);
		 contacts.add(contacto);

	}
	
	public void drawList() {
		app.fill(0);
		app.text(contacto.getPhone(),100,100);
		System.out.println(contacto.getName());
		System.out.println(contacto.getLastn());
		System.out.println(contacto.getEmail());
		System.out.println(contacto.getNation());
		System.out.println(contacto.getPhone());
		 
/*for (int i = 0; i < contacts.size(); i++) {
	
 
}*/
			
			
			
		
		
}
}
