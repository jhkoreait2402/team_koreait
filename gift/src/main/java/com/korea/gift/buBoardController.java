package com.korea.gift;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import service.BuBoardService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bu/board")
public class buBoardController {
	
	private final static String BU_BOARD_VIEW_PATH = "/WEB-INF/views/board";

	private final BuBoardService service;
	
	@RequestMapping("buQnaList")
	public String qnaList(Model model) {
		System.out.println("qnaList");
		
		model.addAttribute("qnaList", service.qnaList());
		
		return BU_BOARD_VIEW_PATH + "qnaList.jsp";
	}
	
}
