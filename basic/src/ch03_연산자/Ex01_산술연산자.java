package ch03_연산자;

/**
 *  산술연산자
 */
public class Ex01_산술연산자 {

	public static void main(String[] args) {
		//부호 연산
		int x = -100;
		x = -x;
		
		byte b = 100;
		//byte y = -b; 연산시 int로 바뀌어서 byte에 대입이 안된다.
		int y = -b;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
