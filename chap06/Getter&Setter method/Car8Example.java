//Getter/Setter ���
package chap06;

public class Car8Example {

	public static void main(String[] args) {
		Car8 myCar = new Car8();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : "+myCar.getSpeed());
	}
}
