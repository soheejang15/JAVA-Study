package chap08;

public interface RemoteControl {

	//���
	int MAX_VALUME = 10;
	int MIN_VALUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setValume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� ���� �մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
