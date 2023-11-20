package ch_3_1;

public class ch_3_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		
		int result1 = ++a + 10;
		int result2 = b++ + 10;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int x = 10;
		int y = x++; // x = x + 1
		
		System.out.println("y: " + y); // ++앞에 있을때는 y -> 11, ++뒤에 있을때는 y -> 10
		System.out.println("x: " + x); // x -> 11

		// y = ++x -> 연산자의 우선순위가 =보다 ++가 위이므로 x = x + 1이 =보다 먼저 실행되어 y값에 1이 증가된 x 값이 저장됨
		// y = x++ -> 연산자의 우선순위가 =가 ++보다 위이므로 x = x + 1이 =보다 먼저 실행되어 y값에 1이 증가된 x 값이 저장됨
	}

}
