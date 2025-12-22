package ch06_클래스.ex10_정적블록;
/**
 * 정적 메서드와 정적 블록에서 인스턴스 멤버를 사용하려면
 * 	-객체 생성후 참조 변수로 접근한다.
 */
public class CarMain {
		//인스턴스 피드
		int speed;
		//인스턴스 메서드
		void run() {
			System.out.println(speed + "으로 달린다.");
		}
		//정적 메서드
		static void simulate() {
			CarMain myCar = new CarMain();
			myCar.speed = 200;
			myCar.run();
		}
		//main 메서드도 정적 메서드로 객체를 만들어 접근해야 한다.
	public static void main(String[] args) {
		//Cannot make a static reference to the non-static field speed
		//speed = 10;
		//Cannot make a static reference to the non-static method run() from the type CarMain
		//run();
		
		//CarMain.simulate(); CarMain 생략가능(현재클래스의 정적메서드이므로)
		simulate();

	}

}
