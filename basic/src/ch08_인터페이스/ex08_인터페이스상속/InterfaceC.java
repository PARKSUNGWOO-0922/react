package ch08_인터페이스.ex08_인터페이스상속;
/**
 * 인터페이스 상속
 * 	- 다중 상속을 허용한다.
 * 		[접근제한자] interface 인터페이스명 extends 인터페이스명1, 인터페이스명2, ...{...}
 *  - 다중 구현을 허용한다.
 * 		[접근제한자] interface 인터페이스명 implements 인터페이스명1, 인터페이스명2, ...{...}
 * 
 * 	- 자식 인터페이스의 구현 클래스는 자식 인터페이스의 추상 메서드뿐만 아니라
 * 	  부모 인터페이스의 모든 추상메서드를 재정의 해야 한다.
 */
public interface InterfaceC extends InterfaceA, InterfaceB {
	//추상 메소드
	void methodC();
}