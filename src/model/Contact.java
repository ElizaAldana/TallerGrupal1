package model;

public class Contact extends Person implements Comparable <Contact>{



	public Contact(String name, String lastn, String email, String nation, int phone) {
		super(name, lastn, email, nation, phone);
		// TODO Auto-generated constructor stub
	}

	
	
	public String compareTo(Contact c) {
		return this.name - c.getName();
	}

//}
