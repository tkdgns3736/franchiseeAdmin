package com.pinple.store.controller.page;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pinple.store.util.RestTemplateUtil;

@Controller
@RequestMapping("/page/term")
public class termController {

	@Autowired
	private RestTemplateUtil restTemplateUtil;
	
	// 개인정보정책 페이지
	@RequestMapping("/privacy")
	public String privacy(ModelMap modelMap){
		
		return "term/privacy";
	}
	
	// 이용약관 페이지
	@RequestMapping("/use")
	public String use() {

		return "term/use";
	}

}
