// 국어, 영어, 수학 => 1.총점 , 2.평균, 3.학점 (조건문)
// A B C D F
//  A+ A0 A- ......
import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		System.out.print("수학점수:");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		String grade;
		
		if(avg >= 90)
			grade = "A";
		else if(avg >= 80)
			grade = "B";
		else if(avg >= 70)
			grade = "C";
		else if(avg >= 60)
			grade = "D";
		else
			grade = "F";
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+grade);
		
	}

}
