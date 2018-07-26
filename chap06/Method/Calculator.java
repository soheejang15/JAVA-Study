package chap06;

public class Calculator {
	
	//메소드
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	
	double divide(int a, int b) {
		double result = (double) a/ (double)b;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
