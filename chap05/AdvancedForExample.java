// ���� for��
package chap05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("���� : "+sum);
	}
}
