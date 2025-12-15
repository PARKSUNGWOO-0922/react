package ch04_제어문;

public class Ex05_구구단 {

	public static void main(String[] args) {
		System.out.println("------구구단(중첩for문)---------------");
		
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
		System.out.println("\n");

	}

}
