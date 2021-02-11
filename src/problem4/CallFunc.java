package problem4;

public class CallFunc {

	private boolean calling;
	private boolean power;

	public void callToFriend() {

		if(power) {

			if(calling) {
				System.out.println("친구와 통화를 합니다.");
			}else {
				calling = true;
				System.out.println("통화버튼이 눌려졌습니다. 친구와 통화를 할 수 있습니다.");
			}
		}else {
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");

		}
	}

}
