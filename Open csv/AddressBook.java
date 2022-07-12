package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;


public class AddressBook  {

	public static List<String[]> createCsvDataSimple() {
		
		    String[] header = {"FirstName", "LastName", "City"};
	        String[] record1 = { " Nikhil ", " Pawar ", " Dhule "};
	        String[] record2 = { " Aryan ", " Patil ", " Amalner "};
	        String[] record3 = { " Pawan ", " Pawar ", " Dhule "};

	        List<String[]> list = new ArrayList<>();
	        list.add(header);
	        list.add(record1);
	        list.add(record2);
	        list.add(record3);

	       return list;
	      
	}
	
}
