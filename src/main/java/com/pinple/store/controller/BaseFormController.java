package com.pinple.store.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pinple.store.common.vo.CurrentMember;
import com.pinple.store.enums.CommonConstants;
import com.pinple.store.util.RestTemplateUtil;

/**
 * 기본 공통 로직 Controller Class ( 상속 전용 )
 *
 * @ClassName : BaseFormController.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 08. 23 최윤재 - 최초 생성
 *
 * @formatter:on
 *
 * @author 최윤재
 * @since  2021. 08. 23
 *
 */
@Controller
public class BaseFormController {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * request 객체
	 */
	@Autowired
	private HttpServletRequest request;

	/**
	 * session 객체
	 */
	@Autowired
	private HttpSession session;

	
	/**
	 * restTemplateUtil 객체 (핀플넷 API 통신)
	 */
	@Autowired
	protected RestTemplateUtil restTemplateUtil;

	/**
	 * 현재 로그인 사용자 정보 조회
	 * 
	 * @return 현재 로그인 된 사용자 정보 : currentMember
	 */
	protected CurrentMember getCurrentMember() {

		CurrentMember currentMember = (CurrentMember) session.getAttribute(CommonConstants.LOGIN_SESSION_NAME);

		return currentMember;
	}

	/**
	 * 로그아웃 : 세션
	 */
	protected void logout() {

		session.removeAttribute(CommonConstants.LOGIN_SESSION_NAME);
		session.invalidate();
	}
}
/**
 * 로그아웃 : api 및 세션
 */
/*
 * protected void restLogout(){ CurrentMember currentMember =
 * this.getCurrentMember(); Card currentCard = currentMember.getCurrentCard();
 * 
 * // API : 로그아웃(WS_0003) String path = "/moa/web/user/logout.do";
 * 
 * Map<String, Object> inputParam = new HashMap<String, Object>();
 * inputParam.put("storeSeq", CommonUtil.createStoreSeq(storeId));
 * inputParam.put("authKey", currentMember.getAuthKey());
 * inputParam.put("cardNo", currentCard.getCardNo());
 * 
 * restTemplateUtil.requsetPost(path, inputParam);
 * 
 * // ========================= 세션 초기화 ========================= this.logout();
 * // =============================================================== }
 */
/**
 * 사용자 레벨 갱신
 * 
 * @param memLevel     갱신 시킬 사용자 레벨
 * @param rtnAccountNo 계좌 번호
 * @param rtnBankNm    은행 코드
 */
/*
 * protected void refreshCurrentMember(String memLevel, String rtnAccountNo,
 * String rtnBankNm) {
 * 
 * CurrentMember currentMember = this.getCurrentMember();
 * 
 * if(StringUtils.isNotEmpty(memLevel)) {
 * 
 * currentMember.setMemLevel(memLevel); }
 * 
 * Card currentCard = currentMember.getCurrentCard(); if(currentCard != null) {
 * 
 * if(StringUtils.isNotEmpty(rtnAccountNo) && StringUtils.isNotEmpty(rtnBankNm))
 * {
 * 
 * currentCard.setRtnAccountNo(rtnAccountNo);
 * currentCard.setRtnBankNm(rtnBankNm); } } }
 * 
 *//**
	 * 회원 선택한 카드의 포인트 정보 갱신 ( WS_0004 )
	 */
/*
 * protected void refreshPoint() {
 * 
 * CurrentMember currentMember = this.getCurrentMember(); String authKey =
 * currentMember.getAuthKey();
 * 
 * Card currentCard = currentMember.getCurrentCard(); String cardNo =
 * currentCard.getCardNo();
 * 
 * // 모바일 포인트 조회 ( WS_0004 ) String path = "/moa/web/sts/check_card.do";
 * 
 * Map<String, Object> _paramMap = new HashMap<>(); _paramMap.put("storeSeq",
 * CommonUtil.createStoreSeq(storeId)); _paramMap.put("authKey", authKey);
 * _paramMap.put("cardNo", cardNo);
 * 
 * ResponseVO responseVO = restTemplateUtil.requsetPost(path, _paramMap);
 * 
 * if(CommonConstants.CODE_SUCCESS.equals(responseVO.getResultCode())) {
 * 
 * String point = responseVO.getParams().get("cardPoint").toString();
 * currentCard.setPoint(point); }
 * 
 * }
 * 
 *//**
	 * 회원 선택한 카드의 포인트 정보 갱신 ( WS_0004 )
	 * 
	 * @return 포인트 갱신 결과 값
	 */
