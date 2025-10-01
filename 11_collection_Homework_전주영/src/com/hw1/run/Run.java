package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	
	public static void main(String[] args) {
		List<String> friendList = new ArrayList<>();
		
		friendList.add("짱구");
		friendList.add("철수");
		friendList.add("유리");
		friendList.add("훈이");
		friendList.add("맹구");
		
		System.out.println(friendList.get((int) (Math.random() * 5)) + "가 떡잎방범대 대장이다!");
	}

}
