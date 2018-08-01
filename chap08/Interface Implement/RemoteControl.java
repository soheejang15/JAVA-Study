package Implement;

public interface RemoteControl {
	
	//���
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // �������̽� ������ ������ ���
	
	//�߻� �޼ҵ�
	public abstract void turnOn();
	public abstract void turnOff();
	void setVolume(int volume); // public abstract ���� ����
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) { //public ���� ����
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	static void changeBattery() { //public ���� ����
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
