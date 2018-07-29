package chap06;

import java.util.Scanner;

public class BankApplication {

	private static Accountt[] accountArray = new Accountt[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
		}
	}
	
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성 : ");
		System.out.println("----------");
		System.out.println("계좌번호 : ");
	}
	

}
