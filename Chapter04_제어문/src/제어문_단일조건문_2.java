//if ==> 15 ==> 3배수, 5배수, 7배수

// 로그인, 유효성 검사
import java.util.Scanner;
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		int num = sc.nextInt();
		
		if(num%3==0)
			System.out.println(num+"는(은) 3의 배수입니다");
		if(num%5==0)
			System.out.println(num+"는(은) 5의 배수입니다");
		if(num%7==0)
			System.out.println(num+"는(은) 7의 배수입니다");
	}

}
