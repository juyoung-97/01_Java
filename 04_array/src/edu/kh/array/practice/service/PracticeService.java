package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

		int[] arr;
		arr = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if (i % 2 == 0) {
				sum += i + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);

	}

	public void practice2() {
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		int[] arr;
		arr = new int[9];
		int sum = 0;
		for (int i = 8; i >= 0; i--) {
			arr[i] = arr.length - i; // i = 0 -> 9 i = 1 -> 8 i= 2 -> 7
			if (i % 2 != 0) {
				sum += i + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);

	}

	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		[실행 화면]
//		양의 정수 : 5
//		1 2 3 4 5
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			result += i + 1 + " ";
		}
		System.out.println(result);

	}

	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
//
//		[실행 화면 1]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 8
//		인덱스 : 1
//
//		[실행 화면 2]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 1
//		일치하는 값이 존재하지 않습니다.
		int[] arr = new int[5];
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input;

		}
		System.out.print("검색할 값 : ");
		int input1 = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (input1 == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		[실행 화면]
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		String index = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				index += i + " ";
				count++;
			}

		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %s\n", input, ch, index);
		System.out.printf("%s 개수 : %d\n", ch, count);

	}

	public void practice6() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//		[실행 화면]
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2

		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] text = new int[input];
		int sum = 0;

		for (int i = 0; i < text.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);

			int input2 = sc.nextInt();

			text[i] = input2;
			sum += input2;
		}
		System.out.println(Arrays.toString(text));
		System.out.printf("총 합 : %d\n", sum);

	}

	public void practice7() {
//		주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
//
//		[실행 화면]
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		 
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		char[] number = new char[input.length()];
		for(int i = 0; i < input.length(); i++) {
			number[i] = input.charAt(i);
		}

	}

}
