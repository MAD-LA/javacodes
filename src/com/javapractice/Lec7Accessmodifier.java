package com.javapractice;

public class Lec7Accessmodifier {
	
	
	//method
	//syntax: access modifier returntype method name (argument1, argument2){}
	
	public void method1() {
		System.out.println("nexttech");
	}
	
	//inside parenthesis is always called argument or parameter, same thing
	
	public void fblogin(String email, String pw) {	
	}
	
	// default method (not private or public)
	void signup() {	
	}
	
	private void methodprivate () {	
	}
	
	//public access modifier
	public int num=10;

	//default access modifier
	String car="BMW";
	
	//private access modifier
	private String flower="Rose";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax for object
		//Lec7Accessmodifier am= new Lec7Accessmodifier ();
		
		//System.out.println(am.flower);
		
		Lec7AMTWO am= new Lec7AMTWO ();
		System.out.println(am.jam2);
		System.out.println(am.jam3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
