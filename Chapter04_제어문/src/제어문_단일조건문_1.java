import java.util.Scanner;
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력해주세요:");
		String ch=sc.nextLine();
		char c=ch.charAt(0); //문자열 => 문자 변환
		System.out.println("알파벳:"+c);
		
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다.");
		if(c>='a' && c<='z')
			System.out.println(c+"는(은) 소문자입니다.");
		if(c>='0' && c<='9')
			System.out.println(c+"는(은) 숫자입니다.");
	}

}
