//�޼ҵ� �����ε�
package chap06;

public class Calculator3Example {

	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		
		//�޼ҵ� �̸��� ����, �Ű������� �ڷ����� �޶����.
		//��ȯ Ÿ�Ը� �ٸ� ���� �����ε��� �� �� ����.
		
		//���簢�� ���� ���ϱ�
		double result1= myCal.areaRectangle(10);
		
		//���簢�� ���� ���ϱ�
		double result2 = myCal.areaRectangle(10, 20);
		
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
	}

}
