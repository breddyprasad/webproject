package CollectionsFrome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Reddy");
		
		
		String St=list.get(0);
		String St1=list.get(1);
		System.out.println("element is :"+St);
		
		System.out.println("...........................");
		
		
		System.out.println("element is : " +St1);
		
		
		
		Iterator<String> it= list.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}

}
