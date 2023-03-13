package com.obj.basiccontroller;


//접근제한자가 public으로 선언된 클래스는 같은 프로젝트 내의 모든 패키지에서 이용가능
//이용가능: new연산자로 객체화(생성)해서 사용할 수 있다.
public class BasicTestClass {
	
	{
		//default 접근제한자로 선언된 클래스는 같은 패키지 안에서 사용가능 
		new DefaultTestClass();//같은 패키지 안이라서 사용가능
		
		FieldTestClass ftc=new FieldTestClass();
	
		System.out.println(ftc.name);
		ftc.name="유병승";
		//System.out.println(ftc.gender); 다른 클래스
	}

}
