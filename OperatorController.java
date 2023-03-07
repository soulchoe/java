package com.operator.controller;

import java.util.Scanner;

//기능을 제공하는 클래스
public class OperatorController {

	//1.단항연산자 알아보기
	public void singleOp() {
		//1.부정연산자 : boolean형의 값을 반전시키는 연산자
		//표현 : !변수명 또는 !기능(메소드)호출 또는 !비교연산
		System.out.println("=======부정연산자 활용하기=======");
		boolean flag=true;
		System.out.println("flag : "+flag);
		System.out.println("!flag : "+!flag);
		System.out.println("!!flag : "+!!flag);
		//나이가 19살 이상이 아니지?
		int age=15;
		System.out.println(!(age>19));
		//기능을 호출했을 때 부정하기
		//String의 값을 동등 비교할때는 equals()를 이용해야함.->같니?라는 질문형태
		//이름이 유병승이니?
		String name="유병승";
		System.out.println(name.equals("유병승"));
		//문자열의 같지 않음을 비교할 때 사용->같지 않지?라는 질문형태
		System.out.println(!name.equals("최솔"));
		
		//2.증가, 감소 연산
		//표현 : ++변수, 변수++
		//		--변수, 변수--
		//특정 수를 카운트할 때 사용
		//변수(정수)에 1을 더하고 다시 그 변수에 저장시키는 연산
		//++변수==(변수=변수+1)
		int count=0;
		++count;//count=count+1;
		count=count+1;
		System.out.println(count);
		count++;
		
		count=0;
		--count;
		System.out.println(count);
		--count;
		count--;
		System.out.println(count);
		
		//++, --연산자의 위치에 따라 연산실행순서가 변경됨
		//다른 연산자와 같이 연산을 실행했을 때 순서변동
		//int testNum=++count+10;//-3+1+10 
		//전위연산: 다른연산자와 같이 있을때 증가나 감소연산을 먼저 실행하고 다른 연산을 실행
		int testNum=count+++10;
		//후위연산: 다른연산과 같이 있을 때 다른 연산을 먼저 실행하고 증가, 감소연산을 실행
		System.out.println(testNum);
		System.out.println(count);
		
		testNum=0;
		count=0;
		//testNum=--count; testNum=-1, count=-1
		//testNum=count--; testNum=0, count=-1
		
		//반복문을 사용할 때 많이 사용
		//for(int i=0;1<10;i++);
		//특정 로직의 실행횟수를 확인할 때 많이 사용
		

	}//singleOp() 끝
	
