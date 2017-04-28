package CollectionsFrome;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListing {
	public static void main(String[] args) {
		
		
		ArrayList<String> arr =new ArrayList<String>();
		
		
		arr.add("reddy ");
		arr.add("prasad");
		
		arr.add("reddy ");
		arr.add("prasad");
		
		arr.add("reddy ");
		arr.add("prasad");
		arr.add("reddy ");
		arr.add("prasad");
		arr.add("reddy ");
		arr.add("prasad");
		// By using iterator 
		
		Iterator it =arr.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
			
			System.out.println("...........Hi how are you............");
			
			// By using for each loop
			
			
			for (String string : arr) {
				
				System.out.println(string);
			}
			
			
		}
	}

}
