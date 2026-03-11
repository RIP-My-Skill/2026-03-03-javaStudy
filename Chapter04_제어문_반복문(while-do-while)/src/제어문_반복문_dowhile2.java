//난수 => 1~100 사이
//맞추는게임
//힌트(UP/DOWN)
import java.util.*;
public class 제어문_반복문_dowhile2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = (int)(Math.random()*100)+1;
		int input = 0;
		do {
			System.out.print("정수를 입력해주세요(1~100):");
			input = getUserInput(" ");
			if(input>100)
				System.out.println("잘못된 입력입니다. 1~100 사이의 정수를 입력해주세요.");
			else if(input==-1)
				continue;
			else if(input>number)
				System.out.println("DOWN");
			else if(input<number)
				System.out.println("UP");
		}while(input != number);
		System.out.println("정답!");
	}
	
	
	private static int getUserInput(String prompt) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("[오류] 숫자만 입력 가능합니다.");
            return -1;
        }
    }
	
	

}
