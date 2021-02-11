package problem4;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		/* 핸드폰과 스마트폰을 만들어 보자 */
		/* 객체 및 상속을 적용하자. */
		/*
		 * 핸드폰 속성
		 * 1. 화면 온.오프
		 * 2. 전화 기능
		 * 3. 문자 기능
		 * 
		 * 스마트폰
		 * 1. 인터넷 사용
		 * 2. 모바일 거래 사용
		 */
		User user = new User();	// 왜 여기다가 선언을 해야 하는가
		Scanner sc = new Scanner(System.in);
		SmartPhone smartphone = new SmartPhone();
		while(true) {
		System.out.println("나의 핸드폰 사용!!");
		System.out.println("1. 전원 버튼 ");
		System.out.println("2. 전화 버튼");
		System.out.println("3. 문자 버튼");
		System.out.println("4. 스마트폰 업그레이드!!");
		System.out.println("5. 전원 종료");
		System.out.println("9. 종료");
	
		
		int no = sc.nextInt();
		
		switch(no) {
		case 1: 
			user.powerOn();
			break;
		case 2:
			user.Callbutton();
			break;
		case 3:
			user.textButton();
			break;
		case 4:
			
			break;
		case 5:
			user.powerOff();
			break;
		case 9:
			
			System.out.println("핸드폰을 종료합니다.");
			return; 
		default : 
			System.out.println("잘못된 번호를 선택하셨습니다.");
			break;
		
		}
		
		
		
		
		
		}
	}
}

















