package encodAnddecode;

import java.util.Base64;

public class Base64EnodingAndDecodingDemo {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decode= Base64.getDecoder();
		byte[] array = { 1, 2, 3, 4, 5 };
		byte[] array_2 = encoder.encode(array);
		System.out.println(array_2);
		byte[] array_3 = decode.decode(array_2);
		System.out.println(array_3.toString());
		String str = encoder.encodeToString("Ovaledge".getBytes());
		System.out.println(str);
		String dstr= new String(decode.decode(str));
		System.out.println(dstr);
		
	}

}
