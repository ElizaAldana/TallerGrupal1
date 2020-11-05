package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Controller control;

	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		control = new Controller();
	}
	
	public void draw() {
		background(250);
}
}