import java.util.*;
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력:");
		int no = sc.nextInt();
		// switch => 다중조건문과 동일
		if(1 <= no && no <=12) {
			if(3 <= no && no <= 5)
				System.out.println("계절은 봄입니다.");
			else if(6 <= no && no <=8)
				System.out.println("계절은 여름입니다.");
			else if(9 <= no && no <=11)
				System.out.println("계절은 가을입니다.");
			else
				System.out.println("계절은 겨울입니다.");
		}
		else {
			System.err.println("없는 달입니다!!");
		}
	}

}
