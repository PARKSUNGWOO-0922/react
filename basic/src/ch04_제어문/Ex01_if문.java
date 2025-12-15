package ch04_제어문;

/**
 * 제어문
 * 1.조건문
 * 		-if,if~else,if~else if~else
 * 		-switch
 * 2.반복문
 * 		-for
 * 		-while
 * 		-do~while
 * 3.기타
 * 		-break
 * 		-continue
 */
public class Ex01_if문 {

	public static void main(String[] args) {
		/*
		 * if 형식
		 * 		 if(score>=90){
		 *  		 실행문;
		 *  		}
		 *  -실행문이 하나이면 {} 생략가능
		 */
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		//선택한 영역 자동 정렬(들여쓰기):ctrl+i
		if(score < 90)
			System.out.println("점수가 90보다 작습니다.");//참인경우 실행
			System.out.println("등급은 B입니다.");//거짓인경우 실행
			System.out.println("\n");
			System.out.println("-------if~else--------------");
		
			
		//--------------if~else-------------------	
		/*
		 * if~else문
		 * 		if (조건) {
		 * 			조건이 true일때 실행문;
		 * 		}else {
		 * 			조건이 false일때 실행문;
		 * 		}
		 */
			
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}	
		System.out.println("\n");
		System.out.println("-------if~elseif--------------");
		//--------------if~else if-------------------	
		/*
		 * if~else문
		 * 		if (조건) {
		 * 			조건이 true일때 실행문;
		 * 		}else if(조건2){
		 * 			조건2 true일때 실행문;
		 * 		}else if(조건3){
		 * 			조건3 true일때 실행문;
		 * 		}else {
		 * 			조건이 모두 false 일대 실행문
		 * 		}
		 * 
		 */
		score = 75;
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("\n");
		System.out.println("-------if Nested if--------------");
		//--------------if Nested if-------------------	
		
		//Math.random(): 난수(0이상~1미만 사이의 임의 수)
		//자동 형 변환(up casting) : 작은변수를 큰변수에 넣을때 ex)큰변수=작은변수
		//int() 강제 타입(형) 변환(down casting)
		//0*20 <= Math.random()*20 < 20
		
		//81이상 101미만의 정수
		score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}
