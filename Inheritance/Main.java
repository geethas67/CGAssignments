package lab4ex1;
public class Main 
{
 public static void main(String[] args)
 {
	 Person p1 = new Person("Smith", 25);
	 Person p2 = new Person("Kathy", 26);
	 
	 Account acc1 = new Account(111,2000.0,p1);
	 Account acc2 = new Account(333,3000.0,p2);
	 
	 SavingsAccount sa = new SavingsAccount(6534556,3000, p2);
	 CurrentAccount ca = new CurrentAccount(9836372,3000, p2);
	 
	 
	 acc1.setAccHolder(p1);
	 acc2.setAccHolder(p2);
	 
	acc1.deposit(2000);
	System.out.println("Smith:"+acc1.getBalance());
	acc2.withdraw(2000);
	System.out.println("Kathy:" +acc2.getBalance());
	

	sa.withdraw(3000);
	ca.withdraw(2000);
 
  }
}
	 
	 
	

