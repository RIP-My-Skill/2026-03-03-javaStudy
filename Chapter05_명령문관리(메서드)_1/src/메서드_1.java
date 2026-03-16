/*
 * 	프로그램
 * 		
 * 		=> 데이터 저장 : 관리 (묶어서 관리 => 배열)
 * 		=> 명령문 : 명령어를 모아서 관리 => 메소드
 * 		---------------------------------- + 객체지향
 * 		기능별 분리
 * 
 * 		=> 선언부 : 리턴형 메소드명(매개변수)
 *							 | 사용자 입력값 
 * 				 | 처리 결과값 : 한개만 사용 가능 => 배열/클래스
 * 		   구현부 {구현}
 * 
 * 		1) 난수 발생(1~100)
 * 		2) 난수 맞추기
 * 			1. 입력
 * 			2. 비교
 * 		3) 힌트
 * 		4) 종료
 */
import java.util.*;
public class 메서드_1 {

	static int random() {
		int com = (int)(Math.random()*100)+1;
		return com;
	}
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		int user = 0;
		while(true) {
			System.out.print("1~100 사이 정수 입력:");
			user = sc.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		return user;
	}
	
	static void compare(int com, int user) {
		Scanner sc = new Scanner(System.in);
		if(user>com) {
			System.out.println("DOWN");
		}
		else if(user<com) {
			System.out.println("UP");
		}
		else {
			System.out.println("정답!");
			System.out.print("게임을 다시 하시겠습니까?(y/n)");
			char c = sc.next().charAt(0);
			if(c=='y'||c=='Y') {
				process();
			}
			else {
				System.out.println("Game Over!!");
				System.exit(0);
			}
		}
	}
	
	static void process() {
		int com = random();
		while(true) {
			int user = input();
			compare(com,user);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
//		Scanner sc = new Scanner(System.in);
//		int com = (int)(Math.random()*100)+1;
//		while(true) {
//			System.out.print("1~100 사이 정수 입력:");
//			int user = sc.nextInt();
//			if(user<1 || user>100) {
//				System.out.println("잘못된 입력입니다.");
//				continue;
//			}
//			else {
//				if(user>com) {
//					System.out.println("DOWN");
//				}
//				else if(user<com) {
//					System.out.println("UP");
//				}
//				else {
//					System.out.println("정답!");
//					break;
//				}
//			}
//		}
	}

}
