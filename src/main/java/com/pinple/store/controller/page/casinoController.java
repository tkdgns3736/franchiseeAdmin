package com.pinple.store.controller.page;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pinple.store.common.vo.CurrentMember;
import com.pinple.store.controller.BaseFormController;
import com.pinple.store.util.RestTemplateUtil;

@Controller
@RequestMapping("/page/casino")
public class casinoController extends BaseFormController {

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
		
		
		//CurrentMember currentMember = this.getCurrentMember();
		System.out.println(getCurrentMember());

		return "casino/exchangeRate";
	}

	
}