	public void calculatorOp() {
		//산술연산자 활용하기
		//+, -,  *, /, %
		int su=2;
		int su2=10;
		//더하기 빼기
		System.out.println("+연산 : "+(su+su2));
		System.out.println("-연산 : "+(su-su2));
		//곱하기 나누기
		System.out.println("*연산 : "+(su*su2));
		System.out.println("/연산 : "+(su/(double)su2));
		
		//산술연산결과를 계속 사용하려면? 결과를 변수에 저장하고 활용
		int result=su+su2;
		double result2=su/(double)su2;
		
		
		//나머지 연산
		//% 연산: 짝수 홀수 구분, 배수, 약수 등을 구할 수 있는 연산자
		System.out.println(su%2);
		System.out.println(su2%3);
		//입력받은 값이 짝수 또는 홀수인지 확인할 수 있는 기능
		//특정수의 배수가 맞는지 판단하는 기능
	}
	
	
	public void calc() {
			//계산기 만들기
			//사용자에게 두수를 입력받고 입력받은 수의
			//더한결과, 뺀결과, 곱한결과,나눈결과를 출력하는 기능
				
			Scanner sc=new Scanner(System.in);
				
			System.out.println("두 개의 숫자를 입력하세요: ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println("첫번째 숫자: "+num1+", 두번째 숫자: "+num2);
				
			int numPlus=num1+num2;
			int numMinus=num1-num2;
			int numTimes=num1*num2;
			float numDivide=(float)num1/num2;
				
			System.out.println("두 수의 연산결과는 다음과 같습니다:");
			System.out.println("더하기 결과: "+numPlus);
			System.out.println("빼기 결과: "+numMinus);
			System.out.println("곱하기 결과: "+numTimes);
			System.out.println("나누기 결과: "+numDivide);

	}
	
	
	public void compareOp() {
		//비교연산자 활용하기
		//동등비교 표현 : ==, !=
		//대소비교 표현 : >, <, >=, <=
		//비교연산의 결과는 언제나 true/false(boolean)으로 반환됨
		
		//1.동등비교
		//숫자형 동등비교
		int num=13;
		int num2=19;
		int num3=13;
		//일치여부확인
		System.out.println(num==num2);
		System.out.println(num==num3);
		//불일치여부 확인
		//!=연산자 활용
		System.out.println(num!=num2);
		System.out.println(num!=num3);
		
		//실수형 비교하기
		double dnum=180.5;
		double dnum2=190.5;
		double dnum3=180.5;
		System.out.println(dnum==dnum2);
		System.out.println(dnum==dnum3);
		System.out.println(dnum!=dnum2);
		dnum=13;
		System.out.println(dnum==num);//num의 int가 double로 형변환됨
		
		//문자동등비교
		char ch='A';
		char ch1='a';
		char ch2='A';
		System.out.println("A==a: "+(ch==ch1));
		System.out.println("A==A: "+(ch==ch2));
		System.out.println("A!==a: "+(ch!=ch1));
		int chInt=65;
		System.out.println(ch==chInt);//ch(2byte)가 int(4byte)로 형변환
		
		//문자열에 대한 동등비교
		//String(클라스) 동등비교시 ==을 사용할 수 없음!
		//String이 제공하는 equals()기능을 활용하여 동등비교해야 함
		String name="유병승";//->리터럴로 쓴 같은 값은 스트링풀, 같은 주소에 저장됨
		String name2="이다영";//->다른 리터럴은 다른 주소값이 생김
		String name3="유병승";//->name과 같은 
		String name4=new String("이다영");//->클라스인 스트링을 원래 사용해야하는 방식,위의 스트링들과 다른 주소(스트링풀)가 생김
		String name5="유병승";
		System.out.println("name==name2: "+(name==name2));//false
		System.out.println("name==name3: "+(name==name3));//true
		System.out.println("name2==name4: "+(name2==name4));//false
		System.out.println(name==name5);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름: ");
		String inputName=sc.nextLine();
		//System.out.println(inputName=="유병승"); 유병승 쳐도 false나옴 왜?다른 주소값
		System.out.println(inputName.equals("유병승"));
		System.out.println("유병승".equals(inputName));
		//불일치비교
		System.out.println(!"유병승".equals(inputName));
		
		//대소비교하기
		//숫자값만 가능
		//<,>,>=,<=
		num=200;
		num2=300;
		num3=200;
		System.out.println(num<num2);
		System.out.println(num>num3);
		System.out.println(num>=num3);
		
		//문자타입은 대소비교가 가능할까?
		//ㅇㅇ 내부적으로는 숫자가 저장되는 것이기 때문
		char ch4='Z';
		char ch5='E';
		System.out.println("Z>E: "+(ch4>ch5));
		//대문자, 소문자를 확인할 수 있음
		System.out.println("A<Z: "+('A'<'Z'));
		
		//문자열도 대소비교 가능할까? no
		String str="30";
		String str2="40";
		//System.out.println(str<str2)
		
	}
	
	
	
	public void testStr() {
		//public void testStr() 기능구현하기
		//사용자에게 id를 입력받고, 이것이 admin 이면 true출력하기
		//public void check()구현하기
		//나이를 입력받고 성년이면 true 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디를 입력하세요: ");
		String id=sc.next();
		System.out.println("관리자 입니까? "+("admin".equals(id)));//=((id).equals("admin"))

	}
	
	public void check() {
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int userAge=sc.nextInt();
		System.out.println("성인입니까? "+(userAge>=20));
	}
	
	public void logicOp() {
		// 논리연산하기 : 두개 이상의 진위형을 연결할 때 사용
		// && 그리고: 두개의 진위형 모두 true일 때 true 반환
		// || 또는: 두개의 진위형 중 한개가 true일 때 true 반환
		// ex) id가 admin이고 password가 1234이면 true,아니면 false
		String id="admin";
		String password="1231";
		System.out.println(id.equals("admin") && password.equals("1234"));//false
		
		//입력받은 나이가 19세 이상이고, 경기도에 살면 true 출력 아니면 false
		Scanner sc=new Scanner(System.in);
		System.out.println("나이: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("주소(광역시,도): ");
		String address=sc.nextLine();
		System.out.println(age>=19&&address.equals("경기도"));

		//or 연산
		//입력받은 주소가 경기도나 서울일 경우 true를 반환
		System.out.println("수도권 주민인가요?"+(address.equals("경기도")||address.equals("서울")));
		
		//논리연산을 이용해 숫자의 범위를 확인할 수 있음
		System.out.println("10대인가요?"+(age>=10&&age<20));
	
		//입력받은 나이가 20대이면 true 아니면 False
		System.out.println("20대인가요?"+(age>=20&&age<30));
		
		//문자 한개를 입력받고 문자가 대문자이면 참 아니면 거짓
		System.out.println("문자를 입력하세요: ");
		char alpha=sc.next().charAt(0);
		//int chInt=alpha;
		System.out.println("입력한 문자 "+(alpha)+"는 대문자 인가요? "+(alpha>=65&&alpha<=90));
		System.out.println("입력한 문자 "+(alpha)+"는 대문자 인가요? "+(alpha>='A'&&alpha<='Z'));	
		//입력받은 문자가 알파벳이면 참 아니면 거짓
		System.out.println("입력한 문자가 알파벳인가요?"+((alpha>='A'&&alpha<='Z')
				||(alpha>='a'&&alpha<='z')));
				
		
		//입력받은 나이가 20대 이면서 입력받은 성별이 여자인 사람
		System.out.println("성별을 입력하세요(M/F): ");
		char gender=sc.next().charAt(0);
		System.out.println("20대 여성인가요? "+(age>=20&&age<=29&&gender=='F'));
		
		//사는 곳이 서울 또는 인천이면서 30대인사람
		System.out.println((address.equals("서울")||address.equals("인천"))&&(age>=30&&age<40));
		boolean flag=(address.equals("서울")||address.equals("인천"))&&(30<=age&&age<=39);
		System.out.println("결과: "+flag);
		//&&와 ||를 한문장에 사용할 땐 우선순위를 고려해야 함. 
		//앤드가 먼저이므로 괄호를 쓰거나 왼쪽부터 진행될 수 있게 배치
		
	}
	
	
	public void complexOp() {
		//복합대입연산자 : +=, -=, *=, /=
		//연산 후 결과 값을 다시 자기 자신에게 저장
		//a+=10 == a=a+10
		
		//값을 누적시키거나 차감시킬 때 활용
		int total=300000;
		total-=1000;
		System.out.println(total);
		total+=10000;
		System.out.println(total);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("현재 용돈: ");
		total=sc.nextInt();
		System.out.println("변동 금액: ");
		total+=sc.nextInt();
		System.out.println("현재 잔액: "+total);
		System.out.println("변동 금액: ");
		total+=sc.nextInt();
		System.out.println("현재 잔액: "+total);
		System.out.println("변동 금액: ");
		total+=sc.nextInt();
		System.out.println("현재 잔액: "+total);
		System.out.println("변동 금액: ");
		total+=sc.nextInt();
		System.out.println("현재 잔액: "+total);
		
		//문자열에 대한 누적을 할 수 있을까?
		String msg="";//공값을 대입할 때. 지역변수를 선언할 때는 반드시 값을 저장(초기화)해줘야 한다
					//값 지정 없이는 쓰레기 값만 존재, 자바는 쓰레기값 인정하지 않음
		msg+="안녕";
		msg+="하이";
		msg+="왓썹";
		msg+="곰방와";
		System.out.println(msg);
		

	}
	
	
	//수학, 국어, 영어, 코딩 점수를 각각 입력받고
	//합계와 평균을 출력하는 기능 구현하기
	//변수는 한개만 사용할 것
	public void calcGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.print("수학 점수를 입력하세요: ");
		double grade=sc.nextInt();
		System.out.print("국어 점수를 입력하세요: ");
		grade+=sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		grade+=sc.nextInt();
		System.out.print("코딩 점수를 입력하세요: ");
		grade+=sc.nextInt();
		System.out.println("네 과목의 총점은 "+(int)grade+"점, 평균은 "+grade/4+"점 입니다.");
	
		
	}
	
	//사용자에게 메세지를 4개 입력받고 입력받은 메세지를 한번에 출력하는 기능 만들기
	public void inputMsg() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 문장을 입력하세요: ");
		String line=sc.nextLine()+"\n";
		System.out.print("두번째 문장을 입력하세요: ");
		line+=sc.nextLine()+"\n";
		System.out.print("세번째 문장을 입력하세요: ");
		line+=sc.nextLine()+"\n";
		System.out.print("네번째 문장을 입력하세요: ");
		line+=sc.nextLine()+"\n";
		System.out.println(line);
		
		
		//웹페이지를 구성해서 응답할 때 사용가능
		String html="<html>";
		html+="<head>";
		html+="<title>첫번째 페이지</title>";
		html+="</head>";
		html+="<body>";
		html+="<h2>내가 만든 첫 페이지</h2>";
		html+="</html>";
	
	}
	
