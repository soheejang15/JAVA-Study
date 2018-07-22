// 부호 연산자
package chap03;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		short s = 100;
		// short result3 = -s; 부호 연산 시 int형이 기본형.
		int result3 = -s;
		System.out.println("result3 : "+result3);
		
	}
}
