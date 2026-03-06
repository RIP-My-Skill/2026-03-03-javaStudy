/*
 * 		산출물
 * 		1. 형식	==> 벤치마킹
 * 		2. 결과값	==> 출력물 (와이어프레임)
 * 		3. 흐름	==> 유스케이스 다이어그램, 클래스 다이어그램, 시퀀스 다이어그램
 * 		4. 순서도	==> 플로우차트
 * 		-----------
 * 		ERD => 구현 => 웹 사이트
 * 			   -------------
 */
import java.util.Scanner;
public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력:");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력:");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력:");
		int math = sc.nextInt();
		
		int avg=(kor+eng+math)/3;
		// avg>=60?"합격":"불합격"
		if(avg>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}

}
