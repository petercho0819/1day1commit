package com.greedy.member.model.service;

import static com.greedy.common.JDBCTemplate.close;
import static com.greedy.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.greedy.member.model.dao.MemberDAO;
import com.greedy.member.model.dto.MemberDTO;

public class MemberService {
	
	private MemberDAO memberDAO = new MemberDAO();

	public  int lastNum() {
		
		Connection con = getConnection();
		
		int lastNum = memberDAO.lastNum(con);
		
		close(con);
		
		return lastNum;
	}

	public int registNewMember(MemberDTO memberdto) {
		
		System.out.println("connection에 왔나?");
		
		Connection con = getConnection();
		
		int registResult = memberDAO.registNewMember(con, memberdto);

		
		close(con);
		
		
		return registResult;
	}

	public List<MemberDTO> selectAllMembers() {

		Connection con = getConnection();
		
		List<MemberDTO> memList = memberDAO.selectAllMembers(con);
		
		close(con);
		return memList;
	}

	public List<MemberDTO> searchMemberByGender(String gender) {

		Connection con = getConnection();
		
		List<MemberDTO> memList = memberDAO.searchMemberByGender(con, gender);
		
		close(con);
		
		return memList;
	}



	public int modifyPassword(MemberDTO mem) {

		Connection con = getConnection();
		
		int result = memberDAO.modifyPassword(con, mem);
		
		close(con);
		
		return result;
	}

	public int modifyEmail(MemberDTO mem) {
		Connection con = getConnection();
		
		int result = memberDAO.modifyEmail(con, mem);
		
		close(con);
		
		return result;

	}

	public int modifyPhone(MemberDTO mem) {
		Connection con = getConnection();
		
		int result = memberDAO.modifyPhone(con, mem);
		
		close(con);
		
		return result;

	}

	public int modifyAddress(MemberDTO mem) {
		Connection con = getConnection();
		
		int result = memberDAO.modifyAddress(con, mem);
		
		close(con);
		
		return result;
	}

	public int deleteMember(MemberDTO mem) {
		Connection con = getConnection();
		
		int result = memberDAO.deleteMember(con, mem);
		
		close(con);
		
		return result;
	}

	public MemberDTO searchMemberById(String id) {
	

		Connection con = getConnection();
		
		MemberDTO memList = memberDAO.searchMemberById(con, id);
		
		close(con);
		
		return memList;
	}
	
	
}
