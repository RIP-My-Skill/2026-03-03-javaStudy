import java.util.Scanner;

public class 메서드_4 {
	
	static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력:");
		int dan = sc.nextInt();
		
		gugudan(dan);
		System.out.println("=======");
		System.out.print("단 입력:");
		dan = sc.nextInt();
		gugudan(dan);
	}

}
