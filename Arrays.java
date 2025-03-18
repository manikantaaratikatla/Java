package myFirstProgram;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// comparing the both arrays with each element
		/*
		int arr1[]= {15,25,35};
		int arr2[]= {14,25,34};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+ " == " +arr2[j]+" is equal");
				}
				else if(arr1[i]>arr2[j]) {
					System.out.println(arr1[i]+ " > " +arr2[j]+ " is greater");
				}
				else {
					System.out.println(arr1[i]+ " < " +arr2[j]+ " is smaller");
				}
			}
		}
		*/
		//comparing the both arrays with each element by using scanner user input
		/*
		System.out.println("Enter size of the first array: ");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter elements of the first array:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of the second array: ");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		System.out.println("Enter the elements of the second array: ");
		for(int j=0;j<m;j++) {
			arr2[j]=sc.nextInt();
			}
		System.out.println("Compare the all possible pairs betweeen two arrays:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" =="+arr2[j]+ " is equal");
				}
				else if(arr1[i]>arr2[j]) {
					System.out.println(arr1[i]+ " > " +arr2[j]+ " is greater");
				}
				else {
					System.out.println(arr1[i]+ " < " +arr2[j]+ " is smaller");	
				}
			}
		}
		*/
		// check whether the given number is palprime or not
		/*
        int number,temp,rem,i;
        int sum=0;
        int count=0;
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        temp=number;
        for(i=1;i<=temp;i++) {
        	if(temp%i==0) {
        		count++;
        	}
        }
        while(number>0) {
        	rem=number%10;
        	sum=sum*10+rem;
        	number=number/10;
        }
        if(temp==sum && count==2) {
        	System.out.println(temp+" is palprime.");
        }
        else {
        	System.out.println(temp+" is not a palprime.");
        }
 */
		
		// Min & Max
		
/*		
		        int[] arr = {3, 1, 4, 5, 2}; 
		        int num = 1;
		        int min = arr[0];
		        int max = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		            }
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }

		        
		        System.out.println("Minimum value in the array: " + min);
		        System.out.println("Maximum value in the array: " + max);
*/
		       /*
		        if (num == min) {
		            System.out.println(num + " is the MINIMUM value in the array.");
		        } else if (num == max) {
		            System.out.println(num + " is the MAXIMUM value in the array.");
		        } else {
		            System.out.println(num + " is neither minimum nor maximum in the array.");
		        }
		        */
		        
		    
		

	}

}
