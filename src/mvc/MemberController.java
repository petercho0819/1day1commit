package com.greedy.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.greedy.member.model.dto.MemberDTO;
import com.greedy.member.model.service.MemberService;
import com.greedy.member.views.MemberResultView;

public class MemberController {
	
	/* MemberResultView 클래스에 작성한 display 메소드로 출력할 것
	 * display 메소드로 출력할 필요 없는 내용은 간단히 콘솔에 직접 출력
	 * dml 수행 결과는 MemberResultView의 displayDmlResult()를 이용할 것
	 * */
	
	private MemberResultView memberResultView = new MemberResultView();
	private MemberService memberService = new MemberService();

	/* 신규 회원 등록용 메소드 */
	public void registNewMember(Map<String, String> requestMap) {
		
		/* Map으로 전달 된 데이터를 꺼내 MemberDTO에 담아 Service로 전달 */
		
		String memId = requestMap.get("아이디");
		String memPwd = requestMap.get("비밀번호");
		String name = requestMap.get("이름");
		String gender = requestMap.get("성별");
		String email = requestMap.get("이메일");
		String phone = requestMap.get("전화번호");
		String address = requestMap.get("주소");
		String age = requestMap.get("나이");
		
		MemberDTO memberdto = new MemberDTO();
		
		memberdto.setMemeberId(memId);
		memberdto.setMemeberPwd(memPwd);
		memberdto.setMemberName(name);
		memberdto.setAddress(address);
		memberdto.setAge(Integer.parseInt(age));
		memberdto.setEmail(email);
		memberdto.setGender(gender);
		memberdto.setPhone(phone);
	
		int result = memberService.registNewMember(memberdto);
		
//		if(result > 0) {
//			String isInsert = "insertSuccess";
//			memberResultView.displayDmlResult(isInsert);
//		}else {
//			String isInsert = "insertFailed";
//			memberResultView.displayDmlResult(isInsert);
//		}
	}
	
	/* 모든 회원 정보 조회용 메소드(List로 조회할 것) */
	public void selectAllMembers() {
		
		List<MemberDTO> memList = memberService.selectAllMembers();
		
		for(MemberDTO ml : memList) {
			System.out.println(ml);
		}
		
	
		
	}
	
	/* 아이디를 이용한 회원 정보 검색(MemberDTO로 한 명 회원 정보 조회) */
	public void searchMemberById(String id) {
		
		MemberDTO memberdto = memberService.searchMemberById(id);
	
		System.out.println(memberdto);
	
		

	}
	
	/* 성별을 이용한 회원 정보 검색 (List로 조회할 것)*/
	public void searchMemberByGender(String gender) {
		
		List<MemberDTO> memList = memberService.searchMemberByGender(gender);
		for(MemberDTO mem : memList) {
			System.out.println(mem);
		}
		
	}
	
	/* 입력받은 아이디와 일치하는 회원의 비밀번호 변경 */
	public void modifyPassword(String memberId, String password) {
		
		int idCode = 0;
		int result = 0;
		
//		System.out.println("바꿀 비밀번호 : " + password);
		List<MemberDTO> memList = memberService.selectAllMembers();
		MemberDTO mem = new MemberDTO();
//		System.out.println("수정전 회원 조회" + memList);
		
		for(int i = 0; i <memList.size(); i ++ ) {
//			System.out.println("들어왓니?");
			mem = memList.get(i);
			if(mem.getMemeberId().equals(memberId)) {
				mem.setMemeberPwd(password);
//				System.out.println("바꿀 회원정보" + mem);
				break;
			}
		}
//		System.out.println(mem);
		result = memberService.modifyPassword(mem);
		
//		System.out.println("변경된 비밀번호 : " + mem.getMemeberPwd());
		
		if(result > 0) {
			memberResultView.displayDmlResult("updateSuccess");
		}else {
			memberResultView.displayDmlResult("updateFailed");
		}
		
	}
	
	/* 입력받은 아이디와 일치하는 회원의 이메일 변경 */
	public void modifyEmail(String memberId, String email) {
		
		int result = 0;
		
		List<MemberDTO> memList = memberService.selectAllMembers();
		MemberDTO mem = new MemberDTO();
		
		for(int i = 0; i <memList.size(); i ++ ) {
			mem = memList.get(i);
			if(mem.getMemeberId().equals(memberId)) {
				mem.setEmail(email);
				break;
			}
		}
		result = memberService.modifyEmail(mem);
		
		
		if(result > 0) {
			memberResultView.displayDmlResult("updateSuccess");
		}else {
			memberResultView.displayDmlResult("updateFailed");
		}	
		
	}
	
	/* 입력받은 아이디와 일치하는 회원의 전화번호 변경 */
	public void modifyPhone(String memberId, String phone) {
		
		int result = 0;
		
		List<MemberDTO> memList = memberService.selectAllMembers();
		MemberDTO mem = new MemberDTO();
		
		for(int i = 0; i <memList.size(); i ++ ) {
			mem = memList.get(i);
			if(mem.getMemeberId().equals(memberId)) {
				mem.setPhone(phone);
				break;
			}
		}
		result = memberService.modifyPhone(mem);
		
		
		if(result > 0) {
			memberResultView.displayDmlResult("updateSuccess");
		}else {
			memberResultView.displayDmlResult("updateFailed");
		}	
		
	}
	
	/* 입력받은 아이디와 일치하는 회원의 주소 변경 */
	public void modifyAddress(String memberId, String address) {
		
		int result = 0;
		
		List<MemberDTO> memList = memberService.selectAllMembers();
		MemberDTO mem = new MemberDTO();
		
		for(int i = 0; i <memList.size(); i ++ ) {
			mem = memList.get(i);
			if(mem.getMemeberId().equals(memberId)) {
				mem.setAddress(address);
				break;
			}
		}
		result = memberService.modifyAddress(mem);
		
		
		if(result > 0) {
			memberResultView.displayDmlResult("updateSuccess");
		}else {
			memberResultView.displayDmlResult("updateFailed");
		}	
		
	}
	
	/* 회원 정보 삭제용 메소드 */
	public void deleteMember(String memberId) {
		
		int result = 0;
		
		List<MemberDTO> memList = memberService.selectAllMembers();
		MemberDTO mem = new MemberDTO();	
		
		for(int i = 0; i <memList.size(); i ++ ) {
			mem = memList.get(i);
			if(mem.getMemeberId().equals(memberId)) {
				break;
			}
		}
		result = memberService.deleteMember(mem);
		
		
		if(result > 0) {
			memberResultView.displayDmlResult("deleteSuccess");
		}else {
			memberResultView.displayDmlResult("deleteFailed");
		}	
		
	}

}
