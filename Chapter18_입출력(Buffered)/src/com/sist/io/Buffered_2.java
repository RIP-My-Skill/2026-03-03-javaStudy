package com.sist.io;
// BufferedReader : 외부에서 데이터 읽기 , 네트워크 통신
// 키보드 입력 가능

import java.io.*;
public class Buffered_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			// 키보드로부터 입력값 받음
			System.out.print("문자열 입력:");
			String msg=br.readLine();
			System.out.println(msg);
		}catch(Exception ex) {}
	}

}
