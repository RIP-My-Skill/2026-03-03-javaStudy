/*
 *  	★★☆★★
 *  	★★☆★★
 *  	★★☆★★
 *  	★★☆★★
 *  	★★☆★★
 *  
 *  	☆★★★★
 *  	★☆★★★
 *  	★★☆★★
 *  	★★★☆★
 *  	★★★★☆
 *  
 *  	☆★★★☆
 *  	★☆★☆★
 *  	★★☆★★
 *  	★☆★☆★
 *  	☆★★★☆
 */
public class 제어문_중첩반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {			
//			for(int j=1; j<=5; j++) {
//				if(j==3)
//					System.out.print("☆");
//				else
//					System.out.print("★");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i==j)
//					System.out.print("☆");
//				else
//					System.out.print("★");
//			}
//			System.out.println();
//		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j || j==6-i)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}
//		System.out.println();
//		System.out.println("☆★★★☆");
//		System.out.println("★☆★☆★");
//		System.out.println("★★☆★★");
//		System.out.println("★☆★☆★");
//		System.out.println("☆★★★☆");
		
	}

}
