package com.sist.application;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class BoardVO implements Serializable {
	private int no; // 고유번호 => 게시물 구분자 : 중복X
	private String name,subject,content,pwd; // 글쓴이,제목,내용, 삭제수정시 본인확인용 비밀번호
	private Date regdate; // 등록일
	private int hit; // 조회수
}
