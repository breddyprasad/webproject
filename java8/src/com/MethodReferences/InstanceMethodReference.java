package com.MethodReferences;

public class InstanceMethodReference {
	 public void Printingmsg(){
		 System.out.println("Hi this printing mesgess.....");
		 
	 }

	 public static void main(String[] args) {
		
		 Thread t =new Thread(new InstanceMethodReference()::Printingmsg);
		 
		 t.start();
	}
	 
}
