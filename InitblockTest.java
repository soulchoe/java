package com.obj.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InitblockTest {
	//초기화 블럭 테스트
	public String test;
	public int testnum;
	
	//초기화 블럭 선언하기
	{
		System.out.println("InitblockTest클래스 생성!");
		test="야구화이팅!";
		testnum=200;
		//이 초기화 블럭 안에서는 조건문 또는 반복문 사용가능
		int count=0;
		for(int i=1;i<=10;i++) {
			count+=i;
		}
		testnum+=count;
		if(test.charAt(0)=='야') {
			test+="이긴다";
		}
		
		testnum+=count;
		Date today=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYYMM");
		test=sdf.format(today)+(int)(Math.random()*10000)+1;
	}
	
}
