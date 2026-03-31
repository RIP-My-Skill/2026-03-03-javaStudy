package com.sist.lang;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// Date => 현재 날짜 읽어오기 => 제어 (Calender)
// 534p
import java.util.*;
public class Date_Time_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String res=now.format(formatter);
		System.out.println(res);
	}

}
