package ch02_데이터와변수;

/**
 * 타입 변환
 * 1. 자동 타입 변환
 * 		- 값의 허용 범위가 작은 타입이 허용 범위 큰 타입으로 대입될때 발생한다.
 * 			예)char(2) -> int(4) -> long(8) -> float(4) -> double(8)
 * 			예)byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
 * 			형식:
 * 				큰타입 변수 = 작은타입 값
 * 				예)int var1 = 'A';
 * 				예)char var2 =var1;
 * 2. 강제 타입 변환
 * 		- 큰 허용 범위 타입을 작은 허용 범위 타입을 쪼개어서 저장하는 것
 * 		- 형식:
 * 			작은타입 변수 = (작은타입) 변수			
 */
public class Ex10_타입변환 {

	public static void main(String[] args) {
		// 자동 타입(형변환) 변환
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("intValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("intValue: " + intValue);

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		// 강제 타입 변환
		int var1 = 10;
		// 타입 변수명 = (타입) 변수명; -> 양쪽 타입은 같아야 한다.
		byte var2 = (byte) var1;
		System.out.println("var2: " + var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println("var4: " + var4);
		
		var1 = 65;
		char var5 = (char) var1;
		System.out.println("var5: " + var5);
		
		double var6 = 3.14;
		var1 = (int) var6;
		System.out.println("var6: " + var1);
		
		// 연산식에서 자동 타입 변환
		byte result1 = 10 + 20;
		System.out.println("resutl: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;//연산(더해질)때 타입변화되어 할당된다.
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		//long 타입 리터럴은 끝에 L을 쓴다.
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;//연산(더해질)때 타입변화되어 할당된다.
		System.out.println("result3: " + result3);
		
		//연산식에서 int 타입보다 작은 타입의 연산은 int 타입으로 변환되어 연산된다.
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		
		double result6 = v8 / 4.0;//4로 나누면 2/ 4.0으로 나누면 2.5
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;//v10을 double형변환하고 연산
		System.out.println("result7: " + result7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
