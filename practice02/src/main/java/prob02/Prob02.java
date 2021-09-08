package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;
		
		System.out.println("숫자 입력");
		
		for(int i = 0; i < intArray.length; i++) {
			
			/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
			intArray[i] = scanner.nextInt();
			
			/* 배열에 저장된 정수 값 더하기 */
			sum += intArray[i];
			
		}
		
		/* 출력 */
		System.out.println(sum / intArray.length);
		
		/* 자원정리 */
		scanner.close();
	}
}
