
public class Child2 extends Parent{

	int e,f;
	
	public Child2(int a, int b, int e, int f) {
		super(a,b);
		this.e = e;
		this.f = f;
	}

	@Override
	int plus() {
		// TODO Auto-generated method stub
		return a+b+e+f;
	}
}
