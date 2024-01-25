package ex02;

import java.util.Scanner;

/*
 *  메소드 : calculateEvenSum
 *  매개변수 : int 
 *  반환타입 : int
 *  기능 : 주어진 정수 N까지의 모든 짝수의 합을 꼐산하는 함수를 작성하세요
 */
public class Exam03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("n의 수를 정해주세요");
		int N = s.nextInt();
		
		int result = calculateEvenSum(N);
		System.out.println("1부터 N까지의 짝수의 합은" + result);
		
		/*
		 * int total = calculateEvenSum(100);
		 * System.out.println(total);
		 */
		
	}

	static int calculateEvenSum(int N) {
		
		/*
		 * int sum 0;
		 * 
		 * for(int i=0; i<=num; i++)
		 * if(i % 2 == 0 )
		 * sum += i;
		 * 
		 * return sum;
		 */
		
		
		int sum = 0;
		for(int i=2; i<=N; i+=2) {
			sum += i;
		}
		return sum;
	
	}

}
