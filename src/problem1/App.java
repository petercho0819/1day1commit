package problem1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//		직각삼각형의 밑변이 x, 높이가 y일 때 남은 변(대각선)의 길이를 구하는 함수를 만들어주세요.

		/*
		 * 대각선을 구하기 위해서는 피타고라스의 정리가 요구
		 * x^2 + y^2 = z^2
		 * x값을 입력 받는다
		 * y값을 입력 받는다
		 * x^2 + y^2 = z^2가 되는 경우의 z를 구한다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.println("높의의 길이를 입력하세요  : ");
		int y = sc.nextInt();
		int z;

		for(int i = 0; ; i++) {

			if(x*x + y*y == i*i) {
				System.out.println("대각선의 길이는 " + i);

				break;
			}
		}

	}

}
