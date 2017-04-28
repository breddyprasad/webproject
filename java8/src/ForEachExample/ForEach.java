package ForEachExample;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String > For= new ArrayList<String >();
		
		For.add("String ....");
		For.add("java....");
		For.add("Selenium...");
		For .add("Core java....");
		For.add("String ....");
		System.out.println(" .......... this is the for each loop opratin Lambda ............");
		
		
		For.stream().forEach(game->System.out.println(game));
		
		
		System.out.println("................. This is the main java Operations ..................");
		For.stream().forEach(System.out::println);
		
	}

}
