package ch05_참조타입;
/**
 * 데이터 타입
 * 1. 기본 타입
 * 	- 정수 타입: byte,char,short,int,long
 * 	- 실수 타입: float,double
 * 	- 논리 타입: boolean
 * 2. 참조 타입
 * 	- 배열array 타입: []
 * 	- 문자열 타입: String
 * 	- 열거Enum 타입: 
 * 	- 클래스calss 타입: 
 * 	- 인터페이스interface 타입: 
 * 
 * 기본 타입- 값 자체가 저장
 * 		예)int num = 3;
 * 참조 타입- 번지(주소) 저장
 * 		예)int[] nums  = new int[]{1,2,3};
 * 참조 타입은 null값을 가질수 있다.-> 참조하는 주소값이 없다.
 * 
 * 배열
 * 	-연속된 공간에 값을 나열시키고 , 각 값에 인덱스를 부여해 놓은 자료구조이다.
 * 	-인덱스는 대괄호[]와 함께 사용하여 각 항목의 값을 읽거나 저장하는데 사용한다.
 * 	-같은 타입의 값만 관리한다.
 * 	-배열의 길이는 생성과 동시에 길이가 결정된다.->늘리거나 줄일수 없다.
 * 	-배열 선언: 타입[] 배열;(관례) , 타입 배열[]; , 타입 배열[필요갯수];
 * 	-배열 할당: 배열 = {값,...};, 배열 = new 타입[] {값,...};
 * 		예)	읽기:배열명[인덱스]
 * 			저장(할당):배열명[인덱스] = 값;
 */
public class Ex05_배열 {

	public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //배열 변수 arr2 선언
		int[] arr3; //배열 변수 arr3 선언
			
		arr1 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
		arr2 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
		arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
			
		System.out.println(arr1 == arr2); // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 == arr3); // arr2와 arr3 변수가 같은 배열을 참조하는지 검사
		
		//--------------ArrayCreateByValue1------------------------------------------------------
		
		//배열 변수 선언과 배열 생성
		String[] season = { "Spring", "Summer", "Fall", "Winter" };

		//배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);

		//인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();

		//배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };

		//총합과 평균 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		System.out.println("--------------ArrayCreateByValue2----------");
		//--------------ArrayCreateByValue2--------------------------
		//배열 변수 선언
		//int[] scores; 중복선언 주석처리
		//배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };
		//배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		//배열을 매개값으로 주고, printItem() 메소드 호출
		printItem( new int[] { 83, 90, 87 } );
		System.out.println("--------------ArrayCreateByNew----------");
		//--------------ArrayCreateByNew--------------------------
		
				//배열 변수 선언과 배열 생성
				//3개의 값을 가진 배열
				arr1 = new int[3];
				//배열 항목의 초기값 출력
				for(int i=0; i<3; i++) {
					System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
				}
				System.out.println();
				//배열 항목의 값 변경
				arr1[0] = 10;
				arr1[1] = 20;
				arr1[2] = 30;
				//배열 항목의 변경 값 출력
				for(int i=0; i<3; i++) {
					System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
				}
				System.out.println("\n");

				//배열 변수 선언과 배열 생성
				double[] arr4 = new double[3];
				//배열 항목의 초기값 출력
				for(int i=0; i<3; i++) {
					System.out.print("arr4[" + i + "] : " + arr4[i] + ", ");
				}
				System.out.println();
				//배열 항목의 값 변경
				arr4[0] = 0.1;
				arr4[1] = 0.2;
				arr4[2] = 0.3;
				//배열 항목의 변경 값 출력
				for(int i=0; i<3; i++) {
					System.out.print("arr4[" + i + "] : " + arr4[i] + ", ");
				}
				System.out.println("\n");

				//배열 변수 선언과 배열 생성
				String[] arr5 = new String[3];
				//배열 항목의 초기값 출력
				for(int i=0; i<3; i++) {
					System.out.print("arr5[" + i + "] : " + arr5[i] + ", ");
				}
				System.out.println();
				//배열 항목의 값 변경
				arr5[0] = "1월";
				arr5[1] = "2월";
				arr5[2] = "3월";
				//배열 항목의 변경값 출력
				for(int i=0; i<3; i++) {
					System.out.print("arr5[" + i + "] : " + arr5[i] + ", ");}
				
		
	}//메인메서드 끝
	//printItem()메서드 선언
	public static void printItem( int[] scores ) {
		//매개변수가 참조하는 배열의 항목을 출력
		for(int i=0; i<3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}

}//클래스 끝
