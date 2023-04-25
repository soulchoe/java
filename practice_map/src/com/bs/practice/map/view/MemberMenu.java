package com.bs.practice.map.view;

import java.util.Scanner;

import com.bs.practice.map.controller.MemberController;
import com.bs.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc=new Scanner(System.in);
	private MemberController mc=new MemberController();
	
	public void mainMenu() {
		System.out.println("=========== BS 사이트 ==========");
		while(true) {
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택: ");
			switch(sc.nextInt()) {
				case 1:joinMembership();break;
				case 2:logIn();memberMenu();break;//로그인 실행 후 멤버메뉴 실행
				case 3:sameName();
				case 9:System.out.println("프로그램 종료.");return;
				default:System.out.println("잘못 입력하였습니다. 다시 입력해주세요");break;
			}
		}

	}
	public void memberMenu() {
		while(true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택: ");
			switch(sc.nextInt()) {
				case 1:changePassword();break;
				case 2:changeName();break;
				case 3:System.out.println("로그아웃 되었습니다.");return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요");break;
			}
		}
	}
	public void joinMembership() {
		System.out.println("***** 회원가입 *****");
		Member m=new Member();
		System.out.print("아이디 입력: ");
		String id=sc.next();
		System.out.print("비밀번호 입력: ");
		m.setPassword(sc.next());
		System.out.print("이름 입력: ");
		m.setName(sc.next());
		boolean result=mc.joinMembership(id, m);
		System.out.println(result?"성공적으로 회원가입 완료하였습니다.":"중복된 아이디입니다. 다시 입력해주세요.");
		
	}
	public void logIn() {
//		아이디와 비밀번호를 사용자에게 받아 mc의 logIn()메소드로 넘겨 줌
//		반환 값 있으면 “OOO님, 환영합니다!” 출력 후 로그인 된 화면으로(memberMenu()), 
//		없으면 “틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			Member m=new Member();
			System.out.println("***** 로그인 화면 *****");
			System.out.print("아이디: ");
			String id=sc.next();
			System.out.print("비밀번호: ");
			String password=sc.next();
			String result=mc.logIn(id, password);
			if(result==null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");return;
			}
			else {
				System.out.println(result+"님, 환영합니다!");
				//memberMenu();
				//break;
			}
		}
		
	}
	public void changePassword() {
		while(true) {
			System.out.println("***** 비밀번호 변경 *****");
			System.out.print("아이디: ");
			String id=sc.next();
			System.out.print("현재 비밀번호: ");
			String oldPw=sc.next();
			System.out.print("변경할 비밀번호: ");
			String newPw=sc.next();
			boolean result=mc.changePassword(id, oldPw, newPw);
			if(result==true) {
				System.out.println("비밀번호 변경에 성공했습니다.");break;
			}else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");return;
			}
		}
	}
	public void changeName() {
		System.out.println("***** 이름 변경 *****");
		System.out.print("아이디: ");
		String id=sc.next();
		System.out.print("비밀번호: ");
		String password=sc.next();
	}
	public void sameName() {
		System.out.println("***** 같은 이름 회원 찾기 *****");
	}
}
