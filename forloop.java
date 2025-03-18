package Demo.java;

public class forloop {

	public static void main(String[] args) {
      /*   
          int sum=5;
          int product=1;
          for(int i=1;i<=15;i++) {
        	  if(i%2==0) {
        		  product=product*1;
        	  }
        	  else {
        		     sum=sum+i;
        	  }
        	  
          }
          System.out.println(sum);
          System.out.println(product);
          */
		
		/*
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("1");	
			}
			System.out.println();
		}
		*/
		
		/* fibonacci 
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1 +" "+n2);
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		 output: 0 1 1 2 3 5 8 13 21 34
		 */
		
		/* 1.
		    int n=5;
		    for(int i=1;i<=n;i++) {
		    	for(int j=5;j>=i;j--) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		*/ /*output:*****
		            ****
		            ***
		            **
		            *
			*/
		/* 2.
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	output:*****
	       ****
	       ***
	       **
	       *
*/
		/*3.
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		output:11111
		       2222
		       333
		       44
		       5
		       */
		 /* 4.
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		output: 1
		        12
		        123
		        1234
		        12345
		        */
		/* 5.
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		output:1
		       23
		       456
		       78910
		       1112131415
		       */
		/* 6.
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		output:
			A
			BC
			DEF
			GHIJ
			KLMNO
			*/
		/* 7.
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		output:
			A
			AB
			ABC
			ABCD
			ABCDE
		*/
		/* 8.
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		output:
			1
			22
			333
			4444
			55555
			*/
		/*
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='Z';
			for(int j=5;j>=i;j--) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
		output:
			ZYXWV
			ZYXW
			ZYX
			ZY
			Z
			*/
		/*
		int n=5;
		char ch='Z';
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
		output:
			ZYXWV
			UTSR
			QPO
			NM
			L
			*/
		/*
		  factorial
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial is: " +fact);
		output:
			The factorial is :120
			*/
		
		/*
		  prime number
		int x=20;
		int count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)
				count++;
		}
		if(count==2) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
		output:
			It is not a prime number
			*/
		/* 
		 prime number
		int x=20;
	    int i;
	    int j;
		System.out.println("The Prime Numbers are: ");
		for(i=1;i<=x;i++) {
			int count=0;
			for(int j1=1;j1<=i;j1++) {
				if(i%j1==0)
					count++;
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
		output:
			The Prime Numbers are:
				2 3 5 7 9 11 13 17 19
				*/
	}	
}
