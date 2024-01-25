package ex01;

import java.util.Scanner;

public class Sample02 {

/*	
	매서드 : change
	매개변수 : int
	반환타입 : int[]
	기능 : change함수 정수값은 전달하면, 그 정수 수 만큼 배열을 생성해서 전달
	배열안에는 1~10까지 난수 입력
*/	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("개수를 입력해주세요 : ");
		int a = s.nextInt();
		
		int[] arr = change(a);
		for(int num : arr) {
			System.out.print(num + " ");
			
		}
		
//		int[] numArr = change(10);
//		for(int i=0; i<numArr.length; i++) {
//			System.out.println(numArr[i] + " ");
//		}
	}
	
	static int[] change(int size){
		if(size <=0) {
			return null;
		}
		int[] newArr = new int[size];
		for(int i=0; i <size; i++) {
			newArr[i] = (int)(Math.random()*10)+1;
		}
		return newArr;
		
//		int[] arrNum = new int[num];
//		
//		for(int i =0; i<arrNum.length; i++) {
//			arrNum[i] = (int)(Math.random()*10)+1;
//		}
//		return arrNum;
	}
}
