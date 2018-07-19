// long 타입 변수
package chap02;

public class LongExample {
	public static void main(String[] args){
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000000;
		//정수가 8byte임을 컴파일러에게 알려주지 않음.
		//int 타입의 저장 범위를 넘어섰음.
		long var4 = 10000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
