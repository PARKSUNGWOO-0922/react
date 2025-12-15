package ch04_제어문;

public class Ex04_for문 {

	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("-----1~10까지 출력----------------");
		//-------------1~10까지 출력--------------------	
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		System.out.println("-----1~100까지 합 출력----------------");
		//-------------1~100까지 합 출력--------------------	
		int sum = 0;
		int i;
			
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		System.out.println("\n");
		System.out.println("-----float(부동 소수점)----------------");
		//-------------float(부동소수점) 0.6이후 숫자변동------------	
		//float 타입은 연산과정에서 0.1을 정확히 표현 못한다.
		//-> 증감식에서 x에 더해지는 실제 값은 0.1보다 클 수 있다.
		//0.1부터 1.0까지 10번 반복될것 같으나,
		//9번만 반복한다.(10번째:1.0000001로 1.0보다 크기때문)
		for(float x=0.1f; x<=1.1f; x+=0.1f) {
			System.out.println(x);
		}
	}
}
