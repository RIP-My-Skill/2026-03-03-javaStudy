package com.sist.files;
/*
 *    toAbsolutePath() => 절대경로명으로 변경
 *    getFileName() => 파일이름만 추출
 *    getParent() => 경로명만 추출
 *    getRoot() => 루트디렉토리
 *    
 *    // 파일 복사
 *       = 파일 없을 시 자동생성
 *       = 기존 파일이 있는경우 덮어쓰기
 *       = File(절대경로) / Files(절대경로/상대경로)
 */
import java.nio.file.*;
import java.util.*;
public class Files_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹 => 업로드, 다운로드
		/*
		 *    라이브러리
		 *    1. 기능
		 *    2. 메서드명
		 *    3. 매개변수
		 *    4. 리턴형
		 *    ------------- 이해<암기 => 표준화
		 *                            -----
		 *                            SQL/Linux
		 */
		try {
			Path file=Paths.get("C:\\javaDev\\고객.txt");
			System.out.println(file.toAbsolutePath());
			System.out.println(file.getFileName());
			System.out.println(file.getParent());
			System.out.println(file.getRoot());
			long size=Files.size(file);
			System.out.println((size/1024)+"kb");
			Path dir=Paths.get("C:\\javaDev");
			Files.list(dir).forEach(p->System.out.println(p.getFileName()));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
