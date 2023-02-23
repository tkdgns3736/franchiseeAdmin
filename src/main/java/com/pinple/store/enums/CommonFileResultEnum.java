package com.pinple.store.enums;

/**
 * 공통 결과코드 Enum Class
 *
 * @ClassName : CommonResultEnum.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 09. 01 최윤재 - 최초 생성
 *
 * @formatter:on
 *
 * @author 최윤재
 * @since  2021. 09. 01
 *
 */
public enum CommonFileResultEnum {


	/** 파일 업로드 완료 */
	SUCCESS("F000", "common.file.upload.success"),

	/** 업로드할 파일을 찾을 수 없습니다. */
	ERR_FILE_NOT_FOUND("F001", "common.file.upload.err.not-found"),

	/** 파일 업로드 실패 */
	ERR_FAIL("F002", "common.file.upload.fail")
	;

	/**
	 * 결과 코드
	 */
	private String code;

	/**
	 * 결과 메시지
	 */
	private String message;

	CommonFileResultEnum(String code, String message) {

		this.code = code;
		this.message = message;
	}

	/**
	 * 결과 코드 가져오는 메소드
	 * @return	결과 코드
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 결과 메시지 가져오는 메소드
	 * @return	결과 메시지
	 */
	public String getMessage() {
		return message;
	}

}
