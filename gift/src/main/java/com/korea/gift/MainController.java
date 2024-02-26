package com.korea.gift;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.MainDAO;
import dto.CategoryDTO;
import dto.ItemDTO;
import lombok.RequiredArgsConstructor;
import util.Common;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private final MainDAO mainDAO;
	
	// 첫 화면 출력
	@GetMapping
	public String mainPage(Model model) {
		
		// 카테고리 정보
		List<CategoryDTO> cateInfo = mainDAO.categoryInfo();
		
		// 전체 상품 수
		int itemCount = mainDAO.itemCountAll();
		
		// 전체 카테고리 상품 리스트
		List<ItemDTO> itemList = mainDAO.itemListAll();
		
		model.addAttribute("cateInfo", cateInfo);
		model.addAttribute("itemCount", itemCount);
		model.addAttribute("itemList", itemList);
		
		return Common.Main.VIEW_PATH + "main.jsp";
	}
	
	@GetMapping("/list_ajax/{category_no}")
	public String listAjax() {
		
		// category_no가 null이면 전체 리스트 출력
		
		return null;
	}
}
