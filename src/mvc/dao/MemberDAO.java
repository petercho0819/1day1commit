package mvc.dao;

import static com.greedy.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.greedy.member.model.dto.MemberDTO;

public class MemberDAO {

	private Properties prop = new Properties();

	public MemberDAO() {
		try {
			prop.loadFromXML(new FileInputStream("mapper/member-query.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	public  int lastNum(Connection con) {

		Statement stmt = null;
		ResultSet rset = null;

		int lastNum = 0;

		String query = prop.getProperty("lastNum");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			if(rset.next()) {
				lastNum = rset.getInt("CURRVAL");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}


		return lastNum;
	}

	public int registNewMember(Connection con, MemberDTO memberdto) {

		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("registNewMember");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, memberdto.getMemeberId());
			pstmt.setString(2, memberdto.getMemeberPwd());
			pstmt.setString(3, memberdto.getMemberName());
			pstmt.setString(4, memberdto.getGender());
			pstmt.setString(5, memberdto.getEmail());
			pstmt.setString(6, memberdto.getPhone());
			pstmt.setString(7, memberdto.getAddress());
			pstmt.setInt(8, memberdto.getAge());

			result = pstmt.executeUpdate();



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}



		return result;
	}

	public List<MemberDTO> selectAllMembers(Connection con) {

		Statement stmt = null;
		ResultSet rset = null;

		List<MemberDTO> memList = null;

		String query = prop.getProperty("selectAllMember");

		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);

			memList = new ArrayList<>();

			while(rset.next()) {
				MemberDTO mem = new MemberDTO();
				mem.setMemberNo(rset.getInt("MEMBER_NO"));
				mem.setMemeberId(rset.getString(2));
				mem.setMemeberPwd(rset.getString(3));
				mem.setMemberName(rset.getString(4));
				mem.setGender(rset.getString(5));
				mem.setEmail(rset.getString(6));
				mem.setPhone(rset.getString(7));
				mem.setAddress(rset.getString(8));
				mem.setAge(rset.getInt(9));
				mem.setDate(rset.getDate("ENROLL_DATE"));

				memList.add(mem);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}



		return memList;
	}

	public List<MemberDTO> searchMemberByGender(Connection con, String gender) {

		PreparedStatement pstmt =  null;
		ResultSet rset = null;

		List<MemberDTO> memList = null;

		String query = prop.getProperty("searchMembeByGender");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, gender);

			rset = pstmt.executeQuery();

			memList = new ArrayList<>();

			while(rset.next()) {
				MemberDTO mem = new MemberDTO();

				mem.setMemberNo(rset.getInt("MEMBER_NO"));
				mem.setMemeberId(rset.getString(2));
				mem.setMemeberPwd(rset.getString(3));
				mem.setMemberName(rset.getString(4));
				mem.setEmail(rset.getString("EMAIL"));
				mem.setPhone(rset.getString("PHONE"));
				mem.setAddress(rset.getString("ADDRESS"));
				mem.setGender(rset.getString("GENDER"));
				mem.setAge(rset.getInt("AGE"));
				mem.setDate(rset.getDate("ENROLL_DATE"));

				memList.add(mem);

			}


		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}


		return memList;
	}



	public int modifyPassword(Connection con, MemberDTO memDTO) {

		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("modifyPwdById");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(2, memDTO.getMemeberId());
			pstmt.setString(1, memDTO.getMemeberPwd());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result;
	}

	public int modifyEmail(Connection con, MemberDTO mem) {

		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("modifyEmailById");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(2, mem.getMemeberId());
			pstmt.setString(1, mem.getEmail());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result;


	}

	public int modifyPhone(Connection con, MemberDTO mem) {
		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("modifyPhoneById");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(2, mem.getMemeberId());
			pstmt.setString(1, mem.getPhone());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result;
	}

	public int modifyAddress(Connection con, MemberDTO mem) {
		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("modifyAddressById");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(2, mem.getMemeberId());
			pstmt.setString(1, mem.getAddress());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result;
	}

	public int deleteMember(Connection con, MemberDTO mem) {
		PreparedStatement pstmt = null;
		int result = 0;

		String query = prop.getProperty("deleteMember");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, mem.getMemeberId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result;
	}

	public MemberDTO searchMemberById(Connection con, String id) {

		PreparedStatement pstmt =  null;
		ResultSet rset = null;


		String query = prop.getProperty("searchMembeById");
		MemberDTO mem = new MemberDTO();

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);

			rset = pstmt.executeQuery();


			while(rset.next()) {

				mem.setMemberNo(rset.getInt("MEMBER_NO"));
				mem.setMemeberId(rset.getString(2));
				mem.setMemeberPwd(rset.getString(3));
				mem.setMemberName(rset.getString(4));
				mem.setEmail(rset.getString("EMAIL"));
				mem.setPhone(rset.getString("PHONE"));
				mem.setAddress(rset.getString("ADDRESS"));
				mem.setGender(rset.getString("GENDER"));
				mem.setAge(rset.getInt("AGE"));
				mem.setDate(rset.getDate("ENROLL_DATE"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}

		return mem;
	}

}

























