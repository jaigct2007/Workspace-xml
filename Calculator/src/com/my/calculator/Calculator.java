package com.my.calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string");
		String addition="+";
		String subraction="=";
		String devesion="/";
		String multiplication="*";
		
String input=scan.nextLine();
String [] s1=input.split(",");
int n=s1.length;
if(n==3)
{
	double m;
	double n1=Double.parseDouble(s1[0]);
	double n2=Double.parseDouble(s1[2]);
	String operator=s1[1];
	System.out.println("Input number one  " +n1+ "Input Number Two  " +n2+ "  Operator  "  +operator);
	
	if(operator.equals(addition))
	{
		 m=n1+n2;
		
		 String m1=Double.toString(m);
		 BigDecimal add=new BigDecimal(m1);
		System.out.println("Addition of two input" + m1.toString());
	}
	if(operator.equals(subraction))
	{
		 m=n1-n2;
		 String m1=Double.toString(m);
		 BigDecimal add=new BigDecimal(m1);
		System.out.println("Subraction of two input" + m1.toString());
		//System.out.println("Addition of two input" + (m));
	}
	if(operator.equals(multiplication))
	{
		 m=n1*n2;
		 String m1=Double.toString(m);
		 BigDecimal add=new BigDecimal(m1);
		System.out.println("Multiplication of two input" + m1.toString());
	}
	if(operator.equals(devesion))
	{
		 m=n1/n2;
		 String m1=Double.toString(m);
		 BigDecimal add=new BigDecimal(m1);
		System.out.println("Division of two input" + m1.toString());
	}
	//String val=String.valueOf(m);
	//BigInteger m2=new BigInteger(val);
	
}
else
	System.out.println("Please enter the valid number");

	}

}
