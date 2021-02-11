package problem3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
	    예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
		점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
		점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다
		
		입력
		첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
		출력
		점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		 */
		
		
		/*풀이법
		 * 1. x,y의 범위 안에서 받게 하며, 그 외의 경우 다시 입력할 수 있도록 한다.
		 * 2. x,y가 양수이면 1사분면, x음수,y양수는 2사분면, x음수 y음수 3사분면, x양수 y음수 4사분면
		 * 3. x,y가 0이면 다시 입력하도록 한다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("x를 입력하세요 : (-1000 ~ 1000, 0은 제외)");
			int x = sc.nextInt();
			System.out.println("y를 입력하세요 : (-1000 ~ 1000, 0은 제외)");
			int y = sc.nextInt();
			
			
			if((x>1000 || x < -1000) || (y>1000 || y < -1000)) {
				
				System.out.println("범위를 초과했습니다. 다시 입력하세요.");
				return;
			}else if( x == 0 || y == 0) {
				System.out.println("x또는 y가 0입니다. 손가락에 장애가 있어요. ");
				
				return;
			}if(!((x>1000 || x < -1000) || (y>1000 || y < -1000))) {
				
				if(x > 0 && y>0) {
					System.out.println("1사분면");
				}else if(x < 0 && y > 0) {
					System.out.println("2사분면");
					
				}else if(x < 0 && y < 0) {
					System.out.println("3사분면");
				}else if(x > 0 && y < 0) {
					System.out.println("4사분면");
				}
			}
			break;
		}
		
		
		
		
		
	}

}



























