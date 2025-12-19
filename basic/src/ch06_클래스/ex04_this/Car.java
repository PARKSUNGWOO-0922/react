package ch06_클래스.ex04_this;
/**
 * 참고:오버라이딩(overriding):재정의
 * 
 * 생성자 오버로딩(overloading)이 많은 경우
 * 중복된 코드가 발생할 수 있다.
 * -> 공통 코드를 가진 생성자를 작성하고,
 * 	  다른 생성자는 this(...)를 사용하여 공통생성자를 호출한다.
 * 
 * 오버로딩: 이름은 같고 매개변수의 타입 갯수 순서가 다른 경우
 * 1.생성자 오버로딩
 * 2.메서드오버로딩
 * 		예)print
 * 
 * 
 * 
 * 생성자에서 사용하는 this 와 this()
 * this - 클래스(객체) 자기 자신
 * this() - 공통 코드를 가진 생성자 호출
 */
public class Car {
	Car(String model) {
		//this(model); Recursive constructor invocation Car(String):3개모두인자표시해야한다.
		//매개변수로 받은것 이외 2개는 별도로 지정해주어야한다. 단)clolr,maxSpeed처럼 같음필드명을 쓰면 에러!
		//예)this(model,color,maxSpeed); Cannot refer to an instance field maxSpeed while explicitly invoking a constructor
		this(model, "흰색",200);
		//this.model = model;
	}
	Car(String model, String color) {
		this(model,color,250);
		//this.model = model;
		//this.color = color;
	}
	//공통 코드를 가진 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed =350;
	int speed;
	
	
}
