package com.obj.basiccontroller;

import java.util.Scanner;

public class MyMethod {
	
	public MyMethod() {}
	private int sum=0;
	private String lines="";

	public int countDup=0;
	
	//"월요일 점심 맛있게 먹어요" 출력하는 메소드 작성하기
	public void monLunch() {
		System.out.println("월요일 점심 맛있게 먹어요");
	}
	
	//숫자를 1~5까지 더한 수를 반환하는 메소드 작성하기
	public int addFive() {
		
		for(int i=1;i<=5;i++) {
			this.sum+=i;
		}
		return sum;
	}
	
	//사용자한테 5번 메세지 입력받고 입력받은 메세지를 반환하는 메소드 만들기
	public String returnMsg() {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 메세지: ");
			String line=sc.nextLine();//lines+=sc.nextLine();
			this.lines+=line+" ";
		}
		return lines;
	}
	
	//정수 두개, 연산자 한개를 전달받아 계산결과를 출력하는 메소드
	public void printCal(int su1, int su2, char op) {
		int result=0;
		switch(op) {
			case '+':result=su1+su2;break;
			case '-':result=su1-su2;break;
			case '*':result=su1*su2;break;
			case '/':result=su1/su2;break;
			case '%':result=su1%su2;break;
		}
		System.out.println(""+su1+op+su2+" = "+result);
		
	}
	
	//정수 두개, 연산자 한개를 전달받아 계산결과를 반환하는 메소드
	public double returnCal(int su1, int su2, char op) {
		double returnResult=0;
		switch(op) {
			case '+':returnResult=su1+su2;break;//case'+':return su1+su2; 등으로 쓰고, 디폴트 값설정해줄수도 있음
			case '-':returnResult=su1-su2;break;
			case '*':returnResult=su1*su2;break;
			case '/':returnResult=su1/su2;break;
			case '%':returnResult=su1%(double)su2;break;
		}
		return returnResult;
	
	}
	//리턴 메소드 안에 조건문을 쓸때는 모든경우에 대한 리턴값을 설정해줘야함(if+else/switch+cases+default/...)
	
	//문자열을 전달받아 문자열에 중복값이 있는지 확인해서 결과를 반환해주는 메소드
	public boolean returnDup(String msg) {
		
		for(int i=0;i<msg.length();i++) {
			for(int j=0;j<i;j++) {
				if(msg.charAt(i)==msg.charAt(j)) {
					return true;//리턴을 한번 만족하면 아래는 무시
				}
			}
		}
		return false;
	}
}
