//char Ÿ�� ����
package chap02;

public class CharExample {
	public static void main(String[] args) {
		char var1 = 'A'; //�����ڵ� : 0x0041
		char var2 = 'B'; //�����ڵ� : 0x0042
		char var3 = '��'; //�����ڵ� : 0xAC00
		char var4 = '��'; //�����ڵ� : 0xAC01
		
		System.out.println(var1+"\n"+var2+"\n"+var3+"\n"+var4+"\n");
		
		char c1 = 'A';
		char c2 = 65; //10������ A ����
		char c3 = '\u0041'; //16������ A ����
		
		char c4 = '��';
		char c5 = 44032; //10������ �� ����
		char c6 = '\uac00'; //16������ �� ����
		
		int uniCode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		// c1 == c2 == c3
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		// c4 == c5 == c6
		
		System.out.println(uniCode);
				
	}
}
