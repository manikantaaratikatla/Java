package myFirstProgram;
import java.util.*;
public class SamplePrograms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Even and Odd
/*
		 System.out.print("Even numbers: ");
         for(int i=1;i<=10;i++) {
       	  if(i%2==0) {
       		  System.out.print(i +" ");
       	  }
         }
         System.out.print("\nOdd numbers : ");
         for(int i=1;i<=10;i++) {
       	  if(i%2==1) {
       		  System.out.print(i + " ");
       	  }
         }
*/
		
		// Sum of natural numbers from 1 to 100
		
/*
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("sum of natural numbers from 1 to 100 is :" + sum);
*/
		
		// Check whether the given number is divisible by 3 & 5 or not
		
/*
		 int num=15;
	        if(num%3==0 && num%5==0) {
	        	System.out.println("The given number is divisible by both 3 & 5.  ");
	        }
	        else if(num%3==0) {
	        	System.out.println("The given number is divisible by 3.");
	        }
	        else if(num%5==0) {
	        	System.out.println("The given number is divsible by 5.");
	        }
	        else {
	        	System.out.println("The given number is not divisible by both 3 & 5. ");
	        }
*/
		
		// check whether the given number is positive or negative

/*
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number : ");
	        int number=sc.nextInt();
	        if(number<0) {
	        	System.out.println("The given nnumber is negative.");
	        }
	        else if(number>0) {
	        	System.out.println("The given number is positive.");
	        }
	        else {
	        	System.out.println("The given number is zero.");
	        }
	*/
		
		// A SIMPLE CALCULATOR
		
/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		double num1=sc.nextDouble();
		System.out.print("Enter the operator(+,-,*,/) : ");
		char operator=sc.next().charAt(0);
		System.out.print("Enter the second number : ");
		double num2=sc.nextDouble();
		double result=0;
		if(operator=='+') {
			result=num1 + num2;
		}
		else if(operator=='-') {
			result=num1 - num2;
		}
		else if(operator=='*') {
			result=num1 * num2;
		}
		else if(operator=='/') {
			if(num2 !=0) {
				result=num1/num2;
			}
			else {
				System.out.println("Error! Division by Zero.");
				return;
			}
		}
		else {
			System.out.println("Invalid operator!");
			return;
		}
		System.out.println("Result: "+ result);
		sc.close();
*/
		
		// Check the whether the given number is prime or not
		
/*
		int num=15;
        int count=0;
        if(num>1) 
        {
        	for(int i=1;i<=num;i++) 
        	{
        		if(num% i==0)
        		{
        			count++;
        			}
        	}
        	if (count==2)
        	{
        		System.out.println("Prime number");
        	}
        	else
        	{
        		System.out.println("Not Prime number");
        	}
        }
*/
		
		// Fibonacci Series

/*
		int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++) {
        	n3=n1+n2;
        	System.out.print(" " +n3);
        	n1=n2;
        	n2=n3;
        }
*/
		
		// Factorial 

/*		
 int num=5,factorial=1;
         
         for(int i=1;i<=num;i++) {
        	 factorial=factorial*i;
         }
         System.out.println("Factorial of " +num + " is " + factorial);
*/
		
 int temp,number,rem;
 int sum=0;
 System.out.println("Enter the number: ");
 number=sc.nextInt();
 temp=number;
 while(number>0) {
	 rem=number%10;
	 sum=sum*10+rem;
	 number=number/10;
 }
 if(temp==sum) {
	 System.out.println(temp + " is palindrome");
 }
 else {
	 System.out.println(temp +" is not palindrome");
 }
	}

}
