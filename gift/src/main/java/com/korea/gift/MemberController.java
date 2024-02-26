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

	
	MemberDAO memberDAO;

	//�럹�씠吏� �씠�룞
	@RequestMapping(value="member", method = RequestMethod.GET)
	public String member() {
		return Common.Member.VIEW_PATH + "login.jsp";
	}
	

	/*
	 * @RequestMapping public String login(MemberDTO dto){ 
	 * return
	 * memberDAO.login(memberDAO); }
	 */


	
	
	
	
}
