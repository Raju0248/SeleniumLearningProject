package com.EncodeAndDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecode {
	
	public static void main(String[] args) throws Exception {
		String str="Raju@123";
	byte[] encodedString = Base64.encodeBase64(str.getBytes());
	System.out.println("encoded String "+new String(encodedString));
	
	
	byte[] decodedString = Base64.decodeBase64(encodedString);
	System.out.println("decoded string : "+new String(decodedString));	
	

		
	}
}
