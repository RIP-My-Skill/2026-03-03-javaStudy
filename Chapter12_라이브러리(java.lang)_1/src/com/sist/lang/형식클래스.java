package com.sist.lang;
/*
 *     SimpleDateFormat
 *     DecimalFormat
 *     MessageFormat
 */
import java.text.*;
import java.util.Date;
public class 형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SimpleDateFormat
		/*
		 *    1. 년도 => yyyy/yy
		 *    2. 월 => M/MM => M
		 *    3. 일 => d/dd
		 *    4. 시간 => hh/HH
		 *    5. 분 => m/mm
		 *    6. 초 => s/ss
		 */
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		DecimalFormat df=new DecimalFormat("###,###");
		int won=100000000;
		System.out.println(df.format(won)+"원");
		
		int no=1;
		String name="홍길동";
		String sex="남자";
		String address="서울";
		String phone="010-1111-1111";
		int age=30;
		String content="홍길동입니다";
		
		//오라클 전송
		String sql="INSERT INTO member VALUES("+no+",'"+name+"','"+sex+"','"+address+"','"+phone+"','"+age+"','"+content+"')";
		System.out.println(sql);
		
		sql="INSERT INTO member VALUES("+"{0},''{1}'',''{2}'',''{3}'',''{4}'',''{5}'',''{6}'')";
		Object[] obj= {no,name,sex,address,phone,age,content};
		System.out.println(MessageFormat.format(sql, obj));
	}

}
