package chap06;

import java.util.Scanner;

public class BankApplication {

	private static Accountt[] accountArray = new Accountt[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
		}
	}
	
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("���»��� : ");
		System.out.println("----------");
		System.out.println("���¹�ȣ : ");
	}
	

}
