//클래스 외부에서 메소드 호출
package chap06;

public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : "+speed+"km/h");
	}
}
