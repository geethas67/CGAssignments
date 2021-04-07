package com.cg.eis.exception;

import java.util.Scanner;

public class Ex3 
{
	static void getSalary(double salary) throws EmployeeSalaryException
	{
		if(salary<3000)
	      throw new EmployeeSalaryException("salary below 3000!!");
		else
			System.out.println("Salary is:"+salary);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		try {
			getSalary(salary);
		}
		catch(EmployeeSalaryException e) {
			e.printStackTrace();
			sc.close();
		
		}
	}
}
