package chap06;

public class MemberService {

	String id;
	String password;
	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}
