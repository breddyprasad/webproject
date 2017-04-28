package FunctionalInterface;

@FunctionalInterface
     
         interface sayable{
        	 void say (String msg ); 
         }
         
public class FunctionalInterfaceExam implements sayable {

	public void say(String msg ){
		System.out.println(msg);
		
	}
	
	public static void main(String[] args) {
		//FunctionalInterface fi =new FunctionalInterface() ;
			//fi.say("Hello there");
			
			
		}
		
	
	

}
