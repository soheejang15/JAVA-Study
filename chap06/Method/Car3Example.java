package chap06;

public class Car3Example {
	public static void main(String[] args) {
		Car3 myCar = new Car3(5);
		
		//myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���");
		}
	}
}
