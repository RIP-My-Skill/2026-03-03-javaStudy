package com.sist.music;

import lombok.Getter;
import lombok.Setter;

// 데이터를 모아서 관리 => 데이터형클래스 => 캡슐화
// MusicVO / MusicDTO / MusicEntity
// => 데이터 보호 / 한번에 모아서 전송 => 윈도우 / 브라우저
@Getter@Setter
public class Music {
	private int mno;
	private String title;
	private String artist;
	private String album;
	private String state;
	private int idcrement;
	//private String poster;
}