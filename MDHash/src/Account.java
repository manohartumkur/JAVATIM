
public class Account {

	private String name;
	private String email;
	private long phoneNumber;
	private String accountNumber;
	private double balance;
	static {

		System.out.println("Static Block");
	}

	{
		System.out.println("Normal Block");
	}

	public Account() {
		this("Manohara P H", "manohar123.tumkur@gmail.com", 1234567891, "1231233211", 100.0);
		System.out.println("Empty Constructor called");
	}

	public Account(String name, String email, long phoneNumber, String accountNumber, double balance) {

		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;

		System.out.println("Parameterized constructor");
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}

	public void withdraw(double withdrawalAmount) {

		if ((this.balance - withdrawalAmount) < 0)
			System.out.println("withdrawal not possible, Only " + this.balance + " is available");

		else {

			this.balance -= withdrawalAmount;
			System.out.println("Processed.The balance available is " + this.balance);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
