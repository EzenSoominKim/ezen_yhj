package objectClass05;
//은행계좌(통장) 클래스
public class Account {
	/* 개발자의 약속
	 * class의 첫글자는 대문자
	 * 멤버변수의 첫글자는 소문자
	 * 상수의 모든 글자는 대문자
	 */
	
	//멤버변수(필드, 속성)
	static final String BANKNAME="신한은행";
	//static 클래스의 정저필드
	//필드멤버변수 new 생성
	//정적멤버변수 원본클래스에서 사용하는 것
	String accountNo; //계좌번호
	String ownername; //예금주이름
	int balance;      //잔액
	
	//생성자
	
	
	//빈 생성자
	public Account() {
		
		
	}
	
	public Account(String accountNo, String ownername, int balance) {
		this.accountNo = accountNo;
		this.ownername = ownername;
		this.balance = balance;
	}

	//예금한다 메서드(하는 일, 기능) void=리턴값이 없음, type=리턴값 있음
	void deposit(int amount) { //amount 매게변수 = 외부로부터 값을 받을 수 있는 변수
		balance+=amount; //외부로부터 값을 받아 balance로 전달
	}
	
	
	//인출한다 메서드
	int withdraw(int amount) throws Exception {
		if(balance<amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;  //balance=balance-amount;
		return amount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
