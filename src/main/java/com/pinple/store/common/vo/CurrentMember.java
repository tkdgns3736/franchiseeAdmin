package com.pinple.store.common.vo;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 현재 로그인한 회원 Model Class
 *
 * @ClassName : CurrentMember.java
 * @Description :
 *
 * @formatter:off
 * 수정일     수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 8. 17. 조문정 - 최초 생성
 *
 * @author 조문정
 * @since  2021. 8. 17.
 *
 */
@Getter
@Setter
@ToString
public class CurrentMember {

	/**
	 * 제휴사 사업자 이름
	 */
	private String storeName;	

	/**
	 * 사용자 아이디
	 */
	private String userID;	

	/**
	 * 제휴사 사업자아이디
	 */
	private String storeID;	
	
	/**
	 * 임시 인증 키
	 */
	private String authKey;

	/**
	 * 사용자성명
	 */
	private String userName;

	
	private String storeGB;
	
	
	private ArrayList<Menu> menuList;
	

}
