package Demo.java;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		/*
		int a[] = {18,25,50,60};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		*/
		/*
	     int[] arr = {5, 12, 9, 18, 3, 21};
	        int max = arr[0];
	        int min = arr[0]; 
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i]; 
	            }
	        }
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	      */  
		/*
		        int[] numbers = {10, 5, 8, 3, 6};
		        Arrays.sort(numbers);
		        int min = numbers[0];
		        int max = numbers[numbers.length - 1];
		        System.out.println("Minimum value: " + min);
		        System.out.println("Maximum value: " + max);
		    
		*/
		/*
		
		int number,temp,last,i;
		int sum=0;
		int count=0;
		System.out.println("Enter the number : ");
		number=sc.nextInt();
		temp=number;
		for(i=1;i<=temp;i++) {
			if(temp%i==0) {
				count++;
			}
		}
		while(number>0) {
			last=number%10;
			sum=sum*10+last;
			number=number/10;
		}
		 if(temp==sum && count==2) {
			 System.out.println(temp+" is palprime");
			 
		 }
		 else {
			 System.out.println(temp+" is not palprime");
		}
		*/
		
		}

	}


