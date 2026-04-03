package com.sist.collection;
/*
 *   Map
 *    = Iterator : 단방향
 *    = ListIterator : 양방향
 *    -----------------------> for-each문 대신 사용
 */
import java.util.*;
public class Collection_10 {
	/*
	 *    메서드 정리
	 *     1. 데이터 추가 / 수정
	 *        put(k,v) => 같은 키일 경우 수정
	 *     2. 값 읽기
	 *        get(k) => 키에 해당되는 값 읽기
	 *     3. 삭제
	 *        remove(k) => 키에 해당되는 값 삭제
	 *     4. 키 존재 확인
	 *        containsKey(k) => boolean : 주로 if에서 사용
	 *     5. 값 존재 확인
	 *        containsValues(v) => boolean
	 *     6. 전체 삭제
	 *        clear()
	 *     7. 키 전체 가져오기
	 *        keySet() ==> 반복문
	 *     8. 값 전체 가져오기
	 *        values()   
	 *     9. 키+값 가져오기
	 *        entrySet()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<String, Integer>();
		// key: String, value: Integer
		// 1. 값 주입 => put(k,v)
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("포도", 300);
		// 2. 값 읽기 => get(k)
		System.out.println("사과 갯수:"+map.get("사과"));
		System.out.println("바나나 갯수:"+map.get("바나나"));
		System.out.println("포도 갯수:"+map.get("포도"));
		// 3. 전체출력 
		System.out.println("전체 데이터:"+map);
		// 4. 키 존재여부 => containsKey(k) -> 리턴 boolean
		if(map.containsKey("바나나")) {
			System.out.println("바나나가 있음");
		}
		// 5. 값 수정 => 같은키에 다른 값 (덮어쓰기)
		map.put("사과", 1000);
		System.out.println("수정 후 전체 데이터:"+map);
		// Map, Set은 순서가 없음
		// 6. 삭제 => remove(k)
		map.remove("포도");
		System.out.println("삭제 후 전체 데이터:"+map);
		
		// 7. 반복문 사용 => 데이터 출력
		// key 전체읽기 => keySet
		for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		// value 전체읽기 => values
		for(int i:map.values()) {
			System.out.println(i);
		}
		// 전체읽기 => entrySet()
		for(Map.Entry<String,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		/*
		 *    HashMap : 가장 많이 사용
		 *    키 : 중복(X)
		 *    값 : 중복 가능
		 *    순서는 없음
		 */
		
	}

}
