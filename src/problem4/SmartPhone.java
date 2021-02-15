package problem4;

import java.util.Scanner;

public class SmartPhone extends Cellphone{

	public SmartPhone() {
		super();	

	}

	boolean isOn;
	boolean call;
	boolean text;
	@Override
	public void powerOn() {

		if(this.isOn) {
			System.out.println("스마트폰의 전원이 켜져있습니다.");
		}else {
			this.isOn = true;
			System.out.println("스마트폰의 전원을 켰습니다.");
		}

	}

	@Override
	public void callbutton() {

		if(this.isOn) {
			if(this.call) {
				System.out.println("친구와 통화를 합니다.(화상전화)");
			}else {
				call = true;
				System.out.println("통화버튼이 눌려졌습니다. 친구와 화상통화를 할 수 있습니다.");
			}

		}else {
			System.out.println("스마트폰의 전원이 꺼져있습니다. 전원을 켜주세요.");

		}

	}
	
	@Override
	public void textButton() {
//		textFunc.textToFriend();
		if(this.isOn) {

			if(this.text) {
				System.out.println("친구와 화상문자를 합니다.");
			}else {
				text = true;
				System.out.println("통화버튼이 눌려졌습니다. 친구와 통화를 할 수 있습니다.");
			}
			
		}else {
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");

		}
		
	}
	
	@Override
	public void powerOff() {
		if(isOn) {
			System.out.println("스마트폰을 강제로 종료합니다.");
			isOn = false;
		}else {
			System.out.println("핸드폰이 이미 꺼져있습니다. 사용하시려면 켜주세요");
		}
		
	}

	public void internet() {
		// TODO Auto-generated method stub
		
	}

	public void mobileBuy() {
		// TODO Auto-generated method stub
		
	}


}
