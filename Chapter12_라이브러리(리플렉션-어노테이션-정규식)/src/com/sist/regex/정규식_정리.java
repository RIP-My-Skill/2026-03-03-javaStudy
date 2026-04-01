package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *    정규식은 문자의 형태(패턴)을 만드는 과정
 *    => replaceAll / split
 *    => 기호
 *       [] => 한개의 문자
 *          => [a] / [abc] => a|b|c
 *          => [a-zA-Z] => contains
 *          => ^[a-zA-Z] => startsWith
 *          => [a-zA-Z]$ => endsWith
 *          ^,$ => 시작과 끝
 *        + => 1개 이상 반복
 *        * => 0개 이상 반복
 *        . => 임의의 한글자 (오라클: _)
 *        ? => 없거나 1개
 *        | => 선택(or)
 *       () => 그룹
 *       {n} => 글자수
 *       
 * 
 */
public class 정규식_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg="내 전화번호는 010-1234-5678이고 "+"회사전화는 02-333-4566입니다";
//		String regex="(\\d{2,3})-(\\d{3,4})-(\\d{4})";
//		Pattern p=Pattern.compile(regex);
//		Matcher m=p.matcher(msg);
//		
//		while(m.find()) {
//			System.out.println("전화번호:"+m.group());
//			System.out.println(m.start()+" "+m.end());
//		}
		/*
		 *   Matcher
		 *     matchers() : 전체 문자열에서 패턴과 일치 여부 => boolean
		 *     find() : 부분일치 (패턴 형식)
		 *     group() : 찾은 문자열
		 *     start() : 시작 인덱스
		 *     end() : 끝 인덱스
		 *     replaceAll() : 변환
		 */
//		String msg="비밀먼호: 1234, 또 다른 비밀번호: 567";
//		String regex="\\d+";
//		Pattern p=Pattern.compile(regex);
//		Matcher m=p.matcher(msg);
//		
//		while(m.find()) {
//			System.out.println("비밀번호:"+m.group());
//		}
//		String email="test@emple.com";
//		String regex="^\\w+@\\w+\\.\\w{2,}$";
//		boolean res=Pattern.matches(regex, email);
//		if(res) {
//			System.out.println("올바른 형식입니다.");
//		}else {
//			System.out.println("이메일 형식이 아닙니다");
//		}
//		Pattern p=Pattern.compile(regex);
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(date);
		System.out.println(today);
		String regex="(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(today);
		
		while(m.find()) {
			System.out.println("연도:"+m.group(1)+"년");
			System.out.println("월:"+m.group(2)+"월");
			System.out.println("일:"+m.group(3)+"일");
		}
		/*
		 *   패턴
		 *    Pattern.matchers => equals => 전체문장
		 *    Matcher.find() => contains
		 *    => 찾은 문자열: group
		 *    => replaceAll()
		 *    => () => 그룹
		 *    ------------------------------------
		 *    --> 데이터셋 => 데이터사전
		 */
	}

}
