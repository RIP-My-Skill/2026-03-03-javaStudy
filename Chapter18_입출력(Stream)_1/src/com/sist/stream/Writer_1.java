package com.sist.stream;
// FileWriter => write() / close()
//               ------- write(String s)
import java.io.*;
import java.util.Scanner;
public class Writer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\java_data\\member.txt",true);
			Scanner sc=new Scanner(System.in);
			System.out.print("이름 입력:");
			String name=sc.next();
			System.out.print("성별 입력:");
			String sex=sc.next();
			System.out.print("전화번호 입력:");
			String phone=sc.next();
			// 구분이 없음 => 한명(\n), 어떤 데이터인지 구분(| ,)
			//             row      column
			String data=name+","+sex+","+phone+"\n";
			fw.write(data);
			System.out.println("회원 가입 완료");
			
			FileReader fr=new FileReader("c:\\java_data\\member.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}catch(Exception ex) {}
		}
	}

}
