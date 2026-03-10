import java.util.Scanner;
public class 제어문_다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요:");
		int month = sc.nextInt();
		
		if(month==3 || month==4 || month==5)
			System.out.println(month+"월은 봄입니다");
		else if(month==6 || month==7 || month==8)
			System.out.println(month+"월은 여름입니다");
		else if(month==9 || month==10 || month==11)
			System.out.println(month+"월은 가을입니다");
		else if(month==12 || month==1 || month==2)
			System.out.println(month+"월은 겨울입니다");
		else
			System.err.println("없는 달입니다!!");
		
	}

}