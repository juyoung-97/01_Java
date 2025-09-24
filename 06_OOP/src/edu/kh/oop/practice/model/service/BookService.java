package edu.kh.oop.practice.model.service;

import java.util.Scanner;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	private Scanner sc = new Scanner(System.in);
	
	private Book bookInfo = null;
	
	private Book bookInfo2 = null;
	
	public void practice() {
		bookInfo = new Book() {};
		
		bookInfo2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		System.out.println(bookInfo);
		
		System.out.println(bookInfo2);
		
		System.out.println("===============================");
		
		System.out.println("수정된 결과 확인");
		
		bookInfo.setTitle("C언어");
		bookInfo.setPrice(30000);
		bookInfo.setDiscountRate(0.1);
		bookInfo.setAuthor("홍길동");
		
		System.out.println(bookInfo);
		
		System.out.println("도서명 = " + bookInfo.getTitle());
		System.out.println("할인된 가격 = " + (bookInfo.getPrice() - (bookInfo.getPrice() * bookInfo.getDiscountRate()) + "원"));
		System.out.println("도서명 = " + bookInfo2.getTitle());
		System.out.println("할인된 가격 = " + (bookInfo2.getPrice() - (bookInfo2.getPrice() * bookInfo2.getDiscountRate()) + "원"));

		
		
	}




}
