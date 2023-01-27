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
@RequestMapping("/page/casino")
public class casinoController {

	@Autowired
	private RestTemplateUtil restTemplateUtil;
	
	// 정산 & 거래내역
	@RequestMapping("/tradeInfo")
	public String tradeInfo() {

		return "casino/tradeInfo";
	}
	
	//포인트 변경
	@RequestMapping("/changePoint")
	public String changePoint(){
		
		return "casino/changePoint";
	}
	
	// 환율등록
	@RequestMapping("/exchangeRate")
	public String exchangeRate() {

		return "casino/exchangeRate";
	}

	
}