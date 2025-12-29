package ch08_인터페이스.ex03_추상메서드;
/**
 * 추상 메서드?
 * 	- 리턴타입, 메서드명, 매개변수만 기술하고 , 중괄호{}가 없는 메서드
 * 		[public abstract] 리턴타입 메서드명(매개변수,...);
 */
public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}