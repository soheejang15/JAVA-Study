package chap08;

public class Television implements RemoteControl{

	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUME) {
			this.volume = RemoteControl.MAX_VALUME;
		} else if(volume<RemoteControl.MIN_VALUME) {
			this.volume = RemoteControl.MIN_VALUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+volume);
	}

	
}