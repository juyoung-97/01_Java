package edu.kh.control.practice;

import java.util.Scanner;

public class AtmSimulator {

	Scanner sc = new Scanner(System.in);

	public void ex1() {

		int money = 10000;
		System.out.println("=== ATM 프로그램 시작 ===");
		System.out.println("현재 잔액 : " + money + "원\n");
		int num = 0;
		while (num != 4) {
			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("\n입금할 금액을 입력하세요 : ");
				int input = sc.nextInt();
				money += input;
				System.out.println("입금 완료! 현재 잔액 : " + money + "원입니다.");
				break;
			case 2:
				System.out.print("\n출금할 금액을 입력하세요 : ");
				int output = sc.nextInt();
				if (money < output) {
					System.out.println("잔액 부족! 현재 잔액은 " + money + "원입니다\n");
					continue;
				} else {
					money -= output;
					System.out.println("출금 완료! 현재 잔액은 " + money + "원입니다.\n");
					break;

				}
			case 3:
				System.out.println("\n현재 잔액은 " + money + "원입니다.\n");
				break;
			case 4:
				System.out.println("\n프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");
			}
		}

	}

	public void ex2() {
		String input = "";
		int count = 0;
		int win = 0;
		boolean running = true;

		System.out.println("=== 주사위 맞히기 게임 시작===");
		System.out.println("1~6 사이 숫자를 맞혀보세요 (종료하려면 /종료/입력)");
		
		while(running) {
			System.out.print("숫자 입력 >> ");
			input = sc.next();
			int answer = (int) (Math.random() * 6 + 1);
			if(input.equals("종료")) {
				running = false;
			}
			int input1 = Integer.parseInt("input");
			while(answer != input1) {
				if(answer > input1) {
					System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
				} else if(answer < input1) {
					System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
				} else if(input1 < 1 || input1 > 6) {
					System.out.println("잘못된 입력입니다. 1~6사이 숫자를 입력하세요.");
				}
			}
		}



	}
}
