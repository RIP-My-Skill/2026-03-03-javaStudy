import java.util.Scanner;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력:");
		int month = sc.nextInt();
		
		switch(month) {
		case 3,4,5 -> System.out.println(month+"월은 봄입니다");
		case 6,7,8 -> System.out.println(month+"월은 여름입니다");
		case 9,10,11 -> System.out.println(month+"월은 가을입니다");
		case 12,1,2 -> System.out.println(month+"월은 겨울입니다");
		default -> System.err.println("없는 달입니다!!");
		}
	}

}
