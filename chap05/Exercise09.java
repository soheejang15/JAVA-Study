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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수입력>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2){
				System.out.print("점수입력>");
				for(int i=0; i<scores.length;i++) {
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) {
				System.out.println("점수 리스트 : ");
				for(int i=0; i<scores.length; i++) {
					System.out.print(scores[i]+" ");
				}
			} else if(selectNo == 4) {
				System.out.println("분석");
				int sum = 0, max = 0;
				for(int i=0; i<scores.length;i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				double avg = (double) sum / scores.length;
				
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 :"+ avg);
			} else {
				run = false;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}
}
