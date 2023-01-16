package com.pinple.store.common.vo;

import java.util.Map;

import org.springframework.stereotype.Component;


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

	public String getStoreSeq() {
		return storeSeq;
	}

	public void setStoreSeq(String storeSeq) {
		this.storeSeq = storeSeq;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "ResponseVO [storeSeq=" + storeSeq + ", result=" + result + ", resultCode=" + resultCode + ", params="
				+ params + "]";
	}
	
	
}
