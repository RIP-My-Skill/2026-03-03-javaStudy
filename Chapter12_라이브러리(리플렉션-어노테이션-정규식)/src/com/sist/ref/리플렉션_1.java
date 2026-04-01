package com.sist.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *    리플렉션 => 동적제어
 *       => 현재 실행중 프로그램을 제어
 *                  --------
 *                    클래스 : 멤버변수 / 생성자 / 메서드
 *       => 클래스명 이용
 *          반드시 => 패키지명부터 설정한다
 *          메서드 제어(호출), 변수값 변경
 *                        -------- private 접근이 가능
 *                                 OOP 깨진다(보안)
 *       => 개게 생성
 *       => 어노테이션 확인
 *       ------------------------------------------- Spring 
 *       => 리플렉션 + 어노테이션 : 프레임워크 개발
 *       => 자바스크립트
 *        JSP  MVC   **Spring
 *        Vue  Vuex  Pinia ==> **Nust
 *        React Redux  **Next
 *        NodeJs=>Nest
 *        -------------------------------------------
 *        
 *        1. 클래스 정보 얻기 (멤버변수, 메서드, 생성자)
 *           => 객체생성/멤버변수 주입/메서드호출 => 자동화처리
 *        2. 프레임워크 (솔루션) => 개발자
 *           
 *        
 */
class Sawon {
	private String name;
	public Sawon() {}
	public Sawon(String name) {
		this.name=name;
	}
	public void info() {
		System.out.println("Sawon:info() Call.."+name);
	}
}
public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생성
		try {
			// 클래스 정보 읽기
			Class clsName=Class.forName("com.sist.ref.Sawon");
			// 클래스 정보의 생성자를 가져옴
			Constructor con=clsName.getConstructor();
			// 메모리 할당
			Object obj=con.newInstance();
			// Method 읽기
			Method m=clsName.getMethod("info");
			m.invoke(obj);
		}catch(Exception ex) {}
	}

}
