package EncodingAndDecoding;

import java.util.Base64;
import java.util.Base64.Decoder;

public class Coding {
	public static void main(String[] args) {
		
		
		 // Encoder
		
		   Base64.Encoder encode=Base64.getEncoder();
		   
		   String Str=encode.encodeToString("http://www.google.com/".getBytes());
		   
		   
		   System.out.println("Encoded URL :" +Str);
		   
		   
		   // Decoder
		   
		   
		   Base64.Decoder decoder=Base64.getDecoder();
		   
		//   String dstr= new String(decoder.decode((Str));
		   
		   String dStr = new String(decoder.decode(Str));
		   
		   System.out.println("Enter the DecoderURL:"+dStr);
		   
	}

}
