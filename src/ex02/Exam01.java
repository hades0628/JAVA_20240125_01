package ex02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 매서드명 : abs
		// 반환타입 : int
		// 매개변수 : int
		// 기능 : 주어진 값의 절대값을 반환한다.
		
		int num = abs(-1);
		
		System.out.println("절대값은 " + num);
		

	}
	static int abs(int n1) {
		//return n1 > 0 ? n1 : -n1;
		return Math.abs(n1);
	}

}
