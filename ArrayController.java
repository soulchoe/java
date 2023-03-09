package com.array.controller;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayController {
	public void basicArray() {
		//기본배열 활용하기
		//배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용한다
		//배열의 저장구조는 선형구조임
		//저장순서가 있고 저장소를 지칭하는 번호(index)를 가진다
		//배열 선언하기
//		int[] intArr;//배열을 저장할 수있는 변수를 선언
		//원하는 크기만큼의 배열을 생성해서 할당해야 함
		//배열생성하기-> new연산자 이용
		//new 자료형[원하는 갯수(길이)]
//		intArr=new int[3];//->new는 heap영역에 생성하는 것, jvm에 의해 자동으로 초기화 됨
		//정수형(byte, short, int, long): 0
		//실수형(float, double): 0.0
		//문자열(String): null
		//문자(char): ' '
		//배열생성 후 각 저장공간 활용하려면
		//인덱스 번호로 각 저장공간을 불러올 수 있다.
		//인덱스번호는 선언한 길이-1번까지 있다.(0부터 시작하니까)
//		System.out.println(intArr[0]);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
		//초과한 인덱스 번호를 호출하면? 런타임 에러발생!(컴파일 시점 에러 아님:코드상에 에러로 보여지는 것)
		//System.out.println(intArr[3]);  java.lang.ArrayIndexOutOfBoundsException
		
		//배열에 값 저장하기
//		intArr[0]=1;
//		intArr[1]=200;
//		intArr[2]=-5;
//		
//		System.out.println(intArr[0]);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
		
		//친구이름 저장하기
		//친구 3명의 이름을 저장하는 배열을 만들고
		//자신의 스터디원을 저장 후 출력하기
//		String[] team;
//		team=new String[3];
//		team[0]="최솔";
//		team[1]="강민기";
//		team[2]="윤지환";
//		System.out.println(team[0]);
//		System.out.println(team[1]);
//		System.out.println(team[2]);
//		team[0].length();
//		team[0].charAt(0);
		
		//for문과 같이 배열이용하기
//		for(int i=0;i<3;i++) {
//			System.out.println(intArr[i]);
//		}
		//for문 이용해 이름출력하기
//		for(int i=0;i<3;i++) {
//			System.out.println(team[i]);
//		}
		//배열에서 저장소의 길이를 제공하는 변수가 있음
		//배열변수명.length;
//		System.out.println(intArr.length);
//		System.out.println(team.length);
		
		//반복문을 이용해서 배열을 초기화
		//int형 배열 10개를 할당하고 각 저장공간에 1~10의 수를 대입하기
//		int[] tenInt=new int[10];
//		for(int i=0;i<tenInt.length;i++) {
//			tenInt[i]=i+1;
//		}
//		for(int i=0;i<tenInt.length;i++) {
//			System.out.println(tenInt[i]);
//		}
//		
//		//학생5명의 키를 입력받아 저장하는 기능 구현하기
//		//저장 후 출력하기
//		double[] heights=new double[5];
		Scanner sc=new Scanner(System.in);
//		
//		for(int i=0;i<heights.length;i++) {
//			System.out.print("학생 "+(i+1)+"의 키:");
//			heights[i]=sc.nextDouble();
//		}
//		for(int i=0;i<heights.length;i++) {
//			System.out.println("학생"+(i+1)+"의 키: "+heights[i]);
//		}
		
		//배열선언시 대입할 값이 정해져있다면, 
		//선언과 동시에 값을 초기화할 수 있다.
		char[] alpha={'a','b','c','d','e'};
		for(int i=0;i<alpha.length;i++) {
			System.out.print(alpha[i]);
		}
		char[] alpha2=new char[] {'A','B','C','D','E'};
		for(int j=0;j<alpha2.length;j++) {
			System.out.print(alpha2[j]);
		}
		
		//alpha= {'가','나','다','라'}; 선언이후에 같은 내용을 다시 덮어쓸 수 없음
		alpha=new char[] {'가','나','다','라'};
		
		//배열은 한번 선언된 길이는 변경되지 않는다!
		String[] names2=new String[3];
		names2[0]="유병승";
		names2[1]="홍길동";
		names2[2]="피카츄";
		//names2[3]="리자몽";->자동으로 길이가 증가하지 않는다
		names2=new String[4];//이렇게 바꾸면 위의 내용이 삭제됨
		//그래서 배열을 사용할 때는 최대치의 길이로 설정해 둘 것!
		
		//배열은 저장된 데이터를 전체 순회해서 원하는 데이터를 찾을 수 있음
		int[] numbers2= {10,20,30,40,50,60};
		//30이상인 값의 갯수 구하기
		int count=0;
		for(int k=0;k<numbers2.length;k++) {
			System.out.println(numbers2[k]);
			if(numbers2[k]>=30) {
				count++;
			}
		}	
			System.out.println(count);
			
		//저장된 학생이름 중 김씨는 몇명인지 구하는 기능
		//사용자가 요청한 성씨의 학생수를 구하는 기능
		String[] studentName= {"김현영","김찬은","김중근","김재훈","김예린","강민기","윤지환",
				"윤준호","윤나라","나빈","이성진","이동제","조윤진","이다영","정상준","이은지"};
		int kim=0;
		for(int s=0;s<studentName.length;s++) {
			if(studentName[s].charAt(0)=='김') {
				kim++;
			}	
		}
		System.out.println("김씨 학생은 "+kim+"명 입니다.");
		
		int last=0;
		System.out.print("성씨: ");
		char sung=sc.next().charAt(0);
		for(int s=0;s<studentName.length;s++) {
			if(studentName[s].charAt(0)==sung) {
				last++;
			}
		}
		System.out.println(sung+"씨 학생은 "+last+"명 입니다.");
		
		//정수 10개를 랜덤으로 저장하는 기능 만들기
		//정수 1~100
	
		int[] random=new int[10];
		for(int i=0;i<random.length;i++) {
			random[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<random.length;i++) {
			System.out.println(random[i]+" ");
		}
		
		//최댓값, 최솟값 찾기
		int max=random[0];
		int min=random[0];
		for(int i=0;i<random.length;i++) {
			if(random[i]>max) {
				max=random[i];
			}
		}
		System.out.print("최댓값: "+max);
		for(int i=0;i<random.length;i++) {
			if(random[i]<min) {
				min=random[i];
			}
		}
		System.out.println("최솟값: "+min);
		
		//배열은 선형구조로, 순서가 있음
		//순서는 인덱스 번호를 기준으로 순서를 정한다
		//순서에 따라 값을 정렬할 수 있음
		//배열의 저장값위치 변경하기->swap
		//
		int[] testArr= {4,3,6,2,7,5,1};
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		System.out.println();
		int temp=testArr[0];
		testArr[0]=testArr[1];
		testArr[1]=temp;
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		for(int i=0;i<testArr.length;i++) {
			for(int j=0;j<i;j++) {
				if(testArr[i]<testArr[j]) {
					int t=testArr[i];
					testArr[i]=testArr[j];
					testArr[j]=t;
				}
			}
		}
		System.out.println();
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		
		//배열에서 길이를 정하면 고정
		String[] oriName= {"유병승","홍길동","김유신"};
		//oriName
	
	}//basicArray() ends
	
	public void arraysCopyTest() {
		//배열의 복사를 알아보자
		//1. 얕은 복사: 원본값을 공유하는 방식
		//2. 깊은 복사: 별도의 저장공간을 생성해 데이터를 따로 관리하는 방식
		
		int[] num= {1,2,3,4,5};
		//얕은 복사->주소를 복사
		int[] copyNum=num;
		System.out.print("num"+Arrays.toString(num));
		System.out.println("copyNum"+Arrays.toString(copyNum));
		System.out.println("num[0]: "+num[0]);
		System.out.println("copyNum[0]: "+copyNum[0]);
		//주소값을 공유하기 때문에 저장소가 한개! 원본을 수정하면 복사본에서도 수정되어 출력됨
		num[0]=100;
		System.out.println("num[0]: "+num[0]);
		System.out.println("copyNum[0]: "+copyNum[0]);
		//깊은 복사-> 값 자체를 복사해서 새로운 저장소에 저장
		int[] deepcopy=new int[num.length];
		for(int i=0;i<num.length;i++) {
			deepcopy[i]=num[i];
		}
		System.out.print("num"+Arrays.toString(num));
		System.out.println("deepcopy"+Arrays.toString(deepcopy));
		num[1]=200;
		System.out.print("num"+Arrays.toString(num));
		System.out.println("deepcopy"+Arrays.toString(deepcopy));
		
		//자바에서 제공하는 기능을 이용해 깊은 복사 가능
		//Arrays 클래스에서 제공하는 copyOf()기능이용하기
		int[] copy2=Arrays.copyOf(num,num.length);//괄호 안 두번째 숫자에 원하는 갯수만큼 설정가능
		System.out.println("copy2"+Arrays.toString(copy2));
		copy2[3]=-100;
		System.out.println("num"+Arrays.toString(num));
		System.out.println("copy2"+Arrays.toString(copy2));
		
		//배열의 전체를 깊은 복사할 때는 clone()을 이용해도 된다
		copy2=num.clone();
		System.out.println("copy2"+Arrays.toString(copy2));
		
		//System.arraycopy()이용하기
		//첫번째: 원본배열 선언
		//두번째: 원본배열의 복사를 시작할 시작인덱스
		//세번째: 복사될 배열
		//네번째: 복사될 배열의 시작 인덱스
		//다섯번째: 복사할 길이(데이터 수)
		String[] names= {"유병승", "홍길동","김유신"};
		String[] extend=new String[names.length+5];
		System.arraycopy(names, 1, extend, 3, 2);
		for(int i=0;i<extend.length;i++) {
			System.out.print(extend[i]+" ");
		}
		System.out.println();
	}
	public void doubleArray() {
		//2차원 배열
		//배열저장소 두개가 연결되어있는 구조
		//저장소는 바둑판처럼 저장구조르 ㄹ가지고 있음
//		int[][] intArr;
//		intArr=new int[3][3];
//		System.out.println(intArr);
//		System.out.println(intArr[0]);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[0][0]);
//		System.out.println(intArr[1][2]);
//		
//		for(int i=0;i<intArr.length;i++) {
//			for(int j=0;j<intArr.length;j++) {
//				System.out.print(intArr[i][j]);
//			}
//			System.out.println();
//		}

//		for(int i=0;i<intArr.length;i++) {
//			for(int j=0;j<intArr.length;j++) {
//				System.out.print(intArr[i][j]);
//			}
//			System.out.println();
//		}
		//3*3배열을 생성하고 
		//123
		//123
		//123 을 각 인덱스에 저장하고 출력하기
		int[][] intArr2=new int[3][3];
//		intArr2[0][0]=1;
//		intArr2[0][1]=2;
//		intArr2[0][2]=3;
//		intArr2[1][0]=1;
//		intArr2[1][1]=2;
//		intArr2[1][2]=3;
//		intArr2[2][0]=1;
//		intArr2[2][1]=2;
//		intArr2[2][2]=3;
		for(int i=0;i<intArr2.length;i++) {
			for(int j=0;j<intArr2[i].length;j++) {
				intArr2[i][j]=j+1;
			}
		}
		for(int i=0;i<intArr2.length;i++) {
			for(int j=0;j<intArr2.length;j++) {
				System.out.print(intArr2[i][j]);
			}
			System.out.println();
		}
		
		int[][] numbers3=new int[3][4];
		int count=0;
		for(int i=0;i<numbers3.length;i++) {
			for(int j=0;j<numbers3[i].length;j++) {
				numbers3[i][j]=count++;
			}
		}
		for(int i=0;i<numbers3.length;i++) {
			for(int j=0;j<numbers3[i].length;j++) {
				System.out.print(numbers3[i][j]);
			}
			System.out.println();
		}//왜 0부터 출력...?
		
		//2차원배열의 선언과 동시에 초기화
		String[][] study= {{"김중근","홍승우","문준호","김현영"},
				{"김찬은","홍성현","나빈","이성진"},
				{"김재훈","이다영","조장흠"},
				{"김예린","윤나라","최인호","최주영","이동제"},
				{"강민기","윤지환","최솔"},
				{"조윤진","정상준","최하리","이은지"}};
		for(int i=0;i<study.length;i++) {
			for(int j=0;j<study[i].length;j++) {
				System.out.print(study[i][j]+" ");
			}
			System.out.println();
		}
		//최주영의 조찾기+인원수
		//최솔 조찾기+인원수
		//나빈 조찾기+인원수
		String findTeam="최주영";
		for(int i=0;i<study.length;i++) {
			for(int j=0;j<study[i].length;j++) {
				if(study[i][j].equals(findTeam)) {
					System.out.println(findTeam+"은 "+(i+1)+"조 입니다.");
					System.out.println("총 인원"+(study[i].length)+"명");
					break;
				}
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("팀원 명: ");
		findTeam=sc.next();
		String msg="없는 조원입니다.";
		for(int i=0;i<study.length;i++) {
			for(int j=0;j<study[i].length;j++) {
				if(study[i][j].equals(findTeam)) {
					System.out.println(findTeam+"씨는 "+(i+1)+"조 입니다.");
					msg=((i+1)+"조의 총 인원은 "+(study[i].length)+"명 입니다.");
					msg+=Arrays.toString(study[i]);
					break;
				}	
			}
		}
		System.out.println(msg);
	}
	
	//배열에 대한 데이터를 순회할때 편리하게 해보자
	public void extraTest() {
		int[] intArr= {1,2,3,4,5,6};
		//forEach문을 이용해서 데이터 순회하기
		//for(자료형 변수명 : 배열명||CollectionFramework){ }
		System.out.println("forEach문을 이용해서 출력하기");
		for(int d:intArr) {
			if(d%2==0) {
				System.out.print(d);
			}
		}
		//단, forEach문은 배열에 있는 값을 수정할 때는 사용할 수 없다.
		String[] hobby= {"농구","자전거","게임","코딩"};
		for(String h:hobby) {
			if(h.equals("코딩")) h="운동";
		}
		//배열에 중복값없이 저장하기
		//임의의 정수 10개 저장하기
		//수범위은 1~10
		
		int[] ranNum=new int[10];
		for(int i=0;i<ranNum.length;i++) {
			ranNum[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(ranNum[i]==ranNum[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println();
		for(int t:ranNum) {
			System.out.print(t+" ");
		}
		
		//로또 만들기
		//1~45번호를 중복값없이 여섯자리 저장
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println();
		for(int l:lotto) {
			System.out.print(l+" ");
		}
	}
		
}//ArrayController class ends
