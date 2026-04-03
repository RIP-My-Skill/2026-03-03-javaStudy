package com.sist.collection;
/*
 *             Map
 *              |
 *       ----------------
 *       |              |
 *     HashMap        HashTable
 *      비동기            동기       ==> HashTable의 단점 보완 : HashMap
 *      
 *      List / Set => Collection
 *      
 *      특징
 *        두개를 동시에 저장 (key, value)
 *                       | key를 가지고 value를 얻어옴
 *                       | key: 중복허용(X)
 *                         value: 중복허용
 *                         같은키 => 덮어씀
 *                        => 응용 : Spring / MyBatis / 웹 라이브러리
 *                                          | SQL (id, "SQL문장")
 *                                 | 클래스 찾기 (id, 클래스 주소)
 *                           => Session / Cookie / Request / Response
 *      사용처 : 클래스 관리
 *           => 메모리 할당 후 관리
 *              ------------- 메모리 주소
 *      map.put("a",new A())
 *                  -------- 한번 메모리 할당 (싱글턴)
 */
import java.util.*;
class AA {
	public void disp() {
		System.out.println("AA:disp() Called...");
	}
}
public class Collection_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,AA> map=new HashMap<String,AA>();
		map.put("aa", new AA());
		AA a=map.get("aa");
		AA b=map.get("aa");
		AA c=map.get("aa");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}
