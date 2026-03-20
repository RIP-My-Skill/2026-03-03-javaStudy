package com.sist.oop;

import lombok.Getter;
import lombok.Setter;

/*
 * 	접근지정어 / 제어자
 * 	--------------
 * 	  구분 => 패키지 => 안에 있는 클래스 가지고 오기 (import)
 * 	----------------------------------------------
 * 	1.package : 한번만 사용
 * 	2.import : 여러번 사용 가능
 * 	3.class
 * 	  -----
 * 	  | 접근지정어 public / default
 * 	--------------------------------------------- 클래스 제작 순서
 * 	4.클래스 구조
 * 
 * 		(public) class ClassName {
 *   	--------------
 *   	변수 -> private
 *   	--------------
 *   	생성자 -> public
 *   	--------------
 *   	메서드 -> public
 *  	--------------
 *  	}
 *  
 *  1) static / instance
 *    --------  --------
 *    static 특징
 *    ---------- 공유 목적 => 사이트 (동일한 내용)
 *    						로그 / 공통 CSS
 *    			 객체 생성없이 사용 가능
 *    => 컴파일시 메모리 저장
 *    => 독립적으로 사용 가능 ==> 클래스.변수명
 *    						클래스.메서드
 *    => 공유 멤버 변수 : 회사명, 학교명 ...
 *    	 ------- 변경이 되면 모든 인스턴스 한번에 변경
 *    	 ------- 오라클 저장되는 데이터
 *    => 사용제한
 *    	 ----- static 메서드 안에서 static만 사용 가능
 *    	 ----- 인스턴스를 사용
 *    		   반드시 new 이용, 객체생성 후 사용
 *    => 사용 목적 : 전역 변수/전역 함수
 *  2) instance 변수
 *     객체변수 => 따로 메모리를 만들어서 저장 후 사용
 *     			맛집 : 300개
 *     			: 다른 주소에 저장된 데이터는 접근불가
 *     			-------------------
 *     			반드시 저장시에 new 생성자()
 *     					   --- 새로운 메모리
 *     => static/instance => 프로그램 종료시까지 메모리 유지
 *     => instance 변수 수분 => this.변수명
 *     => **static은 this를 사용할 수 없다.
 *     	
 *     	class A {
 *     		int a,b;
 *     		static int c; // 메모리 크기에서 제외
 *     		static void disp() {
 *          	a=4; (X) //static 안에서 instance 변수 사용 불가
 *          }
 *          ==> 지역변수/매개변수 우선순위
 *          	------------
 *          		 |
 *             멤버변수 (인스턴스 변수)
 *          void display() {
 *          	System.out.prinln(a); // 중복 변수명이 없을 경우 this. 생략 가능
 *          	System.out.prinln(b); //
 *          	System.out.prinln(c);
 *          }
 *     	}
 *     	----------------- 실제로 저장되는 메모리 크기 : 8byte
 *     	A aa=new A();
 *     	  Stack		     Heap	  MethodArea
 *     	   aa ----->   -------
 *    					this		--c--
 *     					--a--		  0
 *     					  0			-----
 *     					-----		disp()
 *     								----- this 사용 불가
 *     					--b--
 *     					  0
 *     					-----
 *     				   --------
 *     		오라클
 *     		A : no, name, subject, image
 *     		B : no, title, image, comment
 *     
 *     		select A.no, name, subject, A.image, B.no, title, B.image, comment
 *     		from A, B
 *     
 *     	2. 생성자
 *     		=> 	클래스를 저장해서 => 객체를 생성시 호출
 *     		   	생성자 => 호출
 *     				   new 생성자()
 *    		=> 	특징
 *    		   	클래스명과 동일
 *    		   	리턴형이 없음 (void는 리턴형임)
 *    		   	오버로딩 지원
 *    		   	class A {
 *    		   		public A(){}
 *    		   	} 
 *    			오버로딩
 *    			   => 같은 이름의 메서드로 새로운 기능 제작
 *    			   => 문법
 *    				  메서드명 동일
 *    				  매개변수 갯수나 데이터형이 달라야함
 *    				  리턴형/접근지정어는 관계 X
 *    			   => 생성자에서 오버로딩 지원
 *    				  => 초기화가 다르게 만드는 경우
 *    
 *    			변수 => 초기화
 *    			class A {
 *    				기본값
 *    				String name; => null
 *    				int age; => 0
 *    
 *    				명시적 초기화
 *    				--------------------
 *    				String name="홍길동"
 *    				int age=20;
 *    				String company;
 *    				long pay;
 *    				-------------------
 *    
 *    				초기화 블록
 *    				{
 *    					name="심청이";
 *    					age=25;
 *    					
 *    				}
 *    
 *    				생성자
 *    				A() {
 *    					name="박문수";
 *    					age=27;
 *    					company="SIST"
 *    					pay=3000
 *    				}
 *    				
 *    				초기값을 다르게 저장시 사용하는 생성자
 *    				A(String n,int a) {
 *    					this(); => 변수 초기화시 중복 제거
 *    					name=n;
 *    					age=a;
 *    				}
 *    			}
 *    
 *    			this() => 생성자안에서 호출
 *    				   => 반드시 첫번째 줄
 *    				   => 생성자안에서 다른 생성자 호출
 *    				   => 중복 코딩 제거
 *    				   => this => 매개변수/인스턴스변수 구분
 *    			-------------------------------------
 *    			** this => 자신의 객체
 *    					   컴파일시 생성 => static
 *    					   모든 클래스가 갖고있음
 *    			  A a=new A();
 *    			  this=a
 *    			  A b=new A();
 *    			  this=b
 *    			  ==> 현재 사용하고 있는 객체가 this
 *    			  ------------- 컴파일러가 처리
 *    		  *** static => 클래스 전체에서 공동사용하는 변수 정의
 *    			  ------------------------------------
 *    			  this() => 생성자간의 연결을 통해
 *    						효율적 초기화 수행
 *    						---- 반복제거
 *    			  this => 자신의 객체 => 모든 클래스가 갖고있음
 *    			  ------------------------------------ 인스턴스 변수 / 인스턴스 메서드에만 적용
 *    
 *    		프로그램
 *    		------
 *    		1. 기능 설정 : 메서드
 *    		   => 메서드 안에서 공통으로 사용되는 변수
 *    									---- 인스턴스 변수
 *    
 *    		2. 화면 UI => 변수 초기화
 *    		   ---------------------------------------
 *    		   => 명시적 초기화 => 알고 있는 상태
 *    			  => 목록 => 페이지 나눠짐
 *    				---- page=1
 *    		   => static 블록 
 *    			  => 객체 생성없이 화면에 출력 => static변수만 사용가능
 *    		   => instance 블록 
 *    			  => 파일/데이터베이스/크롤링 
 *    		   --------------------------------------- 자동호출
 *    		   => 생성자  ==> public
 *    		   *** static => static 블록
 *    		   *** instance => 생성자
 *    		   *** 모든 변수는 은닉화 => private
 *    		3. 구현
 *    		   메서드 => 다른 클래스와 연결 => public
 *    		   = static 메서드 : 공통으로 적용되는 기능
 *    		   = instance 메서드 : 각 개체마다 따로 수행하는 기능
 *    		   = abstract 메서드 : 개발자에게 맡기는 기능
 *    							 => 미완성 : 선언
 *    					| 설계 도구 => 추상클래스 / 인터페이스
 *    		   => static 메서드 : 클래스명.메서드()
 *    		   => instance 메서드 : 객체명.메서드()
 *    	
 *    
 *    	1. 자바의 접근 지정어
 *    	   = public
 *    		  어디서든 상관없이 접근가능 => 공개
 *    		  : 클래스, 생성자, 메서드
 *         = protected
 *            같은 패키지에서 접근가능 / 다른패키지 => 상속을 받은 클래스는 접근가능
 *            .. 사용빈도는 거의 없음
 *         = default
 *            같은 패키지에사 접근가능
 *         = private
 *         	  비공개 => 은닉화
 *            자신의 클래스내에서만 사용 가능 => 인스턴스변수
 *      2. public > protected > default > private
 *         => overriding시 접근지정어는 축소할수 없음
 *         class A {
 *         		void display(){}
 *         }
 *         class B extends A {
 *         		private void display(){}				//오류
 *         }
 *    		
 *    
 *    		요구사항
 *    			-------------------------
 *    				기능		기능에 필요한 요소
 *    			-------------------------
 *    			   로그인		id / pwd
 *    			-------------------------
 *    
 *    
 *    -----------------------------------------------------------------------
 *    			같은 클래스 		같은 폴더 			다른 클래스(상속) 		모든 클래스
 *    -----------------------------------------------------------------------
 *    private		O
 *    -----------------------------------------------------------------------
 *    default		O			   O
 *    -----------------------------------------------------------------------
 *    protected		O			   O				O
 *    -----------------------------------------------------------------------
 *    public		O			   O				O					O
 *    -----------------------------------------------------------------------   
 */
@Getter@Setter
class Sawon {
	private int sabun;
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
	
	
}
public class 접근지정어_1 {
	int a=10;
	void display(int a) {
		this.a=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong=new Sawon();
		hong.dept="개발부";
		hong.job="사원";
		hong.loc="제주";
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		System.out.println("사번:"+hong.getSabun());
		System.out.println("이름:"+hong.getName());
		System.out.println("부서:"+hong.dept);
		System.out.println("직위:"+hong.job);
		System.out.println("연봉:"+hong.getPay());
		System.out.println("근무지:"+hong.loc);
	}

}
