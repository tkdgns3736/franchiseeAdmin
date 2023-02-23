package com.pinple.store.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 공통함수 Util Class
 *
 * @ClassName : CommonUtil.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 08. 09 최윤재 - 최초 생성
 *
 * @formatter:on
 *
 * @author 최윤재
 * @since  2021. 08. 09
 * */
@Component
public class CommonUtil {


	/**
	 * 왼쪽 padding Function
	 * @param str		문자열
	 * @param maxLen	최대 길이
	 * @param type		자료형
	 * @return			가공된 문자열
	 */
	public static String setLeftPadding(String str, int maxLen, String type) {

		String result = "";
		if("String".equals(type)) {
			result = StringUtils.leftPad(str, maxLen, " ");
		} else if("Integer".equals(type)) {
			result = StringUtils.leftPad(str, maxLen, "0");
		}

		return result;
	}

	/**
	 * 전문 길이 반환 Function
	 * @param str	문자열
	 * @return		왼쪽에 "0" 채운 전문 길이
	 */
	public static String getSpecialtyLength(String str) {

		int len = str.length();

		return setLeftPadding(String.valueOf(len), 4, "Integer");
	}

	/**
	 * 연속된 문자열 체크
	 * @param str	체크할 문자열
	 * @param limit	연속된 문자열 제한 길이
	 * @return		true : 연문자 존재, false : 연문자 미존재 
	 */
	public static boolean checkContinuousPwd(String str, int limit) {

		int o = 0;
		int d = 0;
		int p = 0;
		int n = 0;

		for (int i=0; i<str.length(); i++) {

			char tempVal = str.charAt(i);
			if (i > 0 && (p = o - tempVal) > -2 && (n = p == d ? n + 1 : 0) > limit - 3) {

				return true;
			}
			d = p;
			o = tempVal;
		}

		return false;
	}

	/**
	 * 현재 시간 출력 : API
	 * @return	yyyyMMddhhmmss 포맷의 시간
	 */
	public static String getCurrentTime() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(new Date());
	}

	/**
	 * API의 storeSeq 값 생성
	 * @return	storeSeq
	 */
	public static String createStoreSeq(String storeId) {

		String storeSeq = storeId + "_" + getCurrentTime() + "_" + randomValue(13, "number");

		return storeSeq;
	}

	/**
	 * 랜덤 값 생성 Function
	 * @param len	길이
	 * @param gubun	자료형
	 * @return		생성된 랜덤값
	 */
	public static String randomValue(int len, String gubun) {

		Random ran = new Random();
		StringBuffer result = new StringBuffer();

		if("string".equals(gubun)) {
			// Only 문자 ( 대/소문자 )
			for(int i=0;i<len;i++) {
				int r = ran.nextInt(2);
				switch (r) {
					case 0:
						// a-z
						result.append((char) (ran.nextInt(26) + 97));
						break;
					case 1:
						// A-Z
						result.append((char) (ran.nextInt(26) + 65));
						break;
				}
			}
		} else if("number".equals(gubun)) {
			// Only 숫자 ( 정수 )
			for(int i=0;i<len;i++) {
				result.append((ran.nextInt(10)));
			}
		} else if("mix".equals(gubun)) {
			// 문자 + 숫자 ( 대/소문자 + 숫자(정수) )
			for(int i=0;i<len;i++) {
				int r = ran.nextInt(3);
				switch (r) {
					case 0:
						// a-z
						result.append((char) (ran.nextInt(26) + 97));
						break;
					case 1:
						// A-Z
						result.append((char) (ran.nextInt(26) + 65));
						break;
					case 2:
						// 0-9
						result.append(ran.nextInt(10));
						break;
				}
			}
		}
		return result.toString();
	}

	/**
	 * 요청 주소 가져오기
	 * @param request	request 객체
	 * @return			요청 주소 ex) https://example.com:80
	 */
	public static String getBaseUrl(HttpServletRequest request) {

		return request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort();
	}

	/**
	 * 현재 HttpServletReqeust 의 값을 설정
	 * @return	
	 */
	@SuppressWarnings("unused")
	private static HttpServletRequest getCurrentHttpRequest() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {

			HttpServletRequest request = (HttpServletRequest) ((ServletRequestAttributes) requestAttributes).getRequest();
			return request;
		}
		return null;
	}

	/**
	 * 클라이언트 IP 주소
	 * @return	클라이언트 IP 주소
	 */
	public static String getIp(HttpServletRequest request) {

		String ip = request.getHeader("X-Forwarded-For");

		if(StringUtils.isEmpty(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if(StringUtils.isEmpty(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if(StringUtils.isEmpty(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if(StringUtils.isEmpty(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if(StringUtils.isEmpty(ip)) {
			ip = request.getRemoteAddr();
		}

		return ip;
	}

	/**
	 * 문자열 마스킹 처리
	 * @param str	마스킹 처리할 문자열
	 * @param type	문자열 타입 (name, phone, card)
	 * @return		마스킹 처리된 문자열
	 */
	public static String maskingStr(String str, String type) {

		String rValue = "";

		if("name".equals(type)) {	// 이름

			int len = str.length();

			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(str.substring(0, 1));

			for(int i=1;i<(len-1);i++) {

				stringBuffer.append("*");
			}

			stringBuffer.append(str.substring((len-1)));

			rValue = stringBuffer.toString();
		} else if("phone".equals(type)) {	// 휴대폰 번호

			String maskingPhone = "";
			str = str.replaceAll("-", "");

			int len = str.length();
			if(10 == len) {

				maskingPhone = str.substring(0, 3) + "-" + "***" + "-" + str.substring(6);
			} else if(11 == len) {

				maskingPhone = str.substring(0, 3) + "-" + "****" + "-" + str.substring(7);
			}

			rValue = maskingPhone;
		} else if("card".equals(type)) {	// 카드 번호

			String maskingCardNo = "";
			String[] cardNo = str.split("-");

			maskingCardNo = cardNo[0] + "-" + "****" + "-" + "****" + "-" + cardNo[3];

			rValue = maskingCardNo;
		}

		return rValue;
	}

	/**
	 * 인증 받은 핸드폰 번호 포맷 변경 (하이픈 추가)
	 * @param val	인증 받은 핸드폰 번호
	 * @return		하이픈(-) 추가된 핸드폰 번호
	 */
	public static String formatPassPhone(String val) {
		String hyphenPattern = "(^01\\d{1})([0-9]{3,4})([0-9]{4})$";
		Pattern pattern = Pattern.compile(hyphenPattern);
		Matcher matcher = pattern.matcher(val);

		while(matcher.find()){
			val = "";
			val += matcher.group(1);
			val += "-";
			val += matcher.group(2);
			val += "-";
			val += matcher.group(3);
		}
		
		return val;
	}

}
