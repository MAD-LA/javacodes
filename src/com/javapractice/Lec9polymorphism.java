package com.javapractice;

public class Lec9polymorphism {
	
	//method over loading = same method name but different parameters/ arguments
	//method overriding, also polymorphism - check lec10ab2 and lec11
	
	public void fblogin (String email, String PW) {}
	public void fblogin (int phonenumber, String PW) {}
	public void fblogin () {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
