package chap07;

public class SupersonicAirplane extends Airplane{
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}

}
