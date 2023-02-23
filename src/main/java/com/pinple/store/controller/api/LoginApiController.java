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
import com.pinple.store.service.LoginService;
import com.pinple.store.util.CommonUtil;
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
@RequestMapping("/api/login")
public class LoginApiController {

	private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

	/**
	 * 로그인 API Service Class
	 */
	@Autowired
	private LoginService loginService;


	/**
	 * 로그인 API 요청 ( WS_0002 )
	 * @param loginMemberVO	사용자가 입력한 로그인 정보
	 * @param bindingResult	spring validator 객체
	 * @param request		request 객체
	 * @return				로그인 요청 결과 값
	 */
	@RequestMapping(value = "/request", method = RequestMethod.POST)
	public ResponseEntity<Void> requestLogin(LoginMemberVO loginMemberVO,
								BindingResult bindingResult, HttpServletRequest request) {
						
		//로그인 아이디 trim처리
		loginMemberVO.setUserId((loginMemberVO.getUserId()).trim());
		
		// API 요청 : 로그인(WS_0002)
		ResponseVO responseVO = loginService.loginApiRequest(loginMemberVO);

		if(responseVO.getResultCode().equals("0000")) { // 성공

			log.info("============================== Login Success Log ==============================");
			log.info("USER_LOGIN : " + loginMemberVO.getUserId() + ", User-Agent : " + request.getHeader("user-agent") + ", IP :"+ CommonUtil.getIp(request));
			
			loginService.setLoginSession(responseVO.getParams());
			return new ResponseEntity<Void>(HeaderUtil.createCode(responseVO.getResultCode()), HttpStatus.OK);
		}else { // 실패 시
			log.info(responseVO.getResultCode());

			return new ResponseEntity<Void>(HeaderUtil.createAlert(responseVO.getResultCode(), "로그인 실패"), HttpStatus.OK);
		}

	}

}
