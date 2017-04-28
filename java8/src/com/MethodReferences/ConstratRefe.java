package com.MethodReferences;

import java.security.MessageDigestSpi;

import javax.annotation.processing.Messager;

interface Messagerable{
	Messager getmessage(String msg);
	
}

 class message{
	 
	 public message(String msg ){
		 System.out.println(msg);
	 }
 }

public class ConstratRefe {

	public static void main(String[] args) {
		//Messagerable Hello =message::new;
		
		//Hello.getmessage("hello how are you....");
		
	}
}
