package JumpUp;

import java.util.Scanner;

public class StudentInformationExample {

	private static Scanner scanner = new Scanner(System.in);
	private static StudentInformation[] info = new StudentInformation[30];
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		
		
		while(run) {
			System.out.println("MENU");
			System.out.println("1.�л������Է� | 2.�л�������ȸ | 3.�л��������� | 4.����");
			System.out.print("���� �Է�>");
			
			int number = scanner.nextInt();
			
			if(number == 1) {
				inputInformation();
			} else if(number == 2) {
				checkGrade();
			} else if(number == 3) {
				
			} else if(number == 4) {
				System.out.println("�л� ���� ���� ���α׷��� �����մϴ�.");
				run = false;
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
		
		
	}
	
	static void inputInformation() {
		StudentInformation newInfo = new StudentInformation();
		
		
		System.out.println("1.�л����� �Է�");
		
		for(int i=0;i<info.length;i++) {
			if(info[i]==null) {
				System.out.print("�̸� : ");				
				newInfo.setName(scanner.next());
//				info[i].name = scanner.nextLine();
				
				System.out.print("��ȣ : ");
				newInfo.setNumber(scanner.nextInt());
//				info[i].number = scanner.nextInt();
				
				System.out.print("�������� : ");
				newInfo.setKoreanScore(scanner.nextInt());
//				info[i].koreanScore = scanner.nextInt();
				
				System.out.print("�������� : ");
				newInfo.setEnglishScore(scanner.nextInt());
//				info[i].englishScore = scanner.nextInt();
				
				System.out.print("�������� : ");
				newInfo.setMathScore(scanner.nextInt());
//				info[i].mathScore = scanner.nextInt();
				
				info[i] = newInfo;
				
				break;
			}
		}
	}
	
	static void checkGrade() {
		System.out.println("2.�л�������ȸ");
		System.out.println("1.�����л�������ȸ | 2.��ü�л�������ȸ | 3.����");
		System.out.print("��ȣ�Է�> ");
		int number = scanner.nextInt();
		
		if(number == 1) {
			checkGradeOne();
		} else if(number == 2) {
			checkGradeAll();
		} else if(number == 3) {
			
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

		

	
	static void checkGradeOne() {
		System.out.println("1.�����л�������ȸ");
		System.out.print("��ȣ�Է�> ");
		int number = scanner.nextInt();
		
		
		for(int i=0;i<info.length;i++) {
			if(info[i].number == number) {
				int sum = info[i].koreanScore + info[i].englishScore + info[i].mathScore;
				double average = (double)sum / 3;
				
				System.out.println("�̸� : "+info[i].name);
				System.out.println("��ȣ : "+info[i].number);
				System.out.println("�������� : "+info[i].koreanScore);
				System.out.println("�������� : "+info[i].englishScore);
				System.out.println("�������� : "+info[i].mathScore);
				System.out.println("�հ� : "+ sum);
				System.out.println("��� : "+ average);
				
				return;
			}
		}	
	}
	
	static void checkGradeAll() {

		int sumKorean = 0, sumEnglish = 0, sumMath = 0;
		int count = 0;
		
		for(int i=0;i<info.length;i++) {
			
			if(info[i]!=null) {
			
				count++;
				
				int sum = info[i].koreanScore + info[i].englishScore + info[i].mathScore;
				double average = (double)sum / 3;
				
				sumKorean += info[i].koreanScore;
				sumEnglish += info[i].englishScore;
				sumMath += info[i].mathScore;
				
				System.out.println("�̸� : "+info[i].name);
				System.out.println("��ȣ : "+info[i].number);
				System.out.println("�������� : "+info[i].koreanScore);
				System.out.println("�������� : "+info[i].englishScore);
				System.out.println("�������� : "+info[i].mathScore);
				System.out.println("�հ� : "+ sum);
				System.out.println("��� : "+ average);
				System.out.println();
			}
			
			
		}
		
		double avgK = (double)sumKorean / count;
		double avgE = (double)sumEnglish / count;
		double avgM = (double)sumMath / count;
		
		System.out.println("���� ���� ���� : "+sumKorean+" ���� ���� ��� : "+avgK);
		System.out.println("���� ���� ���� : "+sumEnglish+" ���� ���� ��� : "+avgE);
		System.out.println("���� ���� ���� : "+sumMath+" ���� ���� ��� : "+avgM);
	}
	
	static void editGrade() {
		
		StudentInformation stu = new StudentInformation();
		
		System.out.println("----------");
		System.out.println("3.�л���������");
		System.out.println("----------");
		System.out.println();
		System.out.println("�л� ��ȣ �Է�> ");
		
		
		int number = scanner.nextInt();
		
		if(number>info.length-1 || number<0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		
		for(int i=0;i<info.length;i++) {
			if(info[i].number == number) {
				
				System.out.println("�̸� : "+info[i].name);
				System.out.println("��ȣ : "+info[i].number);
				System.out.println("�������� : "+info[i].koreanScore);
				System.out.println("�������� : "+info[i].englishScore);
				System.out.println("�������� : "+info[i].mathScore);
				
				break;
			} 
			
		}
		
		System.out.println("������ ���� 1.�������� | 2.�������� | 3.��������");
		System.out.println("���� �Է�> ");
		
		number = scanner.nextInt();
		
		stu.edit(number);
		System.out.println("");
	}
}
