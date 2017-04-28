package com.LambdaExpressions;


interface addable{
	int add(int a,int b);
	
}
public class Mulitple {
	public static void main(String[] args) {
		
		//Multiple parameters in Lambda expression
		
		addable ad=(a,b)->{
		//System.out.println(ad.add(10, 20));
		return (a+b);
		
		};
		
		System.out.println(ad.add(10, 20));
		
		
		
		addable ad1=( a,b)->{
			return (a+b);
			
			
		};
		
		System.out.println(ad1.add(200,3000));
		
		
	}

}
