package model;

public class User extends Person{
	
	private String password;
	public User(String name, String lastn, String email, String nation, float phone, String password) {
		super(name, lastn, email, nation, phone);
		this.password=password;
		
	}

}
