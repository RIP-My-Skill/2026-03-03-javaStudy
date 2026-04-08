package com.sist.io;
import java.io.*;
/*
 *     FileInputStream fis=new FileInputStream("파일명") / FileReader fr=new FileReader("파일명")
 *       => 파일에 있는 데이터 읽기
 *     FileOutputStream fos=new FileOutputStream("파일명") / FileWriter fw=new FileWriter("파일명")
 *       => 파일에 데이터 쓰기 (파일이 없는 경우 파일 자동 생성)
 */
public class Buffered_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("c:\\javaDev\\movie.txt");
//			int i=0;
//			StringBuilder sb=new StringBuilder();
//			while((i=fis.read())!=-1) {
//				sb.append((char)i);
//			}
//			System.out.println(sb.toString());
			long start=System.currentTimeMillis();
			// 수행속도 최적화
			BufferedReader in=new BufferedReader(new InputStreamReader(fis));
			StringBuilder sb=new StringBuilder();
			while(true) {
				String msg=in.readLine();
				if(msg==null) break;
				sb.append(msg+"\n");
			}
			long end=System.currentTimeMillis();
			System.out.println(sb.toString());
			System.out.println("수행시간:"+(end-start)+"ms");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				fis.close();
			}catch(Exception ex) {}
		}
	}

}