/*
 * protected ResponseVO returnRefreshPoint() {
 * 
 * CurrentMember currentMember = this.getCurrentMember(); String authKey =
 * currentMember.getAuthKey();
 * 
 * Card currentCard = currentMember.getCurrentCard(); String cardNo =
 * currentCard.getCardNo();
 * 
 * // 모바일 포인트 조회 ( WS_0004 ) String path = "/moa/web/sts/check_card.do";
 * 
 * Map<String, Object> _paramMap = new HashMap<>(); _paramMap.put("storeSeq",
 * CommonUtil.createStoreSeq(storeId)); _paramMap.put("authKey", authKey);
 * _paramMap.put("cardNo", cardNo);
 * 
 * ResponseVO responseVO = restTemplateUtil.requsetPost(path, _paramMap);
 * 
 * if(CommonConstants.CODE_SUCCESS.equals(responseVO.getResultCode())) {
 * 
 * String point = responseVO.getParams().get("cardPoint").toString();
 * currentCard.setPoint(point); }
 * 
 * return responseVO; }
 * 
 *//**
	 * 보안키패드 입력값 받아서 복호화
	 * 
	 * @return 복호화 값
	 * @throws IOException       보안 키패드 (카드 패스워드) 관련 에러
	 * @throws XSSValueExpection 보안 키패드 (카드 패스워드) 관련 에러
	 */
/*
 * protected String decodeTransKey() throws IOException, XSSValueExpection {
 * 
 * String id = request.getParameter("id"); String initTime =
 * request.getParameter("initTime"); String keyboardType =
 * request.getParameter("keyboardType_" + id); String keyIndex =
 * request.getParameter("keyIndex_" + id); String fieldType =
 * request.getParameter("fieldType_" + id); String seedKey =
 * request.getParameter("seedKey"); String transkey_enc =
 * request.getParameter("transkey_" + id); String transkey_HM =
 * request.getParameter("transkey_HM_" + id);
 * 
 * String decode = TransKey.withoutSessionDecode(id, initTime, keyboardType,
 * keyIndex, fieldType, seedKey, transkey_enc, transkey_HM, "");
 * log.info("### decode ::: " + decode);
 * 
 * return decode; }
 * 
 *//**
	 * 보안키패드 입력값 받아서 복호화
	 * 
	 * @param id 복호화 해야하는 id
	 * @return 복호화 된 값
	 * @throws IOException       보안 키패드 (카드 패스워드) 관련 에러
	 * @throws XSSValueExpection 보안 키패드 (카드 패스워드) 관련 에러
	 */
/*
 * protected String decodeTransKey(String id) throws IOException,
 * XSSValueExpection {
 * 
 * String initTime = request.getParameter("initTime"); String keyboardType =
 * request.getParameter("keyboardType_" + id); String keyIndex =
 * request.getParameter("keyIndex_" + id); String fieldType =
 * request.getParameter("fieldType_" + id); String seedKey =
 * request.getParameter("seedKey"); String transkey_enc =
 * request.getParameter("transkey_" + id); String transkey_HM =
 * request.getParameter("transkey_HM_" + id);
 * 
 * String decode = TransKey.withoutSessionDecode(id, initTime, keyboardType,
 * keyIndex, fieldType, seedKey, transkey_enc, transkey_HM, "");
 * log.info("### decode ::: " + decode);
 * 
 * return decode; }
 * 
 *//**
	 * 로그인 만료 시켜야하는 결과 코드인지 확인
	 * 
	 * @param resultCode 결과 코드
	 * @return true : 세션 만료 필요, false : 세션 만료 불필요
	 */
/*
 * protected boolean checkResultCode(String resultCode) {
 * 
 * if(StringUtils.isEmpty(resultCode) ||
 * resultCode.equals(CommonConstants.CODE_SUCCESS)) {
 * 
 * return false; }
 * 
 * for (String code : CommonConstants.CODE_EXPIRE_SESSION) {
 * if(resultCode.equals(code)) { return true; } }
 * 
 * return false; } }
 */
