package com.sist.lang;
// String과 동일 => append => 문자열 결합
import java.io.*;
public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String foodData="";
			FileReader fr=new FileReader("c:\\javaDev\\food.txt");
			/*
			 *   FileReader : 
			 *   FileInputStream : 바이트 스트림 => 다운로드 업로드
			 */
			StringBuffer sb=new StringBuffer();
			int i=0;
			long start=System.currentTimeMillis();
			while((i=fr.read())!=-1) { // -1 EOF
//				foodData+=(char)i;
				sb.append((char)i);
			}
			fr.close();
			long end=System.currentTimeMillis();
			
			// 데이터출력
//			System.out.println(foodData);
			System.out.println(sb.toString());
			System.out.println("걸린시간:"+(end-start)+"ms");
		}catch(Exception ex) {}
	}

}
