package exceptionLab5;
import java.util.Scanner;
public class Ex1 {
	
	static void getAge(int age) throws InvalidAgeException {
		if(age<15)
			throw new InvalidAgeException("Age should be above 15");
		else
			System.out.println("Age is:"+age);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();  
		try {
			getAge(age);
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
			sc.close();
		}
	}

}
