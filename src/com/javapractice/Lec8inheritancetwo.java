package com.javapractice;

public class Lec8inheritancetwo extends Lec8inheritance {

	protected void protectedmethod1 () {
		
	}
	
	void defaultmethod1 () {
		
	}
	
	public static void main(String[] args) {
		
		/* to access and reuse the code from parent class,
		   we will use inheritance concept by using:
		   1. extends key word
		   2. create object of child class
		 */
		
		Lec8inheritancetwo obj2 = new Lec8inheritancetwo ();
		obj2.method1();
		
        	
		
		
		//able to access protected method and attribute in same package class
		
		
		
		
	}

}
