package Test02;

public class BankAccount {

	String name;
	String accountNumber;
	int balance;

	void withdraw(int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다");
		} else {
			balance -= money;
			System.out.println("인출한 금액: " + money + "원");
		}
	}

	void deposit(int money) {
		balance += money;
		System.out.println("입금한 금액: " + money + "원");
	}

	@Override
	public String toString() {
		return "예금주: " + name + ", 계좌번호: " + accountNumber + ", 잔액: " + balance + "원";
	}

	BankAccount(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("자바맨", "123-456", 1000);

		account1.withdraw(1000);
		account1.withdraw(90000000);
		account1.deposit(5000);
		System.out.println(account1.toString());
	}

}
