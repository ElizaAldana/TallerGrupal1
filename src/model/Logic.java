package model;

import processing.core.PApplet;
import processing.core.PFont;
import java.util.ArrayList;
import java.util.LinkedList;

import controlP5.*;


public class Logic {
	
private PApplet app ;
private ControlP5 p5;
public Contact contacto;
private LinkedList<Contact> contacts;


	public Logic(PApplet app, ControlP5 p5) {
		this.app=app;
		this.p5=p5;
		
		contacts = new LinkedList<Contact>();
		
	}
	
	public void userReg(String name, String lastn, String email, String nation, int phone, String password){
		
		User user = new User(name, lastn, email, nation, phone, password);
		
	}
	
	public void addContact(String name, String lastn, String email, String nation, int phone){
	
		
		 contacto = new Contact(name, lastn, email, nation, phone);
		 contacts.add(contacto);

	}
	
	public LinkedList<Contact> getList() {
return contacts;
}
			
			
}
