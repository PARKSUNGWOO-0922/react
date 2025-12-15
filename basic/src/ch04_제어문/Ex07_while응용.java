package ch04_제어문;
// java.lang패키지는 import 필요 없다.
//-> 기본패키지
import java.util.Scanner;
//java.util 패키지의 Scanner클래스를 사용하기 위해 import
/*
 *  sc.nextInt();     // 정수로 읽기
	sc.nextDouble();  // 실수로 읽기
	sc.next();        // 단어 하나(공백전까지)
	sc.nextLine();    // 한 줄 전체(공백포함)
 */

public class Ex07_while응용 {

	public static void main(String[] args) {
		//참조 타입:String, 클래스,...
		//new 키워드로 생성한 객체를 특별히 instance(인스턴스)
		//scanner() 생성자 함수를 통해 sc 객체(인스턴스) 생성
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------------");
			System.out.print("선택: ");

			String strNum = sc.nextLine();

			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

}
