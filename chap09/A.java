package chap09;

public class A {

	A() {
		System.out.println("A ��ü�� ������");
	}

	class B {
		B() {
			System.out.println("B ��ü�� ������");
			int field1;
			//static int field2;
			//void method1() {}
				//static void method2(){}
			
		}
	}
	
	static class C{
		C() {
			System.out.println("C ��ü�� ������");
			//int field1;
			//static int field2;
			//void method1() {}
			//static void method2(){}
			
		}
	}
}

