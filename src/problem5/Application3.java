package problem5;

import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
//	자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다. 
//	예를 들면, 6과 28은 완전수이다. 
//	6=1+2+3 // 1,2,3은 각각 6의 약수 28=1+2+4+7+14 //
//			1,2,4,7,14는 각각 28의 약수
//			입력으로 자연수 N을 받고, 출력으로 N 이하의 모든 완전수를 출력하는 코드를 작성하라
//
		/* 접근법 */
		/*
		 * 1. 양의 정수를 입력받는다
		 * 2. for문을 통해 나누어서 나머지가 0인 수를 찾는다
		 * 3. 나머지가 0인수를 더한 값이 입력한 양의 정수와 동일하면 완전수 이다
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int num = sc.nextInt();
		int num2  = num;
		int sumNum = 0;
		
		for(int i = 1; i < num; i++) {
			if(num2 % num == 0 ) {
				sumNum += i;
			}
		}
		
		if(sumNum == num2) {
			System.out.println("완전수 이다");	
		}else {
			System.out.println("완전수가 아니다");
		}
		
	}
	

}
