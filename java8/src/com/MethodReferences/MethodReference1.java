package com.MethodReferences;




public class MethodReference1 {
	
	
	
    public static void ThreadStatus(){
    	System.out.println("Thread is running ...........");
    }
	public static void main(String[] args) {
		
		Thread t=new Thread(MethodReference1::ThreadStatus);
		
		
		t.start();
	}

}
