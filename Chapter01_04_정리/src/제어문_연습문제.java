import java.util.Scanner;
public class 제어문_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번 문제
		System.out.println("1번문제");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num1 = sc.nextInt();
		if(num1>0)
			System.out.println(num1+"는(은) 양수입니다.");
		else if(num1<0)
			System.out.println(num1+"는(은) 음수입니다.");
		else
			System.out.println(num1+"입니다.");
		
		System.out.println("=".repeat(50));
		
		//2번문제
		System.out.println("2번문제");
		System.out.print("정수 입력:");
		int num2 = sc.nextInt();
		if(num2%3==0)
			System.out.println(num2+"는(은) 3의 배수입니다.");
		else
			System.out.println(num2+"는(은) 3의 배수가 아닙니다.");
		
		System.out.println("=".repeat(50));
		
		//3번문제
		System.out.println("3번문제");
		System.out.print("정수 입력:");
		int num3 = sc.nextInt();
		if(num3<0)
			System.out.println("a="+(-num3));
		else
			System.out.println("a="+num3);
		
		System.out.println("=".repeat(50));
		
		//4번문제
		System.out.println("4번문제");
		System.out.print("정수 입력:");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0))
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
		
		System.out.println("=".repeat(50));
		
		//5번 문제
		System.out.println("5번문제");
		System.out.print("정수 입력:");
		int num5 = sc.nextInt();
		if(num5>100)
			System.err.println("100점 이하의 정수를 입력해주세요.");
		else if(num5>=90)
			System.out.println("A학점입니다.");
		else if(num5>=80)
			System.out.println("B학점입니다.");
		else if(num5>=70)
			System.out.println("C학점입니다.");
		else if(num5>=60)
			System.out.println("D학점입니다.");
		else
			System.out.println("F학점입니다.");
		
		System.out.println("=".repeat(50));
		
		//6번 문제
		System.out.println("6번문제");
		System.out.print("정수 입력:");
		int num6 = sc.nextInt();
		if(num6>100)
			System.err.println("100점 이하의 정수를 입력해주세요.");
		else {
			switch(num6/10) {
			case 10,9 -> System.out.println("A학점입니다.");
			case 8 -> System.out.println("B학점입니다.");
			case 7 -> System.out.println("C학점입니다.");
			case 6 -> System.out.println("D학점입니다.");
			default -> System.out.println("F학점입니다.");
			}
		}
		
		System.out.println("=".repeat(50));
		
		//7번문제
		System.out.println("7번문제");
		System.out.print("정수 입력:");
		int num7 = sc.nextInt();
		
		System.out.print("연산자 입력:");
		String op = sc.next();
		
		System.out.print("정수 입력:");
		int num8 = sc.nextInt();
		
		switch(op) {
		case "+" -> System.out.printf("%d %s %d = %d\n",num7,op,num8,num7+num8);
		case "-" -> System.out.printf("%d %s %d = %d\n",num7,op,num8,num7-num8);
		case "*" -> System.out.printf("%d %s %d = %d\n",num7,op,num8,num7*num8);
		case "/" -> {
			if(num8==0)
				System.err.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d %s %d = %d\n",num7,op,num8,num7/num8);
		}
		}
		
		System.out.println("=".repeat(50));
		
		//8번문제
		System.out.println("8번문제");
		int sum=0;
		for(int i=2;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("2+4+...100의 합:"+sum);
		
		System.out.println("=".repeat(50));
		
		//9번문제
		System.out.println("9번문제");
		for(int i=5;i<=50;i+=5) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("=".repeat(50));
		
		//10번문제
		System.out.println("10번문제");
		for(char c='B';c<='N';c+=2) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		System.out.println("=".repeat(50));
		
		//11번문제
		System.out.println("11번문제");
		System.out.print("정수 입력:");
		int num11 = sc.nextInt();
		sum=0;
		for(int i=1;i<=num11;i++) {
			sum += i;
		}
		System.out.println("1~"+num11+"까지의 합:"+sum);
		
		System.out.println("=".repeat(50));
		
		//12번문제
		System.out.println("12번문제");
		for(int i=1; i<=30; i++) {
			
			if(i%2==0)
				System.out.print(i +" ");
			if(i%6==0)
				System.out.println();
		
		}
		
		
		System.out.println("=".repeat(50));
		
		//13번문제
		System.out.println("13번문제");
		sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) 
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3...-10까지의 합:"+sum);
		
		System.out.println("=".repeat(50));
		
		//14번문제
		System.out.println("14번문제");
		for(int i=1;i<=10;i++) {
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("=".repeat(50));
		
		//15번문제
		System.out.println("15번문제");
		System.out.print("두자리 정수 입력(10~99):");
		int num15 = sc.nextInt();
		if(num15<10 || num15>99)
			System.err.println("잘못된 입력값입니다.");
		else {
			if(num15%11==0)
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		System.out.println("=".repeat(50));
		
		//16번문제
		System.out.println("16번문제");
		System.out.print("달을 입력하세요(1~12):");
		int month = sc.nextInt();
		//if문
		if(3<=month && month<=5)
			System.out.println("봄");
		else if(6<=month && month<=8)
			System.out.println("여름");
		else if(9<=month && month<=11)
			System.out.println("가을");
		else if(1<=month && month<=12)
			System.out.println("겨울");
		else
			System.err.println("잘못입력하셨습니다.");
		//switch문
		switch(month) {
		case 3,4,5 -> System.out.println("봄");
		case 6,7,8 -> System.out.println("여름");
		case 9,10,11 -> System.out.println("가을");
		case 12,1,2 -> System.out.println("겨울");
		default -> System.err.println("잘못입력하셨습니다.");
		}
		
		System.out.println("=".repeat(50));
		
		//17번문제
		System.out.println("17번문제");
		sum=0;
		int i=1;
		while(i<100) {
			if(i%3 != 0) {
				i++;
				continue;
			}
			else sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("=".repeat(50));
		
		//18번문제
		System.out.println("18번문제");
		sum=0;
		i=1;
		while(true) {
			if(i>50)break;
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("=".repeat(50));
		
		
		
	}

}
