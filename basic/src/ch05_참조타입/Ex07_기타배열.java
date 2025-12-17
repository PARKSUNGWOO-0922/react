package ch05_참조타입;

public class Ex07_기타배열 {

	public static void main(String[] args) {
		System.out.println("-------------ArrayReferenceObject--------");
		//-----------------ArrayReferenceObject----------------
		//자바 배열은 객체를 직접 저장하지 않고 객체의 참조값을 연속된 공간에 저장한다
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println( strArray[0] == strArray[1] );		//true: 같은 객체 참조
		System.out.println( strArray[0] == strArray[2] );    	//false: 다른 객체를 참조
		System.out.println( strArray[0].equals(strArray[2]) );	//true: 문자열이 동일
		/**
		 * 배열 복사
		 * 1.반복문으로 배열 복사
		 * 2.System.arraycopy(원본배열,원본배열시작인텍스,새배열,새배열시작인덱스,복사할길이)
		 * 
		 */
		System.out.println("-------------ArrayCopy--------");
		//-----------------ArrayArrayCopy----------------
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		//배열 항목 복사
		//System.arraycopy( oldStrArray, 0번째부터, newStrArray, 0번째부터, oldStrArray.length 몇개복사);
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println("");
		System.out.println("-------------ArrayCopyByFor--------");
		//-----------------ArrayCopyByFor----------------
		//길이 3인 배열 
		int[] oldIntArray = { 1, 2, 3 };
		//길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		//배열 항목 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열 항목 출력
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("-------------AdvancedFor--------");
		//-----------------AdvancedFor----------------
		//배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		//배열 항목 전체 합 구하기
		int sum = 0; 
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
		System.out.println("");
		System.out.println("---MainStringArrayArgment------------------");
		//-----------MainStringArrayArgment----------------------
		//Run > Run Configurations...
		//->project와 Main class확인후
		//->Program arguments 에 값을 입력한후 Run ->결과출력
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];
			
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		System.out.println("");
		System.out.println("---------------------");
		//---------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
