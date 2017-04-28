package com.LambdaExpressions;


interface Single {
	public String say(String name );

}
public class Test2 {
	public static void main(String[] args) {
		
		//parameter
		
		Single s=(name)->{
			
			
			return "Hell ---> "+name;
			
			
		};
		
		System.out.println(s.say("reddy"));
		
		
		
		// parameter
		
		Single s1=(name)->{
			
			return "Hello----> "+name;
			
		};
		
		System.out.println(s1.say("prasad"));
	}
	
	

}
