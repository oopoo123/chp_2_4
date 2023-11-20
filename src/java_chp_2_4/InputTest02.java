package java_chp_2_4;

import java.util.Scanner;

public class InputTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		// 파이썬 클래스 선언 객체 이름 scan = Scanner();
		
//		int keycode1 = scanner.nextInt();
//		// 키보드로부터 정수 받아오기
//		double keycode2 = scanner.nextDouble();
//		// 키보드로부터 실수 받아오기
//		String keycode3 = scanner.nextLine();
//		// 키보드로부터 문자열 받아오기(엔터키 누르기 전까지 입력된 문자열 받음)
//		String keycode4 = scanner.next();
		// 키보드로부터 문자열 받아오기(공백을 만나면 공백전까지만 입력된 문자열 받음)
		char keycode5 = scanner.next().charAt(5);
		//문자열을 입력받아서 원하는 인덱스의 한글자만 입력받을때
		
//		System.out.println(keycode1);
//		System.out.println(keycode2);
//		System.out.println(keycode3);
//		System.out.println(keycode4);
		System.out.println(keycode5);

	}

}
