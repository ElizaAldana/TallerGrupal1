package model;

public class Person {
	
private String name;
private String lastn;
private String email;
private String nation;
private int phone;

public Person(String name,String lastn,String email,String nation, int phone) {
	this.name=name;
	this.lastn=lastn;
	this.email=email;
	this.nation=nation;
	this.phone=phone;
}

public String getName() {
	return this.name;
}

public String getLastn() {
	return this.lastn;
}

public String getEmail() {
	return this.email;
}

public String getNation() {
	return this.nation;
}

public int getPhone() {
	return this.phone;
}
}
