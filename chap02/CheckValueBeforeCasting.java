//변환으로 인한 데이터 손실이 발생되지 않도록 한다.
package chap02;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			//byte는 127까지 표현 가능.
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
