//Ŭ���� �ܺο��� �޼ҵ� ȣ��
package chap06;

public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ� : "+speed+"km/h");
	}
}
