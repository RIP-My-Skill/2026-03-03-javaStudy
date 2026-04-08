package com.sist.io;
/*
 *     객체단위 저장
 *     ObjectInputStream   /   ObjectOutputStream
 *          | 읽기                    | 쓰기(저장)
 *          
 *      1) 직렬화 이용
 *         -------------
 *           |    |    |
 *         -------------
 *      2) 역직렬화 이용
 *         ------
 *         
 *         ------
 *         
 *         ------
 *         
 *         ------
 */
import java.io.*;

import lombok.Getter;
import lombok.Setter;
// json => 파일, 업로드, 다운로드
// json, properties, xml
@Getter@Setter
class Student implements Serializable { // 직렬화
	private int hakbun,kor,eng,math;
	private String name;
}
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.setHakbun(1);
		std.setName("홍길동");
		std.setKor(90);
		std.setEng(80);
		std.setMath(90);
		
		//저장
		ObjectOutputStream oos=null;
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c:\\java_data\\student.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(std);
			System.out.println("객체단위 저장 완료");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				oos.close();
				fos.close();
			}catch(Exception ex) {}
			
		}
	}

}
