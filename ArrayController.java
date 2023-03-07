package com.array.controller;

public class ArrayController {
	public void basicArray() {
		//기본배열 활용하기
		//배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용한다
		//배열의 저장구조는 선형구조임
		//저장순서가 있고 저장소를 지칭하는 번호(index)를 가진다
		//배열 선언하기
		int[] intArr;//배열을 저장할 수있는 변수를 선언
		//원하는 크기만큼의 배열을 생성해서 할당해야 함
		//배열생성하기-> new연산자 이용
		//new 자료형[원하는 갯수(길이)]
		intArr=new int[3];//->new는 heap영역에 생성하는 것, jvm에 의해 자동으로 초기화 됨
		//정수형(byte, short, int, long): 0
		//실수형(float, double): 0.0
		//문자열(String): null
		//문자(char): ' '
		//배열생성 후 각 저장공간 활용하려면
		//인덱스 번호로 각 저장공간을 불러올 수 있다.
		//인덱스번호는 선언한 길이-1번까지 있다.(0부터 시작하니까)
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		//초과한 인덱스 번호를 호출하면? 런타임 에러발생!(컴파일 시점 에러 아님:코드상에 에러로 보여지는 것)
		//System.out.println(intArr[3]);  java.lang.ArrayIndexOutOfBoundsException
		
		//배열에 값 저장하기
		intArr[0]=1;
		intArr[1]=200;
		intArr[2]=-5;
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		//친구이름 저장하기
		//친구 3명의 이름을 저장하는 배열을 만들고
		//자신의 스터디원을 저장 후 출력하기
		String[] team;
		team=new String[3];
		team[0]="최솔";
		team[1]="강민기";
		team[2]="윤지환";
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
		team[0].length();
		team[0].charAt(0);
		
		//for문과 같이 배열이용하기
		for(int i=0;i<3;i++) {
			System.out.println(intArr[i]);
		}
		//for문 이용해 이름출력하기
		for(int i=0;i<3;i++) {
			System.out.println(team[i]);
		}
		//배열에서 저장소의 길이를 제공하는 변수가 있음
		//배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(team.length);
	}//basicArray() ends
}//ArrayController class ends
