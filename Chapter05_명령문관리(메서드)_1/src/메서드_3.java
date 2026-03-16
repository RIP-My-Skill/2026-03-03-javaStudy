/*
 * 		int total = kor+eng+math
 * 					------------ 매개변수
 * 			  |
 * 			리턴형
 * 		------------------------ 메서드
 * 
 * 		static int totalScore(int kor,int eng,int math){
 * 		
 * 			return kor+eng+math;
 * 		}
 * 		=> int total = totalScore(90,90,90);
 */
public class 메서드_3 {
	static void display() {
		System.out.println("display() 진입...");
		System.out.println("기능 처리");
		System.out.println("...display() 종료");
	}
	
	static void increment() {
		int a=10;
		System.out.println("a="+a);
		a++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		increment();
		increment();
		increment();
	}

}
