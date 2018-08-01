
public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent(1,2);
		Parent p1 = new Child1(1,2,3,4);
		Parent p2 = new Child2(4,5,6,7);
		
		CallPlus(p);
		CallPlus(p1);
		CallPlus(p2);
	}

	private static void CallPlus(Parent p) {
		System.out.println(p.plus());
	}
	

}
