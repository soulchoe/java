package com.repeat.controller;
import java.util.Scanner;
import java.util.Random;
public class RepeatController {
	public void basicRepeat() {
		//기본 for문 이용하기
		//특정코드를 원하는 만큼 반복 실행하게 하는 명령어
		//for(초기식;조건식;증감식){반복할 코드}
		//초기식: 변수선언, 반복한 횟수에 대해 저장하는 공간
		//조건식: 반복을 더 실행할지 여부를 결정하는 조건(true면 실행, false면 중단)
		//증감식: 초기식에 선언한 변수의 값을 수정하는 연산->조건식의 결과가 변경
		//안녕하세요를 10번 출력
		for(int i=1;i<=100;i++) {
			System.out.println("안녕하세요");
		}
		for (int i=1;i<=10;i++) {
			System.out.println(i+" ");
		}
		
		//for문 중괄호 내부에는 변수선언, 연산자, 조건문 전부 사용 가능
		//단, 내부에서 선언된 것들은 내부에서만 사용가능
		//다섯번 실행하는 for문 만들기
		for(int i=1;i<=5;i++) {
			int temp=10+i;
			if(temp%2==0) {
			System.out.println(temp);
			}
		}
		
		//1부터 100까지의 수를 출력
		//1부터 100까지 수 중 짝수만 출력하기
		
		for(int i=1; i<=100; i++) {
			System.out.print(" "+i);
		}
		System.out.println("");
		for(int i=1;i<=100; i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}
		System.out.println("");
		for(int i=2;i<=100;i+=2) {
			System.out.print(" "+i);
		}
		System.out.println("");
		//100부터 1까지 출력
		for(int i=100;i>0;i--) {
			System.out.print(" "+i);//A
		}
		int count=100;
		for(int i=1; i<=100; i++) {
			System.out.println(count--);//B:A와 B는 같은 결과
		}
		
		//친구 다섯명의 이름을 입력받고 출력하기
		Scanner sc=new Scanner(System.in);
//		String friend=" ";
//		for(int i=1; i<=5; i++) {
//			System.out.print("친구의 이름:");
//			friend+=sc.nextLine()+" ";
//		}
//		System.out.print(friend);

	
		//숫자 네개 입력받아 총합 구하는 기능 구현하기
//		int total=0;
//		for(int i=1;i<=4;i++) {
//			System.out.println("숫자 입력: ");
//			total+=sc.nextInt();
//		}
//		System.out.println(total);//누적해야 할 값이 있다면 반복문 밖에 선언
		//반복해서 초기화 할 값이 있을때만 반복문 안에 선언
		
		
		//for문은 초기식, 조건식, 증감식을 반드시 써야할까?
		//ㄴㄴ 생략가능
//		count=0;
//		for(;count<10;count++) {
//			System.out.println(count);
//		}//초기식 생략: 외부의 변수를 사용하는 경우
//		for(;;count++) {
//			System.out.println(count);
//		}//조건식 생략: 무한루프 생성의 의도
//		String msg=" ";
//		for(;!msg.equals("exit");){
//			System.out.println("메세지 입력: ");
//			msg=sc.next();
//			System.out.println(msg);
//		}//증감식 생략: 특정 조건에서만 루프가 멈추도록
		
		
		//사용자에게 메세지를 입력받고 출력하는 기능
		//사용자가 "끝"이라는 메세지를 입력할 때까지 입력을 받고
		//입력받은 내용 모두 출력하기 단, 끝이라는 메세지는 포함 안함
		
		String totalMsg=" ";
		//sc.nextLine();
		String m=" ";
		for(;!m.equals("끝");) {
			System.out.print("메세지를 입력하세요: ");
			m=sc.nextLine();
			if(!m.equals("끝")) {
				totalMsg+=m;
			}
		};
		System.out.print(totalMsg);
		
	}
		
