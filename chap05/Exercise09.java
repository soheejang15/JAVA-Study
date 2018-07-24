package chap05;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.print("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л����Է�>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2){
				System.out.print("�����Է�>");
				for(int i=0; i<scores.length;i++) {
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				System.out.println("���� ����Ʈ : ");
				for(int i=0; i<scores.length; i++) {
					System.out.print(scores[i]+" ");
				}
			} else if(selectNo == 4) {
				System.out.println("�м�");
				int sum = 0, max = 0;
				for(int i=0; i<scores.length;i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				double avg = (double) sum / scores.length;
				
				System.out.println("�ְ� ���� : "+max);
				System.out.println("��� ���� :"+ avg);
			} else {
				run = false;
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		
	}
}
