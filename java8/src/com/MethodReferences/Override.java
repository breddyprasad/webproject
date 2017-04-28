package com.MethodReferences;

import java.util.function.BiFunction;

  class Arithmetic {
	 
	 
	 
	 public static int add(int a, int b){
		 return a+b;
		 
	 }

		 
	 public static float add(int a, float b){
		 return a+b;
		 
	 }
	 
	 

	 public static float add(float a,float b){
		 return a+b;
		 
	 }
	 
 }
public class Override {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> adding =Arithmetic::add;
		BiFunction<Integer, Integer, Integer>adding1= Arithmetic::add;
		BiFunction< Integer , Integer , Integer> adding2 =Arithmetic::add;
		
		
		int result  =adding.apply(20, 30);
		float result1 = adding1.apply(20,30);
		float result2 = adding2.apply(40, 20);
		
		
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
		
		
		
		
		

	}

}
