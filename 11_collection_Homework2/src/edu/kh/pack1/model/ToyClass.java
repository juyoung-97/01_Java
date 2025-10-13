package edu.kh.pack1.model;

import java.util.*;

public class ToyClass {
    private String name;
    private int age;
    private int price;
    private String color;
    private String madeDate;
    private Set<String> materials; // 중복 방지 위해 Set 사용


    @Override
	public int hashCode() {
		return Objects.hash(age, color, madeDate, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToyClass other = (ToyClass) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(madeDate, other.madeDate)
				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name)
				&& price == other.price;
	}

    public ToyClass(String name, int age, int price, String color, String madeDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.madeDate = madeDate;
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age + " / 제조년월일 : " + madeDate + " / 재료 : " + materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}




}

