package com.sist.lang;
// GC
// => 멀티미디어 (스트리밍 서버) => 화상채팅
// 네트워크: 자바(속도가 늦음) => 인트라넷 (사내메신저)
// 흐름 (Client / Server)
// => 웹 (서버 / 클라이언트) => 톰캣, 레진 ... 브라우저
// 객체 메모리 해제
// 클래스 --- 객체생성 --- 객체활용 --- 객체=null --- GC호출
class Sawon {
	public Sawon() {
		System.out.println("객체 생성");
	}
	public void print() {
		System.out.println("사원 정보 출력 (객체 활용)");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	
}
public class System_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		sa.print();
		sa=null;
		System.gc();
	}

}
