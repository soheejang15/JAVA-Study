//정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다.
package chap02;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		//123456780은 float 23 가수 비트로 표현 불가능, 근사치로 변경

		double num4 = num1;
		num2 = (int) num4;
		
		result = num1 - num2;
		System.out.println(result);
		//double 52 가수 비트로 표현 가능
	}

}
