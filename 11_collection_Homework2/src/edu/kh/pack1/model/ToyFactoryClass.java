package edu.kh.pack1.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
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
		
		
		toySet.add(new ToyClass("마미롱레그", 8, 36000, "분홍색", "19950805",toySet(materialMap.get(1)));
		   
		   

	            
	   }
	
	   public void displaymenu() {
	      int menuNum = 0; //메뉴 선택용 변수
	      
	   
	      
	       do {
	          try {
	             System.out.println("<<플레이타임 공장>>");
	             System.out.println("1.전체 장난감 조회하기");
	             System.out.println("2.새로운 장난감 만들기");
	             System.out.println("3.장난감 삭제하기");
	             System.out.println("4.장난감 제조일 순으로 조회하기");
	             System.out.println("5.언령별 사용 가능한 장난감 리스트 조회하기");
	             System.out.println("6.재료 추가");
	             System.out.println("7.재료 제거");
	             System.out.println("0.프로그램 종료");
	             System.out.print("메뉴를 입력하세요 : ");
	            
	             menuNum= sc.nextInt();
	             sc.nextLine();
	             switch (menuNum){
	             case 1 : toySearch(); break;
	             case 2 : /*addToy();*/ break;
	             case 3 : /*removeToy();*/ break;
	             case 4 : /*madeInSearch();*/ break;
	             case 5 : /*usingAgeSearch();*/ break;
	             case 6 : /*addNaturalName();*/ break;
	             case 7 : /*removeNaturalName();*/ break;
	             case 0 : System.out.println("프로그램 종료"); break;
	                
	             }
	          } catch (InputMismatchException e) {
	               System.out.println("\nerror : 입력형식이 유효하지 않습니다." + "다시 시도해주세요.");
	               
	               sc.nextLine(); // 입력버퍼 남아있는 잘못된 코드 +개행문자 제거
	               
	               menuNum = -1; // 첫 반복 시 잘못 입력하는 경우
	               // menuNum이 초기값인 0을 가지고있어 반복문이 종료됨.
	               //이를 방지하게 위해서 임의 값 -1 대입
	            }
	             
	          }while(menuNum !=0);
	      
	   }
	
	   public void toySearch() {
		   System.out.println("<전체 장난감 목록>");
		   for(int i = 0; i < toyList.size();i++) {
			   System.out.println((i + 1) + "." + toyList.get(i));
		   }
	   }
	   
	   public void addToy() {
		   System.out.println("새로운 장난감 추가");
		   System.out.print("장난감 이름 : ");
		   String name = sc.nextLine();
		   System.out.print("사용 가능 연령 : ");
		   int age = sc.nextInt();
		   sc.nextLine();
		   System.out.print("가격 : ");
		   int price = sc.nextInt();
		   sc.nextLine();
		   System.out.print("색상 : ");
		   String color = sc.nextLine();
		   System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		   String madeIn = sc.nextLine();
		   
			

				
				
		   int index = 1;
		   while (true) {
	            System.out.print("재료를 입력하세요(종료하려면 'q' 입력) : ");
	            String input = sc.nextLine();

	            if (input.equalsIgnoreCase("q")) {
	                break;
	            }
	            map.put(index++, input);
	           
		   }
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
	   
	   
	   
	   
	   
}
