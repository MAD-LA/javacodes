package com.javapractice;

import java.util.ArrayList;

public class Lec5ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array List which is resizable and can add/ remove/ exchange 
		// Syntax: ArrayList<datatype> variable name= new ArrayList<datatype>();
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		
		ArrayList<String> sportscar = new ArrayList<String>();
		
		//how to add data in ArrayList
		
		sportscar.add("BMW");
		sportscar.add("Nissan gtr");
		sportscar.add("Mustang");
		sportscar.add("Dodge");
		
		//to remove
		//variablename.remove(index #);
		
		sportscar.remove(3);
		
		//to access data
		
		sportscar.get(0);
		
		System.out.println(sportscar.get(0));
		
		//to exchange the data
		//variablename.set(index #, "datatype");
		sportscar.set(1, "Mercedes");
		
		System.out.println(sportscar.get(1));
		
		//use size instead of length to get number of data
		
		//for loop to print
		
		for (int i=0; i<sportscar.size(); i++ ){
			System.out.println(sportscar.get(i));
		}
		
		
		//practice with 4 flowers
		
		
ArrayList<String> flowers = new ArrayList<String>();
		
		flowers.add("roses");
		flowers.add("lilies");
		flowers.add("daisies");
		flowers.add("peonies");
		
		for (int a=0; a<flowers.size(); a++ ){
			System.out.println(flowers.get(a));
		}
		
		
		
		
		
		
		
	}

}
