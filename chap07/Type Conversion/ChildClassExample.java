package chap07;

public class ChildClassExample {

	public static void main(String[] args) {
		ParentClass parent = new ChildClass();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2"; 불가능
		//parent.method3(); 불가능
		
		ChildClass child = (ChildClass) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
