package com.sist.exception;
/*
 *     
 *     1. 예외복구
 *        try
 *          = 정상 실행 가능 코딩
 *          = 에러발생확률이 있는 코딩 (실수, 입력) => 사전에 방지
 *          = 에러가 나면 스킵 => catch이동
 *        catch
 *          1. 에러 확인 가능
 *             printStackTrace / getMessage
 *              |에러위치확인용이      |에러메세지만 전송
 *          2. 에러 복구 가능 => 이동 : goto(사용금지)
 *          
 *        finally
 *          생략 가능
 *          => try/catch 상관없이 무조건 수행
 *          => 서버/오라클/파일 닫기
 *          
 *        ** catch : 에러발생시 처리
 *           => 다중사용 가능
 *           => 통합 : Exception/Throwable
 *        ** 자동 close 호출
 *           try~with~resource
 *           
 *     2. 예외회피 : 에러를 등록해서 컴파일시 통과
 *        throws => 특별한 경우가 아니면 throws 문장은 많이 없다
 *        ------ 한글변환
 *        => 소스가 긴 경우 => try위치 설정이 안되는 경우
 *           ---------- 유지보수
 *        메서드() throws ....
 *        => 라이브러리에 많음
 *     3. catch찾기 => 임의발생 : throw
 *        => 필요시 직접 예외를 만들어서 사용
 *                ------- 호출시 반드시 throw new 클래스()
 *        throws : 예상되는 에러를 선언한다
 *                 => 메서드호출시 예외처리 필수
 *                 => throws / try~catch
 *        throw : 견고한 프로그램 여부 확인
 *     
 */
public class 예외처리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
