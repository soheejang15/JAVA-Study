// 변수의 사용 범위
package chap02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			System.out.println(v2);
		}
		
		//int v3 = v1 + v2 + 15; 
		// v2 변수는 선언된 블록 내에서만 사용 가능함.
		
	}
}
