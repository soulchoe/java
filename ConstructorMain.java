package com.obj.run;

import com.obj.model.vo.Person;
import com.obj.model.vo.MyPet;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스의 생성자 활용하기
		//클래스는 생성해서 이용을 해야한다
		//클래스를 생성할 때 이용하는 것이 생성자다
		//모든 클래스 선언에는 반드시 생성자선언 코드가 있어야한다
		Person p=new Person();//기본생성자를 호출한 구문
		System.out.println(p.name+" "+p.age+" "+p.height+" "+p.gender);
		
		//매개변수 있는 생성자 호출하기
		Person p1=new Person("최주영",26,178.4,'여');
		Person p2=new Person("김중근",28,177.3,'여');
		
		System.out.println(p1.name+p1.age+p1.height+p1.gender);
		System.out.println(p2.name+p2.age+p2.height+p2.gender);
		
		Person p3=new Person("윤지환",'남');
		Person p4=new Person("윤준호",26);
		
		MyPet pet=new MyPet();//디폴트만 실행되고 끝
		MyPet pet1=new MyPet("개","뽀삐",5,50,"우리집");
		MyPet pet2=new MyPet("고양이","엉",5,40,"솔이집");
		MyPet pet3=new MyPet("거북이","꼬북이",1.2,5,"어항속");
		
		System.out.println(pet1.breed+" "+pet1.name+" "
				+(int)pet1.weight+"kg "+pet1.length+"cm "+pet1.habitat);
		System.out.println(pet2.breed+" "+pet2.name+" "
				+(int)pet2.weight+"kg "+pet2.length+"cm "+pet2.habitat);
		System.out.println(pet3.breed+" "+pet3.name+" "
				+pet3.weight+"kg "+pet3.length+"cm "+pet3.habitat);
		
	}

}
