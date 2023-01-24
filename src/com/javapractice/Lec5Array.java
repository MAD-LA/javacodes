package com.javapractice;

import java.util.Arrays;

public class Lec5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array = where we can store multiple data in 1 variable
		//Array is fixed, we cannot add any data
		
		String [] Fruits= {"Mango","Watermelon","Orange", "Apple"};
		
		System.out.println(Fruits [0]);
		
		//how to change data in Array
		Fruits [0]="Jackfruit";
		Fruits [1]="Mango";
		
		System.out.println(Fruits [0]);
		
		System.out.println(Fruits.length);
		
		System.out.println(Arrays.toString(Fruits));
		
		//array length = number of data
		
		System.out.println(Fruits.length);
		
		//Store value 1- 10 using array
		
		int [] num = {1,2,3,4,5,6,7,8,9,10};
 		
		System.out.println(Arrays.toString(num));
		
		String [][] Cars= {{"Honda", "Toyota", "Nissan"},{"Jeep", "Ford", "Dodge"}, {"Mercedes", "BMW"}};
		System.out.println(Arrays.deepToString(Cars));
		
		System.out.println(Cars.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
