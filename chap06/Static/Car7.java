//���� �޼ҵ�
package chap06;

public class Car7{
	
	int speed;
	
	void run() {
		System.out.println(speed+"���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car7 myCar = new Car7();
		myCar.speed = 60;
		myCar.run();
	}
}



