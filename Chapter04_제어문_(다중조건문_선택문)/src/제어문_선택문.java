import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해주세요:");
		int num1 = sc.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/):");
		String op = sc.next();
		System.out.print("두번째 정수를 입력해주세요:");
		int num2 = sc.nextInt();
		int num3 = 0;
		
		switch (op) {
			case "+" -> num3 = num1 + num2;
			case "-" -> num3 = num1 - num2;
			case "*" -> num3 = num1 * num2;
			case "/" -> {
				if(num2==0)
					System.err.println("0으로 나눌 수 없습니다.");
				else
					num3 = num1 / num2;
				}
			default -> System.err.println("잘못된 연산자입니다!!");
		}
		if(op.equals("/") && num2==0)
			num3=0;
		else
			System.out.printf("%d %s %d = %d\n", num1, op, num2, num3);
		
	}

}
