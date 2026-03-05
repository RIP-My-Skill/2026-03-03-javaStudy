import java.util.Scanner;
public class 이항연산자_산술연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num = sc.nextInt();
//		
//		String res=(num%2==0)?"짝수":"홀수";
//		System.out.println(num+"은(는) "+res+"입니다.");
//		
//		int no=369;
//		System.out.println(no/100);
//		System.out.println((no%100)/10);
//		System.out.println(no%10);
		
		//암기
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력:");
		int year = sc.nextInt();
		/*
		 * 	윤년
		 * 	4년마다
		 * 	100년마다 제외
		 * 	400년마다
		 */
		String result=((year%4==0)&&(year%100!=0))||(year%400==0)?"윤년입니다":"윤년이 아닙니다.";
		System.out.println(year+"년은 "+result);
	}

}
