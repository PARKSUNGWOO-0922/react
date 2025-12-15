package ch04_제어문;
/**
 * while문
 * 	-반복 횟수가 정해지지 않은 경우
 * 	-조건식이 true일 경우 계속 반복
 * 
 * 		while(true) {
 * 			실행문;
 * 			}
 */
public class Ex06_while {

	public static void main(String[] args) {
		System.out.println("------1~10까지 출력(while문)---------------");
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("");
		System.out.println("------1~100까지 합 출력(while문)---------------");
		int sum = 0;
		i = 1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
