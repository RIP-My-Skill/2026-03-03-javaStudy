package com.sist.anno;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 *    어노테이션
 *      => 다른 프로그램에 정보 제공
 *      => 책 => 목차 (인덱스) => 쉽게 찾을 수 있게 만들어 준다
 *      => 구분자 
 *          = 멤버변수
 *          = 클래스 (*******)
 *          = 메서드 (*******)
 *          = 생성자
 *      1. 구분은 어떤 것을 할 것인지
 *         @Target
 *           TYPE ===> 클래스
 *           METHOD ===> 메서드
 *           CONSTRUCTOR ===> 생성자
 *           FIELD ===> 멤버변수
 *      2. 저장기간
 *         SOURCE : 클래스파일(.class)가 존재시까지
 *         CLASS : 컴파일시만 유지 => 실행시 사라짐
 *         ***RUNTIME : 파일 존재, 프로그램 종료시까지
 *         기능은 없고 => 찾기 기능만 가지고 있다
 *      3. public @interface 어노테이션명칭
 *         {
 *             메서드;
 *         }   
 *      4. 배치 ==> 위에 배치
 *         @ => TYPE
 *         class ClassName
 *         {
 *            @ => FIELD
 *            변수
 *            @CONSTRUCTOR
 *            생성자
 *            @METHOD
 *            메서드
 *         }
 *         
 */
class Controller {
	@RequestMapping("1") // GetMapping / PostMapping
	public void main_page() {
		System.out.println("Main Page 이동");
	}
	@RequestMapping("2")
	public void member_join() {
		System.out.println("회원가입 이동");
	}
	@RequestMapping("3")
	public void login() {
		System.out.println("로그인 이동");
	}
	@RequestMapping("4")
	public void board_list() {
		System.out.println("게시판 이동");
	}
	@RequestMapping("5")
	public void food_list() {
		System.out.println("맛집 목록 이동");
	}
	@RequestMapping("6")
	public void food_detail() {
		System.out.println("맛집 상세보기 이동");
	}
	@RequestMapping("7")
	public void food_jjim() {
		System.out.println("맛집 찜 이동");
	}
	@RequestMapping("8")
	public void like() {
		System.out.println("맛집 좋아요 이동");
	}
}
public class 어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 메뉴 =====");
		System.out.println("1. Main");
		System.out.println("2. 회원가입");
		System.out.println("3. 로그인");
		System.out.println("4. 게시판");
		System.out.println("5. 맛집 목록");
		System.out.println("6. 맛집 상세");
		System.out.println("7. 맛집 찜 이동");
		System.out.println("8. 맛집 좋아요 이동");
		System.out.print("메뉴 입력:");
		int menu=sc.nextInt();
		
		try {
			//클래스 정보 열기
			Class clsName=Class.forName("com.sist.anno.Controller");
			// 객체 생성
			Object obj=clsName.getDeclaredConstructor().newInstance();
			// 메서드 정보 가져오기
			Method[] methods=clsName.getDeclaredMethods();
			
			for(Method m:methods) {
				// 메서드 위의 어노테이션 찾기
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				// 어노테이션의 문자열과 사용자 입력값 비교
				if(rm.value().equals(String.valueOf(menu))) {
					//해당 메서드 호출 => invoke(객체명,매개변수)
					m.invoke(obj, null);
				}
			}
		}catch(Exception ex) {}
	}

}
