package com.pinple.store.common.vo;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * API 통신 응답 Class
 *
 * @ClassName : ResponseVO.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 08. 11 최윤재 - 최초 생성
 *
 * @formatter:on
 *
 * @author 최윤재
 * @since  2021. 08. 11
 *
 */

@Component
@Getter
@Setter
@ToString
public class ResponseVO {

	/**
	 * 요청시 전달된 storeSeq 값 : 사업자번호 + 년월일시분초 + 전문을 구분할 수 있는 유일값
	 */
	private String storeSeq;
	
	/**
	 * SUC : 성공, FAL : 실패
	 */
	private String result;
	
	/**
	 * 결과 코드
	 */
	private String resultCode;
	
	/**
	 * 유동성 결과 값들
	 */
	
	private Map<String, Object> params;


}
