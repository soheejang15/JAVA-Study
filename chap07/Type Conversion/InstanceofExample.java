package chap07;

public class InstanceofExample {
	public static void method1(ParentClass parent) {
		if(parent instanceof ChildClass) {
			ChildClass child = (ChildClass) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(ParentClass parent) {
		ChildClass child = (ChildClass) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		ParentClass parentA = new ChildClass();
		method1(parentA);
		method2(parentA);
		
		ParentClass parentB = new ChildClass();
		method1(parentB);
		method2(parentB);
	}

}
