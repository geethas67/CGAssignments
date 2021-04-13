package lab4ex1;

public class CurrentAccount extends Account
 {
   double overdraftLimit = 2000;
   CurrentAccount(){
 }
 
 CurrentAccount(long accNum, double balance,Person accHolder)
 {
	 super(accNum,balance,accHolder);
 }
 
 @Override
 void withdraw(double amt) 
  {
 if (amt >= overdraftLimit) {
	 System.out.println("Overdraft Limit is reached");
 }
 else {
	 setBalance(getBalance()-amt);
      }
   }
 }
  
