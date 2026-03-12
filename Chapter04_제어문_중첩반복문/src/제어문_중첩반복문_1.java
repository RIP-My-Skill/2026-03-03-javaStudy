/*
 * 		중첩
 * 		---
 * 			로그인 된 경우 => 인증 => 메뉴 / 기능
 * 							=> 댓글
 * 							=> 예약
 * 							=> 결제
 * 							=> 여행 경로
 * 		  if(조건문) ======> if(조건문 && 조건문)
 * 		  {
 * 			if(조건문)
 * 			{
 * 			}
 * 		  }
 * 
 * 		------------------------------------
 * 		for(초기값;조건식;증가식)			=> 세로 (줄수)
 * 		{
 * 			for(초기값;조건식;증가식)		=> 가로 (실제 출력물)
 * 			{
 * 				반복수행문장
 *			}
 * 		}
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		for(int i=1; i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
