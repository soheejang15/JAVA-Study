package chap07;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���",15);
					break;
				case 2:
					System.out.println("�տ����� kumhoTire�� ��ü");
					car.frontRightTire = new HankookTire("�տ�����",13);
					break;	
				case 3:
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���",14);
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����",17);
					break;	
			}
			System.out.println("------------------");
			
		}
	}

}
