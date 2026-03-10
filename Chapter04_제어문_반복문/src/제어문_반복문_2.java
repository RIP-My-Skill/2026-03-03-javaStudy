import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("1~100 사이의 정수 입력:");
			int input = sc.nextInt();
			if(1<=input && input <=100) {
				if(input > number)
					System.out.println("DOWN");
				else if(input < number)
					System.out.println("UP");
				else{
					System.out.println("정답!");
					System.exit(0);
				}
			}
			else
			System.err.println("잘못된 입력입니다. 1~100 사이의 정수를 입력해주세요.");
		}
	}

}
