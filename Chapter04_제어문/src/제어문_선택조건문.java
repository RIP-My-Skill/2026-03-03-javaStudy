import java.util.Scanner;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 두개 입력해주세요:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int num3 = num1>num2?num1:num2;
		
		if(num3==num1) {
			System.out.println("최대값:"+num1);
			System.out.println("최소값:"+num2);
		}
		else {
			System.out.println("최대값:"+num2);
			System.out.println("최소값:"+num1);
		}
	}

}
