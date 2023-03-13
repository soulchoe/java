package com.obj.model.vo;

public class Person {
	public String name;
	public int age;
	public char gender;
	public double height;
	public String address;
	{
		System.out.println("person 초기화 블럭");
	}
	//생성자는 반드시 필요한 코드로, 선언하지 않으면 jvm이 자동으로 생성해줌
	//생성자는 두 가지로 구분
	//1.기본생성자(디폴트 생성자): 기본값으로 클래스를 생성할 때 이용
	//ㄴ>접근제한자 클래스명(){} 대부분 public으로 이용, 시스템상 막혀있을 수 있음
	public Person() {
		System.out.println("Person기본생성자 실행");
		name="유병승";
		age=19;
		height=180.5;
		gender='남';
	}
	//2.매개변수있는 생성자: 외부에서 생성에 필요한 데이터를 받아서 생성할 때 이용
	public Person(String paramName, int paramAge, 
			double paramHeight, char paramGender) {
		name=paramName;
		age=paramAge;
		height=paramHeight;
		gender=paramGender;//this.가 생략된 상태
	}
	//생성과 동시에 초기화할 값만 선언해도 된다.
	//위아래는 같은 이름, 변수 타입으로 구분 가능=오버로딩
	public Person(String paramName, char paramGender) {
		this.name=paramName;
		this.gender=paramGender;
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		//필드와 매개변수 이름이 같을 땐 반드시 this.사용!
	}
	public Person(char gender, String address) {
		this.address=address;
		this.gender=gender;
		//자료형이 중복되는 매개변수가 있다면 배치를 다르게 해서 구분시켜준다
	}
	
	//this() 생성자를 이용하면 추가로직을 작성하지 않고 활용할 수 있음.
	//생성자 내부에서 다른 생성자를 호출할 때 사용
	//맨 처음 한줄만 사용할 수 있음!
	public Person(String name, int age, char gender, String address) {
		this(name,age);
		this.address=address;
		this.gender=gender;
	}
	
}
