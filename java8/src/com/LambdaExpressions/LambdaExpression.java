package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class producet {
	 
	 int id;
	 String name;
	 float price;
	 
	 
	 public producet(int id, String name , float price ){
		 
		 super();
		 this.id=id;
		 this.name= name;
		 this.price =price;
		 
	 }

}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<producet> list= new ArrayList<producet>();
		list.add(new producet(1, "Lenovo ",2000));
		list.add(new producet(2,"Hp ",1254));
		list.add(new producet(3, "Dell ", 1500));
		
		
		
		System.out.println("Enter the product ............");
		

		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
			
			
		});
		
		for (producet p : list){
			System.out.println(p.id +" "+p.name+" "+p.price);
			
		}
	}

}
