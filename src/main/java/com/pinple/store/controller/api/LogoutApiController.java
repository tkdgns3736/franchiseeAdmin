package com.pinple.store.controller.api;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pinple.store.common.vo.LoginMemberVO;
import com.pinple.store.common.vo.ResponseVO;
import com.pinple.store.controller.BaseFormController;
import com.pinple.store.service.LoginService;
import com.pinple.store.util.HeaderUtil;



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
@RequestMapping("/api/logout")
public class LogoutApiController extends BaseFormController {

	private static final Logger log = LoggerFactory.getLogger(LogoutApiController.class);


	
	@RequestMapping(value = "/request", method = RequestMethod.POST)
	public ResponseEntity<Void> requestLogin() {
						
			log.info("============================== Logout Success Log ==============================");
		
			this.logout();
			return new ResponseEntity<Void>(HeaderUtil.createCode("0000"), HttpStatus.OK);
		

	
	}

}
