package com.epaam.clean;

public class Main {
	public static void main(String[] args)
	{
		simpleInterest si=new simpleInterest();
		double interest=si.calculateInterest(100000,5,0.05);
		System.out.println("Simple Interest is "+interest);
		
		compoundInterest ci=new compoundInterest();
		double c_interest=ci.calculate_Interest(10000,5,0.05,4);
		System.out.println("Compound Interest is "+c_interest);
		
		
		
	}

}