	public void thirdOp() {
		//삼항연산자에 대해 알아보자
		//(조건식 또는 기능)?(조건식,기능이 참일때 실행할 로직):(조건식,기능이 거짓일 때 실행할 로직)
		
		//값이 180보다 크면 키가 크네요 출력, 아니면 키가 작네요 출력
		double height=175.3;
		String msg=height>=180?"키가 크네요":"키가 작네요";
		System.out.println(msg);
		
		//점수를 입력받아 60점 이상이면 합격 출력, 아니면 불합격 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int result=sc.nextInt();
		String pass=result>=60?"합격입니다!":"불합격입니다.";
		System.out.println(pass);
		
		//아이디와 비번 입력받고, 아이디가 admin 비번이 1234면 로그인 성공 출력, 아니면 실패 출력
		System.out.print("아이디를 입력하세요:" );
		String userId=sc.next();
		System.out.print("비밀번호를 입력하세요: ");
		String password=sc.next();
		String logIn=userId.equals("admin")&&password.equals("1234")?"로그인 성공":"로그인 실패";
		System.out.println(logIn);
		
		
//		String tag="<input type='check box' name='hobby' "
//				+(userId.equals("admin")?"checked":"")+">";
		
		//나이와 성별을 입력받아 
		//나이가 성년이고 남자이면 멋진 남자네요 출력
		//나이가 성년이고 여자이면 멋진 여자네요 출력
		//나이가 미성년이면 공부하세요 출력
		System.out.println("나이: ");
		int age=sc.nextInt();
		System.out.println("성별(M/F): ");
		char gender=sc.next().charAt(0);
		String define=age>19?gender=='M'?"멋진 남자":"멋진 여자":"공부하세요";
		System.out.println("결과: "+define);
		
	}
	
}