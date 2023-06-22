package com.sp.app0622.plant;

public class Flower {
	String name;
	String color;
	public Flower() {
		name="장미";
		color="흰색";
	}
	public void init() {
		name="장미";
		color="흰색";
	}
	public static void main(String[] args) {
		Flower f=new Flower();
		f.init();
	}

}
