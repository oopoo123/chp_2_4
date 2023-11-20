package java_chp_2_4;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int keycode = System.in.read();
			System.out.println(keycode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}

}
