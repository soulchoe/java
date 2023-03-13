package com.obj.run;

import java.util.Arrays;

import com.obj.basiccontroller.MethodTest;
import com.obj.basiccontroller.MyMethod;
import com.obj.model.vo.MyPet;

public class MethodMain {

	public static void main(String[] args) {
		//클래스에 선언된 메소드 호출하기
		//클래스의 멤버메소드를 호출하려면 클래스를 객체로 생성해야한다
		MethodTest mt=new MethodTest();
		mt.printMsg();
		//반환형이 있는 메소드 호출하기;
		int result=mt.plus();
		System.out.println(result);
		mt.printSentMsg("중근씨 힘내요");
		mt.printSentMsg("월요병 안돼요");
		String data="안녕";
		mt.printSentMsg(data);
		result=mt.complexNumber(20,30);
		System.out.println(result);
		mt.numberTest();
		mt.numberTest();
		mt.numberTest();
		
		new MethodTest().numberTest();
		new MethodTest().numberTest();
		new MethodTest().numberTest();
		
		MyMethod mm=new MyMethod();
		mm.monLunch();
		
		int sum=mm.addFive();
		System.out.println(sum);
		
		String lines=mm.returnMsg();
		System.out.println(lines);
		System.out.println(mm.returnMsg());//위 두줄의 내용과 같은 말

		
		new MyMethod().printCal(5,8,'*');
		new MyMethod().printCal(9,6,'%');
		new MyMethod().printCal(17,6,'+');
		new MyMethod().printCal(9,6,'/');
		
		double returnResult=mm.returnCal(3,9,'*');
		System.out.println(returnResult);
		returnResult=mm.returnCal(12,9,'%');
		System.out.println(returnResult);
		returnResult=mm.returnCal(3,9,'-');
		System.out.println(returnResult);
//		if(mm.returnCal(10, 20, '*')<100)//mm.returnCal(10, 20, '*')은 더블타입의 숫자로 반환되기때문에 이처럼 조건문만들수 있음
		
		
		boolean flag=mm.returnDup("바나나 맛나");
		System.out.println(flag);
		if(mm.returnDup("아기다람쥐")) {
			System.out.println("중복값이 있습니다.");
		}else {
			System.out.println("중복값이 없습니다.");
		}

		flag=mm.returnDup("apple flavored pineapple");
		
		int[] intArr=mt.testReturn();
		System.out.println(Arrays.toString(intArr));
		MyPet a=mt.makeAnimal();
		System.out.println(a);
//		mt.paramArr(intArr);
		mt.paramObj(a,"강아지");
		
		//매개변수, 반환형으로 배열이나 객체를 선언했을때는 힙영역의 주소를 공유하게 됨.
		//원본값을 수정할 수 있게 된다는 것(배열의 얕은 복사와 같은 원리)
		
		int su=10;
		su=mt.changeInt(su);
		int[] numbers= {1,2,3,4};//힙영역이므로 new생성자 이용한것과 같은 원리
		mt.changeIntArr(numbers);
		System.out.println(su);
		System.out.println(numbers[0]);
		//main메소드 매개변수 넣기
		System.out.println(args);
		System.out.println(args[0]);
	}

}
