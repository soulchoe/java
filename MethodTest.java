package com.obj.basiccontroller;

import com.obj.model.vo.MyPet;

public class MethodTest {
	
	private int count;
	
	public MethodTest() {}
		
	//메소드는 클래스가 제공하는 기능 의미
	//반환은 호출을 받은 곳으로 되돌아가는 것

	//1.반환형이 없고 매개변수도 없는 메소드 선언하기
	//반환형이 없음:void
	//매개변수 없음:()
	//접근제한자(public_ [예약어] 반환형 메소드명([매개변수 선언]){기능구현}
	public void printMsg() {
		System.out.println("printMsg실행함!");
	}
	//2.반환형 있고 매개변수 없는 메소드 구현하기
	//반환형에는 반환할 값의 타입을 선언한다(모든 타입형 가능)
	//특정값을 더하고 결과를 반환하는 기능
	public int plus() {
		int su=100;
		int su2=200;
		//반드시 반환형을 처리하는 예약어 사용->return에 해당 값 또는 변수 작성
		return su+su2;
		
	}
	//3.반환형이 없고 매개변수가 있는 메소드
	//호출하는 곳에서 전달한 문자를 출력해주는 기능
	public void printSentMsg(String msg) {
		System.out.println("전달한 메세지: "+msg);
		
	}
	//4.반환형 있고 매개변수 있는 메소드
	//정수 두개를 전달받아 두 값을 곱한 결과를 반환하는 기능 만들기
	public int complexNumber(int su, int su2) {
//		return su*su2; 아래 두줄과 같은 말
		int result=su*su2;
		return result;
	}
	
	//메소드 구현부(중괄호 내부)
	//변수선언(로컬변수:메소드 끝나면 사라짐), 조건문, 반복문, 필드(멤버변수:힙에 생성, 주소만 있으면 어디서든) 등 모두 사용가능
	
	//1부터 10까지 출력해주는 메소드 만들기
	public void numberTest() {
		this.count++;//heap에서 자동 초기화 됐으므로 이렇게 쓸 수 있음
		int count=0;
		count++;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("필드출력: "+this.count);
		//앞의 값 유지되어 ++ 실행, 힙에 있는 거라서(단, 매new마다 새로 생성!)
		System.out.println("지역변수: "+count);
		//계속 1, 만들었다 사라지기를 반복하니까
	}	
		
		//java의 메소드 반환값은 한개만 가능하다
//		public int testReturn() {
//			return 10,20,30,40;
//		}
		//여러개의 값을 반환하거나 전달(매개변수) 받으려면
		//1.배열(같은 자료형) 2.클래스(서로 다른 자료형)를 선언한다
		public int[] testReturn() {
			return new int[] {10,20,30,40};//아래 두줄과 같은 내용
//			int[] returnValue= {10,20,30,40};
//			return returnValue;
		}
		public MyPet makeAnimal() {
			return new MyPet();
		}
		
		public void paramObj(MyPet animal,String breed) {
			animal.breed=breed;
		}
			
		public int changeInt(int num) {
			//num+=20;
			return num+20;
		}
		public void changeIntArr(int[] intArr) {
			intArr[0]=200;
			//매개변수로 '배열'을 받으면 원본의 내용을 수정할 수 있게됨, 왜? 주소를 받는거니까!
		}
}
