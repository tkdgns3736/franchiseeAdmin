package com.pinple.store.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;	
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.pinple.store.controller.api.LoginApiController;

public class AuthenticationInterceptor  extends HandlerInterceptorAdapter{
	
	private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		
		
		if(session == null || session.getAttribute("currentMember") == null) {
			
			FlashMap flashMap = new FlashMap();
			flashMap.put("errorMessage", "로그인 후 이용해 주세요.");
			FlashMapManager flashMapManager = RequestContextUtils.getFlashMapManager(request);
			flashMapManager.saveOutputFlashMap(flashMap, request, response);
			response.sendRedirect(request.getContextPath() + "/");
		}
		return true;
	}

}
