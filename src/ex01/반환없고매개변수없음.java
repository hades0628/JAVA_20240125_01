package ex01;
/*
 * method : max
 * 매개변수 : 0
 * 반환 : void
 * 두 정수 중 최대값 반환 
 */

import java.util.Scanner;

public class 반환없고매개변수없음 {

	public static void main(String[] args) {
		System.out.println("최대값 출력");
		
		
		max(); //호출
		System.out.println("프로그램 종료");
		

	}
	
	static void max() {
		int num1 = 5;
		int num2 = 20;
		
		int max = num1> num2 ? num1 : num2;
		
		System.out.println("최대값 : " + max);
	}

}
