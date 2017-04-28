package EncodingAndDecoding;

import java.util.Base64;
import java.util.Base64.Decoder;

public class Base64Encodeingreddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// encode 
		
		Base64.Encoder encode =Base64.getMimeEncoder();
		String  Message ="This is  Qedge Technologye ......";
		
		String eStr= encode.encodeToString(Message.getBytes());
		
		System.out.println(" Encoding the code --->"+eStr);
	
		
		
		// decode 
		
		
		Base64.Decoder decoder =Base64.getMimeDecoder();
		String dStr = new String(decoder.decode(eStr));
		
		System.out.println(" Decoding ------> "+dStr);
		
		
		
		
	}

}
