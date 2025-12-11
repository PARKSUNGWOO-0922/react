package ch02_데이터와변수;

public class Ex12_변수사용범위 {

	public static void main(String[] args) {
		//변수? v1,v2
		//v1은 main 메서드 블록에서 선언(전역변수)
	 int v1 = 15;
	 if (v1 > 10) {
		 int v2 = v1 - 10;
		 //v2는 if 조건문 블록에서 선언(지역변수)
	 }
	 	//int v3 = v1 + v2 //v2는 if문밖에서는 사용불가
	
	}

}
