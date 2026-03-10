
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2 == 0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
		
		//1~10 ==> 3의 배수 제외 출력
		for(int i=1;i<=10;i++) {
			if(i%3!=0)
				System.out.print(i+" ");
		}
		
		System.out.println();
		
		//1~10 ==> 2의 배수이고 3의 배수인 값 출력
		for(int i=1;i<=10;i++) {
			if(i%2==0 && i%3==0)
				System.out.print(i+" ");
		}
	}

}
