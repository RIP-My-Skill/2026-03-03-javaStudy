/*
 * 1~100 사이 총합 / 짝수 합 / 홀수 합
 */
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		int even = 0;
		int odd = 0;
		
		while(num<=100) {
			if(num%2==0) {
				even+=num;
			}
			else {
				odd+=num;
			}
			sum+=num;
			num++;
		}
		System.out.println("1~100 총합:"+sum);
		System.out.println("1~100 짝수합:"+even);
		System.out.println("1~100 홀수합:"+odd);

	}

}
