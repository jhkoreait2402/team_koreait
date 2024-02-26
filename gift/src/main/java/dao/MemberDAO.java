package dao;

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
	
	
	public String login(MemberDTO dto) {
		
		return sqlSession.selectOne("m.loginCheck",dto);
	}
	
	
}
