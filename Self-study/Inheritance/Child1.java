
public class Child1 extends Parent{

	int c,d;
	
	public Child1(int a, int b, int c, int d) {
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	
	@Override
	int plus() {
		// TODO Auto-generated method stub
		return a+b+c+d;
	}

}
