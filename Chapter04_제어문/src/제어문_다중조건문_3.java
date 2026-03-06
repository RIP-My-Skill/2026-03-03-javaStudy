public class 제어문_다중조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = (int)(Math.random()*50)+51;
		int eng = (int)(Math.random()*50)+51;
		int math = (int)(Math.random()*50)+51;
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		char score = 'A';
		char op = ' ';
		
//		if(avg >= 97)
//			score = "A+";
//		else if(avg >= 94)
//			score = "A0";
//		else if(avg >= 90)
//			score = "A-";
//		else if(avg >= 87)
//			score = "B+";
//		else if(avg >= 84)
//			score = "B0";
//		else if(avg >= 80)
//			score = "B-";
//		else if(avg >= 77)
//			score = "C+";
//		else if(avg >= 74)
//			score = "C0";
//		else if(avg >= 70)
//			score = "C-";
//		else if(avg >= 67)
//			score = "D+";
//		else if(avg >= 64)
//			score = "D0";
//		else if(avg >= 60)
//			score = "D-";
//		else
//			score = "F";
		if(avg >= 90) {
			score = 'A';
			if(avg>=97)
				op='+';
			else if(avg>94)
				op='0';
			else
				op='-';
		}
		else if(avg >= 80) {
			score = 'B';
			if(avg>=87)
				op='+';
			else if(avg>84)
				op='0';
			else
				op='-';
		}
		else if(avg >= 70) {
			score = 'C';
			if(avg>=77)
				op='+';
			else if(avg>74)
				op='0';
			else
				op='-';
		}
		else if(avg >= 60) {
			score = 'D';
			if(avg>=67)
				op='+';
			else if(avg>64)
				op='0';
			else
				op='-';
		}
		else
			score='F';
		
		System.out.println("=====결과=====");
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score+op);
	}

}
