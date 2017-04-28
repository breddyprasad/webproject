package com.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class product {
	 int id;
	 String name;
	 String add;
	 Float price;
	 
	 
	 public product(int id, String name , String add , float price){
		 
		 super();
		 this.id=id;
		 this.name= name;
		 this.add=add;
		 this.price= price;
		 
		 
	 }
	 
 }

public class TowValueCompa {

	 public static void main(String[] args) {
		
		 List<product> list = new ArrayList<product>();
		 
		 
		 
		 //list.add(new product(1, "computer ", "bangalore", 2f));
		 list.add(new product(2, "laptop", "chittoor", 250f));
		 list.add(new product(3, "tv ","ap", 10f));
		 
		 
		 
		 System.out.println(" Compare the two values ........");
		 
		 
		 Collections.sort(list,(p1,p2)-> {
			 return p1.name.compareTo(p2.name);
		 });
		 
		 for (product p:list){
			 
			 System.out.println(p.id+" "+p.name+" "+p.add+" "+p.price);
		 }
	}
}
