package com.sist.lang;
/*
 *    java.lang => 기본 클래스 저장
 *     => 라이브러리 => 메서드
 *    Object : 최상위 클래스 / 모든 클래스의 상위 / 가장 큰 데이터형
 *      데이터가  여러개 있는 경우 => 배열
 *      Object[] obj={10,10.5,"aaa",'A',newA()};
 *      = String toString() => 객체 메모리 주소를 문자열 리턴
 *               ---------- 오버라이딩 => 변수값 출력
 *               ---------- 생략 가능
 *               A a=new A()
 *               System.out.println(a)
 *               System.out.println(a.toString())
 *      = boolean equals(Object o) : 객체 비교 => (주소값 비교)
 *                  => 실제 값을 비교할때 오버라이딩
 *      = Object clone(): 복제 => 같은 값을 가지고 새로운 메모리 생성
 *                  => Spring : prototype
 *                  => Git Clone => 그대로 저장
 *      = int hashCode() : 구분자 (객체)
 *    String : 문자열
 *      = int length() : 문자의 갯수
 *      = boolean equals(String s) : 문자값 비교
 *          => 로그인 / 상세보기 / 아이디중복
 *      = boolean startsWith(String s) : 시작문자열이 같은 경우
 *          => 쿠키찾기 / 자동완성기
 *      = boolean contains(String s) : 포함된 문자열
 *          => 검색
 *      = int indexOf(문자, 문자열) : 앞에서부터 문자 찾기
 *      = int lastIndexOf(문자,문자열) : 뒤에서부터 문자 찾기
 *      = String replace(문자,문자열) : 변환
 *                       old new
 *      = String replaceAll(문자열,변경될 문자열)
 *                         ----- 정규식 : 패턴
 *    StringBuffer/StringBuilder
 *    Wrapper
 *      = Integer
 *      = Double
 *      = Boolean
 *      = Long
 *    Math
 *    System
 */
// git config --global user.emanil "you@example.com"
// git config --global user.name "Your Name"
// git config -global user.password "토큰키"
//
// git init
// git add .
// git remote add origin git 주소
// git branch -M main
// git commit -m "커밋메시지"
// git push -u origin main -force(한번수행)
public class 중간정리 {

}
