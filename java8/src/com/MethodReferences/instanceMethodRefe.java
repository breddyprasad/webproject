package com.MethodReferences;

import java.util.function.BiFunction;

class Arthima{
    	public int add(int a,int b){
    		return a+b;
    		
    		
    	}
    }


public class instanceMethodRefe {
	
	public static void main(String[] args) {
		
		BiFunction<Integer , Integer,Integer>add =  new Arthima()::add;
		 int result =add.apply(20, 30);
		 System.out.println(result);
		
	}
	

}
