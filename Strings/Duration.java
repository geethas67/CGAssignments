package lab3;

import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.Period;

public class Duration {
	
	public static void main(String[] args)
	{
		LocalDate local = LocalDate.of(1998,10,29);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(local, now);
		System.out.println("Difference is \n"+diff.getYears()+"Years\n"+diff.getMonths()+"Months\n"+diff.getDays()+"Days");
	
     }
}