package EncodingAndDecoding;

import java.util.Base64;
import java.util.Base64.Decoder;

public class Base64Ecncodeing {
	
	public static void main(String[] args) {
		
		Base64.Encoder encode =Base64.getMimeEncoder();
		
		
		   //encode
		
		String Message =" Hello , \this is theis my first massege..... ";
		
		String eStr=encode.encodeToString(Message.getBytes());
		
		System.out.println("Encoded MiME :" +eStr);
		
		// Decode 
		
		Base64.Decoder decoder =Base64.getMimeDecoder();
		
		String dStr= new String(decoder.decode(eStr));
		System.out.println("Decoding the message :"+ dStr);
		
		
	}

}
