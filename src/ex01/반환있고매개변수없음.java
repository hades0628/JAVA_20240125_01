package ex01;
/*
 * method : max
 * 매개변수 : 0
 * 반환 : int
 * 두 정수 중 최대값 반환 
 */

import java.util.Scanner;

public class 반환있고매개변수없음 {

	public static void main(String[] args) {
		System.out.println("숫자 두개를 입력해주세요.");
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = s.nextInt();
		
		int result = max();
		System.out.println("최대값 : " + result);
		System.out.println("프로그램 종료");

	}
	
	static int max() {
		int num1 = 5;
		int num2 = 20;
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

}