		//for문 응용해보기
		public void forApplication() {
			//1부터 사용자가 입력한 수까지 출력하기
			//입력값:4->1 2 3 4->for(int i=1;i<=4;i++)
			//입력값:10->1 2 3 4 5 6 7 8 9 10->for(int i=1;i<=10;i++)
			//입력값:4->1 2 3 ->for(int i=1;i<=3;i++)
			
			Scanner sc=new Scanner(System.in);
			System.out.println("입력: ");
			int su=sc.nextInt();
			for(int i=1;i<=su;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}//forApplication ends
		
		//사원정보를 입력받는 기능을 구현하자
		//세명의 사원정보를 입력받고 출력을 구현하는 기능
		//입력정보: 이름, 나이, 성별, 급여, 보너스(소숫점)
		//입력한 정보는 한번에 출력
		//public void empInputData();
		//버전업 입력전에 입력할 사원수를 입력받고 그 수만큼 입력후 출력하기
	
		public void empInputData() {
			Scanner sc=new Scanner(System.in);
			String empInfo="";
			for(int i=0;i<3;i++) {
				System.out.println("==사원 정보 등록==");
				System.out.print("이름: ");
				if(i!=0) {sc.nextLine();}//if없이 nextDouble 뒤에 들어가도 됨
				String name=sc.nextLine();
				System.out.print("나이: ");
				int age=sc.nextInt();
				System.out.print("성별(남/여): ");
				char gender=sc.next().charAt(0);
				System.out.print("급여: ");
				int wage=sc.nextInt();
				System.out.print("보너스(소숫점): ");
				double bonus=sc.nextDouble();
				empInfo+=name+" "+age+" "+gender+" "+wage+" "+bonus+"\n";
			}
			System.out.println("==입력한 사원 정보==");
			System.out.println(empInfo);
		}//empInputData ends
		public void empInputDataVari() {
			Scanner sc=new Scanner(System.in);
			String empInfo="";
			System.out.println("정보를 입력할 사원 수: ");
			int emp=sc.nextInt();
			for(int i=0;i<emp;i++) {
				System.out.println("==="+(i+1)+"번 사원 정보를 입력하세요===");
				System.out.print("이름: ");
				sc.nextLine();//int emp에서 엔터 들어왔으므로 처음부터 비워줘야함
				String name=sc.nextLine();
				System.out.print("나이: ");
				int age=sc.nextInt();
				System.out.print("성별(남/여): ");
				char gender=sc.next().charAt(0);
				System.out.print("급여: ");
				int wage=sc.nextInt();
				System.out.print("보너스(소숫점): ");
				double bonus=sc.nextDouble();
				empInfo+=name+" "+age+" "+gender+" "+wage+" "+bonus+"\n";
		
			}
			System.out.println("==입력한 사원 정보==");
			System.out.println(empInfo);
			
		}//empInputDataVari ends
		
		
		public void forApplication2() {
			//숫자에 규칙이 있는 경우에 for문의 초기값을 활용할 수 있다.
			String msg="안녕하세요 화요일이에요";
//			System.out.println(msg.charAt(0));
//			System.out.println(msg.charAt(1));
//			System.out.println(msg.charAt(2));
//			System.out.println(msg.charAt(3));
			
			for(int i=0;i<msg.length();i++) {
				System.out.println(msg.charAt(i));
			}
		}//forApplication2() ends
		
		
		//입력받은 문자에 알파벳 대문자가 포함되어있는지 확인하는 기능
		public void checkCap() {
			Scanner sc=new Scanner(System.in);
			System.out.println("메세지를 입력하세요: ");
			String msg=sc.nextLine();
			boolean flag=false;
			for(int i=0;i<msg.length();i++) {
				char ch=msg.charAt(i);
				if(ch>='A'&&ch<='Z') {
					flag=true;
				}//if ends//else로 flag=false까지 넣으면 매 글자마다 대문자 체크,'마지막 글자'에 대한 결과만 나오게됨
			}//for ends
			System.out.println(flag?"메세지에 대문자가 포함되어 있습니다.":"대문자 미포함");
		}//checkCap() ends
		//응용해서 문자 중에 대문자의 갯수, 소문자의 갯수 확인하는 기능
		//문자열, 문자를 입력받아 문자열에 문자가 몇개 포함되어있는지 확인하는 기능
		
		//중첩 반복문
		public void forInfor() {
			//중첩반복문: for문 내부에 for문이 있는 로직
			for (int i=0;i<10;i++) {
				System.out.println(i);
				for(int j=0;j<5;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			//구구단 출력하기
			//2단부터 9단까지 구구단 출력
			for(int i=1;i<10;i++) {
				for(int j=1;j<10;j++) {
					System.out.println(i+"X"+j+"="+(i*j));
				}
				System.out.println();
			}
			
			String test="apple";
			//test변수에 저장된 문자열에 중복값이 있는지 확인하는 로직
			for(int i=0;i<test.length();i++) {
				int count=0;//for문안에 있는 이유:반복때마다 초기화 되어야함
	//			System.out.println(test.charAt(i));
				for(int j=0;j<test.length();j++) {
					if(i!=j&&test.charAt(i)==test.charAt(j)) {
						count++;
					}
	//				System.out.print(test.charAt(j));
				}
				System.out.println(test.charAt(i)+"는 "+count+"개 중복");
			}
		}//forInfor() ends
		
		//별찍기
		//****
		//****
		//****
		//****
		public void starMark() {
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					System.out.print("*");
				}//innerfor ends
				System.out.println();
			}//outterfor ends
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}//innerfor ends
				System.out.println();
			}//outterfor ends
		}//starMark() ends
		
		public void whileTest() {
			//while활용하기
			//반복문을 구현하는 방법 중 하나
			//while(조건문){반복싱행 코드}
			//특정조건에서 반복문을 실행할 때 많이 사용
			//의도적인 무한루프 생성 및 목적
			
			
			//1~10까지 출력하기
			for(int i=1;i<=10;i++) {System.out.println(i);}//원하는 횟수만큼 반복시
			
			int j=1;
			while(j<10) {//해당 조건아래 반복할때
				System.out.println(j);
				j++;
			}
			
			//사용자가 끝이라고 할때까지 입력받는 기능
			Scanner sc = new Scanner(System.in);
			String m=" ";
			String total=" ";
			for(;m.equals("끝");) {}
			while(!m.equals("끝")) {
				System.out.print("메세지 입력: ");
				m=sc.nextLine();
				if(!m.equals("끝")) total+=m;
			}
			System.out.println(total);
			
			//메뉴 기능을 구현할 때
			int menu=0;
			while(menu!=9) {
				System.out.println("====BS Lunch====");
				System.out.println("1. 햄버거");
				System.out.println("2. 피자");
				System.out.println("3. 치킨");
				System.out.println("4. 갈비탕");
				System.out.println("5. 순대국");
				System.out.println("9. 주문종료");
				System.out.println("입력: ");
				menu=sc.nextInt();
			}//while ends
			
//			while(true) { ->조건문이 참인 동안 무한히 돌아감
//				System.out.println("무한");
//			}
			
		}//whileTest() ends
		
		
		//계속 계산가능한 계산기 프로그램 만들기
		//두개의 정수, 연산자를 입력받아 계산해주는 기능
		//계산이 끝나면 계속하시겠습니까 출력 후
		//Y 선택시 한번 더 실행, N 선택시 프로그램종료 문구 출력후 종료
		public void whileCalculator() {
			Scanner sc = new Scanner(System.in);
			char conti='o';
			do {
//			while(conti=='Y') {
				conti='o';//반복 진행시 필요한 초기화 작업
				System.out.print("첫번째 정수: ");
				int su1=sc.nextInt();
				System.out.print("두번째 정수: ");
				int su2=sc.nextInt();
				System.out.print("연산자 입력(+,-,*,/,%): ");
				char cal=sc.next().charAt(0);
				switch(cal) {
					case '+':System.out.println(su1+su2);break;
					case '-':System.out.println(su1-su2);break;
					case '*':System.out.println(su1*su2);break;
					case '/':System.out.println(su1/su2);break;
					case '%':System.out.println(su1%su2);break;
				}//switch ends
				while(conti!='N'&&conti!='Y') {
					System.out.println("계속 하시겠습니까?(Y/N)");
					conti=sc.next().charAt(0);
					if(conti!='N'&&conti!='Y')System.out.println("잘못된 입력입니다.");
				}
	//			for(;conti!='Y';) {
	//			System.out.println(conti=='N'?"프로그램을 종료합니다.":"잘못된 입력입니다. 계속 하시겠습니까?(Y/N)");
	//			conti=sc.next().charAt(0);
	//			}
			}while(conti=='Y');
//			}//while ends
		
		}//whileCalculator() ends

		
		public void continueBreakTest() {
			//분기문 활용하기
			//continue: 반복문에서 continue만나면 아래코드를 생략하고 증감식
			//break: 반복문에서 break 만나면 끝
			//특정조건에서 반복문의 실행을 통제하기 위해 사용
			Scanner sc=new Scanner(System.in);
			System.out.print("문자 입력: ");
			String msg=sc.nextLine();
			boolean flag=false;
			for(int i=0;i<msg.length();i++) {
				char ch=msg.charAt(i);
				if(ch>='A'&&ch<='Z') {
					flag=true;
					break;//조건을 처음 한번만 만족하고나면 끝(그 뒤의 가능성은 고려하지 않음)
				}//if ends
			}//for ends
			System.out.println(flag?"있다":"없다");
			
			//중첩반복문 이용하기
			for(int i=2;i<10;i++) {
				for(int j=1; j<10;j++) {
					if(i%2==0) break;//짝수가 되면 가장 가까운 반복문 종료->바깥for문으로 돌아감->i++->홀수단만 출력+개행
					System.out.print(i+"X"+j+"="+(i*j));
				}
				System.out.println();
			}
			
			
			//continue
			for(int i=0;i<10;i++) {
				if(i%2==0) continue;//->continue만나면 그 아래 내용 생략
				System.out.println(i);
			}
			for(int i=2;i<10;i++) {
				for(int j=1;j<10;j++) {
					if(i%2==0) continue;//위의 break문과의 차이: 컨티뉴는 9번 전부 실행(다만 아래 내용 무시)
					System.out.print(i+"X"+j+"="+(i*j));
				}
			}
			
			
		}//continueBreakTest() ends
		
		//자바에서 랜덤값 출력하기
		//숫자로 출력->임의의 실수(0~1)
		public void randomTest() {
			//임의의 난수 출력하기
			//1.Math.random() 기능이용
			//2.Random 클래스 이용
		//	for(int i=0;i<3;i++) {
		//		System.out.println((int)(Math.random()*10));
		//	}
			//랜덤값을 정수형으로 출력하기
			//Math.random()*10->0~9까지의 랜덤값
			//Math.random()*20->0~19까지의 랜덤값
			//1~10->Math.random()*10+1
			//1~10까지 무작위 수 다섯개 출력
			for (int i=0;i<5;i++) {
				System.out.println((int)(Math.random()*10)+1);
			}
			
			//Random Class
			//java.util.Random
			System.out.println("랜덤 클래스 이용");
			Random r=new Random();
			System.out.println(r.nextInt());//실수 전범위에서 랜덤값 생성
			System.out.println(r.nextInt(10));//0~9 범위
			System.out.println(r.nextInt(20));//0~19 범위
			System.out.println(r.nextInt(20)+1);//1~20 범위
		}
		
		public void rockPaperScissor() {
			Scanner sc = new Scanner(System.in);
			int user=0;
			Random r=new Random();
			int com=0;
			char play=' ';
			do {
				System.out.println("=====가위바위보 게임=====");
				System.out.println("당신의 선택은?");
				System.out.println("1. 가위");
				System.out.println("2. 바위");
				System.out.println("3. 보");
				user=sc.nextInt();
				com=r.nextInt(3)+1;//1,2,3 중에서 랜덤
				while(user!=com) {
					if((com==1&&user==2)||(com==2&&user==3)||(com==3&&user==1)) {
						System.out.println("사용자가 이겼습니다");
					}else {
						System.out.println("컴퓨터가 이겼습니다");
					}
		//			sc.nextLine();
		//			System.out.print("다시 플레이 하시겠습니까?(Y/N):");
		//			play=sc.nextLine().charAt(0);
				}
				sc.nextLine();
				System.out.print("다시 플레이 하시겠습니까?(Y/N):");
				play=sc.nextLine().charAt(0);
	
				System.out.println("비겼습니다");
				
				}while (play!='N');
			
			System.out.println("프로그램을 종료합니다");
		}//rockPaperScissor() 종료
		
	
	

}//RepeatController.class ends	
		



