package controller;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.LinkedList;

import controlP5.*;
import model.Logic;
import model.Contact;


public class Controller {
	Logic logic;
	private PApplet app ;
	private ControlP5 cp5;

	public Controller(PApplet app,ControlP5 cp5) {
		this.app=app;
		this.cp5=cp5;
		
		logic = new Logic(app);
		
	}
	
	public void regC(String name, String lastn, String email, String nation, float phone) {
		
		logic.addContact(name, lastn, email, nation, phone);
	}
	public void regU(String name, String lastn, String email, String nation, float phone, String password) {
		
		logic.userReg(name, lastn, email, nation, phone, password);
	}
	public void regCard(String titular, String date, int number, int cvv) {
		logic.addCard(titular, date, number, cvv);
	}
	public void drawlist() {
		logic.getList();
		
	}
	
	public void sortContact() {
		logic.sortList();
	}

	public LinkedList<Contact> getList() {
		return logic.getList();
		
	}
	
	
}

	

	
