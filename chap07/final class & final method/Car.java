package chap07;

public class Car {

	public int speed;
	
	public void speedUp() {speed+=1;}
	
	
	//final �޼ҵ�� Override �� �� ����.
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
