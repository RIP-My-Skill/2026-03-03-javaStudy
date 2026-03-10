import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해주세요:");
		int num1 = sc.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/):");
		String op = sc.next();
		System.out.print("두번째 정수를 입력해주세요:");
		int num2 = sc.nextInt();
		
		if(op.equals("+")) {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op.equals("-")) {
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(op.equals("*")) {
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(op.equals("/")) {
			if(num2==0) 
				System.err.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		}
		else {
			System.err.println("잘못된 연산자입니다!!");
		}
		

	}

}
