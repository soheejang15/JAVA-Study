package chap07;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; //�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2(); // Override�� �޼ҵ� ȣ��
		//parent.method3(); ȣ�� �Ұ���
	}

}
