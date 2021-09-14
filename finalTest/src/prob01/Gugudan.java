package prob01;

import java.util.*;

public class Gugudan {

	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers(); //정수 배열 생성
		int loc = randomize(0, 8); //0 ~ 8 까지의 숫자를 구해서 넣을 주소를 정해준다
		answerNumbers[loc] = resultNumber; //정수 배열[주소값] = 곱한 값

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
		
	}

	
	
	
	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		
		return random;
	}
	
	private static int[] randomizeAnswers(){
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		
		
		
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size() < 9) {
			
			int one = randomize(1, 9);
			int two = randomize(1, 9);
			
			int rst = one * two;
			
			if(resultNumber != rst) {
				set.add(rst);
			}
			
		}
		
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
		
	}
}
