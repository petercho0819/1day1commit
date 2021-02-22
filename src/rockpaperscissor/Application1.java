package rockpaperscissor;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		// 가위바위보 게임을 만들어보자
		/*
		 * 요구조건
		 * 1. 코인을 넣어 게임 수를 센다. (최대 10번)
		 * 2. 사용자는 1~3을 선택하여 가위, 바위, 보를 선택한다.
		 * 3. 컴퓨터는 난수를 통해 1~3을 뽑고 각각 가위, 바위, 보에 해당하도록한다.
		 * 4. 사용자와 컴퓨터를 서로 비교한다.
		 * 5. 사용자와 컴퓨터가 서로 이겼는지, 졋는지, 비겼는지를 매판 보여준다.
		 * 6. 코인을 넣은 만큼 게임을 진행한다. (모두 끝나면 프로그램은 종료된다.)
		 * 7. 게임결과에는 이긴판, 진판, 비긴판 및 승률을 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		int coin = 0;	// 넣은 코인의 개수
		String com = "";
		String user = "";

		int win = 0;
		int lose = 0;
		int draw = 0;
		int fail = 0;

		System.out.println("==== 컴퓨터와 가위바위보 게임 하기 (승률포함)======");
		System.out.print("코인을 넣으세요~ (최대 10개) : ");
		coin = sc.nextInt(); // 게임 개수 입력

		if(coin > 10) {
			System.out.println("최대 게임의 수를 넘었습니다. 다시 입력하세요.");
			return;
		}

		for(int i = 0; i < coin; i++) {

			int userNum = 0;	// 유저가 선택한 수 초기화
			System.out.println("가위(1번), 바위(2번), 보(3번) 중 선택하세요");
			userNum = sc.nextInt();



			if(userNum == 1) {
				user = "가위";
			}else if(userNum == 2 ) {
				user = "바위";
			}else if(userNum  == 3) {
				user = "보";

			}else {
				System.out.println("손가락에 에러가 있습니다.");
			}

			int comNum = (int) (Math.random() * 3) + 1;

			if(comNum == 1) {
				com = "가위";
			}else if(comNum == 2 ) {
				com = "바위";
			}else if(comNum  == 3) {
				com = "보";

			}else {
				System.out.println("시스템에 에러가 있습니다.");
			}
			if(userNum >= 1 && userNum <=3) {
				if((comNum == 1 && userNum == 2) || (comNum ==)) {
					
				}
					
				elseif(){
					
				}
				
				
			}
			
			
			
			System.out.println("당신은 " + user + " vs " + "컴퓨터는 " +  com);
			
			

		}



		System.out.println("게임 횟수는 : " + coin);
		System.out.println("[전적] 이긴 횟수 : " + win + "번");


	}

}












