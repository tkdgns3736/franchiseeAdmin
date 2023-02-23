package com.pinple.store.controller.page;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pinple.store.common.vo.ResponseVO;
import com.pinple.store.util.RestTemplateUtil;

@Controller
@RequestMapping("/page/management")
public class mainController {

	@Autowired
	private RestTemplateUtil restTemplateUtil;
	
	
	// 대리점 정산관리 페이지
	@RequestMapping("/monthTradeInfo")
	public String monthTradeInfo(){
		
		return "management/monthTradeInfo";
	}
	
	// 회원별 거래정보 페이지
	@RequestMapping("/userTradeInfo")
	public String userTradeInfo() {

		return "management/userTradeInfo";
	}

	// 카드거래정보 페이지
	@RequestMapping("/codeCreate")
	public String codeCreate() {

		return "management/codeCreate";
	}
	
	// 회원정보 페이지
	@RequestMapping("/userInfo")
	public String userInfo() {

		return "management/userInfo";
	}
}
