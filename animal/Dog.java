package com.sp.app0622.animal;

public class Dog {
	String name;
	//생성자도 메서드이므로 오버로딩이 당연히 적용된다!!
	public Dog(String name) {
		this.name=name;
	}
	public Dog() {
		
	}
	public static void main(String[] args) {
		new Dog("퍼피");
		System.out.println("강아지탄생");
	}
}
