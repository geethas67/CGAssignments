package exceptionLab5;
import java.util.*;
public class Ex2 
{
	
	static void getName() throws InvalidNameException 
	{
	throw new InvalidNameException ("firstName and lastName should not be left blank.");
	}
	
	public static void main(String[] args) 
	{
		String firstName;
		System.out.println("Enter the Name:");
		String lastName;
		
		try {
			getName();
		    }
		catch(InvalidNameException e) 
		{
		e.printStackTrace();
		}
    }
}
   