package com.sist.exception;
/*
 *     throws => 예외 회피 => 예측후 선언
 *     => 메서드뒤에 throws 예상되는 예외클래스
 *     => 컴파일러에 알려주는 경우
 *        ----------------- 컴파일 통과
 *     => 단점
 *        복구할 수 없음 / 정상 종료가 불가능 / 시스템 자체 처리
 *     => 라이브러리가 처리를 하지 않고 => 사용시에 처리해서 사용
 *        --------
 *        java.io/java.net/java.sql
 *        => Thread
 *        => 데이터베이스/네트워크
 *     => 장점 : 어떤 예외가 발생할 지 바로 알 수 있다.
 *     => 사용자 정의
 *        throws Exception
 *        throws Throwable
 *     
 *     -------------------------------------------
 *     throw : 임의로 발생
 *     사용자 정의 => 자바에서 지원하지 않는 예외가 있는 경우
 *     ------- 입력/짝수
 *     
 *     throw new 예외처리클래스("Message") => catch로 이동 
 *     => 밑에 코딩 불가
 */
import java.util.*;
public class 예외처리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=sc.nextInt();
	
		try {
			if(num%2!=0) {
				throw new Exception("짝수만 필요합니다");
				// 임의로 예외 발생 => 해당 catch로 이동
				// => 사용자 정의 예외처리
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
