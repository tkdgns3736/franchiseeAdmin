package com.pinple.store.service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinple.store.common.vo.CurrentMember;
import com.pinple.store.common.vo.LoginMemberVO;
import com.pinple.store.common.vo.Menu;
import com.pinple.store.common.vo.ResponseVO;
import com.pinple.store.enums.CommonConstants;
import com.pinple.store.util.RestTemplateUtil;


@Service
public class LoginService {

	/**
	 * restTemplateUtil 객체
	 */
	@Autowired
	private RestTemplateUtil restTemplateUtil;

	/**
	 * session 객체
	 */
	@Autowired
	private HttpSession session;


	/**
	 * 로그인 API 요청 ( WS_0002 )
	 * @param loginMemberVO	사용자가 입력한 로그인 관련 값
	 * @return				로그인 응답 값
	 */
	public ResponseVO loginApiRequest(LoginMemberVO loginMemberVO){

		// 모바일 로그인 ( WS_0002 )
		String path = "https://extchange.paysmart.co.kr/moa/web/admin/store/login.do";
		
		loginMemberVO.setStoreSeq("6058190742_20180118152345_0000000000001");

		ResponseVO responseVO = restTemplateUtil.requsetPost(path, loginMemberVO);

		return responseVO;
	}

	/**
	 * 로그인 성공 후 세션에 담기
	 * @param map	로그인 시 api 통신 후 응답받은 값
	 */
	public void setLoginSession(Map<String, Object> map) {
		CurrentMember currentMember = new CurrentMember();

		currentMember.setAuthKey(map.get("authKey").toString());
		currentMember.setStoreID(map.get("storeID").toString());
		currentMember.setStoreName(map.get("storeName").toString());
		currentMember.setUserID(map.get("userID").toString());
		currentMember.setUserName(map.get("userName").toString());
		currentMember.setStoreGB(map.get("storeGB").toString());
		ArrayList<Menu> menuList = parseList(map.get("menulist").toString());
		currentMember.setMenuList(menuList);
		
		session.setAttribute(CommonConstants.LOGIN_SESSION_NAME, currentMember);
	}
	
	/**
	 * 문자열 파싱 : 큰따옴표 없는 json 문자열 > ArrayList
	 * @param jsonStr	파싱할 json 형태 문자열
	 * @return			ArrayList로 파싱된 문자열 
	 */
	private static ArrayList<Menu> parseList(String jsonStr) {
		ArrayList<Menu> list = new ArrayList<>();

		String[] menuList = jsonStr.split("\\}, ");

		for (String menuOne : menuList) {
			// 괄호 제거 후 split
			String[] menuVals = menuOne.replaceAll("\\{|\\}|\\[|\\]", "").split(", ");

			Menu menu = new Menu();
			for (String menuVal : menuVals) {
				menuVal.split("=");
				String[] val = menuVal.split("=", -1);

				if (val[0].equals("menuGrp")) {
					menu.setMenuGrp(val[1]);
				} else if (val[0].equals("menuOrd")) {
					menu.setMenuOrd(val[1]);
				} else if (val[0].equals("menuNm")) {
					menu.setMenuNm(val[1]);
				} else if (val[0].equals("menuUrl")) {
					menu.setMenuUrl(val[1]);
				} 

			}

			list.add(menu);
		}

		return list;
	}
}