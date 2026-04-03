package com.sist.collection;
// 객체단위 저장 => 중복 제거
import java.util.*;
class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// => 변수 초기값 다르게 설정 : 매개변수가 있는 생성자
	// 명시적 초기화, 초기화 블럭 => 모든 객체가 동일한 값
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	// 객체 식별자 => 동일하게 제작
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	@Override
	// equals => 메모리 주소 비교
	// 오버라이딩 => 변수값 비교
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// instanceof 객체비교
		// 매개변수로 들어온 객체가 => Student 객체?
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
	
	
}
public class Collection_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동", 20);
		Student s2=new Student("홍길동", 20);
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		if(s1.equals(s2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("s1="+s1.hashCode());
		System.out.println("s2="+s2.hashCode());
		
		//Set에 저장
		Set<Student> set=new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		// 데이터 무결성 => 이상현상 : 수정, 삭제 => 원하지않은 데이터 문제발생ㄷ
		for(Student ss:set) {
			System.out.println(ss.getName()+" "+ss.getAge());
		}
	}

}
