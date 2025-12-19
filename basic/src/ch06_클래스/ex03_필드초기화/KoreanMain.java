package ch06_클래스.ex03_필드초기화;

public class KoreanMain {

	public static void main(String[] args) {
		//객체 생성
		//클래스 참조변수 = new 생성자(인자);
		Korean k1 = new Korean("박자바","011225-1025315");
		Korean k2 = new Korean("김자바","010808-5080558");
		
		System.out.println("k1.nation:" + k1.nation);
		System.out.println("k1.name:" + k1.name);
		System.out.println("k1.ssn:" + k1.ssn);

		System.out.println("k2.nation:" + k2.nation);
		System.out.println("k2.name:" + k2.name);
		System.out.println("k2.ssn:" + k2.ssn);
		
		//k2.ssn = "930506-2055329"; The final field Korean.ssn cannot be assigned
	}

}
