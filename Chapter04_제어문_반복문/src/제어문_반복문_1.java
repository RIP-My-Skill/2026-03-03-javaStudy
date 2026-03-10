import java.util.Scanner;
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력:");
		int dan = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
		System.out.println();
		
		for(int i=9;i>=1;i--) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
		System.out.println();
		String str = "Hello Java";
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		int a=0;
		int b=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if('A'<=c && c<='Z')
				a++;
			if('a'<=c && c<='z')
				b++;
		}
		System.out.println("대문자:"+a+"\n소문자:"+b);
		
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}
	}

}
