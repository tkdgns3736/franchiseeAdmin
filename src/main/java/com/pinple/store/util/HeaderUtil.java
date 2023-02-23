package com.pinple.store.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

import com.pinple.store.enums.CommonConstants;



/**
 * Header 값 설정 Util
 *
 * @ClassName : HeaderUtil.java
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
public class HeaderUtil {

	private static final Logger log = LoggerFactory.getLogger(HeaderUtil.class);

	/** 
	 * 응답값 설정 : 결과코드
	 * @param code	결과코드
	 * @return		응답값 설정된 header
	 */
	public static HttpHeaders createCode(String code) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(CommonConstants.CODE_STATUS, code);
		return headers;
	}

	/** 
	 * 응답값 설정 : 결과코드, 메시지
	 * @param code		결과코드
	 * @param message	메시지
	 * @return			응답값 설정된 header
	 */
	public static HttpHeaders createAlert(String code, String message) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(CommonConstants.CODE_STATUS, code);
		headers.add(CommonConstants.CODE_ALERT, encodeMessage(message));
		return headers;
	}

	/** 
	 * 메시지 인코딩 ( UTF-8 )
	 * @param message	인코딩할 문자열
	 * @return			인코딩된 문자열
	 */
	private static String encodeMessage(String message) {
		try {
			if(!StringUtils.isEmpty(message)) {
				return URLEncoder.encode(message, "UTF-8");
			}else {
				return null;
			}
			
		} catch(UnsupportedEncodingException e) {
			log.error(e.getMessage());
		}
		return message;
	}

}
