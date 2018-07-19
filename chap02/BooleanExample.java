//boolean 타입
package chap02;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}
		else {
			System.out.println("시작합니다.");
		}
		
		boolean turn = false;
		if(turn) {
			System.out.println("회전합니다.");
		}
		else {
			System.out.println("직진합니다.");
		}
	}
}
