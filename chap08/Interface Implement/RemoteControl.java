package Implement;

public interface RemoteControl {
	
	//상수
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // 인터페이스 내에서 무조건 상수
	
	//추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	void setVolume(int volume); // public abstract 생략 가능
	
	//디폴트 메소드
	default void setMute(boolean mute) { //public 생략 가능
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() { //public 생략 가능
		System.out.println("건전지를 교환합니다.");
	}
}
