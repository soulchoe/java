package com.control.controller;

import java.util.Scanner;

public class ConditionController {
	public void ifTest() {
		//기본 if문 활용하기
		//if(조건식(true||false)){조건식의 결과가 true일 때 실행할 명령어}
		//if문의 중괄호 안에는 변수 선언, 연산자, 메소드호출, 조건문, 반복문 사용 가능
		if(100>10) {
//		if(100<10) {
			System.out.println("100은 10보다 크다.");
		}
		System.out.println("if 중괄호 밖에 있는 로직은?");
		
		//특정 수를 입력받아 200을 입력하면 200을 입력했군요 출력하기
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num=sc.nextInt();
		if(num==200) {
			System.out.println("200을 입력했군요!");
		}
		
		//입력받은 정수가 100~200 사이이면 정상데이터를 입력했습니다 출력
		if(num>=100&&num<=200) {
			System.out.println("정상데이터를 입력했습니다.");
		}
		
		//if문의 중괄호에서 선언된 변수 활용하기
				//1. if문 외부에 선언된 변수 활용->if문 내부, 외부에서 사용가능
				//2. if문 내부에 선언된 변수 활용->if문 내부에서만 사용가능
		String outterData="if문 외부선언 데이터";
		if(10>0) {
			String innerData="if문 내부선언 데이터";
			System.out.println(outterData);
			System.out.println(innerData);
			outterData+="if에서 추가한 내용";
			//if 내부에 외부에 선언된 변수와 동일한 명칭은 사용할 수 없다
			//단, 다른 if문에 선언된 변수는 사용 가능
			//->다른 if문에서 조건 만족시 사용되고 이후 사라지는 값이기 때문
			int su=100;
		}	
		System.out.println(outterData);
		

		
		
	
	
	}//ifTest 종료			
		//입력받은 값이 5의 배수인지 확인하는 기능
	public void checkNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int su=sc.nextInt();
		if(su%5==0) {
			System.out.println("5의 배수입니다.");
		}
	}//checkNumber 종료
	
	public void ifelseTest() {
		//if~else문 이용하기 ;삼항연산자 처리와 비슷
		//조건에 따라 반드시 한개 로직이 실행되는 구문을 작성할때
		//if절이나 else절에 있는 구문이 반드시 실행
		//특정수를 입력받아 그 수가 양수인지 음수인지 확인해 주는 로직
		Scanner sc=new Scanner(System.in);
		System.out.println("수 입력:");
		int su=sc.nextInt();
		if(su>0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다");
		}
		//else구문은 단독으로 사용 불가
		//if~else문은 하나의 묶음, else앞에는 언제나 if가 있음
		
	}
		//수를 입력받고 짝수인지 홀수인지 확인해주는 기능 만들기
		//public void oddEven();
	public void oddEven() {
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int su1=sc.nextInt();
		if (su1%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");	
		}
		
	}//oddEven 종료
	
	//미성년이면 회원가입 불가능, 성년이면 회원가입 정보 입력받기
	//이름, 나이, 성별, 키 입력받고 출력
	// 미성년이면 회원가입이 불가능 합니다
	//public void enrollMember
	public void enrollMember(){
		Scanner sc=new Scanner(System.in);
		System.out.println("출생년도를 입력하세요: ");//출생년도 혹은 나이 확인
		int year=sc.nextInt();
		if (year<=2003) {
			System.out.println("이름: ");
			String name=sc.next();//nextLine으로 받는다면 앞에서 버퍼 비우는 라인 필요
			System.out.println("나이: ");
			int age=sc.nextInt();
			System.out.println("성별(M/F): ");
			char gender=sc.next().charAt(0);
			System.out.println("키: ");
			double height=sc.nextDouble();
			
			System.out.println("이름: "+name+"\n나이: "+age+"\n성별:"+(gender=='M'?"남":"여")+"\n키: "+height);
		}else {
			System.out.println("회원가입이 불가능 합니다.");
		}
		
		}
			
	
	
		
		//이름을 입력받고 본인 이름과 같으면 코딩 천재 출력
		//public void testName();
	public void testName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name=sc.next();
		if(name.equals("최솔")) {
			System.out.print(" 코딩 천재!");
			}
	}//testName 종료
		
		
		
		
		//아이디와 패스워드 입력받고 아이디가 admin, 패스워드 8888이면 로그인 성공 출력
		//public void loginCheck();
	public void loginCheck() {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id=sc.next();
		System.out.print("패스워드 입력: ");
		String password=sc.next();
		if(id.equals("admin")&&password.equals("8888")) {
			System.out.println("로그인 성공!");
		}
	}//loginCheck 종료
	
	public void ifelseifTest() {
		//if~else if~else if~...~[else]문 활용하기
		//조건이 여러개일 때 사용하는 조건문
		//if문과 한개의 그룹으로 묶임
		//else와 마찬가지로 단독으로 쓸 수 없음
		
		//월을 입력받아 계절을 확인해 주는 구문
		Scanner sc=new Scanner(System.in);
		System.out.println("계절을 확인할 달: ");
		int month=sc.nextInt();
		if(month==1||month==2||month==12) {
			System.out.println("겨울이야~ 겨울잠 자자");
		}else if(month>=3&&month<=5){
			System.out.println("봄이야~ 꽃구경가자");
		}else if(month>=6&&month<=8) {
			System.out.println("여름이야~ 바다가자");
		}else if(month>=9&&month<=11) {
			System.out.println("가을이야~ 단풍놀이 가자");
		}else {
			System.out.println("없는 달을 입력했습니다. 1~12중에서 입력해 주세요.");
		}
	}//ifelseifTest 종료
		
	
	//성적 등급 출력프로그램 만들기
	//점수를 입력받고 그 점수가 
	//90이상이면 a 80이상이면 b 70이상이면 c 60이상이면 d 60미만이면 f 출력
	//등급과 점수 모두 출력: 00점은 0등급입니다.
	public void checkGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score=sc.nextInt();
		char grade=' ';
		if (score>100) {
			grade='x';
		}else if(score>=90) {
			grade= 'A';			//외부에서 선언한 변수는 내부에서 사용 가능
		}else if(80<=score) {	//범위에 90보다 작음을 넣을 필요없음, 조건문은 하나의 그룹이므로
			grade='B';
		}else if(70<=score) {
			grade='C';
		}else if(60<=score) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println(grade!='x'?score+"점은 "+grade+"등급 입니다!":"최고 점수는 100점 입니다");
	}
		
	
	//메뉴선택 기능 구현하기
	//술추천 기능
	//1.맥주->기네스가 맛있어요
	//2.와인->피노누아가 맛있어요
	//3.위스키->발렌타인 21년산 먹고싶어요
	//4.막걸리->장수막걸리가 맛있어요
	
	public void menuRecommendation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("어떤 주종을 추천해드릴까요:\n1.맥주\n2.와인\n3.위스키\n4.막걸리");
		int menu=sc.nextInt();
		if(menu==1) {
			System.out.println("맥주는 기네스!");
		}else if(menu==2) {
			System.out.println("와인은 피노누아!");
		}else if(menu==3) {
			System.out.println("위스키는 발렌타인 21년산!");
		}else if(menu==4) {
			System.out.println("막걸리는 장수막걸리!");
		}else {
			System.out.println("네 개의 보기 중 선택해주세요");
		}
	}//menuRecommendation 종료
	
	public void switchTest() {
		//switch문 활용하기
		//정해진 값에 대해서 분기처리할때 사용하는 조건문
		//정해진 메뉴 기능을 구현할 때 많이 사용
		//switch문의 괄호안에는 변수, 변수의 연산결과를 작성
		//단, int, String, char의 세가지 자료형만 가능
		Scanner sc=new Scanner(System.in);
		System.out.println("====점심메뉴====");
		System.out.println("1. 윤셰프");
		System.out.println("2. 중식당");
		System.out.println("3. 삼계탕");
		System.out.println("4. 육개장");
		System.out.println("선택: ");
		int choice=sc.nextInt();
		switch(choice) { //case 뒤 리터럴과 choice의 값 직접비교
			case 1: System.out.println("구내식당 중 가장 맛있대요");break;//break전까지의 내용 모두 실행함
			case 2: System.out.println("BYC건물 쌍용이 먹을만 해요");break;
			case 3: System.out.println("BYC건물 가산삼계탕");break;
			case 4: System.out.println("본관 앞 이화수육개장");break;
			default:System.out.println("메뉴는 1~4번까지만 있습니다");break;
		}//로직이 길어지면 switch보다 if문 사용
		
		System.out.println("몇 월: ");
		int month=sc.nextInt();
		switch(month) {
		case 1: case 2: case 12: System.out.println("겨울!");break;
		case 3: case 4: case 5: System.out.println("봄!");break;
		case 6: case 7: case 8: System.out.println("여름!");break;
		case 9: case 10: case 11: System.out.println("가을!");break;
		default: System.out.println("일년은 열두달!");
		}
		
		System.out.println("====중식당====");
		System.out.println("가. 짜장");
		System.out.println("나. 짬뽕");
		System.out.println("다. 탕수뮥");
		System.out.println("선택: ");
		int menu=sc.next().charAt(0);
		switch(menu) { //case 뒤 리터럴과 choice의 값 직접비교
			case '가': System.out.println("짜장 선택");break;//break전까지의 내용 모두 실행함
			case '나': System.out.println("짬뽕 선택");break;
			case '다': System.out.println("탕수육 선택");break;
		}
	
	
		System.out.println("====당신의 취미는?====");
		System.out.println("운동/노래/맛집");
		String hobby=sc.next();//char hobby=sc.next().charAt(0)
		switch(hobby) { //case 뒤 리터럴과 choice의 값 직접비교
			case "운동": System.out.println("건강하세요");break;//'운'
			case "노래": System.out.println("랄랄라");break;//'노'
			case "맛집": System.out.println("맛있겠다");break;//'맛'
	
		}
		
		
	}
	//분식집 주문프로그램 만들기
	//떡볶이(3000), 순대(2500), 튀김(3000), 김밥(3500), 라면(3500)
	//선택하면 주문한 메뉴 이름과 금액 출력
	//떡볶이를 고르셨습니다. 결제 금액은 3000원 입니다.
	//없는 메뉴 고르면 잘못 고르셨습니다
	
	public void bunsik() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===메뉴===가격==");
		System.out.println("1. 떡볶이	3000원");
		System.out.println("2. 순 대	2500원");
		System.out.println("3. 튀 김 3000원");
		System.out.println("4. 김 밥	3500원");
		System.out.println("5. 라 면	3500원");
		System.out.print("결정하셨나요?: ");
		int dish=sc.nextInt();
		String food=" ";
		int price=0;
		switch(dish) {
		case 1:food="떡볶이"; price=3000;break;
		case 2:food="순대"; price=2500;break;
		case 3:food="튀김"; price=3000;break;
		case 4:food="김밥"; price=3500;break;
		case 5:food="라면"; price=3500;break;
		default:food="없음";break;
		}
		System.out.println(food.equals("없음")?"선택한 메뉴가 없습니다":
			"당신이 선택한 메뉴는 "+food+", 결제금액은 "+price+" 입니다.");
	}
	
	
	public void innerifTest() {
		//if 내부에 다시 if문을 사용할 수 있다.
		//성인인 사람만 주문을 할 수 있는 기능
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 나이는? ");
		int age=sc.nextInt();
		if(age>19) {
			System.out.println("===메뉴===");
			System.out.println("1. 맥주");
			System.out.println("2. 와인");
			int cho=sc.nextInt();
			if(cho==1) {
				
			}else if(cho==2) {
				
			}
		}else {
			
		}
	}
	
	
	//public void ex_test()
	//성인만 가입할 수 있는 회원가입->미성년 불가능
	//성인이면 내외국인 구분
	//내국인이면 회원가입 바로 이동->이름, 주소 저장 출력
	//외국인이면 외국인등록번호 확인(있, 없)
	//있으면 회원가입 이동->이름, 주소 저장 출력
	//없으면 회원가입 불가능 출력
	//선택을 잘못한 경우 잘못 누르셨습니다 출력후 종료
	
	public void ex_test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("==회원가입 페이지==");
		System.out.print("나이를 입력하세요: ");
		int age=sc.nextInt();
		String error="잘못 입력하셨습니다.";
		String unavail="회원가입이 불가합니다.";
		if(age<20) {
			System.out.println(unavail);
		}else
			System.out.print("내국인인가요?(O/X): ");
		char korean=sc.next().charAt(0);
		if(korean=='O') {
			System.out.print("이름을 입력하세요: ");
			String name=sc.next();
			System.out.print("주소를 입력하세요: ");
			String address=sc.next();
			System.out.printf("이름: %s\n주소: %s",name,address);
		}else if(korean=='X'){
			System.out.print("외국인 등록번호가 있습니까?(Y/N): ");
			char foreign=sc.next().charAt(0);
			switch(foreign) {
			case 'Y':
				System.out.print("외국인 등록번호를 입력하세요(-포함): ");
				String foreignNum=sc.next();
				System.out.println("이름을 입력하세요:");
				String foreignName=sc.next();
				System.out.println("주소를 입력하세요:");
				sc.nextLine();
				String foreignAddress=sc.nextLine();
				System.out.printf("이름: %s\n외국인등록번호: %s\n주소: %s"
						,foreignName, foreignNum, foreignAddress);break;
			case 'N':System.out.println(unavail);break;
//			default:System.out.println(error);break;
			
			}//switch 종료
		}else {
			System.out.println(error);
		}//if문 종료
	}
	
}//ConditionController 종료
		
