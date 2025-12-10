package ch02_데이터와변수;
/**
 * 문서주석은 /** enter
 * 부동소수점,floating Point 타입 : 형식: 부호부(signed:+,-) + 지수(exponent) + 가수부(mantissa)
 * 									0이면 양수/ 1이면 음수
 * 실수 타입(교재 47p)
 * 	1.float		4byte -> 32bit ->7자리
 * 	2.double	8byte -> 64bit ->15자리		
 */
public class Ex06_실수 {
	//main 쓰고 ctrl+space -> enter
	public static void main(String[] args) {
		// 정밀도 확인
		//float 리터럴은 끝에 f 또는 F을 붙인다.
		float var1 =  0.1234567890123456789f;// 소수점 이하 8자리
		double var2 = 0.1234567890123456789; // 소수점 이하 17자리
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;//e6는 10의6승->10을 거듭해서 6번곱한다.
		float var4 = 3e6f;
		double var5 = 2e-3; //10의-3승
		//출력
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}
}
