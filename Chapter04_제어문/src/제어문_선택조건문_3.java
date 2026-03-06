// ==> 절대값 출력
import java.util.Scanner;
public class 제어문_선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();
		// 검증
		System.out.println("검증:"+Math.abs(num));
		
//		if(num==0) {
//			System.out.println(num);
//		}
//		else {
		if(num<0) {
				System.out.println(num*-1);
			}
		else {
				System.out.println(num);
			}
	}

}
