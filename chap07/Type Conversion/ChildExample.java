package chap07;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2(); // Override된 메소드 호출
		//parent.method3(); 호출 불가능
	}

}
