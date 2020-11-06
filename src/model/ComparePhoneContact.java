package model;

import java.util.Comparator;

public class ComparePhoneContact implements Comparator<Contact>{

	
	public int compare(Contact c1, Contact c2) {
		return c1.getPhone()- c2.getPhone();
	}

}
