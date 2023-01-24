package com.javapractice;

import java.util.HashMap;

public class Lec6Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hashmap= when we need to store paired (key, value) value
		//syntax
		// Hashmap<datatype1, datatype2> variable name = new HashMap <datatype1, datatype2>();
		
		
		HashMap<String, String> country = new HashMap <String, String>();
		
		//add data with put () method
		
		country.put("Bangladesh", "Dhaka");
		country.put("Germany", "Berlin");
		country.put("Norway", "Oslo");
		country.put("USA", "Washington DC");
		
		
		System.out.println(country);
		
		country.remove("Bangladesh");
		
		//System.out.println(country);
		
		country.put("France", "Paris");
		
		//to clear all data and ket set
		// country.clear();
		
		//using for loop for HashMap
		
		//printing keys only
		for(String i : country.keySet()) {
			System.out.println(i);
		}
		//printing values only
		for(String i : country.values()) {
			System.out.println(i);
		}
		//printing keys and values together
		for(String i : country.keySet()) {
			System.out.println("Country: " + i + " Capital: " + country.get(i));
		}
		
		
		
		
		
		//homework store 5 student name and ID and get the size of Hashmap
		
		HashMap<String, Integer> StudentID = new HashMap <String, Integer>();
		
		StudentID.put("Allen", 1001);
		StudentID.put("Bryant", 1002);
		StudentID.put("Crawford", 1003);
		StudentID.put("Davis", 1004);
		StudentID.put("Emerson", 1005);
		
		System.out.println(StudentID);
		
		for (String a: StudentID.keySet()) {
			System.out.println("Student Last Name: " + a + ", ID Number: " + StudentID.get(a));
		}
		
System.out.println(StudentID.size());
		
		
		//assignment 1: difference between Array List and HashMap
		// 1.Syntax is different 2. In HashMap we add by using .put (.add for ArrayList) 3. There is key/value in HashMap
		// 4. There is no index on HashMap 5. Can change data on ArrayList with .set but not on HashMap
		
	//	HashMap<String, String> country0 = new HashMap <String, String>();
	//	HashMap<String, Integer> country1 = new HashMap <String, Integer>();
	//	HashMap<Integer, Integer> country2 = new HashMap <Integer, Integer>();
	//	HashMap<Integer, String> country3 = new HashMap <Integer, String>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
