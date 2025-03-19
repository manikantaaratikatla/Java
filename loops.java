package myFirstProgram;

public class loops {

	public static void main(String[] args) {
/*
		 PATTERN 1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
/*
		output: *
		        * *
		        * * *
		        * * * *
		        * * * * *
*/
		
		//PATTERN 2
		
/*
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
*/
/*
		output: 1
		        22
		        333
		        4444
		        55555
*/
		
		// PATTERN 3
		
/*
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
*/
/*
		output:55555
		       4444
		       333
		       22
		       1
*/
		
		//PATTERN 4
		
/*
		for(int i=5;i<=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
*/
/*
		output:* * * * *
		       * * * *
		       * * *
		       * *
		       * 
*/
		
		//PATTERN 5
		
/*
		int sp=20;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			sp--;
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
*/
/*
		output:             * 
		                   * *
		                  * * * 
		                 * * * *
		                * * * * *
 */
		
		// PATTERN 6
		
/*
		int sp=20;
		for(int i=5;i>=1;i--) {
			for(int k=5;k<=sp;k++) {
				System.out.print(" ");
			}
			sp++;
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
*/
/*
		output:            * * * * *
		                    * * * *
		                     * * *
		                      * *
		                       *
*/
		
		//PATTERN 7
/*		
		int sp=20;
		int i,j,k;
		for( i=1;i<=5;i++) {
			for( k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			sp--;
			for( j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sp=20;
		for(i=4;i>=1;i--) {
			for(k=4;k<=sp;k++) {
				System.out.print(" ");
			}
			sp++;
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
*/
/*		output:
		
		  * 
         * * 
        * * * 
       * * * * 
      * * * * * 
       * * * * 
        * * * 
         * * 
          *
 */     
	
		//PATTERN 8
		
/*		
		int n, c, k, space, count = 1; 
		space =n=5; 
		for (c = 1; c <= n; c++){ 
		for (k = 1; k < space; k++) 
		System.out.print(" "); 
		for (k = 1; k <= c; k++){ 
		System.out.print("*"); 
		if (c > 1 && count < c){ 
		System.out.print("A"); 
		count++; 
		} 
		} 
		System.out.print("\n"); 
		space--; 
		count = 1; 
		}
*//*
		output:
		    *
		   *A*
		  *A*A*
		 *A*A*A*
		*A*A*A*A*
*/
		
		//PATTERN 9
		
/*		
		int rows, i, j, number= 1; 
		rows=4; 
		for(i=1; i <= rows; i++){ 
		for(j=1; j <= i; ++j){ 
		System.out.print(number); 
		++number; 
		} 
		System.out.print("\n"); 
		}
*/		
/*		
		output:
			1
			23
			456
			78910
*/
		
		//PATTERN 10
		
	
		
	}
	
}
