package problem5;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		// 구글 입사문제
//		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
//		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
		
		/* 접근 방법 */
		/* 1 ~ 10,000으로 제한
		 * 1부터 10000까지 for문을 돌린다
		 *  
		 * 방법 1.
		 * 10으로 나눠서 나머지가 8이면 
		 * 
		 * 
		 * 방법2.
		 * 1 ~10000까지 for문으로 돌린다
		 * String 값으로 받는다
		 * String을 하나씩 뜯어서 8이 있으면 카운트를 한다.
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		String sNum = "";
		for(int i = 1; i <= num; i++ ) {
			 sNum = String.valueOf(i);	// 입력받은 숫자를 문자열로 전환		
			for(int j = 0; j < sNum.length() ; j++) {
			
				if(sNum.charAt(j) == '8') {	// 입력받은 문자열을 하나씩 쪼개서 8이 있으면 카운트
					
					count++;
				}
//				System.out.println("j" + j);
			
			}
//			
		}
		
		System.out.println("result " + count);
		
	}

}

























