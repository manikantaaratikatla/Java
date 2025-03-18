package myFirstProgram;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
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

	}

}
