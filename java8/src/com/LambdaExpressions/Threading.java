package com.LambdaExpressions;

public class Threading {
	
	public static void main(String[] args) {
		
		// without Lambda
		
		
		Runnable r=new Runnable() {
			
			
			public void run() {
			System.out.println("Thread is Running.......");
				
			}
		};
		
		Thread t1=new Thread(r);
		t1.start();
		
		
		
		// with lambda 
		
		Runnable ra=()->{
			
			System.out.println("Thread2 is Running ......");
		};
		Thread t2= new Thread(ra);
		t2.start();
		
		
		
	}

}
