package mvc;

import com.greedy.member.views.MemberMenu;

public class Application {

	private MemberMenu memberMenu = new MemberMenu();
	
	public static void main(String[] args) {
		
		
		new MemberMenu().displayMenu();
		
		System.out.println("회원관리 프로그램을 종료합니다.");

	}

}
