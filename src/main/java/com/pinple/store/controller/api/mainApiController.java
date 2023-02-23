package com.pinple.store.controller.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pinple.store.controller.BaseFormController;
import com.pinple.store.common.vo.CurrentMember;
import com.pinple.store.common.vo.LoginMemberVO;
import com.pinple.store.common.vo.ResponseVO;
import com.pinple.store.service.LoginService;
import com.pinple.store.util.CommonUtil;
import com.pinple.store.util.HeaderUtil;
import com.pinple.store.util.RestTemplateUtil;

import org.springframework.ui.ModelMap;


/**
 * 로그인 API Controller Class
 *
 * @ClassName : LoginApiController.java
 * @Description :
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 8. 5. 조문정 - 최초 생성
 *
 * @author 조문정
 * @since  2021. 8. 5.
 *
 */
@RestController
@RequestMapping("/api/management")
public class mainApiController extends BaseFormController{
	
	
		@Autowired
		private RestTemplateUtil restTemplateUtil;
	// 대리점 정산관리 페이지
		@RequestMapping("/dayTradeInfo")
		public ResponseEntity<ArrayList<Map<String, Object>>> dayTradeInfo(@RequestParam Map<String, Object> params, ModelMap modelMap){
			
			
			CurrentMember currentMember = this.getCurrentMember();
			//authkey가져오기
			String urlkey = "https://extchange.paysmart.co.kr/moa/web/admin/store/trade/get_list_by_day.do";
			
			Map<String, Object> mapkey = new HashMap<String, Object>();
			mapkey.put("storeSeq", CommonUtil.createStoreSeq(currentMember.getStoreID()));
			mapkey.put("authKey", currentMember.getAuthKey());
			mapkey.put("userId", currentMember.getUserID());
/*			mapkey.put("sDate", params.get("sDate"));
			mapkey.put("eDate", params.get("eDate"));
	        mapkey.put("storeGb", currentMember.getStoreGB());
	        mapkey.put("seachType", params.get("seachType"));	*/
	        mapkey.put("sDate", "20230101");
			mapkey.put("eDate", "20230105");
	        mapkey.put("storeGb", "0124000000");
	        mapkey.put("seachType","0");	
			
	        ResponseVO responseVO = restTemplateUtil.requsetPost(urlkey, mapkey);
	        
	        ArrayList<Map<String, Object>> chargeRrequest =  (ArrayList<Map<String, Object>>) responseVO.getParams().get("results");
	       //
	        log.info(chargeRrequest.toString());
	        
	        return new ResponseEntity<ArrayList<Map<String, Object>>>( chargeRrequest, HeaderUtil.createCode(responseVO.getResultCode()), HttpStatus.OK);
		}


}
