package JumpUp;

import java.util.Scanner;

public class StudentInformation {
	
	Scanner scanner = new Scanner(System.in);
	
	//�ʵ�
	String name="";
	int number;
	int koreanScore;
	int englishScore;
	int mathScore;
	int editNumber;
	
		
	//������
		
	
	//�޼ҵ�
	
	
	String edit(int editNumber) {
		
		if(editNumber==1) {
			return "����";
		} else if(editNumber==2) {
			return "����";
		} else {
			return "����";
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
