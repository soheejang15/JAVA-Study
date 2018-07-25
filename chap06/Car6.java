// 생성자 오버로딩
package chap06;

public class Car6 {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car6(){
	}
	
	Car6(String model){
		this.model = model;
	}
	
	Car6(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car6(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
