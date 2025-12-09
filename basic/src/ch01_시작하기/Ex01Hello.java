package ch01_시작하기;
/*
 * package 패키지명;
 * 1.소문자로 기록
 * 2.숫자로 시작
 * 3.특수문자는 .과 _
 * 4. 예약어(키워드) 사용x -public, class,package,...
 */  
 /** 문서주석(alt+shit+j)
 * @author 작성자명
 * 기능:Hello
 * 작성일:2025-12-09
 */
/*
 * 접근제한자 class 클래스명 {코드}
 * 1.파스칼 표기법(관례)-당어별 첫 글자를 대문자
 * 2._,$,숫자
 * 3. 예약어(키워드) 사용x -public, class,package,...
 */
public class Ex01Hello {
	/*
	 * 여러줄 주석(영역을블럭선택하고 ctrl+shift+/
	 */

	public static void main(String[] args) {
				//ctrl+/:주석
				//ctrl+n :새파일
				//ctrl+shift+l:단축키 목록
				//ctrl+ +/-:코드뷰의 글자 크기를 확대/축소
				//f2 또는 alt+shift+r: 이름 바꾸기
				//alt+위/아래방향키: 선택한 영역 줄단위 위치이동
				//ctrl+alt+위/아래방향키: 선택한 영역 줄단위 복제
				//ctrl+m:코드 편집창 최대화/원래대로	
				//ctrl+d:선택한 영역(줄단위)삭제
				//1.sysout을 쓴후 바로 ctrl+space:자동완성	
				//ctrl+f11:실행
				//ctrl+i:선택한영역 정렬, ctrl+shift+f:선택안해도 자동 정렬
				//alt+shift+y:줄바꿈(토글)
				//car 문자: 문자 1자 -> 예 'A','a', '가'
				//String "문자열
				//책체.메서드(인자)
				//print()-줄 바꿈x
				//println() - 줄 바꿈o
		System.out.print("Hi,Java!");
		System.out.println("Hi,Java!");
		System.out.print("Hi,Java!");

	}

}
