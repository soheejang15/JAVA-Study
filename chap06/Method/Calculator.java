package chap06;

public class Calculator {
	
	//�޼ҵ�
	void powerOn(){
		System.out.println("������ �մϴ�.");
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
		System.out.println("������ ���ϴ�.");
	}
}
