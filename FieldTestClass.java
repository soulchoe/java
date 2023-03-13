package com.obj.basiccontroller;

public class FieldTestClass {
	//클래스에서 필드 (=멤버변수) 선언하기
	//클래스의 기능에 따라 저장할 데이터가 있다면 필드를 선언해서 관리한다.
	//선언하는 방식은 변수선언과 동일하고 선언부 앞에 접근제한자를 사용한다.
	//-접근제한자 종류
	//-public: 모든 패키지에서 직접접근하여 데이터를 저장, 수정할 수 있음
	//-protected: 상속받은 클래스, 또는 같은 패키지에 있는 클래스에서 직접 접근해서
	//데이터를 저장하거나 수정할 수 있음
	//-default(제한자를 생략): 같은 패키지에 있는 클래스에서 직접접근해서 데이터 저장, 수정
	//-private: 클래스 내부에서 직접접근해서 데이터 저장, 수정
	//객체지향의 정보 은닉으로 일반적인 클래스의 필드는 모두 private으로 선언함!!
	
	public int age;
	String name;//default
	private char gender;
	//필드(멤버 변수)선언, new 연산자로 생성(객체화)하기 전까지는 없는 공간
	//heap에 생성되어 자동초기화
	//상수필드는 반드시 선언과 동시에 초기화 해야한다!
	public final double HEIGHT=180.5;
	//그렇지 않으면 자동으로 초기화 되기때문에 상수 선언의 의미 없어짐
	{
		System.out.println(gender);
		this.gender='여';
	}
	
	

}
