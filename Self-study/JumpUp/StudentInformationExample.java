package JumpUp;

import java.util.Scanner;

public class StudentInformationExample {

	private static Scanner scanner = new Scanner(System.in);
	private static StudentInformation[] info = new StudentInformation[30];
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		
		
		while(run) {
			System.out.println("MENU");
			System.out.println("1.학생정보입력 | 2.학생성적조회 | 3.학생성적수정 | 4.종료");
			System.out.print("숫자 입력>");
			
			int number = scanner.nextInt();
			
			if(number == 1) {
				inputInformation();
			} else if(number == 2) {
				checkGrade();
			} else if(number == 3) {
				
			} else if(number == 4) {
				System.out.println("학생 성적 관리 프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		
	}
	
	static void inputInformation() {
		StudentInformation newInfo = new StudentInformation();
		
		
		System.out.println("1.학생정보 입력");
		
		for(int i=0;i<info.length;i++) {
			if(info[i]==null) {
				System.out.print("이름 : ");				
				newInfo.setName(scanner.next());
//				info[i].name = scanner.nextLine();
				
				System.out.print("번호 : ");
				newInfo.setNumber(scanner.nextInt());
//				info[i].number = scanner.nextInt();
				
				System.out.print("국어점수 : ");
				newInfo.setKoreanScore(scanner.nextInt());
//				info[i].koreanScore = scanner.nextInt();
				
				System.out.print("영어점수 : ");
				newInfo.setEnglishScore(scanner.nextInt());
//				info[i].englishScore = scanner.nextInt();
				
				System.out.print("수학점수 : ");
				newInfo.setMathScore(scanner.nextInt());
//				info[i].mathScore = scanner.nextInt();
				
				info[i] = newInfo;
				
				break;
			}
		}
	}
	
	static void checkGrade() {
		System.out.println("2.학생성적조회");
		System.out.println("1.개인학생성적조회 | 2.전체학생성적조회 | 3.종료");
		System.out.print("번호입력> ");
		int number = scanner.nextInt();
		
		if(number == 1) {
			checkGradeOne();
		} else if(number == 2) {
			checkGradeAll();
		} else if(number == 3) {
			
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

		

	
	static void checkGradeOne() {
		System.out.println("1.개인학생성적조회");
		System.out.print("번호입력> ");
		int number = scanner.nextInt();
		
		
		for(int i=0;i<info.length;i++) {
			if(info[i].number == number) {
				int sum = info[i].koreanScore + info[i].englishScore + info[i].mathScore;
				double average = (double)sum / 3;
				
				System.out.println("이름 : "+info[i].name);
				System.out.println("번호 : "+info[i].number);
				System.out.println("국어점수 : "+info[i].koreanScore);
				System.out.println("영어점수 : "+info[i].englishScore);
				System.out.println("수학점수 : "+info[i].mathScore);
				System.out.println("합계 : "+ sum);
				System.out.println("평균 : "+ average);
				
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
				
				System.out.println("이름 : "+info[i].name);
				System.out.println("번호 : "+info[i].number);
				System.out.println("국어점수 : "+info[i].koreanScore);
				System.out.println("영어점수 : "+info[i].englishScore);
				System.out.println("수학점수 : "+info[i].mathScore);
				System.out.println("합계 : "+ sum);
				System.out.println("평균 : "+ average);
				System.out.println();
			}
			
			
		}
		
		double avgK = (double)sumKorean / count;
		double avgE = (double)sumEnglish / count;
		double avgM = (double)sumMath / count;
		
		System.out.println("국어 점수 총합 : "+sumKorean+" 국어 점수 평균 : "+avgK);
		System.out.println("영어 점수 총합 : "+sumEnglish+" 영어 점수 평균 : "+avgE);
		System.out.println("수학 점수 총합 : "+sumMath+" 수학 점수 평균 : "+avgM);
	}
	
	static void editGrade() {
		
		StudentInformation stu = new StudentInformation();
		
		System.out.println("----------");
		System.out.println("3.학생성적수정");
		System.out.println("----------");
		System.out.println();
		System.out.println("학생 번호 입력> ");
		
		
		int number = scanner.nextInt();
		
		if(number>info.length-1 || number<0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		
		for(int i=0;i<info.length;i++) {
			if(info[i].number == number) {
				
				System.out.println("이름 : "+info[i].name);
				System.out.println("번호 : "+info[i].number);
				System.out.println("국어점수 : "+info[i].koreanScore);
				System.out.println("영어점수 : "+info[i].englishScore);
				System.out.println("수학점수 : "+info[i].mathScore);
				
				break;
			} 
			
		}
		
		System.out.println("수정할 성적 1.국어점수 | 2.영어점수 | 3.수학점수");
		System.out.println("숫자 입력> ");
		
		number = scanner.nextInt();
		
		stu.edit(number);
		System.out.println("");
	}
}
