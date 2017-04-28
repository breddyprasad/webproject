package CollectionsFrome;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddall {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> arr=new ArrayList<String>();

		   arr.add("reddy");
		   arr.add("ravi ");
		   arr.add("swathi");
		   arr.add("divya");
		   
		   ArrayList<String> arr1= new ArrayList<String>();
		
		   arr1.add("Radikha");
		   arr1.add("sudha");
		   
		   arr.addAll(arr1);
		   
		   Iterator<String> itr= arr.iterator();
		   while(itr.hasNext());
		   System.out.println(itr.next());
	}
}
