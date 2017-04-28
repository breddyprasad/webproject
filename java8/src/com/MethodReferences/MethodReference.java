package com.MethodReferences;


interface Sayable{
	void say();
	
}


public class MethodReference {
	
	
	public static void  saysomething(){
		
		System.out.println("Hello , this is Static Method ....");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sayable sa=MethodReference::saysomething;
		sa.say();
		
		
	}

}
