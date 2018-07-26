//메소드 오버로딩
package chap06;

public class Calculator3Example {

	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		
		//메소드 이름이 같고, 매개변수의 자료형이 달라야함.
		//반환 타입만 다른 것은 오버로딩이 될 수 없음.
		
		//정사각형 넓이 구하기
		double result1= myCal.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCal.areaRectangle(10, 20);
		
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
	}

}
