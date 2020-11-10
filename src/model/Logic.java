package model;

import processing.core.PApplet;
import java.util.LinkedList;




public class Logic {
	
	private PApplet app ;
	public Contact contacto;
	private LinkedList<Contact> contacts;

	public Logic(PApplet app) {
		this.app=app;
		
		contacts = new LinkedList<Contact>();
		
		
		
	}
	
	public void userReg(String name, String lastn, String email, String nation, int phone, String password){
		
		User user = new User(name, lastn, email, nation, phone, password);
		
	}
	
	public void addContact(String name, String lastn, String email, String nation, int phone){
	
		 
		 contacts.add(new Contact(name, lastn, email, nation, phone,app));

	}
	
	public LinkedList<Contact> getList() {
		return contacts;

}
			
			
}
