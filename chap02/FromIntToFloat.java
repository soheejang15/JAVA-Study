//���� Ÿ���� �Ǽ� Ÿ������ ��ȯ�� �� ���е� �ս��� ���Ѵ�.
package chap02;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		//123456780�� float 23 ���� ��Ʈ�� ǥ�� �Ұ���, �ٻ�ġ�� ����

		double num4 = num1;
		num2 = (int) num4;
		
		result = num1 - num2;
		System.out.println(result);
		//double 52 ���� ��Ʈ�� ǥ�� ����
	}

}
