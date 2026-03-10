
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0, a5=0, a7=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				a3++;
			if(i%5==0)
				a5++;
			if(i%7==0)
				a7++;
		}
		System.out.println("1~100사이의 3의 배수의 갯수:"+a3);
		System.out.println("1~100사이의 5의 배수의 갯수:"+a5);
		System.out.println("1~100사이의 7의 배수의 갯수:"+a7);
		
		//1~100사이 짝수합 홀수합
		int even=0, odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100사이의 짝수합:"+even);
		System.out.println("1~100사이의 홀수합:"+odd);
	}

}
