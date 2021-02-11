package problem2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		영일(01)이는 n개의 계단을 오르려고 한다.
//
//		영일이는 다리가 짧아 계단을 오를 때 한 번에 1계단 또는 2계단만 오를 수 있다.
//
//		영일이가 n번째 계단에 도달할 수 있는 방법의 수를 구하시오.
//
//		예를 들어 n=3인 경우, 1−1−1 , 1−2 , 2−1 , 이렇게 3가지 방법이 있다.
		
		
		/*
		 * 풀이
		 * 1계단의 경우 1
		 * 2계단의 경우 1-1, 2
		 * 3계단의 경우 1-1-1, 1-2, 2-1
		 * 4계단의 경우 1-1-1-1, 1-2-1, 1-1-2, 2-2, 2-1-1
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("n개의 계단을 입력하세요 : ");
		int n = sc.nextInt();
//		
//		int x = 0;
//		int y = 0;
//		for( x; x < n; x ++) {
//			
//			if((x*1) + (y*2) == n) {
//				System.out.println(x);
//				System.out.println(y);
//			}
//		}
		
		}
		

}
