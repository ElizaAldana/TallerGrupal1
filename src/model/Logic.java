package model;

import processing.core.PApplet;

import java.util.Collections;
import java.util.LinkedList;




public class Logic {
	
	private PApplet app ;
	public Contact contacto;
	private Card card;
	private LinkedList<Contact> contacts;
	private CompareEmailContact email;
	private CompareLastNContact lastn;
	private CompareNationContact nation;
	private ComparePhoneContact phone;
	
	public Logic(PApplet app) {
		this.app=app;
		this.email= new CompareEmailContact();
		this.lastn= new CompareLastNContact();
		this.nation= new CompareNationContact();
		this.phone= new ComparePhoneContact();
		
		contacts = new LinkedList<Contact>();
		
		
		
	}
	
	public void userReg(String name, String lastn, String email, String nation, float phone, String password){
		
		User user = new User(name, lastn, email, nation, phone, password);
		
	}
	
	public void addContact(String name, String lastn, String email, String nation, float phone){
	
		 
		 contacts.add(new Contact(name, lastn, email, nation, phone,app));

	}
	
	public void addCard(String titular, String date, int number, int cvv) {
		 card = new Card(titular, date, number, cvv,app);
	}


	public void sortList() {
		if(app.mouseX > 717 && app.mouseX<848 && app.mouseY > 80 && app.mouseY < 122) {
			Collections.sort(contacts);
		}
		if(app.mouseX > 717 && app.mouseX<848 && app.mouseY > 137 && app.mouseY < 191) {
			Collections.sort(contacts,lastn);
		}
		if(app.mouseX > 717 && app.mouseX<848 && app.mouseY > 215 && app.mouseY < 257) {
			Collections.sort(contacts,email);
		}
		if(app.mouseX > 717 && app.mouseX<848 && app.mouseY > 293 && app.mouseY < 323) {
			Collections.sort(contacts,nation);
		}
		if(app.mouseX > 717 && app.mouseX<848 && app.mouseY > 361 && app.mouseY < 393) {
			Collections.sort(contacts, phone);
		}
		
	}
	
	public LinkedList<Contact> getList() {
		return contacts;

	}

	
	public void setContact(LinkedList<Contact> contacts) {
		this.contacts = contacts;
	
			
}

	public Card getCard() {
		return card;
	}
}
