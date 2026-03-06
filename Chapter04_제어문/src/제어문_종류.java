// 흐름제어
/*
 * 	건너뛴다 / 반복수행 / 선택 / 반복제어
 * -----------------------------
 * 	*** 제어문 (연산자 활용)
 * 		=> 평문
 * 		   한줄씩 소스코딩
 * 		=> 조건문
 * 		=> 반복문
 * 	조건문 => 에러 처리 / 필요한 부분
 * 			------- 예외처리
 * 	  = 단일 조건문
 * 		형식)
 * 				|- 부정연산자 / 비교연산자 / 논리연산자만 사용 가능
 * 			if(조건)
 * 			{
 * 				수행문장
 * 			}
 * 			=> 여러개 사용 가능
 * 			=> 한개씩 조건을 비교 ==> 속도가 늦음
 * 			=> 주 사용처: 유효성 검사 / 메뉴(권한) 처리
 * 			=> 웹 / 게임
 * 			=> 자바 => backend
 * 						=> 프로그램언어
 * 						=> JSP
 * 						=> Spring
 * 						=> Oracle
 * 					  frontend
 * 						=>HTML / CSS / JS
 * 									  ----
 * 									  라이브러리 : Jquery
 * 												Vue
 * 												React
 * 						=> JS => 데이터형 다름 => 통일
 * 							int a=10
 * 							----------
 * 							let a=10
 * 								a=10.5 => TypeScript
 * 									   => NodeJS
 * 								SI /SE => DevOps => CI/CD
 * 													------
 * 													| 운영체제에 따라 다름
 * 													----------------
 * 														| docker
 * 														| aws
 * 
 * 	  = 선택 조건문
 * 	  = 다중 조건문
 * 	선택믄
 * 	  = 선택문
 * 	반복문
 * 	  = do~while
 * 	  = while
 * 	  = for
 * 	반복제어문
 * 	  = break
 * 	  = continue
 */
// 입력 => 1. 짝수/홀수
import java.util.Scanner;
public class 제어문_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("입력하신 "+ number + "는(은) 짝수입니다.");
		}
		else {
			System.out.println("입력하신 "+ number + "는(은) 홀수입니다.");
		}
	}

}
