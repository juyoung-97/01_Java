package edu.kh.basic;

// 한줄 주석 : 컴파일러가 해석하지 않는 부분
public class JavaTest {
	
	// main 메서드 : 자바 프로그램을 실행하기 위해서
	//				반드시 필요한 구문
	// main 작성 후 ctrl + space -> Enter 자동완성
	public static void main(String[] args) {
		System.out.println("test");
		// main 메서드 안에 작성한 코드를 실행시키는 방법
		// 단축키 : ctrl + F11
		// 상단에 초록색 재생 버튼
		System.out.println("HELLO WORLD!");
		System.out.println(); // 개행역할만 하는방법
		// syso 작성 후 ctrl + space -> enter 자동완성
		// 저장 단축키 ctrl + s
		System.out.println("HI?");
		System.out.println("반갑습니다");
		// ctrl + alt + 위 아래방향키는 복사
		// ctrl + alt + 위 아래방향키는 복사
		System.out.println("반갑습니다");
		System.out.println("1+2");
		// ""안에 작성된 코드는 단순 문자열로 인식
		// ""안에 작성되지 않은 코드는 숫자, 변수로 인식
		System.out.println(1+2);
		System.out.println(120/9);
		System.out.println(120%9);
		// %는 나눈후에 나머지를 출력한다(% = 모듈러 MODULO)
		
		// "" (문자열) + 숫자 함께 작성 : 이어쓰기
		// 숫자 + 숫자 : 더하기 연산
		System.out.println("14 * 19 = "+ 14 * 19);
		
		// 자바는 사칙연산의 우선 순위를 그대로 따름
		System.out.println(2+3*4);
		System.out.println((2+3)*4); // 우선 계산을 원하면 ()괄호 사용
		System.out.println("90+70+65 = " + 90 + 70 + 65);
		System.out.println("90+70+65 = " + (90 + 70 + 65));
		System.out.println("A"+"B");
		System.out.println("A"+"B"+12);
		System.out.println("A"+"B"+"형");
		System.out.println("뭐하냐도대체");
		
		
	}
}
