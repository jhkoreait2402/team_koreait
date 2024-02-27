package com.korea.gift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.MemberDAO;
import dto.MemberDTO;
import lombok.RequiredArgsConstructor;
//import service.MemberService;
import util.Common;

@RequiredArgsConstructor
@Controller
public class MemberController {

	
	final MemberDAO memberDAO;

	//로그인 페이지 이동
	@RequestMapping(value="memberlogin", method = RequestMethod.GET)
	public String member() {
		return Common.Member.VIEW_PATH + "login.jsp";
	}
	
	@RequestMapping(value="memberlogin", method = RequestMethod.POST)
	public String login(String id, String pwd) {
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pwd);
		
		MemberDTO dto = memberDAO.login(id);
		String id2 = dto.getBu_id();
		System.out.println(id2);
		
		if(dto == null) {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
		
		
//		String pwd2 = dto.getBu_pwd();
//		
//
//		if(pwd2 == null) {
//			return "비밀번호가 일치하지 않습니다";
//		}
//		
//		System.out.println(id2);
//		System.out.println(pwd2);
//		
//		
//		System.out.println("일치");
		return null;
	}
//	public String 
	

	/*
	 * @RequestMapping public String login(MemberDTO dto){ 
	 * return
	 * memberDAO.login(memberDAO); }
	 */
	

	
	


	
	
	
	
}
