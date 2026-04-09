package com.sist.network;
import java.net.*;
import java.io.*;
import java.util.*;
/*
 *    URL / URI 
 *    --------- 웹 연결 => 데이터 수집
 *    URLEncoder : byte[]
 *    Socket : 연결 기기 => 다른 사람과 통신
 *             => client용
 *             => ip (전화번호) / port (연결선)
 *                             => 가변
 *    ServerSocket : 서버 연결기기 => 기지국 => 접속자 받기
 *    ------------------------ 핸드폰 : 고정
 *    
 *    https://www.10000recipe.com/recipe/list.html?q=%EB%B0%80%EA%B0%80%EB%A3%A8
 */
public class URL_1 {
	//데이터 수집
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("검색어입력:");
			String fd=sc.next();
			String u="https://www.10000recipe.com/recipe/list.html?q="+URLEncoder.encode(fd,"UTF-8");
			URI uri=new URI(u);
			URL url=uri.toURL();
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null) { // 사이트에 연결되었다
				BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true) {
					String line=br.readLine();
					if(line==null) break;
					System.out.println(line);
				}
			}
			// Jsoup.connect()
		}catch(Exception ex) {}
	}

}
