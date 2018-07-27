package chap07;

public class Car {

	public int speed;
	
	public void speedUp() {speed+=1;}
	
	
	//final 메소드는 Override 할 수 없음.
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
