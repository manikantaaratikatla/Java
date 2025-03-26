/*
package Demo.java;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
           int a[] ={2,43,66,923,5,13,123,432,44,78};
  
         int x=100;
         for(int num:a) {
        	 if(num>x) {
        		 System.out.println(num +" ");
        		 
        	 }
         }
         
	}

}
*/


/*
package Demo.java;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,4,2,7,8,8,3};
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
        			System.out.print(a[i]+ ",");
        			break;
        		}
        	
        	}
        }
	}

}
*/
/*
package Demo.java;
import java.util.*;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word1=sc.nextLine();
		String word2=sc.nextLine();
		String word3=sc.nextLine();
		sc.close();
		word1=word1.replaceAll("[AEIOUaeiou]", "*");
		
		word2=word2.replaceAll("[^AEIOUaeiou]","@");
		word3=word3.toUpperCase();
		String s=word1+word2+word3;
 System.out.println(word1);
 System.out.println(word2);
 System.out.println(word3);
 System.out.println(s);
	}

}
*/

/*
package Demo.java;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="this is java";
        String str2="java";  
        System.out.println(str1.contains(str2));
        
	}

}

*/

/*
package Demo.java;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="Ramu";
         String str2="umar";
         char[] arr1=str1.toLowerCase().toCharArray();
         char[] arr2=str2.toLowerCase().toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         
         if(Arrays.equals(arr1, arr2)) {
        	 System.out.println("Anagram");
         }
         else {
        	 System.out.println("Not Anagram");
         }
	}

}
*/

/*
package Demo.java;
import java.util.*;
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       sc.nextLine();
       char operator=sc.next().charAt(0);
       sc.close();
       switch (operator) {
       case '+':System.out.println(num1+num2);break;
       case '-':System.out.println(num1-num2);break;
       case '*':System.out.println(num1*num2);break;
       case '/':System.out.println(num2!=0 ? num1/num2:"cannot divide by zero");break;
       default:System.out.println("Invalid operator");
       }
        
        
	}

}
*/

/*
 package Demo.java;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int avg=80;
       if(avg>=80) {
    	   System.out.println("Grade A");
       }
       else if(avg>=60) {
    	   System.out.println("Grade B");
       }
       else if(avg>=40) {
    	   System.out.println("Grade C");
       }
       else {
    	   System.out.println("Grade D");
       }
	}

}

*/

/*
package Demo.java;
import java.util.*;
public class eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double height=sc.nextDouble();
		double weight=sc.nextDouble();
		sc.close();
		if(height>=5.5 && weight>55) {
			System.out.println("This person is Eligible for physical test");
		}
		else {
			System.out.println("This person is not eligible for physical test ");
		}

	}

}
*/

/*
package Demo.java;
import java.util.*;
public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        char c=sc.nextLine().charAt(0);
        char cl= Character.toLowerCase(c);
        if(cl=='a'|| cl=='e'||cl=='i'||cl=='o'||cl=='u') {
        	System.out.println("vowel");
        	
        }
        else {
        	System.out.println("consonant");
        }
       
	}

}
*/

/*
package Demo.java;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random r=new Random();
       int n=r.nextInt(100);
       if(n==0) {
    	   n=n+1;
       }
       if(n%2==1) {
    	   System.out.println("Weird");
       }
       else if((n%2==0) &&(n>=2 &&n<=5)) {
    	   System.out.println("Not Weird");
       }
       else if((n%2==0)&&(n>=6 && n<=20)) {
    	   System.out.println("Weird");
       }
       else if((n%2==0 && n>20)) {
    	   System.out.println("Not weird");
       }
       
	}

}
 */

