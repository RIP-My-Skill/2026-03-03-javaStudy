package com.sist.regex;
// 0개이상 반복 => *
public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello".matches("H*.llo"));
		System.out.println("ho".matches("h.*o"));
		//.*
		// 임의의 한글자가 있을수도있고 없을수도있다
		System.out.println("hheeeeee".matches("h*e*"));
	}

}
