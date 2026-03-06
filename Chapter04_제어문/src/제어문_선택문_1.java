/*
 * 		범위가 있는 경우 => 다중 조건문
 * 		한개의 값을 선택 => 선택문
 * 						---- 웹에서는 사용빈도가 없다.
 * 						---- 네트워크 / 게임 / DB
 */
import java.util.*;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = sc.nextInt();
//		char op=' ';
//		
//		switch(score/10)
//		{
//		case 10: case 9:
//			op='A';
//			break;
//		case 8:
//			op='B';
//			break;
//		case 7:
//			op='C';
//			break;
//		case 6:
//			op='D';
//			break;
//		default:
//			op='F';
//		}
		// -> 람다 (최근 변경된 방식)
		// break 생략 가능
		// 간결하게 처리
		// jdk 14이상 ==> 자바스크립트에선 -> 대신 =>
		String grade = switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		
		System.out.println("학점:"+grade);
	}

}
