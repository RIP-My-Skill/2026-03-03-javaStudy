package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 매개변수를 알수없는 경우 ==> 웹 (필터) => 가변매개변수
/*
 * 	printf("%d",10)
 * 	printf("%d%d",10,20)
 */
// 검색 => 필터링 => String.format(String,object... args)
class Temp {
	public void sum(int... value) {
		int s=0;
		for(int i=0;i<value.length;i++) {
			s+=value[i]; // 값 읽기 => 배열
		}
		System.out.println("sum="+s);
	}
	public String change(int num) {
		DecimalFormat d=new DecimalFormat("###,###");
		return d.format(num);
	}
	public String dateChange(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}
public class 메서드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t=new Temp();
		t.sum(10);
		t.sum(10,20,30,40,50,60,70);
		int a=1000000000;
		String res=t.change(a);
		System.out.println(res+"원");
		res=t.dateChange(new Date());
		System.out.println(res);
	}
	
}
