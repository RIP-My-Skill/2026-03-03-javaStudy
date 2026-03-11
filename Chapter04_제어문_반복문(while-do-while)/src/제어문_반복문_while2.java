/*
 *  	1. while
 *  		사용자가 구구단 => 단 입력시
 *  		해당 단을 출력
 *  		------------------------
 */
import java.util.Scanner;
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력:");
		int dan = sc.nextInt();
		int i=1;
		while(i<=9) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			i++;
		}
	}

}
