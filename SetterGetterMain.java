package com.obj.run;

import com.obj.model.vo.Employee;

public class SetterGetterMain {

	public static void main(String[] args) {
		Employee e=new Employee(0,"유병승","강사부",500,0.5);
		System.out.println(e.infoEmp());
//		e.name="최주영"; 불가능->프라이빗 변수이므로
//		System.out.println(e.name);
		//private 필드를 수정 출력하기 위한 메소드를 선언한다
		//수정: setter()
		//출력: getter()
		//setter/getter메소드는 퍼블릭으로, 각 필드당 한개씩 선언한다
		//명명 규칙:
		//set필드명 / get필드명->camelcase 유지
		//ex) setName/getName
		//setter메소드는 대입할 데이터가 필요하기 때문에 매개변수로 필드에 대입할 값을 받는다.
		//getter메소드는 데이터를 출력하는 것으로 반환형이 있다(리턴);
		System.out.println(e.getName());
		e.setName("최주영");
		System.out.println(e.infoEmp());
		System.out.println(e.getName());
		
		//Employee클래스에 사번을 제외한 모든필드에 세터,게터 메소드 추가하고
		//기본생성자로 사원 5명 생성하고 셋터로 대입, 겟터로 출력
		//유병승 강사부 500 0.5
		//홍길동 강사부 200 0.2
		//이순신 인사부 300 0.3
		//최주영 인턴	10 0
		//김중근 인턴 10 0.2
	}
}
