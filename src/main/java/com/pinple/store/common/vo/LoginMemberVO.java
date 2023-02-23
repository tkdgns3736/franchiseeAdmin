package com.pinple.store.common.vo;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 로그인 : Login Member Class
 *
 * @ClassName : LoginMemberVO.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 08. 02 조문정 - 최초 생성
 *
 * @formatter:on
 *
 * @author 조문정
 * @since  2021. 08. 02
 *
 */

@Getter
@Setter
@ToString
public class LoginMemberVO {
	
	/**
	 * 사업자번호 + 년월일시분초 + 전문을 구분할 수 있는 유일값
	 */
	private String storeSeq;
	
	/**
	 * 아이디
	 */
	private String userId;

	/**
	 * 비밀번호
	 */
	
	private String userPw;

	
}
