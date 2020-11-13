package model;

public class Person {
	
protected String name;
protected String lastn;
protected String email;
protected String nation;
protected float phone;

public Person(String name,String lastn,String email,String nation, float phone) {
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

public float getPhone() {
	return this.phone;
}
public float compareTo() {
	return phone;
}
}
