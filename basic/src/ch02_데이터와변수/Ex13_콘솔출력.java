package ch02_데이터와변수;

public class Ex13_콘솔출력 {

	public static void main(String[] args) {
		int value = 123;
		//줄바꿈 된다.
		System.out.println(value);
		//줄바꿈 안된다.
		System.out.print(value + "\n");
		//format(형식) 지정 출력
		//System.out.printf("형식문자",출력값);
		//형식문자열 구성
		//%[값의순번$][플래그][전체자리수][.소수자릿수]변환문자
		System.out.printf("상품가격: %d원\n",value);//123원
		System.out.printf("상품가격: %6d원\n",value);//총6자리 우측정렬 ____123
		System.out.printf("상품가격: %-6d원\n",value);//총6자리 왼쪽정렬 123____
		System.out.printf("상품가격: %06d원\n",value);//총6자리:000123
		
		double area = 3.14159 * 10 * 10;
		//형식 문자열의 개수 만큼 값을 표시해야 한다
		System.out.printf("반지름이 %d인 원의 넓이는 %10.2f 입니다.\n",10,area );//_____3.14
		System.out.printf("반지름이 %d인 원의 넓이는 %010.2f 입니다.\n",10,area );//000003.14
		//문자열의 경우는 0사용안됨..
		String name = "홍길동";
		String job = "개발자";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
		

	}

}
