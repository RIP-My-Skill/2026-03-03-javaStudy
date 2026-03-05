
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=80;
		int eng=78;
		int math=87;
		
		int count=3;
		
		int total=kor+eng+math;
		double avg=(double)total/count;
		
		System.out.println("총점:"+total+"\n평균:"+avg);
		
		char c='A';
		System.out.println((int)c);
		int i=65;
		System.out.println((char)i);
		
		int a=123456;
		float d=123456.78F;
		int r=(int)((d-a)*100);
		System.out.println(r);
	}

}
