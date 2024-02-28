package com.korea.gift;

import java.util.HashMap;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	MemberDTO memberDTO;
	HttpServletRequest request;
	HttpSession session;

	//로그인 페이지 이동
	@RequestMapping(value="mlogin", method = RequestMethod.GET)
	public String member() {
		return Common.Member.VIEW_PATH + "login.jsp";
	}
	
	@RequestMapping(value="mloginconf", method = RequestMethod.POST)
	public String login(String id, String pwd) {
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pwd);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id",id);
		map.put("pwd", pwd);
		
		MemberDTO dto = memberDAO.login(map);
		
		if(dto == null) {
			System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
			return "[{'data':'no_data'}]";
		}else {
			System.out.println("로그인 준비함");
		}

		int m_idx = dto.getM_idx();
		
		//HttpSession session = request.getSession();
		//session.setAttribute("m_idx", m_idx);
		//session.setAttribute("name", dto.getBu_name());
		
		//세션 타이밍 설정
		//session.setMaxInactiveInterval(180000); // 180,000sec
		
		System.out.println("세션 설정함");
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
		return Common.Member.VIEW_PATH+"testpage.jsp";
	}
//	public String 
	

	/*
	 * @RequestMapping public String login(MemberDTO dto){ 
	 * return
	 * memberDAO.login(memberDAO); }
	 */
	
	
	
	
	
	
	@RequestMapping(value="mjoin", method = RequestMethod.GET)
	public String join() {
		return Common.Member.VIEW_PATH + "member_join.jsp";
	}
	
	
	@RequestMapping("mjoininsert")
	public void memberinsert(String id, String pwd, String name, String addr, String email, String phone){
		
		memberDTO.setBu_id(id);
		memberDTO.setBu_pwd(pwd);
		memberDTO.setBu_name(name);
		memberDTO.setBu_adress(addr);
		memberDTO.setBu_email(email);
		memberDTO.setBu_phone(phone);
		System.out.println(id);
		
		
		memberDAO.insert(memberDTO);
	}
	

	
	


	
	
	
	
}
