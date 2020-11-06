package model;

import java.util.Comparator;

public class CompareNationContact implements Comparator<Contact>{

	
	public int compare(Contact c1, Contact c2) {
		return c1.getNation().compareTo(c2.getNation());
	}

}
