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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToyClass)) return false;
        ToyClass toy = (ToyClass) o;
        return Objects.equals(name, toy.name);
    }

    @Override
	public String toString() {
		return "ToyClass [name=" + name + ", age=" + age + ", price=" + price + ", color=" + color + ", madeDate="
				+ madeDate + ", materials=" + materials + "]";
	}

	@Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getAge() {
        return age;
    }

    public String getMadeDate() {
        return madeDate;
    }

    public String getName() {
        return name;
    }

    public Set<String> getMaterials() {
        return materials;
    }
}

