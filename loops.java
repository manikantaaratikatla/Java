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
		}*//*
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
		}*//*
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
		}*//*
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
		} *//*
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
		*//*
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
		*//*
		output:            * * * * *
		                    * * * *
		                     * * *
		                      * *
		                       *
		   */
		//PATTERN 7
		int sp=20;
		int i,j,k;
		for(int i1=1;i1<=5;i1++) {
			for(int k1=1;k1<=sp;k1++) {
				System.out.print(" ");
			}
			sp--;
			for(int j1=1;j1<=i1;j1++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i1=4;i1>=1;i1--) {
			for(int k1=4;k1<=sp;k1++) {
				System.out.print(" ");
			}
			sp++;
			for(int j1=1;j1<=i1;j1++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
}
