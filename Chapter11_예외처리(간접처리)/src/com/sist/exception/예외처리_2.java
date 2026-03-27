package com.sist.exception;
// 멀티 catch => 다중 예외처리
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String n1="10";
			String n2="3";
			int[] arr= {
				Integer.parseInt(n1),
				Integer.parseInt(n2)
			};
			int res=arr[0]/arr[2];
			System.out.println(res);
		}catch(NumberFormatException
				|ArrayIndexOutOfBoundsException
				|ArithmeticException e) {
			e.printStackTrace();
		}
//		}catch(NumberFormatException e) {
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}
