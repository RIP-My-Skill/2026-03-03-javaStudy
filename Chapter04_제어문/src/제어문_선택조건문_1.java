// 문자열 비교 => equals ==> 로그인처리
import java.util.Scanner;
public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요:");
		String id = sc.next();
		System.out.print("PW를 입력하세요:");
		String pw = sc.next();
		
		if(id.equals("admin") && pw.equals("1234")) 
		//if(id == "admin" && pw =="1234")
		{
			System.out.println("로그인 되었습니다.");
		}
		else 
		{
			System.err.println("id 혹은 pw가 틀립니다!!");
		}
	}

}
