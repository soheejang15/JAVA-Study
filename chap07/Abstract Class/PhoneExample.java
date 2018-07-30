package chap07;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); Phone의 객체를 생성할 수 없음.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
