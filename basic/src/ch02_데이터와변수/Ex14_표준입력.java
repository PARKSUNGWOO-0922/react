package ch02_데이터와변수;
//외부 패키지.클래스를 가져올때(scanner 입력시 자동임포트)
import java.util.Scanner;

public class Ex14_표준입력 {

	public static void main(String[] args) {
		//참조타입 변수 = new 생성자(인자);
		Scanner sc = new Scanner(System.in);
		//콘솔에서 입력한 정보를 strX 에 할당
		System.out.print("x값을 입력: ");//println은 개행해서 나옴.
		//nextLine()은 키보드로 입력한 내용을 '한 줄 전체'그대로 읽어 문자열로 반환
		//nextLine()정보는 모두 문자열이다.
		String strX = sc.nextLine();
		System.out.println("문자열: "+ strX);
		//숫자로 변경시
		int x = Integer.parseInt(strX);
		System.out.println("숫자: " + strX);
		System.out.println(x);
		
		
		System.out.print("y값을 입력: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		System.out.println(y);
		
		int result = x + y;
		System.out.println("x + y = " + result);
		System.out.println();
		
		while (true) {
			System.out.print("입력 문자열: ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문장ㄹ: " + data);
			System.out.println();
		}
		System.out.println("while문을 종료합니다.");
		
		sc.close();
	}

}
