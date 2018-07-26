// 생성자에서 필드 초기화
package chap06;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		//this.name은 필드, name은 매개변수이다.
	}
}
