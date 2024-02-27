package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.MemberDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberDAO {
	
	final SqlSession sqlSession;
//	public MemberDAO(SqlSession sqlSession) {
//		
//		this.sqlSession = sqlSession;
//	}
	
	
	public MemberDTO login(HashMap<String, String> map) {
		
		System.out.println("아이디dao : " +map.get("id"));
		System.out.println("비밀번호dao : " +map.get("pwd"));
		

		MemberDTO dto = sqlSession.selectOne("m.memberlogin",map);
		System.out.println(dto.getM_idx());
		System.out.println(dto.getBu_name());
		//return null;
		return dto;
	}


	public MemberDTO insert(MemberDTO memberDTO) {
		
		//sqlSession.insert(memberDTO)
		
		return null;
	}


	
	
}
