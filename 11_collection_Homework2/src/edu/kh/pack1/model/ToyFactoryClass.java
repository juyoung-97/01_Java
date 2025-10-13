package edu.kh.pack1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ToyFactoryClass {

	private Scanner sc = new Scanner(System.in);

	private Map<Integer, String> materialMap = new HashMap<Integer, String>();

	private Set<ToyClass> toySet = new HashSet<ToyClass>();

	public ToyFactoryClass() {

		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		toySet.add(new ToyClass("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new ToyClass("허기워기", 5, 12000, "파랑색", "19940312", addMaterials(1, 2)));
		toySet.add(new ToyClass("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new ToyClass("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new ToyClass("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

	}

	// 가변인자 : 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	// 자료형 ... 변수명
	// 가변인자를 통해 들어온 매개변수의 데이터 타입은 배열 !

	/**
	 * 매개변수로 전달받은 값들을 재료를 저장한 Map 에 있는지 확인하고 Set 형태로 반환하는 메서드
	 * 
	 * 
	 */
	private Set<String> addMaterials(int... materials) {

		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개

		// 2. 재료를 저장하여 반환할 Set 객체를 생성
		Set<String> addedMaterials = new HashSet<>();

		// 3. addedMaterials 에 재료명을 추가해야함
		// 단, 재료는 Map 에 존재하는 것만 추가 가능
		for (int materialKey : materials) {

			// Map 에서 재료 고유 번호(Key) 에 대응하는 재료명(value)를 가져와서 addMaterials 추가
			// map 에 없는 key 를 입력하여 value 를 얻어왔을 때 == null
			String materialValue = materialMap.get(materialKey);

			if (materialValue != null) {
				addedMaterials.add(materialValue);
			}

		}

		return addedMaterials;
	}

	public void displaymenu() {
		int menuNum = 0; // 메뉴 선택용 변수

		do {
			try {
				System.out.println("<<플레이타임 공장>>");
				System.out.println("1.전체 장난감 조회하기");
				System.out.println("2.새로운 장난감 만들기");
				System.out.println("3.장난감 삭제하기");
				System.out.println("4.장난감 제조일 순으로 조회하기");
				System.out.println("5.연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6.재료 추가");
				System.out.println("7.재료 제거");
				System.out.println("0.프로그램 종료");
				System.out.print("메뉴를 입력하세요 : ");

				menuNum = sc.nextInt();
				sc.nextLine();
				switch (menuNum) {
				case 1:
					toySearch();
					break;
				case 2:
					addToy();
					break;
				case 3:
					removeToy();
					break;
				case 4:
					madeInSearch();
					break;
				case 5:
					usingAgeSearch();
					break;
				case 6:
					addNaturalName();
					break;
				case 7:
					removeNaturalName();
					break;
				case 0:
					System.out.println("프로그램 종료");
					break;

				}
			} catch (InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다." + "다시 시도해주세요.");

				sc.nextLine(); // 입력버퍼 남아있는 잘못된 코드 +개행문자 제거

				menuNum = -1; // 첫 반복 시 잘못 입력하는 경우
				// menuNum이 초기값인 0을 가지고있어 반복문이 종료됨.
				// 이를 방지하게 위해서 임의 값 -1 대입
			}

		} while (menuNum != 0);

	}

	public void toySearch() {
		System.out.println("<전체 장난감 목록>");
		Iterator<ToyClass> it = toySet.iterator();

		while (it.hasNext()) {
			ToyClass temp = it.next();
			System.out.println(temp);
		}

	}

	public void addToy() {
		System.out.println("새로운 장난감 추가");

		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();

		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 개행 제거

		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 개행 제거

		System.out.print("색상 : ");
		String color = sc.nextLine();

		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String madeIn = sc.nextLine();

		// 입력 받은 재료를 저장할 Set
		Set<String> selectedMaterials = new HashSet<>();

		while (true) {
			System.out.print("재료를 입력하세요 (종료하려면 'q' 입력) : ");
			String input = sc.nextLine();

			if (input.equalsIgnoreCase("q")) {
				break; // 루프 종료
			}

			if (materialMap.containsValue(input)) {
				selectedMaterials.add(input);
			} else {
				System.out.println("유효하지 않은 재료입니다. 다시 입력해주세요.");
			}
		}

		// 장난감 객체 생성 및 Set에 추가
		toySet.add(new ToyClass(name, age, price, color, madeIn, selectedMaterials));

		System.out.println("새로운 장난감이 추가되었습니다!");

	}

	public void removeToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String input = sc.nextLine();

		ToyClass toyRemove = null;

		for (ToyClass toy : toySet) {
			if (toy.getName().equals(input)) {
				toyRemove = toy;
				break;
			}
		}

		if (toyRemove != null) {
			toySet.remove(toyRemove);
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 장난감입니다.");
		}
	}

	public void madeInSearch() {
		System.out.println("<제조일 순으로 장난감을 정렬>");

		List<ToyClass> toyList = new ArrayList<>(toySet);

		toyList.sort(Comparator.comparing(ToyClass::getMadeDate));

		for (ToyClass toy : toyList) {
			System.out.println(toy);
		}
	}

	public void usingAgeSearch() {
		System.out.println("<연령별로 사용 가능한 장난감>");

		Map<Integer, List<ToyClass>> ageGroupMap = new HashMap<>();

		for (ToyClass toy : toySet) {
			int age = toy.getAge();

			ageGroupMap.computeIfAbsent(age, k -> new ArrayList<>()).add(toy); // 솔직히 너무 어려워서 gpt썼음..
		}

		// 연령 정렬
		List<Integer> sortedAges = new ArrayList<>(ageGroupMap.keySet());
		sortedAges.sort(Integer::compareTo);

		for (int age : sortedAges) {
			System.out.printf("[연령 : %d세]\n", age);
			for (ToyClass toy : ageGroupMap.get(age)) {
				System.out.println(toy);
			}
		}

	}

	public void addNaturalName() {
		System.out.println("<재료 추가>");
		System.out.println("=== 현재 등록된 재료 ===");

		Set<Integer> number = materialMap.keySet();
		for (Integer key : number) {
			System.out.print(key + ": ");
			System.out.println(materialMap.get(key));
		}
		System.out.println("=========================");
		System.out.print("재료 고유번호(key) 입력 : ");
		int addKey = sc.nextInt();
		System.out.print("재료명 입력 : ");
		String addMaterial = sc.next();
		if (materialMap.containsKey(addKey)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N): ");
			while (true) {
				String input = sc.next();
				if (input.equalsIgnoreCase("y")) {
					System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");

					materialMap.put(addKey, addMaterial);
					break;
				} else if (input.equalsIgnoreCase("n")) {
					System.out.println("메인화면으로 돌아갑니다.");
					break;
				}
				System.out.println("잘못 입력하셨습니다. Y 또는 N 을 입력해주세요");
				System.out.print("덮어쓰시겠습니까? (Y/N): ");
			}

		}

	}

	public void removeNaturalName() {

		System.out.println("<재료 삭제>");
		System.out.println("=== 현재 등록된 재료 ===");

		Set<Integer> number = materialMap.keySet();
		for (Integer key : number) {
			System.out.print(key + ": ");
			System.out.println(materialMap.get(key));
		}
		System.out.println("=========================");
		System.out.print("삭제할 재료명 입력 : ");
		String input = sc.nextLine();
		Set<Entry<Integer, String>> setMap = materialMap.entrySet();

		for (Entry<Integer, String> entry : setMap) {
			if (entry.getValue().equals(input)) {
				System.out.printf("재료 '%s'가 성공적으로 제거되었습니다.\n", input);
				System.out.println();
				materialMap.remove(entry.getKey());
				break;
			} else {
				System.out.println("해당 이름의 재료가 존재하지 않습니다.");
				break;
			}
		}

	}

}
