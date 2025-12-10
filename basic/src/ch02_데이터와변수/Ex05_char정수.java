package ch02_데이터와변수;

public class Ex05_char정수 {

	public static void main(String[] args) {
		//ctrl+alt+방향키 선택한 영역 복제
		//ctrl+f11 실행
		//ctrl+m 코드뷰 최대화
		
		//문자(글자1자)는 단일 따옴표, 문자열(1자이상)은 이중 따옴표로 묶는다
		
		//문자 저장
		char var1 ='A';
		String var5 = "A";
		//char var7 = ''; //공백없이 에러
		String var8 ="";//공백없이 가능
		//문자열 저장
		char var2 ='가';
		char var3 =65;
		char var4 =44032;
		char var6 = 0x0041;
		// sysout  쓰고, ctrl+space
		System.out.println("var1:" + var1);//A
		System.out.println("var2:" + var2);//가
		System.out.println("var3:" + var3);//A
		System.out.println("var4:" + var4);//가
		System.out.println("var5:" + var5);//A
		System.out.println("var6:" + var6);//A

	}

}
