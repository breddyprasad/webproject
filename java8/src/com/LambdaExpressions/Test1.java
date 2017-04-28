package com.LambdaExpressions;


 interface Sayable{
	 public String say();
	 
 }
public class Test1 {
	public static void main(String[] args) {
		
		
		// no parameter
		
		Sayable s=()->{
			return" I am in offices. ";
					
		};
		System.out.println(s.say());
		
		//single parameter
	}

}
