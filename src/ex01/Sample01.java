package ex01;

public class Sample01 {

	public static void main(String[] args) {
		System.out.println("Hello~~");
		
		int num = max(100, 20);//정수 호출
		int num1 = min(100, 20);
		System.out.println("최대값 : " + num);
		System.out.println("최소값 : " + num1);

	}
	
	//매개변수 정수형 2개를 입력받아서 정수값을 반환
	static int max(int n1, int n2) {
		System.out.println("난 함수 ~");
		return n1>n2 ? n1 : n2; //최대값 반환
	}
	static int min(int n1, int n2) {
		System.out.println("난 함수 ~");
		return n1<n2 ? n1 : n2; //최솟값 반환
	}

}
