package chap08;

public interface RemoteControl {

	//상수
	int MAX_VALUME = 10;
	int MIN_VALUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setValume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
