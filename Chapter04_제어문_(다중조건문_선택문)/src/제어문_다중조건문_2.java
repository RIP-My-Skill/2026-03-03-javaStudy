import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력(0~100):");
		int score = sc.nextInt();
		
		char c ='A';
//		if(score>=90)
//			c='A';
//		else if(score>=80)
//			c='B';
//		else if(score>=70)
//			c='C';
//		else if(score>=60)
//			c='D';
//		else
//			c='F';
		
		String s = switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println("학점:"+s);
	}

}
