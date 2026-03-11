import java.io.*;
public class 제어문_반복문_while {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		File file = new File("c:\\javaDev\\movie.txt");
//		FileReader fr = new FileReader(file);
//		//String movie="";
//		StringBuffer db = new StringBuffer();
//		int i=0;
//		while((i=fr.read())!=-1) {
//			movie+=(char)i;
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString()); 
		
		System.out.println("====== for문 ======");
		for(char c='A';c<='Z';c++) {
			System.out.print(c+" ");
		}
		
		System.out.println("\n====== while문 ======");
		char c='A';
		while(c<='Z') {
			System.out.print(c+" ");
			c++;
		}
		
		System.out.println("\n====== do~while ======");
		c='A';
		do {
			System.out.print(c+" ");
			c++;
		} while(c<='Z');
		
	}

}
