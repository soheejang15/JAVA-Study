package chap08;

public class Television implements RemoteControl{

	private int volume;
	
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUME) {
			this.volume = RemoteControl.MAX_VALUME;
		} else if(volume<RemoteControl.MIN_VALUME) {
			this.volume = RemoteControl.MIN_VALUME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç TV º¼·ý : "+volume);
	}

	
}