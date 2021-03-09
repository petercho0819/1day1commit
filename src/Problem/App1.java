package Problem;

public class App1 {

	public static void main(String[] args) {
//		10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//
//		1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		
		
		/* 접근 법 */
		/*
		 * 1. 범위 변수를 100으로 잡는다
		 * 2. for문을 돌려서 3의 배수와 5의 배수를 각각 구한다 (나눠서 0이 되는 숫자)
		 * 3. 두 개를 각각 +=연산자로 더해서 두 합을 더한다 
		 *
		 */
		
		int limitNum  = 100;
		int sum = 0;
		
		
		for(int i = 0; i < limitNum; i ++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("100 미만의 자연수 에서 3, 5의 배수의 총합 : " + sum);
	}

}
