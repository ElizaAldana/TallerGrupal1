package model;

import processing.core.PApplet;

import java.util.Collections;
import java.util.LinkedList;




public class Logic {
	
	private PApplet app ;
	public Contact contacto;
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

	public void sortList(char s) {
		switch (s) { 
		case 'c':
			Collections.sort(contacts);
			break;
		case 'l':
			Collections.sort(contacts,lastn);
			break;
		case 'e':
			Collections.sort(contacts,email);
			break;
		case 'n':
			Collections.sort(contacts,nation);
		break;
		case 'p':
			Collections.sort(contacts, phone);
		break;
		default:
			break;
		}
	}
	
	public LinkedList<Contact> getList() {
		return contacts;

	}

	
	public void setContact(LinkedList<Contact> contacts) {
		this.contacts = contacts;
	
			
}
}
