package model;

public class Contact extends Person implements Comparable <Contact>{

	public Contact(String name, String lastn, String email, String nation, int phone) {
		super(name, lastn, email, nation, phone);
		// TODO Auto-generated constructor stub
	}

	
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	//public int compareTo(Contact c) {
		// TODO Auto-generated method stub
		//return this.name - c.getName();
	}

//}
