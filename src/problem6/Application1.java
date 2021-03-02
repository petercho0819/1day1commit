package problem6;

import java.util.Scanner;

public class Application1 {
	public static void main(String[] args) {

		/*어떤 정수 n에서 시작해, n이 짝수면 2로 나누고, 
		홀수면 3을 곱한 다음 1을 더한다. 
		이렇게 해서 새로 만들어진 숫자를 n으로 놓고,
		n=1 이 될때까지 같은 작업을 계속 반복한다. 
		예를 들어, n=22이면 다음과 같은 수열이 만들어진다. */
		/* 접근법 */
		/*
		 * 1. Scanner를 통해 숫자를 받는다 (두 개)
		 * 2. for문으로 a,b의 값까지 돌린다
		 * 3. 짝수면 2로 나누고, 홀수면 3을 곱하고 1을 더한다.
		 * 4. count(사이클 길)을 카운트하며
		 * 5. 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int b = sc.nextInt();
		
		int a2 = 0;
		int count = 0;
		int max = 0;
		int i = 0;
		for(; a <= b; a ++) {// a부터 b까지의 수를 돌림

			a2 = a; // a를 a2변수에 담음
			for(count = 1,a2 = a; a2>1; count++) {
				// 사이클을 1부터 돌리면서 a2가 1이 될때까지 돌림

				if(a2 % 2 == 0)	{
					a2 /=2;

				}else{
					a2 = a2*3 + 1;
				}

			}
//			System.out.println("count " + count);
			if(max < count) { //for문을 빠져나오면서 count값을 쓴다
								// 여러개의 값이 나오는데 if문을 안쓰면 마지막이 출력됨!
				max = count;

			}
		}
		System.out.println(max);
	}

}
