/*
 * 
 */

class Member {
	int mno;
	String name;
	static String company="Daum";
}
public class 클래스변수_설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	m1=Member@1f32e575
			m2=Member@1be6f5c3
			m3=Member@6b884d57
		 */
		Member m1 = new Member();
		System.out.println("m1="+m1);
		m1.mno=100;
		m1.name="홍길동";
		Member m2 = new Member();
		System.out.println("m2="+m2);
		m2.mno=200;
		m2.name="심청이";
		Member m3 = new Member();
		System.out.println("m3="+m3);
		m3.mno=300;
		m3.name="박문수";
		
		System.out.println();
		System.out.println("회원1 회원번호:"+m1.mno);
		System.out.println("회원1 이름:"+m1.name);
		System.out.println("=".repeat(15));
		System.out.println("회원2 회원번호:"+m2.mno);
		System.out.println("회원2 이름:"+m2.name);
		System.out.println("=".repeat(15));
		System.out.println("회원3 회원번호:"+m3.mno);
		System.out.println("회원3 이름:"+m3.name);
		System.out.println("=".repeat(15));
		
		m1.name = "홍길수";
		System.out.println("회원1 이름:"+m1.name);
		System.out.println("회원2 이름:"+m2.name);
		System.out.println("회원3 이름:"+m3.name);
		
		m1.company = "Kakao";
		System.out.println("회원1 회사명:"+m1.company);
		System.out.println("회원2 회사명:"+m2.company);
		System.out.println("회원3 회사명:"+m3.company);
	
		Member.company = "Naver";
		System.out.println("회원1 회사명:"+m1.company);
		System.out.println("회원2 회사명:"+m2.company);
		System.out.println("회원3 회사명:"+m3.company);
	}

}
