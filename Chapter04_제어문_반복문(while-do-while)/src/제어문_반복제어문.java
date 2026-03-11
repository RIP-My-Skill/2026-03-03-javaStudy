
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++) {
			if(i==5)break;
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=10;i++) {
			if(i==5)continue;
			System.out.print(i+" ");
		}
	}

}
