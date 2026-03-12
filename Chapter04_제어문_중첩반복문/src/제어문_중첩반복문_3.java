/*
 * 		★★★★★
 * 		★★★★★	
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★	
 * 
 * 
 * 		ABCD
 * 		EFGH
 * 		IJKL
 * 		MNOP
 * 
 * 		
 * 		ABCD
 * 		ABCD
 * 		ABCD
 * 		ABCD
 */		
public class 제어문_중첩반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		char c = 'A';
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=4;i++) {
			for(char c='A';c<='D';c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		
	}

}
