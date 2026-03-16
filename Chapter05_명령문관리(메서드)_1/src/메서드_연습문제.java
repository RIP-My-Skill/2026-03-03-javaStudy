import java.util.Arrays;
import java.util.Scanner;
public class 메서드_연습문제 {

	//1-1번
	static boolean check(String id) {
	}
	//1-2번
	static String[] search(int address) {
		
	}
	//1-3번
	static void gugudan() {
		
	}
	
	//2-1번
	static void print() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
	
	//2-2번
	static int sum() {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		return sum;
	}
	
	//2-3번
	static int sum1(int n) {
		
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	//2-4번
	static double divide(int a,int b) {
		int div = 0;
		if(b==0) {
			System.err.println("0으로 나눌 수 없습니다.");
		}
		else {
			div = a/b;
		}
		return div;
	}
	
	//2-5번
	static char change(char c) {
//		for(int i=0;i<a.length();i++) {
//			char c = a.charAt(i);
//			if(c>='A' && c<='Z') {
//				c=(char)(c+32);
//			}
//			else {
//				c=(char)(c-32);
//			}
//		}
//		return a;
		if(c>='A' && c<='Z') {
			return Character.toLowerCase(c);
		}
		else {
			return Character.toUpperCase(c);
		}
	}
	
	//2-6번
	//그림을 거꾸로 출력하는 프로그램 : 코딩 테스트
	/*
	 * 		FileInputStream fis=
	 * 			new FileInputStream("파일의 경로명")
	 * 		byte[] buffer = new byte[4096];
	 * 
	 * 		for(int i=buffer.length-1;i>=0;i--){
	 * 			System.out.println(buffer[i]
	 * 		}
	 * 
	 */
	
	static void reverse(String a) {
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	//3-1번
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		return sc.nextInt();
	}
	
	//3-2번
	static int[] binary(int num) {
		int[] binary = new int[16];
		int index = 15;
		while(true) {
			binary[index] = num%2;
			num/=2;
			if(num==0)
				break;
			index--;
		}
		return binary;
	}
	
	//3-3번
	static void printBinary() {
		int num = input();
		int[] binary = binary(num);
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}
	
	
	//4-1번
	static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for(int i=0;i<array.length;i++) {
			System.out.print("정수 입력:");
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	//4-2번
	static int[] sort(int[] arr,String type) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				boolean b=false;
				if(type.equals("ASC"))
				{
					b=arr[i]>arr[j];
				}
				else
				{
					b=arr[i]<arr[j];
				}
				if(b)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//4-3번
	static void printArray() {
		int[] arr = inputArray();
		System.out.println("정렬전:");
		System.out.println(Arrays.toString(arr));
		arr = sort(arr,"ASC");
		System.out.println("오름차순 정렬:");
		System.out.println(Arrays.toString(arr));
		arr = sort(arr,"DESC");
		System.out.println("내림차순 정렬:");
		System.out.println(Arrays.toString(arr));
	}
	
	//5-1번
	static int inputYear() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해주세요:");
		int year = sc.nextInt();
		return year;
	}
	
	//5-2번
	static boolean leapYear(int year) {
		boolean isLeapYear = true;
		if((year%4==0 && year%100!=0) || (year%400==0)) {
		}
		else {
			isLeapYear=false;
		}
		return isLeapYear;
	}
	
	//5-3번
	static void printLeapYear() {
		int year = inputYear();
		boolean isLeapYear = leapYear(year);
		if(isLeapYear) {
			System.out.println(year+"년도는 윤년입니다.");
		}
		else {
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = change('A');
		System.out.println(a);
		printBinary();
		System.out.println();
		printArray();
		printLeapYear();
	}

}
