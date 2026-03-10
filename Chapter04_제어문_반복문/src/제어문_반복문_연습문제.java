import java.util.Scanner;
public class 제어문_반복문_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1번
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				sum += i;
		}
		System.out.println("1~100 짝수 합:"+sum);
		System.out.println("=".repeat(50));
		//2번
		int sum1=0;
		System.out.print("정수n 입력:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum1+=i;
		}
		System.out.println("1~"+n+" 합:"+sum1);
		System.out.println("=".repeat(50));
		//3번
		for(int i=1;i<=50;i++) {
			if(i%3==0)
				System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("=".repeat(50));
		//4번
		int num7=0;
		for(int i=1;i<=100;i++) {
			if(i%7==0)
				num7++;
		}
		System.out.println("1~100중 7의 배수의 갯수:"+num7);
		System.out.println("=".repeat(50));
		//5번
		String str="JavaProgramming";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("=".repeat(50));
		//6번
		int i1 = 1;
		while(i1<=10) {
			System.out.print(i1+" ");
			i1++;
		}
		System.out.println();
		System.out.println("=".repeat(50));
		//7번
		System.out.print("정수n 입력:");
		int n1 = sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=".repeat(50));
		//8번
		for(int i=1;i<=100;i++) {
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=".repeat(50));
		//9번
		int sum2=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0)
				sum2+=i;
		}
		System.out.println("1~100 중 5의 배수 합:"+sum2);
		System.out.println("=".repeat(50));
		//10번
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
	}

}
