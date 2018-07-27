package chap07;

public class SupersonicAirplane extends Airplane{
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}

}
