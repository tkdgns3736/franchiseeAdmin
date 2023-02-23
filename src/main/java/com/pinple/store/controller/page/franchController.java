package com.pinple.store.controller.page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pinple.store.util.RestTemplateUtil;

@Controller
@RequestMapping("/page/franch")
public class franchController {

	@Autowired
	private RestTemplateUtil restTemplateUtil;
	
	// 마이 페이지
	@RequestMapping("/franchiseeInfo")
	public String franchiseeInfo(ModelMap modelMap){
		
		return "franchisee/franchiseeInfo";
	}
	
	// 가맹점패스워드 변경
	@RequestMapping("/changePass")
	public String changePass() {

		return "franchisee/changePass";
	}

	// 가맹점 정보 변경
	@RequestMapping("/changeFranchInfo")
	public String changeFranchInfo() {

		return "franchisee/changeFranchInfo";
	}
}
