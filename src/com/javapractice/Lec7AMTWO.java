package com.javapractice;

public class Lec7AMTWO {
	
	//private method and attribute
			private void method1 () {
			}
			
			private String jam1="Practice private string";
			
			//default method and attribute
			void method2 () {
			}
			
			String jam2= "Practice default string";
			
			//public method and attribute
			
			public void method3 () {
			}
			
			public String jam3="Practice public string";
			
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Lec7Accessmodifier obj = new Lec7Accessmodifier ();
		
		obj.method1();
		obj.signup();
	
			
		Lec7AMTWO am= new Lec7AMTWO ();
	   System.out.println(am.jam1);
	   System.out.println(am.jam2);
	   System.out.println(am.jam3);
	   
	   
	   
	   
		
		
		
		
	}

}
