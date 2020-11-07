package controller;

import processing.core.PApplet;
import java.util.ArrayList;
import controlP5.*;
import model.Logic;


public class Controller {
	Logic logic;
	private PApplet app ;
	private ControlP5 cp5;

	public Controller(PApplet app,ControlP5 cp5) {
		this.app=app;
		this.cp5=cp5;
		
		logic = new Logic(app, cp5);
		
	}
	
	public void regC(String name, String lastn, String email, String nation, int phone) {
		
		logic.addContact(name, lastn, email, nation, phone);
	}

	public void drawlist() {
		logic.drawList();
		
	}

	public void getList() {
		logic.getList();
		
	}
}

	

	
