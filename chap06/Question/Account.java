package chap06;

public class Account {

	private int balance;
	static final int MIN_BALANCE =0;
	static final int MAX_BALANCE =1000000;
	
	void setBalance(int balance) {
		if(balance <MIN_BALANCE || balance>MAX_BALANCE) {
			
		} else {
			this.balance = balance;
		}
		
	}
	
	int getBalance() {
		return balance;
	}
	

}
