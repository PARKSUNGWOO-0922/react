package ch06_클래스.ex06_가변길이매개변수;

public class Computer {
	//합계
	//1~10까지 합
	int sum(int ...values){
		int sum = 0;
		for(int i = 1; i <= values.length; i++) {
		sum += values[i];
	}
		return sum;
	}
}
