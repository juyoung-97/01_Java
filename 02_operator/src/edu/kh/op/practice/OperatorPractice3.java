package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	Scanner sc = new Scanner(System.in);
//	문제1) 
//	마트에서 고객에게 할인 혜택을 제공하려고 한다
//	물건의 총 가격과 회원 여부를 입력받아, 
//	회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
//
//	메서드 : public void practice1() {}
//
//	[실행화면]
//	가격을 입력 하세요 : 10000
//	멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
//	할인을 포함한 최종금액 : 9000.0원
//
//
	public void practice1() {
		

		
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		System.out.print("멤버십 있으세요? ");
		boolean member = sc.nextBoolean();
		double result = member ? price * 0.90 : price * 0.95;
		System.out.printf("할인을 포함한 최종금액 : %.1f원\n", result);
		
		//자바에서는 문자열끼리 비교 == 사용X
		// equals() 비교
				
		
		
	}
	
//	문제2)
//	ATM에서 사용자가 원하는 금액을 입력하면,
//  5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
//	ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장,
//  5천원 지폐 0장, 1천원 지폐 3장이 필요함
//
//	메서드 : public void practice2() {}
//
	public void practice2() {
		
		System.out.print("출금할 금액 입력 : ");
		int money = sc.nextInt();
		
		int result = money / 50000;
		money %= 50000;
		// money = money % 50000; - 5만원 지폐를 거른후 나머지 금액
		int result2 = money / 10000; 
		money %= 10000;
		
		int result3 = money / 5000;
		money %= 5000;
		
		int result4 = money / 1000;
		
		System.out.println("50000원: " + result);
		System.out.println("10000원: " + result2);
		System.out.println("5000원: " + result3);
		System.out.println("1000원: " + result4);
		
		
	}
	
//	문제3)
//	사용자로부터 두 개의 정수를 입력받아, 
//	첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
//	만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
//
//	메서드 : public void practice3() {}
	public void practice3() {
		
		
		
		System.out.print("첫 번째 수 : ");
		int num = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num % num2 == 0 ? "배수입니다" : "배수가 아닙니다");
		

			
		}
	// 잔액을 입력하고 몇잔의 커피(2000원)을 구매가능한지 출력하고
	// 잔액을 출력하시오
		
	
//
//	[실행화면]
//	첫 번째 수 : 100
//	두 번째 수 : 5
//	배수입니다
//
//	첫 번째 수 : 200
//	두 번째 수 : 7
//	배수가 아닙니다
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int result = a > b ? ++a : --b;
		
		System.out.printf("출력값 %d / %d", a, b);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
