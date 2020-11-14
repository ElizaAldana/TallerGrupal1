package model;

public class Card {

	private String titular, date;
	private int number, cvv;
	
	public Card (String titular, String date, int number, int cvv) {
		super();
		this.date=date;
		this.cvv=cvv;
		this.number=number;
		this.titular=titular;
		
		
	}
}
