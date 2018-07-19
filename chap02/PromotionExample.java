// 자동 타입 변환
package chap02;

public class PromotionExample {
	public static void main(String[] args) {
		//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = "+intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		byte byteValue2 = 65;
		//char charValue2 = byteValue2; char는 음수를 저장할 수 없음.
	}
}
