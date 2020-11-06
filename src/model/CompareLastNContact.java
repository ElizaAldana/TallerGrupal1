package model;

import java.util.Comparator;

public class CompareLastNContact implements Comparator<Contact>{

	public int compare(Contact c1, Contact c2) {
		return c1.getLastn().compareTo(c2.getLastn());
	}

}
