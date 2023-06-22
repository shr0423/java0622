package com.sp.app0622.animal;

public class Bird {
	/*메서드나 변수는 직관성이 있어야 하므로,
	 * 개발시 신중하게 고려해야한다
	 * 하지만, 개발을 하다보면 로직이 상당히 흡사함에도 불구하고
	 * 프로그램 언어의 원칙상 메서드명 중복불가라는 이유때문에 힘들게 정해놓은
	 *메서드명을 또 사용할 수 없는일이 발생할수있다
	 *이러한 문제를해결하기위해 java에서는 overLoading을 지원해준다
	 *OverLoading이라 ㄴ하나의클래스내에 메서드명을중복정의할수있는
	 *메서드정의기법을말하는데, 이때 주의할점은메서드의 이름은같게하고
	 *해당메서드의매개변수의자료형이나 갯수는 틀리게해야한다
	 *그래야 구분이 가능하므로..*/
	public void fly() {
		System.out.println("새가 난다");
	}
	public void fly(int level) {

		System.out.println("새가 낮게난다");
	}
	public void fly(int level, int k) {
		System.out.println("새가 조금더 낮게난다");
	}
}
