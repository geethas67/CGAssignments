package lab4ex1;

public class Account
{
	 private long accNum;
	 private double balance;
	 private  Person accHolder;
	
	Account(){};
	
	Account(long accNum,double balance,Person accHolder)
	{
	     this.accNum = accNum;
	     this.balance = balance;
	     this.accHolder = accHolder;
	}
	
	void deposit (double amt)
	{
		this.setBalance(this.getBalance() + amt);
	}
	
	void withdraw (double amt)
	{
		this.setBalance(this.getBalance() - amt);
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
}
