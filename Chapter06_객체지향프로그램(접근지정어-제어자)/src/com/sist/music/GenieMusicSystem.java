package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 * 		자바 코딩
 * 			package
 * 			import
 * 			public class (ClassName) {
 * 				-------------------
 * 				변수 설정
 * 				  => 공통변수 ==> static
 * 				  => 따로 사용하는 변수 ==> instance
 * 				-------------------
 * 				생성자 / 초기화 블록
 * 				변수 = 초기화 = 프로그램의 처음 대입되는 값
 * 				= 기본값 => 자동
 * 				= 명시적 초기화 : int page=1;
 * 				-------------------------
 * 				클래스 => 선언만 가능, 파일읽기 / 크롤링
 * 								  -----------
 * 								  초기화블록
 * 								  -인스턴스 초기화	
 * 								  {}
 * 								  -static 초기화
 * 								  static{}
 * 				=> 생성자
 * 				** 초기화 : static => static블록
 * 						  => MyBatis
 * 						  인스턴스 => 생성자
 * 				** 변수에 대한 초기화는 많이 없음
 * 				   ---------------------
 * 				   | 생성자: 화면UI / 쿠키 설정
 * 						  환경설정 => 오라클 드라이버 설정
 * 				-------------------
 * 				메서드
 * 				  사용자가 데이터를 사용할 수 있게 기능 부여
 *                => 모든 메서드는 public
 *                   => 다른 클래스와 연결
 *                      --------
 *                      요청 => 결과값
 *                             -- 리턴값
 *                      --- 매개변수
 *                   => 웹, 윈도우
 *                        요청값
 *                    자바 ===== 브라우저
 *                    	  결과값
 *                    C/S
 * 				-------------------
 * 			}
 * 		1. 패키지 생성
 *         => 관련된 클래스 모음
 *         => 패키지 => 폴더
 *         => com(org).업체명.요약
 *                          ---- 한글(X)
 *                          ---- 키워드(X)
 *         => 라이브러리
 *            java.util => 사용이 많은 클래스 모음
 *            java.io => 입출력 관련 클래스 모음
 *            java.net => 네트워크 관련 클래스 모음
 *            java.awt => 윈도우 관련
 *            ---- jdk1.0
 *            javax.swing
 *            javax.xml ...
 *            -----jdk1.2
 *            jakarta. ==> apache (오픈 소스 그룹)
 *            -------jdk17
 *            ==> 찾기(유지보수)
 * 		2. 패키지 내부 클래스 가지고 오기
 *         => 다른 패키지에 있는 클래스는 인식 못함
 *         => import 패키지.*
 *              => 패키지에 있는 클래스 여러개 사용할시
 *            import 패키지.클래스명
 *            ----------------- 권장
 * 		3. 접근지정어
 *         --------------------------------------
 *         private : 데이터 은닉
 *                   => 변수 (노출 안되는 데이터)
 *                   => 자신의 클래스에서만 사용 가능
 *                   => 제한적 허용(Getter/Setter)
 *         --------------------------------------
 *         default : 같은 패키지까지 접근
 *               windows : button,TextFilled...
 *         --------------------------------------
 *         protected : 같은 패키지까지 접근, 상속받는경우
 *         								다른 패키지에 접근 가능
 *         				사용빈도 거의 없으
 *         --------------------------------------
 *         public : 모든 클래스 접근 가능 => 공개
 *         --------------------------------------
 * 		4. 제어어
 * 		
 */
// 사용자 요청 => 기능 => 메서드
public class GenieMusicSystem {
	
	public static Music[] music = new Music[50];
	//초기화 => 객체생성 없이 초기화
	static {
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			Elements artist=doc.select("table.list-wrap a.artist");
			Elements album=doc.select("table.list-wrap a.albumtitle");
			Elements etc=doc.select("table.list-wrap span.rank");
			
			for(int i=0;i<title.size();i++) {
				Music m = new Music();
				m.setMno(i+1);
				m.setTitle(title.get(i).text());
				m.setArtist(artist.get(i).text());
				m.setAlbum(album.get(i).text());
//				System.out.println("순위:"+(i+1));
//				System.out.println("제목:"+title.get(i).text());
//				System.out.println("아티스트:"+artist.get(i).text());
//				System.out.println("앨범:"+album.get(i).text());
				//System.out.println(etc.get(i).text());
				String temp=etc.get(i).text();
				String state="";
				String id="";
				if(temp.equals("유지")) {
					state="유지";
					id="0";
				}
				else {
					state=temp.replaceAll("[^가-힣]", "");
					id=temp.replaceAll("[^0-9]", "");
				}
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				music[i]=m;
//				System.out.println("상태:"+state);
//				System.out.println("등폭:"+id);
//				System.out.println("==================================");
			}
		}catch(Exception ex) {}
	}
	
	//기능 메서드
	//0. 메뉴
	public int menu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 뮤직 목록");
		System.out.println("2. 상세보기");
		System.out.println("3. 곡명 찾기");
		System.out.println("4. 가수 찾기");
		System.out.println("5. 종료");
		System.out.println("===============");
		Scanner sc=new Scanner(System.in);
		System.out.print("메뉴 선택:");
		int m=sc.nextInt();
		return m;
	}
	//1. 목록 출력
	public void musicList() {
		for(Music m:music) {
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}
	//2. 상세보기
	public void musicDetail(int no) {
		for(Music m:music) {
			if(m.getMno()==no) {
				System.out.println("순위:"+m.getMno());
				System.out.println("곡명:"+m.getTitle());
				System.out.println("아티스트:"+m.getArtist());
				System.out.println("앨범:"+m.getAlbum());
				System.out.println("상태:"+m.getState());
				String s=m.getState();
				if(s.equals("유지")) {
					System.out.println("등폭:-");
				}
				else if(s.equals("상승")){
					System.out.println("등폭:▲"+m.getIdcrement());
				}
				else if(s.equals("하강")){
					System.out.println("등폭:▼"+m.getIdcrement());
				}
				break;
			}
		}
	}
	//3. 검색 => 가수, 곡명
	public void titleFind(String fd) {
		for(Music m:music) {
			if(m.getTitle().contains(fd)) {
				System.out.println(m.getMno()+"."+m.getTitle());
			}
		}
	}
	public void artistFind(String fd) {
		for(Music m:music) {
			if(m.getArtist().contains(fd)) {
				System.out.println(m.getMno()+"."+m.getTitle()+"\n- "+m.getArtist());
			}
		}
	}
	//4. 동영상
}
