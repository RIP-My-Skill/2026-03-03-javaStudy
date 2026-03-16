/*
 * 	국어 영어 수학 입력 => 총점 / 평균 / 학점
 * 
 * 	입력
 * 	총점
 * 	평균
 * 	학점
 * 	출력
 */
import java.util.Scanner;
public class 메서드_2 {
	
	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject+" 점수 입력:");
		return sc.nextInt();
	}
	
	static int total(int kor,int eng,int math) {
		return kor + eng + math;
	}
	
	static double avg(int total) {
		return total/3.0;
	}
	
	static String score(int avg) {
		String score = switch(avg/10) {
			case 10,9 -> "A";
			case 8 -> "B";
			case 7 -> "C";
			case 6 -> "D";
			default -> "F";
		};
		return score;
	}
	
	static void process(int kor,int eng,int math) {
		int total = total(kor,eng,math);
		double avg = avg(total);
		String score = score((int)avg);
		System.out.println("-----결과-----");
		System.out.printf("국어:%d  영어:%d  수학:%d\n총점:%d\n평균:%.2f\n학점:%s",kor,eng,math,total,avg,score);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		process(kor,eng,math);
		
		
	}

}
