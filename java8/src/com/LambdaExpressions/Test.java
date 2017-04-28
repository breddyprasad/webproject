package com.LambdaExpressions;



interface Reddy{
	public void draw();
	
}
public class Test {
	
	public static void main(String[] args) {
		int width=10;
		
		           // without  Lambda Expressions
		
//		Reddy r=new Reddy() {` 
//			
//			
//			public void draw() { 
//				
//				System.out.println("Drawing =" + width);
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		
	//	r.draw();
		
		            // with  Lambda Expressions
		    
		Reddy r=()->{
			
			System.out.println("Drawing ="+width);
		};
	r.draw();	
		
	}

}
