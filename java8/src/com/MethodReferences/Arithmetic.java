package com.MethodReferences;

import java.util.function.BiFunction;

class Method{
    	 public static int add(int a,int b){
	    	  return a+b;
	    	  
	      }
}

    
public class Arithmetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 BiFunction<Integer,Integer, Integer> add =Method::add;
			 int result =add.apply(20, 30);
			 System.out.println(result);
	}

}
