package com.pinple.store.controller.page;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pinple.store.common.vo.ResponseVO;
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
	
	// 비밀번호 찾기 변경
	@RequestMapping("/findPass")
	public String findPass() {
		
		return "franchisee/findPass";
		}
	// 비밀번호 찾기 변경
		@RequestMapping("/register")
		public String register() {

			return "franchisee/register";
		}
}
