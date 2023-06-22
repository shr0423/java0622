package com.sp.app0622.hardware;
//컴퓨터 본체를 정의한다
public class Desktop {
	//부품들을 has a 관계로 보유
	Ram ram;
	Hard hard;
	Keyboard keyboard;
	//데스크탑은 부품을 가지고 있으므로 즉 초기화할 대상이 있으므로
	//생성자의 코드작성은 필수이다
	
	public Desktop() {
		ram=new Ram("samsung");
		hard=new Hard(1000,"SSD");
		keyboard=new Keyboard("로지텍",59000);
	}

	
	public static void main(String[] args) {
		//컴퓨터 본체의 인스턴스를 생성하는 시점에 해당 부품들도
		//메모리에 올라와야하며, 데스크탑의 인스턴스 생성이후에는
		//메모리의 브랜드명,하드의 사이즈,키보드가격을 출력
	
		Desktop d=new Desktop();
		System.out.println(d.ram.brand);
		System.out.println(d.hard.size);
		System.out.println(d.keyboard.price);
	}
}
