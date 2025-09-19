package edu.kh.op.practice;

import java.util.Scanner;
// ctrl + shift + o : 자동수입
public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + num2 / num);
		System.out.println("남는 사탕 개수 : " + num2 % num);
		
		
		
	}
	public void practice2() {
//		 ex.
//		 이름: 홍길동
//		 학년(정수만) : 3
//		 반(정수만) : 4
//		 번호(정수만) : 15
//		 성별(남학생/여학생) : 남학생
//		 성적(소수점아래둘째자리까지) : 85.75
//		  3학년4반15번홍길동남학생의성적은85.75이다
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		int year = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점아래둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", year, grade, number, name, gender, score);
		
		
	}
	public void practice3() {
//		국어, 영어, 수학에대한점수를키보드를이용해정수로입력받고, 
//		세과목에대한합계(국어+영어+수학)와평균(합계/3.0)을구하세요.
//		 [실행화면]
//		국어: 60
//		영어: 80
//		수학: 40
//		합계: 180
//		평균: 60.0
		Scanner sc = new Scanner(System.in);

		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");		
		int math = sc.nextInt();
		
		System.out.println();
		int result = kor + eng + math;
		double avg = result / 3.0;
		System.out.printf("합계 : %d\n평균 : %.1f\n", result, avg);
		
		// 각 과목이 40점 이상이고, 평균 60점 이상이어야 합격


		boolean result2 = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg>=60);
		
		System.out.println(result2 ? "합격" : "불합격");

		
	}
	
	

}
