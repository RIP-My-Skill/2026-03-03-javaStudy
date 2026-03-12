/*
 * 			*
 * 		   **
 * 		  ***
 * 		 ****
 * 
 * 		 ****                1  0  4
 * 		  ***				 2  1  3
 * 		   **				 3  2  2
 * 			*				 4  3  1
 * 
 * 		   *				 
 * 		  ***
 * 		 *****
 * 		*******
 */

public class 제어문_중첩반복문_6 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		for(int i=1;i<=6;i++) {
//			int lotto=(int)(Math.random()*45)+1;
//			Thread.sleep(1000);
//			System.out.print(lotto+" ");
//		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

}
