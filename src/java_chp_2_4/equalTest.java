package java_chp_2_4;

public class equalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100;
		
		// num1이 100과 같은지 if문으로 작성
		if(num1 == num2) {//if 조건: 들여쓰기
			System.out.println("num1은 100입니다");
			System.out.println("num2은 100입니다");
		}
		
		String str1 = "korea";
		String str2 = new String("korea");
		
		//str1.equals(str2) = str1 == str2 변수들 비교는  == 문자열은 .equals()를 써라는 이야기 
		//일반 변수는 == 로 같은지 비교하고, 문자열을 비교할때는 .equals() 라는 메서드를 사용해라!
		if(str1.equals(str2)) {
			System.out.println("equals비교 : str1과 str2은 korea 입니다!");
		
		}
		
		if(str1 == str2) {
		//==연산자는 주소가 같은지를 비교 String str2 = new String("korea");여기서 메모리가 korea를 하나더 만들어서 거짓이 됨
			System.out.println("equals비교 : str1과 str2은 korea 입니다!");
			
		}
	}

}
