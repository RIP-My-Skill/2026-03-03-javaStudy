package com.sist.lang;
import java.time.*;
import java.time.format.DateTimeFormatter;
/*
 *    LocalDateTime
 *    => 날짜 + 시간
 *    => LocalDate: 날짜 / LocalTime: 시간
 *    // 1. 현재 날짜+시간
 */
import java.util.*;
public class 시간 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd EE hh:mm:ss a",Locale.US);
		// 1.현재 날짜+시간
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now.format(formatter));
		// 2.특정 날짜.시간 생성
		LocalDateTime dateTime=LocalDateTime.of(2026,3,30,14,30,30);
		System.out.println(dateTime.format(formatter));
		// 3.날짜시간 더하기 빼기
		LocalDateTime f=now.plusDays(5).plusHours(3);
		System.out.println(f.format(formatter));
		LocalDateTime p=now.minusMonths(1);
		System.out.println(p.format(formatter));
		
		int year=now.getYear();
		int month=now.getMonthValue();
		int day=now.getDayOfMonth();
		int hour=now.getHour();
		int min=now.getMinute();
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+min);
		
		// 문자열 => 날짜형 변환
		// 오라클 => DATE => 시간, VARCHAR => 시간
		String str="2026-03-31 15:47:40";
		formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime t=LocalDateTime.parse(str,formatter);
		String fff=dateTime.format(formatter);
		System.out.println(fff);
	}

}
