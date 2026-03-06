/*
 * 		
 */
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op = sc.next();
		
		System.out.print("두번째 정수 입력:");
		int num2 = sc.nextInt();
		
		char c = op.charAt(0);
		
		if(c == '+') {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(c == '-') {
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(c == '*') {
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(c == '/') {
			if(num2==0) {
				System.err.println("error:0으로 나눌 수 없습니다.");
			}
			else {
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
		}
		else {
			System.err.println("error:잘못된 연산자입니다.");
		}
	}

}
