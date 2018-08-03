package JumpUp;

import java.util.Scanner;

public class StudentInformation {
	
	Scanner scanner = new Scanner(System.in);
	
	//필드
	String name="";
	int number;
	int koreanScore;
	int englishScore;
	int mathScore;
	int editNumber;
	
		
	//생성자
		
	
	//메소드
	
	
	String edit(int editNumber) {
		
		if(editNumber==1) {
			return "국어";
		} else if(editNumber==2) {
			return "영어";
		} else {
			return "수학";
		} 
		
		
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEditNumber() {
		return editNumber;
	}

	public void setEditNumber(int editNumber) {
		this.editNumber = editNumber;
	}

	void printInfo() {
		
	}
	
}
