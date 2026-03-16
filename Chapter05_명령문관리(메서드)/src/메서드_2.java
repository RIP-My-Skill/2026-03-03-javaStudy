/*
 * 
 */

import java.util.Scanner;

public class 메서드_2 {
	
	static int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	static int minus(int a, int b) {
		int minus = a - b;
		return minus;
	}
	
	static int multiply(int a, int b) {
		int mul = a*b;
		return mul;
	}
	
	static String div(int a, int b) {
		String res ="";
		if(b==0)
			res="0으로 나눌 수 없습니다.";
		else
			res=a+"/"+b+"="+(a/(double)b);
		return res;
	}
	//메서드 조립해서 => 계산기 (다른 클래스에서 재사용 가능)
	static void process() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op = sc.next().charAt(0);
		System.out.print("두번째 정수 입력:");
		int b = sc.nextInt();
		
		switch(op) {
		case '+' -> {
			int r = plus(a,b);
			System.out.printf("%d+%d=%d",a,b,r);
		}
		case '-' -> {
			int r = minus(a,b);
			System.out.printf("%d-%d=%d",a,b,r);
		}
		case '*' -> {
			int r = multiply(a,b);
			System.out.printf("%d*%d=%d",a,b,r);
		}
		case '/' -> {
			String r = div(a,b);
			System.out.println(r);
		}
		default -> System.err.println("없는 연산자 입니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();		// 호출만
	}

}
