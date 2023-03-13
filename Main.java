package com.obj.run;
import com.obj.basiccontroller.BaseBallPlayer;
import com.obj.basiccontroller.BasicTestClass;
import com.obj.basiccontroller.FieldTestClass;
import com.obj.model.vo.Student;
//import com.obj.basiccontroller.DefaultTestClass; 
//:not visible에러, 존재하지만 보이지 않음, 접근제한자에 의해 가려졌기 때문
public class Main {//시작시키는 기능을 하는 메소드
	public static void main(String[] args) {
		//프로젝트 내부에 선언된 클래스는 반드시 생성해야지만 이용이 가능
		//클래스를 생성하는 방법: new연산자를 활용
		//new 클래스명()<--기본클래스 생성하는 방법(default 생성)
		
		//클래스 선언부에있는 접근제한자에 따라서 생성해서 이용할 수 있는 범위가 달라짐
		//BasicTestClass생성하기
		new BasicTestClass();
		//DefaultTestClass생성하기
//		new DefaultTestClass();
		
		//프로젝트 내에 선언된 클래스명은 하나의 자료형으로 사용한다.
		//참조형자료형(Reference type)
		//클래스를 저장하는 변수를 만들 수도 있다.
		BasicTestClass btc;//클래스로 생성한 객체를 저장하는 변수를 선언
		btc=new BasicTestClass();
		//btc. 으로 사용 가능
		
		//클래스에 선언된 필드(멤버변수) 이용하기
		//클래스에 선언된 필드를 이용하려면 클래스를 객체화(인스턴스화, 생성)해야한다.
		FieldTestClass ftc;
		ftc=new FieldTestClass();
		
		//필드(멤버변수)에 접근하기(직접접근)
		System.out.println(ftc.age);
		//필드에 값 대입하기
		ftc.age=19;
		System.out.println(ftc.age);
		
		//default접근제한자를 사용한 필드접근
		//System.out.println(ftc.name); not visible
		//private접근제한자를 사용한 필드접근
		//System.out.println(ftc.gender);
		
		//final 필드 접근하기
		System.out.println(ftc.HEIGHT);
		//final은 수정이 불가능함
		//ftc.HEIGHT=190.5;
		
		//생성한 BaseBallPlayer 만들기
		//선수 3명
		BaseBallPlayer p1,p2,p3;//아직 생성 안됨
		p1=new BaseBallPlayer();//선수한명 생성
		p1.name="박찬호";
		p1.age=49;
		p1.mainHand="오른손";
		p1.number=61;
		p1.position="P";
		p1.accuracy=70;
		p1.power=100;
		//p1 야구 플레이어->박찬호
		p2=new BaseBallPlayer();//p1,p2,p3는 서로 전혀 상관없음
		p2.name="이승엽";
		p2.age=46;
		p2.mainHand="왼손";
		p2.number=36;
		p2.position="1B";
		p1.accuracy=70;
		p1.power=100;
		
		//박찬호 정보 출력하기
		System.out.print(p1.name+" "+p1.age+" "+p1.mainHand+" "
				+p1.number+" "+p1.position+" "+p1.accuracy+" "+p1.power);
		System.out.print(p2.name+" "+p2.age+" "+p2.power+" "+p2.number
				+" "+p2.mainHand+" "+p2.position+" "+p2.accuracy);
		
		
		//학생정보를 저장하는 클래스를 선언하고
		//->com.obj.model.vo.Student
		//이름, 나이, 학년, 반, 키, 주소 저장
		//모든 필드는 어디서든 접근가능할 수 있개 설정
		//유병승 19 1 3 180.5 경기도 시흥시
		//홍길동 33 2 3 174.2 강원도 산골
		//이순신 54 3 3 167.3 전라남도
		//신사임당 45 2 1 152.3 강원도
		
		Student s1,s2,s3,s4;
		s1=new Student();
		s1.name="유병승";
		s1.age=19;
		s1.grade=1;
		s1.homeRoom=3;
		s1.height=180.5;
		s1.address="경기도 시흥시";
		
		s2=new Student();
		s2.name="홍길동";
		s2.age=33;
		s2.grade=3;
		s2.homeRoom=2;
		s2.height=174.2;
		s2.address="강원도 산골";
		
		s3=new Student();
		s3.name="이순신";
		s3.age=54;
		s3.grade=3;
		s3.homeRoom=3;
		s3.height=167.3;
		s3.address="전라남도";
		
		s4=new Student();
		s4.name="신사임당";
		s4.age=45;
		s4.grade=2;
		s4.homeRoom=1;
		s4.height=152.3;
		s4.address="강원도";
		
		System.out.println(s1.name+" "+s1.age+" "+s1.grade+" "+s1.homeRoom
				+" "+s1.height+" "+s1.address);
		System.out.println(s2.name+" "+s2.age+" "+s2.grade+" "+s2.homeRoom
				+" "+s2.height+" "+s2.address);
		System.out.println(s3.name+" "+s3.age+" "+s3.grade+" "+s3.homeRoom
				+" "+s3.height+" "+s3.address);
		System.out.println(s4.name+" "+s4.age+" "+s4.grade+" "+s4.homeRoom
				+" "+s4.height+" "+s4.address);
		
		//필드로 선언된 변수는 new연산자로 생성을 하면
		//기본값으로 초기화 됨. 초기부터 값을 대입하려면? 필드에 대입연산자를 사용!
		Student s5=new Student();
		System.out.println(s5.name+" "+s5.age+" "+s5.grade+" "+s5.homeRoom
				+" "+s5.height+" "+s5.address);
		
		//2.초기화 블록을 이용해서 필드를 초기화 할 수 있다.
		//인스턴스 초기화 블록->클래스를 생성(객체화)할때마다 실행
		//static 초기화 블록->최초 생성할 때 한번만 실행!
	}
}
