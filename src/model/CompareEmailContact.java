package model;

import java.util.Comparator;

public class CompareEmailContact implements Comparator<Contact>{

	
	public int compare(Contact c1, Contact c2) {
		return c1.getEmail().compareTo(c2.getEmail());
	}

}
