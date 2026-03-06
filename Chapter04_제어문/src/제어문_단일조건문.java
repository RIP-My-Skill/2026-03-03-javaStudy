/*
 * 		형식)
 * 			if(조건){
 * 				실행문장
 * 			}
 */
/*
 * 		컴퓨터와 가위바위보 게임
 * 			  ------- 가정 (가위 0, 바위 1, 보 2)
 * 
 * 		컴퓨터	사용자
 * 			가위	 가위
 * 				 바위
 * 				 보
 * 			바위
 * 				 가위
 * 				 바위
 * 				 보
 * 			보
 * 				 가위
 * 				 바위
 * 				 보
 * 			----------------------- 조건문 3개
 */
import java.util.Scanner;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		if(a==10) {
//			System.out.println("a="+a);
//		}
//		System.out.println("프로그램 종료!!");
		
		int com = (int)(Math.random()*3); //0,1,2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
		int user = sc.nextInt();
		String[] str= {"가위","바위","보"};
		System.out.print("컴퓨터:"+str[com]);
//		if(com==0)
//			System.out.print("가위");
//		if(com==1)
//			System.out.print("바위");
//		if(com==2)
//			System.out.print("보");
		System.out.println();

		System.out.print("사용자:"+str[user]);
//		if(user==0)
//			System.out.print("가위");
//		if(user==1)
//			System.out.print("바위");
//		if(user==2)
//			System.out.print("보");
		
		System.out.println("\n=====결과=====");
		
//		if(com==user)
//			System.out.println("비겼습니다.");
//		if(com==0 && user==1)
//			System.out.println("사용자 Win");
//		if(com==0 && user==2)
//			System.out.println("컴퓨터 Win");
//		if(com==1 && user==0)
//			System.out.println("컴퓨터 Win");
//		if(com==1 && user==2)
//			System.out.println("사용자 Win");
//		if(com==2 && user==0)
//			System.out.println("사용자 Win");
//		if(com==2 && user==1)
//			System.out.println("컴퓨터 Win");
		int result= com - user;
		if(result==0)
			System.out.println("비겼습니다.");
		if(result==-1 || result==2)
			System.out.println("사용자 Win");
		if(result==1 || result==-2)
			System.out.println("컴퓨터 Win");
		
	}

}
