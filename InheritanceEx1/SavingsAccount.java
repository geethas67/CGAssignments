package lab4ex1;

public class SavingsAccount extends Account
 {
  final private int minBalance = 500;
  
  SavingsAccount() {
 }
  SavingsAccount(long accNum, double balance,Person accHolder)
      {
		 super(accNum,balance,accHolder);
	 }
  
  
 @Override
 void withdraw(double amt) {
 {
   if(getBalance() - amt >= minBalance) {
	   setBalance(getBalance()-amt);
   }
   else {
	   System.out.println("Amount will exceed minimum Balance");
   }
   }
 }
  
}
