package com.pinple.store.enums;


/**
 * 공통 상수 Class
 *
 * @ClassName : CommonConstants.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 08. 17 최윤재 - 최초 생성
 *
 * @formatter:on
 *
 * @author 최윤재
 * @since  2021. 08. 17
 *
 */
public class CommonConstants {


	// ================================== API 응답결과 관련 상수 ==================================	
	/**
	 * Header 응답 key 값 : 얼럿 메시지
	 */
	public final static String CODE_ALERT = "X-PINP-ALERT";

	/**
	 * Header 응답 key 값 : 상태 코드
	 */
	public final static String CODE_STATUS = "X-PINP-STATUS";

	/**
	 * 핀플넷 API 응답 코드 값 : 성공 
	 */
	public final static String CODE_SUCCESS = PinApiResultEnum.SUCCESS.getCode();
	
	/**
	 * 핀플넷 API 응답 코드 값 : 성공 / 결제 비밀번호 없을 경우 
	 */
	public final static String CODE_SUCCESS_NO_EASY_PAYMENT = PinApiResultEnum.SUCCESS_NO_EASY_PAYMENT.getCode();
	
	/**
	 * 핀플넷 API 응답 코드 값 : 정상 처리 ( 이체 요청 전달 완료 )
	 */
	public final static String CODE_SUCCESS_TRANSFER_REQUEST = PinApiResultEnum.SUCCESS_TRANSFER_REQUEST.getCode();

	
	/**
	 * 핀플넷 API 응답 코드 배열 : 세션 만료 시킬 응답 코드들
	 */
	public final static String[] CODE_EXPIRE_SESSION = {
														PinApiResultEnum.ERR_LOGIN_NOT_EXIST.getCode(),
														PinApiResultEnum.ERR_RESTCLIENT.getCode()
														};
	// ============================================================================================


	/**************************************** 로그인 세션 명 ***************************************/
	public final static String LOGIN_SESSION_NAME = "currentMember";
	// *********************************************************************************************


	// ======================================= APP 관련 상수 =======================================
	/**
	 * APP 구분 코드
	 */
	public final static String APP_CODE = "PINP-APP";

	/**
	 * 테스트 APP 구분 코드
	 */
	public final static String TEST_APP_CODE = "PINPAY-INTERNAL-MAINTAIN-TEST-AGENT";
	// ============================================================================================


	// ==================================== PASS 인증관련 상수 ====================================
	/**
	 * PASS 인증 성공 시 SESSION 명칭
	 */
	public final static String NICE_VALUE = "requestNumber";

	/**
	 * 카드 비밀번호 시 본인인증 변경
	 */
	public final static String CARD_PASS_AUTH = "isPassAuth";

	/**
	 * 로그인 비밀번호 변경
	 */
	public final static String CHANGE_PW_PASS_AUTH = "isChangePwPassAuth";

	/**
	 * 간편 비밀번호 변경
	 */
	public final static String CHANGE_EASYPAYMENT_PASS_AUTH = "isChangeEasypaymentPassAuth";
	
	/**
	 * 휴대폰 번호 변경
	 */
	public final static String CHANGE_TEL_PASS_AUTH = "isChangeTelPassAuth";

	/**
	 * 간편송금 시 본인인증
	 */
	public final static String REMITTANCE_AUTH = "isRemittanceAuth";

	/**
	 * 계좌입금충전 ARS 인증
	 */
	public final static String CHARGE_ARS_AUTH = "isChargeArsAuth";
	// ============================================================================================


	// ==================================== 추가인증 관련 상수 ====================================
	/**
	 * 추가인증 타입
	 */
	public final static String BANK_CERT_TYPE = "bankCertType";

	/**
	 * 간편송금
	 */
	public final static String BANK_CERT_TYPE_REMITTANCE = "remittance";
	
	/**
	 * 간편송금
	 */
	public final static String BANK_CERT_TYPE_POINTGIFT = "pointgift";
	/**
	 * 가상계좌입금
	 */
	public final static String BANK_CERT_TYPE_ACCOUNT = "account";
	// ============================================================================================


	// =========================== 세션 만료 후 특정 값 다시 담는 경우 ============================
	/**
	 * 휴대폰 변경 완료 후 값 세션명
	 */
	public final static String COMPLETE_TEL_CHANGE = "completeTelChangeParam";
	// ============================================================================================


	// ===================================== 회원 등급별 코드 =====================================
	/**
	 * 회원 가입
	 */
	public final static String MEM_LEVEL_DEFAULT = "0";

	/**
	 * 기본 그룹(SYNQ : 가입코드없이 가입한 회원) 회원이 1원 인증을 진행한 경우
	 */
	public final static String MEM_LEVEL_AUTH = "1";

	/**
	 * 가맹점 그룹( 대리점으로 부터 가입코드를 발급 받아 가입한 회원) 회원이 1원 인증을 진행한 경우
	 */
	public final static String MEM_LEVEL_AUTH_FRANCHISE = "2";
	// ============================================================================================


	// ===================================== 회원별 인증 단계 =====================================
	/**
	 * 오류
	 */
	public final static String MEM_AUTH_STEP_0	= "M0";

	/**
	 * ARS 인증
	 */
	public final static String MEM_AUTH_STEP_1	= "M1";

	/**
	 * 추가인증 ( 1원인증 )
	 */
	public final static String MEM_AUTH_STEP_2	= "M2";

	/**
	 * 본인계좌 등록
	 */
	public final static String MEM_AUTH_STEP_3	= "M3";

	/**
	 * 가상계좌발급
	 */
	public final static String MEM_AUTH_STEP_4	= "M4";
	
	/**
	 * 가상계좌 신규발급(가맹)
	 */
	public final static String MEM_AUTH_STEP_6	= "M6";
	// ============================================================================================


}
