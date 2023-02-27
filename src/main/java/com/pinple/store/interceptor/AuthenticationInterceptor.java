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
		
		String uri = request.getServletPath();
		
		String[] nonLoginUrls = new String[] {
				"/",
				"/page/term/privacy",
				"/page/term/use",
				"/error",
				
				"/api/login/request",
		};
		
		boolean isNonLoginExclude = false;
		for(String nonLoginUrl : nonLoginUrls) {

			if(nonLoginUrl.equals(uri)) {

				isNonLoginExclude = true;
				break;
			}
		}
		log.info(uri);
		
		/*
		 * //비로그인 허용일 경우 if(isNonLoginExclude) return true;
		 */
		
		/*
		 * if(!uri.startsWith("/page")) { response.sendRedirect(request.getContextPath()
		 * + "/error"); return false; }
		 */
			
			
			
		if(session == null || session.getAttribute("currentMember") == null) {
			
			
			//비로그인 허용일 경우
			if(isNonLoginExclude)
				return true;
			
			FlashMap flashMap = new FlashMap();
			flashMap.put("errorMessage", "로그인 후 이용해 주세요.");
			FlashMapManager flashMapManager = RequestContextUtils.getFlashMapManager(request);
			flashMapManager.saveOutputFlashMap(flashMap, request, response);
			log.info("==============================Interceptor preHandle catch==============================");
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}
		
		return true;
	}

}
