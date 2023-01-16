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
@RequestMapping("/page/management")
public class MainController {

	@Autowired
	private RestTemplateUtil restTemplateUtil;
	
	
	// 대리점 정산관리 페이지
	@RequestMapping("/monthTradeInfo")
	public String monthTradeInfo(ModelMap modelMap){
		
		//authkey가져오기
		String urlkey = "https://extchange.paysmart.co.kr/moa/web/user/login.do";
		
		Map<String, Object> mapkey = new HashMap<String, Object>();
		mapkey.put("storeSeq", "6058190742_20180118152345_0000000000001");
        mapkey.put("storeId", "6058190742");
        mapkey.put("memId", "tkdngs3736");
        mapkey.put("memPw", "tkdgns12");	
		
        ResponseVO responseVO1 = restTemplateUtil.requsetPost(urlkey, mapkey);
        
		String url = "https://extchange.paysmart.co.kr/moa/web/point/hold_bank_charge_list.do";
		
		Map<String, Object> map1 = new HashMap<String, Object>();
        
        map1.put("storeSeq", "6058190742_20180118152345_0000000000001");
        map1.put("authKey", responseVO1.getParams().get("authKey"));
        map1.put("cardNo", "8340-2680-0031-1118");
        
		//메소드 호출 실시
        ResponseVO responseVO = restTemplateUtil.requsetPost(url, map1);
        ArrayList<Map<String, String>> chargeRrequest = (ArrayList<Map<String, String>>)responseVO.getParams().get("results");
        System.out.println("resluts : "+chargeRrequest);
        modelMap.addAttribute("list", chargeRrequest);
        modelMap.addAttribute("hi","hohoho");
        System.out.println(chargeRrequest.size());
		return "management/monthTradeInfo";
	}
	
	// 회원별 거래정보 페이지
	@RequestMapping("/userTradeInfo")
	public String userTradeInfo() {

		return "management/userTradeInfo";
	}

	// 카드거래정보 페이지
	@RequestMapping("/cardTradeInfo")
	public String cardTradeInfo() {

		return "management/cardTradeInfo";
	}
	
	// 회원정보 페이지
	@RequestMapping("/userInfo")
	public String userInfo() {

		return "management/userInfo";
	}
}
