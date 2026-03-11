import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 제어문_반복문_while4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("🎶🎶🎶🎶🎶지니뮤직🎶🎶🎶🎶🎶");
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 가요");
			System.out.println("2. 트롯");
			System.out.println("3. OST");
			System.out.println("4. POP");
			System.out.println("5. JAZZ");
			System.out.println("6. CLASSIC");
			System.out.println("7. 종료");
			System.out.println("===============");
			System.out.print("메뉴를 선택해주세요:");
			int input = sc.nextInt();
			switch(input) {
			case 1 -> {System.out.println("=====가요=====");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0100").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++) {
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			case 2 -> {System.out.println("=====트롯=====");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0107").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++) {
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			case 3 -> {System.out.println("=====OST=====");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0300").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++) {
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			case 4 -> {System.out.println("=====POP=====");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0200").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++) {
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			case 5 -> {System.out.println("=====JAZZ=====");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0500").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++) {
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			case 6 -> {System.out.println("=====CLASSIC=====");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0600").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++) {
					String s = title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			case 7 -> {System.out.println("프로그램 종료");
				System.exit(0);
				}
			default -> System.err.println("잘못된 입력입니다.");
			}
			
		}
	}

}
