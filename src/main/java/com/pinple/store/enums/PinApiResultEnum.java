package com.pinple.store.enums;

/**
 * 결과코드 Enum Class
 *
 * @ClassName : ResultCodeEnum.java
 * @Description :
 * @Modification Information
 *
 * @formatter:off
 * 수정일   수정자 수정내용
 * ---------- ------ -----------------------
 * 2021. 07. 28 최윤재 - 최초 생성
 *
 * @formatter:on
 *
 * @author 최윤재
 * @since 2021. 07. 28
 *
 */
public enum PinApiResultEnum {

	/** 정상처리 */
	SUCCESS("0000", "pinp.success"),

	/** 정상 처리 ( 이체 요청 전달 완료 ) */
	SUCCESS_TRANSFER_REQUEST("0001", "pinp.success.transfer.request="),

	/** 정상 처리 ( 이체 확인 조회 결과 없음 ) */
	SUCCESS_TRANSFER_NO_SEARCH_RESULTS("0002", "pinp.success.transfer.no-search-results"),

	/** 정상 처리 ( 상태 변경 내역 조회 결과 없음 ) */
	SUCCESS_STATUS_CHANGE_NO_SEARCH_RESULTS("0003", "pinp.success.status-change.no-search-results"),

	/** 정상 처리 ( 간편 비밀번호 없음) */
	SUCCESS_NO_EASY_PAYMENT("0004", "pinp.success.no.easy.payment"),
	
	/** 실패 */
	FAIL("9900", "pinp.fail"),

	/** 사용권한 없음 */
	PERMISSION_DENIED("9901", "pinp.permission.denied"),

	/** 파라미터 오류 */
	ERR_PARAMETER("9000", "pinp.err.parameter"),

	/** 파라미터 오류 ( storeSeq 필수값 오류 ) */
	ERR_PARAMETER_STORESEQ("9001", "pinp.err.parameter.storeseq"),

	/** 파라미터 오류 ( storeId 필수값 오류 ) */
	ERR_PARAMETER_STOREID("9002", "pinp.err.parameter.storeid"),

	/** 파라미터 오류 ( memId 필수값 오류 ) */
	ERR_PARAMETER_MEMID("9003", "pinp.err.parameter.memid"),

	/** 파라미터 오류 ( memName 필수값 오류 ) */
	ERR_PARAMETER_MEMNAME("9004", "pinp.err.parameter.memname"),

	/** 파라미터 오류 ( memJumin 필수값 오류 ) */
	ERR_PARAMETER_MEMJUMIN("9005", "pinp.err.parameter.memjumin"),

	/** 파라미터 오류 ( memCid 필수값 오류 ) */
	ERR_PARAMETER_MEMCID("9006", "pinp.err.parameter.memcid"),

	/** 파라미터 오류 ( memSex 필수값 오류 ) */
	ERR_PARAMETER_MEMSEX("9007", "pinp.err.parameter.memsex"),

	/** 파라미터 오류 ( memTel 필수값 오류 ) */
	ERR_PARAMETER_MEMTEL("9008", "pinp.err.parameter.memtel"),

	/** 파라미터 오류 ( memAgency 필수값 오류 ) */
	ERR_PARAMETER_MEMAGENCY("9009", "pinp.err.parameter.memagency"),

	/** 파라미터 오류 ( memAdd1 필수값 오류 ) */
	ERR_PARAMETER_MEMADD1("9010", "pinp.err.parameter.memadd1"),

	/** 파라미터 오류 ( memAdd2 필수값 오류 ) */
	ERR_PARAMETER_MEMADD2("9011", "pinp.err.parameter.memadd2"),

	/** 파라미터 오류 ( memAddNum 필수값 오류 ) */
	ERR_PARAMETER_MEMADDNUM("9012", "pinp.err.parameter.memaddnum"),

	/** 파라미터 오류 ( memEmail 필수값 오류 ) */
	ERR_PARAMETER_MEMEMAIL("9013", "pinp.err.parameter.mememail"),

	/** 파라미터 오류 ( cardNo 필수값 오류 ) */
	ERR_PARAMETER_CARDNO("9014", "pinp.err.parameter.cardno"),

	/** 파라미터 오류 ( cardPw 필수값 오류 ) */
	ERR_PARAMETER_CARDPW("9015", "pinp.err.parameter.cardpw"),

	/** 파라미터 오류 ( rtnBankNm 필수값 오류 ) */
	ERR_PARAMETER_RTNBANKNM("9016", "pinp.err.parameter.rtnbanknm"),

	/** 파라미터 오류 ( rtnAccountNo 필수값 오류 ) */
	ERR_PARAMETER_RTNACCOUNTNO("9017", "pinp.err.parameter.rtnaccountno"),

	/** 파라미터 오류 ( rtnOwner 필수값 오류 ) */
	ERR_PARAMETER_RTNOWNER("9018", "pinp.err.parameter.rtnowner"),

	/** 파라미터 오류 ( chargePoint 필수값 오류 ) */
	ERR_PARAMETER_CHARGEPOINT("9019", "pinp.err.parameter.chargepoint"),

	/** 파라미터 오류 ( transPoint 필수값 오류 ) */
	ERR_PARAMETER_TRANSPOINT("9020", "pinp.err.parameter.transpoint"),

	/** 파라미터 오류 ( cardSts 필수값 오류 ) */
	ERR_PARAMETER_CARDSTS("9021", "pinp.err.parameter.cardsts"),

	/** 파라미터 오류 ( chargePoint 범위 오류 ) */
	ERR_PARAMETER_CHARGEPOINT_RANGE("9022", "pinp.err.parameter.chargepoint.range"),

	/** 파라미터 오류 ( transPoint 범위 오류 ) */
	ERR_PARAMETER_TRANSPOINT_RANGE("9023", "pinp.err.parameter.transpoint.range"),

	/** 파라미터 오류 ( memForeignerType 필수값 오류 ) */
	ERR_PARAMETER_MEMFOREIGNERTYPE("9024", "pinp.err.parameter.memforeignertype"),

	/** 파라미터 오류 ( transSeqId 필수값 오류 ) */
	ERR_PARAMETER_TRANSSEQID("9025", "pinp.err.parameter.transseqid"),

	/** 파라미터 오류 ( cardCvc 필수값 오류 ) */
	ERR_PARAMETER_CARDCVC("9026", "pinp.err.parameter.cardcvc"),

	/** 파라미터 오류 ( cardExpireDt 필수값 오류 ) */
	ERR_PARAMETER_CARDEXPIREDT("9027", "pinp.err.parameter.cardexpiredt"),

	/** 파라미터 오류 ( sDate 필수값 오류 ) */
	ERR_PARAMETER_SDATE("9028", "pinp.err.parameter.sdate"),

	/** 파라미터 오류 ( eDate 필수값 오류 ) */
	ERR_PARAMETER_EDATE("9029", "pinp.err.parameter.edate"),

	/** 파라미터 오류 ( sType 필수값 오류 ) */
	ERR_PARAMETER_STYPE("9030", "pinp.err.parameter.stype"),

	/** 파라미터 오류 ( uTxid 필수값 오류 ) */
	ERR_PARAMETER_UTXID("9031", "pinp.err.parameter.utxid"),

	/** 파라미터 오류 ( cTxid 필수값 오류 ) */
	ERR_PARAMETER_CTXID("9032", "pinp.err.parameter.ctxid"),

	/** 파라미터 오류 ( usePoint 필수값 오류 ) */
	ERR_PARAMETER_USEPOINT("9033", "pinp.err.parameter.usepoint"),

	/** 파라미터 오류 ( searchDt 필수값 오류 ) */
	ERR_PARAMETER_SEARCHDT("9034", "pinp.err.parameter.searchdt"),

	/** 파라미터 오류 ( mechantId 범위 오류 ) */
	ERR_PARAMETER_MECHANTID_RANGE("9035", "pinp.err.parameter.mechantid.range"),

	/** 파라미터 오류 ( cardPw 범위 오류 ) */
	ERR_PARAMETER_CARDPW_RANGE("9036", "pinp.err.parameter.cardpw.range"),

	/** 파라미터 오류 ( memJumin 범위 오류 ) */
	ERR_PARAMETER_MEMJUMIN_RANGE("9037", "pinp.err.parameter.memjumin.range"),

	/** 파라미터 오류 ( memBirthday 필수값 오류 ) */
	ERR_PARAMETER_MEMBIRTHDAY("9038", "pinp.err.parameter.membirthday"),

	/** 파라미터 오류 ( memBirthday 범위 오류 ) */
	ERR_PARAMETER_MEMBIRTHDAY_RANGE("9039", "pinp.err.parameter.memBirthday.range"),

	/** 파라미터 오류 ( tradeTxid 필수값 오류 ) */
	ERR_PARAMETER_TRADETXID("9040", "pinp.err.parameter.tradetxid"),

	/** 파라미터 오류 ( tradePoint 필수값 오류 ) */
	ERR_PARAMETER_TRADEPOINT("9041", "pinp.err.parameter.tradepoint"),

	/** 파라미터 오류 ( tradePoint 범위 오류 ) */
	ERR_PARAMETER_TRADEPOINT_RANGE("9042", "pinp.err.parameter.tradepoint.range"),

	/** 파라미터 오류 ( sellerMemId 필수값 오류 ) */
	ERR_PARAMETER_SELLERMEMID("9043", "pinp.err.parameter.sellermemid"),

	/** 파라미터 오류 ( sellerCardno 필수값 오류 ) */
	ERR_PARAMETER_SELLERCARDNO("9044", "pinp.err.parameter.sellercardno"),

	/** 파라미터 오류 ( vaccountBankNo 필수값 오류 ) */
	ERR_PARAMETER_VACCOUNTBANKNO("9045", "pinp.err.parameter.vaccountbankno"),

	/** 파라미터 오류 ( tradeTotalPoint 필수값 오류 ) */
	ERR_PARAMETER_TRADETOTALPOINT("9046", "pinp.err.parameter.tradetotalpoint"),

	/** 파라미터 오류 ( giftTypeA 범위 오류 ) */
	ERR_PARAMETER_GIFTTYPEA("9047", "pinp.err.parameter.gifttypea"),

	/** 파라미터 오류 ( giftTypeB 필수값 오류 ) */
	ERR_PARAMETER_GIFTTYPEB("9048", "pinp.err.parameter.gifttypeb"),

	/** 파라미터 오류 ( giftTypeC 필수값 오류 ) */
	ERR_PARAMETER_GIFTTYPEC("9049", "pinp.err.parameter.gifttypec"),

	/** 서비스 제공 불가능 */
	ERR_SERVICE_NOT_AVAILABLE("9050", "pinp.err.service.not-available"),

	/** 체크키 불일치 */
	ERR_CHECKKEY_INCONSISTENCY_AVAILABLE("9051", "pinp.err.checkkey.inconsistency"),

	/** 파라미터 오류 ( checkKey 필수값 오류 ) */
	ERR_PARAMETER_CHECKKEY("9052", "pinp.err.parameter.checkkey"),

	/** 파라미터 오류 ( historyType 필수값 오류 ) */
	ERR_PARAMETER_HISTORYTYPE("9053", "pinp.err.parameter.historytype"),

	/** 파라미터 오류 ( month 필수값 오류 ) */
	ERR_PARAMETER_MONTH("9054", "pinp.err.parameter.month"),

	/** 파라미터 오류 ( 조회 기간 오류 ) */
	ERR_PARAMETER_SEARCHTERM("9055", "pinp.err.parameter.searchterm"),

	/** 파라미터 오류 ( cardType 필수값 오류 ) */
	ERR_PARAMETER_CARDTYPE("9056", "pinp.err.parameter.cardtype"),

	/** 파라미터 오류 ( 복호화 오류 ) */
	ERR_PARAMETER_DECODE("9057", "pinp.err.parameter.decode"),

	/** 파라미터 오류 ( checkKey 불일치 ) */
	ERR_PARAMETER_CHECKKEY_INCONSISTENCY("9058", "pinp.err.parameter.checkKey.inconsistency"),

	/** 사용자 정보 없음 */
	ERR_USER_NOT_EXIST("9059", "pinp.err.user.not-exist"),

	/** 로그인 정보 없음 */
	ERR_LOGIN_NOT_EXIST("9060", "pinp.err.login.not-exist"),

	/** 중복 로그인 */
	ERR_LOGIN_DUPLICATE("9061", "pinp.err.login.duplicate"),

	/** 파라미터 오류 ( memPw 필수값 오류 ) */
	ERR_PARAMETER_MEMPW("9062", "pinp.err.parameter.mempw"),

	/** 관리자에게 문의(카드정보 갱신 요청) */
	ERR_ADMIN_QUESTION_CARD_INFORMATION("9063", "pinp.err.admin.question.card.information"),

	/** 파라미터 오류 ( authKey 불일치 ) */
	ERR_PARAMETER_AUTHKEY_INCONSISTENCY("9064", "pinp.err.parameter.authkey.inconsistency"),

	/** 파라미터 오류 ( inputIp 불일치 ) */
	ERR_PARAMETER_INPUTIP_INCONSISTENCY("9065", "pinp.err.parameter.inputip.inconsistency"),

	/** 파라미터 오류 ( seq 필수값 오류 ) */
	ERR_PARAMETER_SEQ("9066", "pinp.err.parameter.seq"),

	/** 파라미터 오류 ( cardCd 필수값 오류 ) */
	ERR_PARAMETER_CARDCD("9067", "pinp.err.parameter.cardcd"),

	/** 파라미터 오류 ( transKey 필수값 오류 ) */
	ERR_PARAMETER_TRANSKEY("9068", "pinp.err.parameter.transkey"),

	/** 파라미터 오류 ( transResult 필수값 오류 ) */
	ERR_PARAMETER_TRANSRESULT("9069", "pinp.err.parameter.transresult"),

	/** 파라미터 오류 ( userIp 필수값 오류 ) */
	ERR_PARAMETER_USERIP("9070", "pinp.err.parameter.userip"),

	/** 파라미터 오류 ( reason 필수값 오류 ) */
	ERR_PARAMETER_REASON("9071", "pinp.err.parameter.reason"),

	/** 파라미터 오류 ( memo 필수값 오류 ) */
	ERR_PARAMETER_MEMO("9072", "pinp.err.parameter.memo"),

	/** 파라미터 오류 ( bankCd 필수값 오류 ) */
	ERR_PARAMETER_BANKCD("9073", "pinp.err.parameter.bankcd"),

	/** 파라미터 오류 ( bankAccountNo 필수값 오류 ) */
	ERR_PARAMETER_BANKACCOUNTNO("9074", "pinp.err.parameter.bankaccountno"),

	/** 파라미터 오류 ( bankAccountOwner 필수값 오류 ) */
	ERR_PARAMETER_BANKACCOUNTOWNER("9075", "pinp.err.parameter.bankaccountowner"),

	/** 파라미터 오류 ( subjectname 필수값 오류 ) */
	ERR_PARAMETER_SUBJECTNAME("9076", "pinp.err.parameter.subjectname"),

	/** 파라미터 오류 ( notbefore 필수값 오류 ) */
	ERR_PARAMETER_NOTBEFORE("9077", "pinp.err.parameter.notbefore"),

	/** 파라미터 오류 ( notafter 필수값 오류 ) */
	ERR_PARAMETER_NOTAFTER("9078", "pinp.err.parameter.notafter"),

	/** 파라미터 오류 ( version 필수값 오류 ) */
	ERR_PARAMETER_VERSION("9079", "pinp.err.parameter.version"),

	/** 파라미터 오류 ( serialnum 필수값 오류 ) */
	ERR_PARAMETER_SERIALNUM("9080", "pinp.err.parameter.serialnum"),

	/** 파라미터 오류 ( certpolicyid 필수값 오류 ) */
	ERR_PARAMETER_CERTPOLICYID("9081", "pinp.err.parameter.certpolicyid"),

	/** 파라미터 오류 ( aprovalType 필수값 오류 ) */
	ERR_PARAMETER_APROVALTYPE("9082", "pinp.err.parameter.aprovaltype"),

	/** 파라미터 오류 ( adminId 필수값 오류 ) */
	ERR_PARAMETER_ADMINID("9083", "pinp.err.parameter.adminid"),

	/** 파라미터 오류 ( smsMAgree 필수값 오류 ) */
	ERR_PARAMETER_SMSMAGREE("9084", "pinp.err.parameter.smsmagree"),

	/** 카드 그룹 정보 없음. */
	ERR_CARD_NO_GROUP_INFORMATION("9085", "pinp.err.card.no-group-information"),

	/** 파라미터 오류 ( comSeq 필수값 오류 ) */
	ERR_PARAMETER_COMSEQ("9086", "pinp.err.parameter.comseq"),

	/** 파라미터 오류 ( refundableAmtOnce 필수값 오류 ) */
	ERR_PARAMETER_REFUNDABLEAMTONCE("9087", "pinp.err.parameter.refundableamtonce"),

	/** 파라미터 오류 ( refundableAmtDay 필수값 오류 ) */
	ERR_PARAMETER_REFUNDABLEAMTDAY("9088", "pinp.err.parameter.refundableamtday"),

	/** 파라미터 오류 ( comCardType 필수값 오류 ) */
	ERR_PARAMETER_COMCARDTYPE("9089", "pinp.err.parameter.comcardtype"),

	/** 파라미터 오류 ( refundSusuGubn 필수값 오류 ) */
	ERR_PARAMETER_REFUNDSUSUGUBN("9090", "pinp.err.parameter.refundsusugubn"),

	/** 파라미터 오류 ( refundSusuRate 필수값 오류 ) */
	ERR_PARAMETER_REFUNDSUSURATE("9091", "pinp.err.parameter.refundsusurate"),

	/** 파라미터 오류 ( maxPerMem 필수값 오류 ) */
	ERR_PARAMETER_MAXPERMEM("9092", "pinp.err.parameter.maxpermem"),

	/** 파라미터 오류 ( comChargeSusuGubn 필수값 오류 ) */
	ERR_PARAMETER_COMCHARGESUSUGUBN("9093", "pinp.err.parameter.comchargesusugubn"),

	/** 파라미터 오류 ( comChargeSusuRate 필수값 오류 ) */
	ERR_PARAMETER_COMCHARGESUSURATE("9094", "pinp.err.parameter.comchargesusurate"),

	/** 파라미터 오류 ( comRefundSusuGubn 필수값 오류 ) */
	ERR_PARAMETER_COMREFUNDSUSUGUBN("9095", "pinp.err.parameter.comrefundsusugubn"),

	/** 파라미터 오류 ( comRefundSusuRate 필수값 오류 ) */
	ERR_PARAMETER_COMREFUNDSUSURATE("9096", "pinp.err.parameter.comrefundsusurate"),

	/** 파라미터 오류 ( percentGubn 필수값 오류 ) */
	ERR_PARAMETER_PERCENTGUBN("9097", "pinp.err.parameter.percentgubn"),

	/** 파라미터 오류 ( percentRate 필수값 오류 )*/
	ERR_PARAMETER_PERCENTRATE("9098", "pinp.err.parameter.percentrate"),

	/** 파라미터 오류 ( checkStoreSeq 필수값 오류 ) */
	ERR_PARAMETER_CHECKSTORESEQ("9099", "pinp.err.parameter.checkstoreseq"),

	/** 파라미터 오류 ( createDate 필수값 오류 ) */
	ERR_PARAMETER_CREATEDATE("9100", "pinp.err.parameter.createdate"),

	/** 파라미터 오류 ( posNo 필수값 오류 ) */
	ERR_PARAMETER_POSNO("9101", "pinp.err.parameter.posno"),

	/** 파라미터 오류 ( fixGubn 필수값 오류 ) */
	ERR_PARAMETER_FIXGUBN("9102", "pinp.err.parameter.fixgubn"),

	/** 파라미터 오류 ( fixRate 필수값 오류 ) */
	ERR_PARAMETER_FIXRATE("9103", "pinp.err.parameter.fixrate"),

	/** 파라미터 오류 ( depChargeSusuGubn 필수값 오류 ) */
	ERR_PARAMETER_DEPCHARGESUSUGUBN("9104", "pinp.err.parameter.depchargesusugubn"),

	/** 파라미터 오류 ( depChargeSusuRate 필수값 오류 ) */
	ERR_PARAMETER_DEPCHARGESUSURATE("9105", "pinp.err.parameter.depchargesusurate"),

	/** 파라미터 오류 ( depRefundSusuGubn 필수값 오류 ) */
	ERR_PARAMETER_DEPREFUNDSUSUGUBN("9106", "pinp.err.parameter.deprefundsusugubn"),

	/** 파라미터 오류 ( depRefundSusuRate 필수값 오류 ) */
	ERR_PARAMETER_DEPREFUNDSUSURATE("9107", "pinp.err.parameter.deprefundsusurate"),

	/** 파라미터 오류 ( cardUid 필수값 오류 ) */
	ERR_PARAMETER_CARDUID("9108", "pinp.err.parameter.carduid"),

	/** 파라미터 오류 ( seqNo 필수값 오류 ) */
	ERR_PARAMETER_SEQNO("9109", "pinp.err.parameter.seqno"),

	/** 파라미터 오류 ( memberType 필수값 오류 ) */
	ERR_PARAMETER_MEMBERTYPE("9110", "pinp.err.parameter.membertype"),

	/** 파라미터 오류 ( sourceCardNo 필수값 오류 ) */
	ERR_PARAMETER_SOURCECARDNO("9111", "pinp.err.parameter.sourcecardno"),

	/** 파라미터 오류 ( sourceCardPw 필수값 오류 ) */
	ERR_PARAMETER_SOURCECARDPW("9112", "pinp.err.parameter.sourcecardpw"),

	/** 파라미터 오류 ( targetCardNo 필수값 오류 ) */
	ERR_PARAMETER_TARGETCARDNO("9113", "pinp.err.parameter.targetcardno"),

	/** 차단된 사용자 (비밀번호 5 회 오류 등 ) */
	ERR_BLOCK_USER("9114", "pinp.err.block-user"),

	/** 파라미터 오류 ( recipientTxt 필수값 오류 ) */
	ERR_PARAMETER_RECIPIENTTXT("9115", "pinp.err.parameter.recipienttxt"),

	/** 파라미터 오류 ( depositAmount 필수값 오류 ) */
	ERR_PARAMETER_DEPOSITAMOUNT("9116", "pinp.err.parameter.depositamount"),

	/** 파라미터 오류 ( marketPrice 필수값 오류 ) */
	ERR_PARAMETER_MARKETPRICE("9117", "pinp.err.parameter.marketprice"),

	/** 파라미터 오류 ( coinType 필수값 오류 ) */
	ERR_PARAMETER_COINTYPE("9118", "pinp.err.parameter.cointype"),

	/** 파라미터 오류 ( depositMoney 필수값 오류 ) */
	ERR_PARAMETER_DEPOSITMONEY("9119", "pinp.err.parameter.depositmoney"),

	/** 파라미터 오류 ( tradeMoney 필수값 오류 ) */
	ERR_PARAMETER_TRADEMONEY("9120", "pinp.err.parameter.trademoney"),

	/** 파라미터 오류 ( tradeDt 필수값 오류 ) */
	ERR_PARAMETER_TRADEDT("9121", "pinp.err.parameter.tradedt"),

	/** 파라미터 오류 ( mbtFee 필수값 오류 ) */
	ERR_PARAMETER_MBTFEE("9122", "pinp.err.parameter.mbtfee"),

	/** 파라미터 오류 ( moaFee 필수값 오류 ) */
	ERR_PARAMETER_MOAFEE("9123", "pinp.err.parameter.moafee"),

	/** 파라미터 오류 ( proSts 필수값 오류 ) */
	ERR_PARAMETER_PROSTS("9124", "pinp.err.parameter.prosts"),

	/** 파라미터 오류 ( cardPoint 필수값 오류 ) */
	ERR_PARAMETER_CARDPOINT("9125", "pinp.err.parameter.cardpoint"),

	/** 파라미터 오류 ( IOType 필수값 오류 ) */
	ERR_PARAMETER_IOTYPE("9126", "pinp.err.parameter.iotype"),

	/** 파라미터 오류 ( levelType 필수값 오류 ) */
	ERR_PARAMETER_LEVELTYPE("9127", "pinp.err.parameter.leveltype"),

	/** 파라미터 오류 ( blockValue 필수값 오류 ) */
	ERR_PARAMETER_BLOCKVALUE("9128", "pinp.err.parameter.blockvalue"),

	/** 파라미터 오류 ( memSts 필수값 오류 ) */
	ERR_PARAMETER_MEMSTS("9129", "pinp.err.parameter.memsts"),

	/** 파라미터 오류 ( publishYear 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHYEAR("9130", "pinp.err.parameter.publishyear"),

	/** 파라미터 오류 ( publishCnt 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHCNT("9131", "pinp.err.parameter.publishcnt"),

	/** 파라미터 오류 ( incomeYear 필수값 오류 ) */
	ERR_PARAMETER_INCOMEYEAR("9132", "pinp.err.parameter.incomeyear"),

	/** 파라미터 오류 ( incomeMonth 필수값 오류 ) */
	ERR_PARAMETER_INCOMEMONTH("9133", "pinp.err.parameter.incomemonth"),

	/** 파라미터 오류 ( incomeDate 필수값 오류 ) */
	ERR_PARAMETER_INCOMEDATE("9134", "pinp.err.parameter.incomedate"),

	/** 파라미터 오류 ( publishTypeInt 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHTYPEINT("9135", "pinp.err.parameter.publishtypeint"),

	/** 파라미터 오류 ( publishTypeCnt 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHTYPECNT("9136", "pinp.err.parameter.publishtypecnt"),

	/** 파라미터 오류 ( publishType 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHTYPE("9137", "pinp.err.parameter.publishtype"),

	/** 파라미터 오류 ( publishCode 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHCODE("9138", "pinp.err.parameter.publishcode"),

	/** 파라미터 오류 ( publishCodePW 필수값 오류 ) */
	ERR_PARAMETER_PUBLISHCODEPW("9139", "pinp.err.parameter.publishcodepw"),

	/** 파라미터 오류 ( money 필수값 오류 ) */
	ERR_PARAMETER_MONEY("9140", "pinp.err.parameter.money"),

	/** 파라미터 오류 ( networkFee 필수값 오류 ) */
	ERR_PARAMETER_NETWORKFEE("9141", "pinp.err.parameter.networkfee"),

	/** 파라미터 오류 ( treadFee 필수값 오류 ) */
	ERR_PARAMETER_TREADFEE("9142", "pinp.err.parameter.treadfee"),

	/** 파라미터 오류 ( quantity 필수값 오류 ) */
	ERR_PARAMETER_QUANTITY("9143", "pinp.err.parameter.quantity"),

	/** 파라미터 오류 ( memLevel ) */
	ERR_PARAMETER_MEMLEVEL("9144", "pinp.err.parameter.memlevel"),

	/** 파라미터 오류 ( oneTimeMaxIncome ) */
	ERR_PARAMETER_ONETIMEMAXINCOME("9145", "pinp.err.parameter.onetimemaxincome"),

	/** 파라미터 오류 ( oneTimeMaxTransMoney ) */
	ERR_PARAMETER_ONETIMEMAXTRANSMONEY("9146", "pinp.err.parameter.onetimemaxtransmoney"),

	/** 파라미터 오류 ( oneTimeMaxTransPoint ) */
	ERR_PARAMETER_ONETIMEMAXTRANSPOINT("9147", "pinp.err.parameter.onetimemaxtranspoint"),

	/** 파라미터 오류 ( oneTimeMaxTransAtm ) */
	ERR_PARAMETER_ONETIMEMAXTRANSATM("9148", "pinp.err.parameter.onetimemaxtransatm"),

	/** 파라미터 오류 ( oneDayMaxTransMoney ) */
	ERR_PARAMETER_ONEDAYMAXTRANSMONEY("9149", "pinp.err.parameter.onedaymaxtransmoney"),

	/** 파라미터 오류 ( oneDayMaxTransPoint ) */
	ERR_PARAMETER_ONEDAYMAXTRANSPOINT("9150", "pinp.err.parameter.onedaymaxtranspoint"),

	/** 파라미터 오류 ( oneDayMaxTransAtm ) */
	ERR_PARAMETER_ONEDAYMAXTRANSATM("9151", "pinp.err.parameter.onedaymaxtransatm"),

	/** 파라미터 오류 ( oneTimeMaxFranchiseTrade ) */
	ERR_PARAMETER_ONETIMEMAXFRANCHISETRADE("9152", "pinp.err.parameter.onetimemaxfranchisetrade"),

	/** 파라미터 오류 ( oneDayMaxFranchiseTrade ) */
	ERR_PARAMETER_ONEDAYMAXFRANCHISETRADE("9153", "pinp.err.parameter.onedaymaxfranchisetrade"),

	/** 파라미터 오류 ( memLevelComment )*/
	ERR_PARAMETER_MEMLEVELCOMMENT("9154", "pinp.err.parameter.memlevelcomment"),

	/** 파라미터 오류 ( oneDayMaxIncome ) */
	ERR_PARAMETER_ONEDAYMAXINCOME("9155", "pinp.err.parameter.onedaymaxincome"),

	/** 파라미터 오류 ( giftRefundSusuGubn ) */
	ERR_PARAMETER_GIFTREFUNDSUSUGUBN("9156", "pinp.err.parameter.giftrefundsusugubn"),

	/** 파라미터 오류 ( giftRefundSusuRate ) */
	ERR_PARAMETER_GIFTREFUNDSUSURATE("9157", "pinp.err.parameter.giftrefundsusurate"),

	/** 파라미터 오류 ( transNum ) */
	ERR_PARAMETER_TRANSNUM("9158", "pinp.err.parameter.transNum"),

	/** 파라미터 오류 ( traceNo ) */
	ERR_PARAMETER_TRACENO("9159", "pinp.err.parameter.traceno"),

	/** 파라미터 오류 ( idx ) */
	ERR_PARAMETER_IDX("9160", "pinp.err.parameter.idx"),

	/** 사용자 오류 ( 주민번호 오류 ) */
	ERR_USER_MEMJUMINO("1103", "pinp.err.user.memjumino"),

	/** 사용자 오류 ( 휴대폰번호 오류 ) */
	ERR_USER_MEMTEL("1104", "pinp.err.user.memtel"),

	/** 사용자 오류 ( CID 오류 ) */
	ERR_USER_CID("1105", "pinp.err.user.cid"),

	/** 사용자 오류 ( 주민번호 오류-만 20세 이하 )*/
	ERR_USER_MEMJUMINO_AGE("1106", "pinp.err.user.memjumino.age"),

	/** 사용자 오류 ( 조회 결과 없음 ) */
	ERR_USER_SEARCH_NO_RESULT("1107", "pinp.err.user.search.no-result"),

	/** 사용자 오류 ( 등록실패/탈퇴실패 )*/
	ERR_USER_FAIL("1108", "pinp.err.user.fail"),

	/** 카드 상태 오류 ( 추가인증필요 ) */
	ERR_CARD_STATUS_ADDITIONAL_AUTHENTICATION_REQUIRED("1109", "pinp.err.card.status.additional-authentication-required"),

	/** 카드 기명 등록 오류 */
	ERR_CARD_NAME_REGIST("1110", "pinp.err.card.name.regist"),

	/** 카드 기명 등록 오류 ( 계좌인증 실패 ) */
	ERR_CARD_NAME_REGIST_ACCOUNT_AUTHENTICATION_FAIL("1111", "pinp.err.card.name.regist.account.authentication.fail"),

	/** 카드 기명 등록 오류 ( 기등록 상태 )*/
	ERR_CARD_NAME_REGIST_STATUS_REGISTERED("1112", "pinp.err.card.name.regist.status.registered"),

	/** 카드 기명 등록 오류 ( 기명 등록 조회 실패 ) */
	ERR_CARD_NAME_REGIST_SEARCH_NAME_FAIL("1113", "pinp.err.card.name.regist.search-name.fail"),

	/** 카드 기명 등록 오류 ( 비대면인증처리중 ) */
	ERR_CARD_NAME_REGIST_AUTHENTICATION_NON_FACE_TO_FACE_PROGRESS("1114", "pinp.err.card.name.regist.authentication.non-face-to-face.progress"),

	/** 카드 기명 등록 오류 ( 보유 수량 초과 ) */
	ERR_CARD_NAME_REGIST_QUANTITY_EXCEEDED("1115", "pinp.err.card.name.regist.quantity.exceeded"),

	/** 카드 기명 등록 오류 ( 관리자 발급 제한 ) */
	ERR_CARD_NAME_REGIST_ADMIN_LIMIT("1116", "pinp.err.card.name.regist.admin.limit"),

	/** 카드 오류 */
	ERR_CARD("1200", "pinp.err.card"),

	/** 카드 오류 ( 미등록 카드 ) */
	ERR_CARD_UNREGISTERED("1201", "pinp.err.card.unregistered"),

	/* 카드 오류 ( 카드유효기간 불일치 ) **/
	ERR_CARD_VALIDITY_INCONSISTENCY("1202", "pinp.err.card.validity.inconsistency"),

	/** 카드 오류 ( 카드비밀번호 불일치 ) */
	ERR_CARD_CARDPW_INCONSISTENCY("1203", "pinp.err.card.cardpw.inconsistency"),

	/** 카드 오류 ( CVC번호 불일치 ) */
	ERR_CARD_CVC_INCONSISTENCY("1204", "pinp.err.card.cvc.inconsistenc"),

	/** 카드 오류 ( 조회 결과 없음 ) */
	ERR_CARD_CVC_NOT_FOUND("1205", "pinp.err.card.not-found"),

	/** 카드 상태 오류 */
	ERR_CARD_CVC_STATUS("1210", "pinp.err.card.status"),

	/** 카드 상태 오류 ( 입고상태 ) */
	ERR_CARD_CVC_STATUS_STOCK("1211", "pinp.err.card.status.stock"),

	/** 카드 상태 오류 ( 사용대기 ) */
	ERR_CARD_CVC_STATUS_STAND_BY("1212", "pinp.err.card.status.stand-by"),

	/** 카드 상태 오류 ( 정지 ) */
	ERR_CARD_CVC_STATUS_STOP("1213", "pinp.err.card.status.stop"),

	/** 카드 상태 오류 ( 폐기 )*/
	ERR_CARD_CVC_STATUS_DISCARD("1214", "pinp.err.card.status.discard"),

	/** 카드 상태 오류 ( 폐기 불가 ) */
	ERR_CARD_CVC_STATUS_DISCARD_IMPOSSIBLE("1215", "pinp.err.card.status.discard-impossible"),

	/** 카드 상태 오류 ( 환급 불가 ) */
	ERR_CARD_CVC_STATUS_REFUND_IMPOSSIBLE("1216", "pinp.err.card.status.refund-impossible"),

	/** 카드 상태 오류 ( 포인트보유 ) */
	ERR_CARD_CVC_STATUS_POINT("1217", "pinp.err.card.status.point"),

	/** 연계 서비스 관련 실패 */
	ERR_LINKED_SERVICE_FAIL("1300", "pinp.err.linked-service.fail"),

	/** 연계 서비스 호출 실패 */
	ERR_LINKED_SERVICE_CALL_FAIL("1301", "pinp.err.linked-service-call.fail"),

	/** 실명인증 실패 (실명인증 실패 ) */
	ERR_REAL_AUTHENTICATION_FAIL("1302", "pinp.err.real-authentication.fail"),

	/** 실명인증 실패 (해당자료 없음) */
	ERR_REAL_AUTHENTICATION_FAIL_NO_DATA("1303", "pinp.err.real-authentication.fail.no-data"),

	/** 실명인증 실패 (주민번호생성규칙 오류) */
	ERR_REAL_AUTHENTICATION_FAIL_MEMJUMIN_PATTERN("1304", "pinp.err.real-authentication.fail.memjumin-pattern"),

	/** 실명인증 실패 (명의도용차단 서비스 가입자 ) */
	ERR_REAL_AUTHENTICATION_FAIL_BLOCK_IMPERSONATION_SERVICE("1305", "pinp.err.real-authentication.fail.block-impersonation-service"),

	/** 본인계좌확인 실패 */
	ERR_ACCOUNT_VERIFICATION_FAIL("1306", "pinp.err.account-verification.fail"),

	/** 본인계좌확인 실패(은행기타오류) */
	ERR_ACCOUNT_VERIFICATION_FAIL_BANK_ERR("1307", "pinp.err.account-verification.fail.bank-err"),

	/** 본인계좌확인 실패(계좌정보없음) */
	ERR_ACCOUNT_VERIFICATION_FAIL_NO_ACCOUNT("1308", "pinp.err.account-verification.fail.no-account"),

	/** 가상계좌 발급 실패 */
	ERR_VACCOUNT_ISSUANCE_FAIL_FAIL("1400", "pinp.err.vaccount.fail"),
	
	/** 가상계좌 발급 실패(입금계좌없음) */
	ERR_VACCOUNT_ISSUANCE_FAIL_NO_ACCOUNT("1401", "pinp.err.vaccount.fail.no-account"),
	
	/** 가상계좌 발급 실패(발급제한 갯수초과) */
	ERR_VACCOUNT_ISSUANCE_FAIL_NO_LIST("1402", "pinp.err.vaccount.fail.no-list"),
	
	/** 가상계좌 발급 실패(발급제한 갯수초과) */
	ERR_VACCOUNT_ISSUANCE_FAIL_EXCEED_ACCOUNT("1403", "pinp.err.vaccount.fail.exceed-account"),

	/** 충전 실패 */
	ERR_CHARGING_FAIL("1500", "pinp.err.charging.fail"),

	/** 충전 실패( 충전금액 오류 ) */
	ERR_CHARGING_FAIL_AMOUNT("1501", "pinp.err.charging.fail.amount"),

	/** 충전 실패( 예치금 부족 ) */
	ERR_CHARGING_FAIL_LACK_OF_DEPOSIT("1502", "pinp.err.charging.fail.lack-of-deposit"),

	/** 충전 실패( 제휴사 정보 조회 결과 없음 ) */
	ERR_CHARGING_FAIL_NO_AFFILIATE("1503", "pinp.err.charging.fail.no-affiliate"),

	/** 충전 실패( 수수료 지불불가 ) */
	ERR_CHARGING_FAIL_NO_FEE_PAYABLE("1504", "pinp.err.charging.fail.no-fee-payable"),

	/** 충전 실패 ( 원장 조회 결과 없음 ) */
	ERR_CHARGING_FAIL_NO_LEDGER_INQUIRY_RESULTS("1505", "pinp.err.charging.fail.no-ledger-inquiry-results"),

	/** 충전 실패 ( 한도 초과 ), 충전 실패 ( 처리 불가 ) */
	ERR_CHARGING_FAIL_LIMIT_EXCESS("1506", "pinp.err.charging.fail.limit-excess"),

	/** 충전 실패 ( 중복 요청 ), 충전 실패 ( 익일충전가능 ) */
	ERR_CHARGING_FAIL_DUPLICATE_REQUEST("1507", "pinp.err.charging.fail.duplicate-request"),
	
	/** 충전 실패 ( 충전가능 시간 안됨 ) */
	ERR_CHARGING_FAIL_RECHARGEABLE_NEXT_DAY("1508", "pinp.err.charging.fail.rechargeable-next-day"),

	/** 충전 취소 실패 */
	ERR_CHARGING_CANCEL_FAIL("1600", "pinp.err.charging.cancel.fail"),

	/** 충전 취소 실패 ( 원장 조회 결과 없음 ) */
	ERR_CHARGING_CANCEL_FAIL_NO_LEDGER_INQUIRY_RESULTS("1601", "pinp.err.charging.cancel.fail.no-ledger-inquiry-results"),

	/** 충전 취소 실패 ( 취소 일자 오류 ) */
	ERR_CHARGING_CANCEL_FAIL_CANCEL_DATE("1602", "pinp.err.charging.cancel.fail.cancel-date"),

	/** 충전 취소 실패 ( 취소 충전 금액 불일치 ) */
	ERR_CHARGING_CANCEL_FAIL_CHARGING_AMOUNT_INCONSISTENCY("1603", "pinp.err.charging.cancel.fail.charging-amount-inconsistency"),

	/** 충전 취소 실패 ( 잔액 부족 ) */
	ERR_CHARGING_CANCEL_FAIL_LACK_OF_BALANCE("1604", "pinp.err.charging.cancel.fail.lack-of-balance"),

	/** 사용 실패 */
	ERR_USE_FAIL("1700", "pinp.err.use.fail"),

	/** 사용 실패 ( 잔액 부족 ) */
	ERR_USE_FAIL_LACK_OF_BALANCE("1701", "pinp.err.use.fail.lack-of-balance"),

	/** 사용 실패 ( 한도 초과 ) */
	ERR_USE_FAIL_LIMIT_EXCESS("1702", "pinp.err.use.fail.limit-excess"),

	/** 사용 실패 ( 사용금액 오류 ) */
	ERR_USE_FAIL_USAGE_AMOUNT_ERROR("1703", "pinp.err.use.fail.usage-amount-error"),

	/** 사용 실패 ( 계좌 조회 실패 ) */
	ERR_USE_FAIL_ACCOUNT_INQUIRY_FAILED("1704", "pinp.err.use.fail.account-inquiry-failed"),

	/** 사용 실패 ( 이체 실패 ) */
	ERR_USE_FAIL_TRANSFER_FAILED("1705", "pinp.err.use.fail.transfer-failed"),

	/** 사용 실패 ( 거래금액 불일치 ) */
	ERR_USE_FAIL_TRANSACTION_AMOUNT_MISMATCH("1706", "pinp.err.use.fail.transaction-amount-mismatch"),

	/** 사용 실패 ( 카드 소유주 불일치 ) */
	ERR_USE_FAIL_CARDHOLDER_MISMATCH("1707", "pinp.err.use.fail.cardholder-mismatch"),

	/** 사용 실패 ( 카드 비일번호 불일치 ) */
	ERR_USE_FAIL_CARD_PASSWORD_MISMATCH("1708", "pinp.err.use.fail.card-password-mismatch"),

	/** 사용 취소 실패 */
	ERR_USE_CANCEL_FAIL("1800", "pinp.err.use.cancel.fail"),

	/** 사용 취소 실패 ( 원장 조회 결과 없음 ) */
	ERR_USE_CANCEL_FAIL_NO_LEDGER_INQUIRY_RESULTS("1801", "pinp.err.use.cancel.fail.no-ledger-inquiry-results"),

	/** 사용 취소 실패 ( 취소 일자 오류 ) */
	ERR_USE_CANCEL_FAIL_CANCEL_DATE_ERROR("1802", "pinp.err.use.cancel.fail.cancel-date-error"),

	/** 사용 취소 실패 ( 취소 충전 금액 불일치 ) */
	ERR_USE_CANCEL_FAIL_CANCEL_AMOUNT_MISMATCH("1803", "pinp.err.use.cancel.fail.cancel-amount-mismatch"),

	/** 사용 취소 실패 ( 잔액 부족 ) */
	ERR_USE_CANCEL_FAIL_LACK_OF_BALANCE("1804", "pinp.err.use.cancel.fail.lack-of-balance"),

	/** 사용 취소 실패 ( 총판 정보 없음 ) */
	ERR_USE_CANCEL_FAIL_NO_DISTRIBUTOR_INFORMATION("1805", "pinp.err.use.cancel.fail.no-distributor-informatione"),

	/** 사용 취소 실패 ( 금액 불일치 ) */
	ERR_USE_CANCEL_FAIL_AMOUNT_MISMATCH("1806", "pinp.err.use.cancel.fail.amount-mismatch"),

	/** 사용 취소 실패 ( 취소 중복 요청 - 완료된 취소 재요청 ) */
	ERR_USE_CANCEL_FAIL_DUPLICATE_REQUEST("1807", "pinp.err.use.cancel.fail.duplicate-request"),

	/** 사용 취소 실패 ( 잘못된 Txid ) */
	ERR_USE_CANCEL_FAIL_WRONG_TXID("1808", "pinp.err.use.cancel.fail.wrong-txid"),

	/** 이체 실패 */
	ERR_TRANSFER_FAIL("1900", "pinp.err.transfer.fail"),

	/** 계좌정검중(이체 제한) */
	ERR_ACCOUNT_CHECK_IN_PROGRESS("1901", "pinp.err.account-check-in-progress"),

	/** 동일계좌 입출금 제한 */
	ERR_SAME_ACCOUNT_LOCK("1902", "pinp.err.same-account-lock"),

	/** 포인트 이체 모계좌 상이 */
	ERR_POINT_TRANSFER_ACCOUNT_DIFFERENT("1903", "pinp.err.point-transfer-account-different"),

	/** 이체 등록 실패 */
	ERR_TRANSFER_REGISTRATION_FAILED("2000", "pinp.err.transfer.registration-failed"),

	/** 이체 등록 실패(제휴사 정보 오류) */
	ERR_TRANSFER_REGISTRATION_FAILED_AFFILIATE_INFORMATION_ERROR("2001", "pinp.err.transfer.registration-failed.affiliate-information-error"),

	/** 이체 등록 실패(금액불일치) */
	ERR_TRANSFER_REGISTRATION_FAILED_AMOUNT_MISMATCH("2002", "pinp.err.transfer.registration-failed.amount-mismatch"),

	/** 이체 등록 실패(잔액부족) */
	ERR_TRANSFER_REGISTRATION_FAILED_LACK_OF_BALANCE("2003", "pinp.err.transfer.registration-failed.lack-of-balance"),

	/** 이체 등록 실패(원장 조회 결과 없음) */
	ERR_TRANSFER_REGISTRATION_FAILED_NO_LEDGER_INQUIRY_RESULTS("2004", "pinp.err.transfer.registration-failed.no-ledger-inquiry-results"),

	/** 이체 등록 실패(건별 이체 한도 초과) */
	ERR_TRANSFER_REGISTRATION_FAILED_TRANSFER_LIMIT_EXCEEDED_CASE_BY_CASE("2005", "pinp.err.transfer.registration-failed.transfer-limit-exceeded.case-by-case"),

	/** 이체 등록 실패(타인 계좌 이체 불가) */
	ERR_TRANSFER_REGISTRATION_FAILED_NO_TRANSFER_OTHER_PERSON_ACCOUNT("2006", "pinp.err.transfer.registration-failed.no-transfer.other-person-account"),

	/** 이체 등록 실패(대상 계좌정보 없음) */
	ERR_TRANSFER_REGISTRATION_FAILED_NO_TARGET_ACCOUNT("2007", "pinp.err.transfer.registration-failed.no-target-account"),

	/** 이체 등록 실패(입금 계좌 정보 없음) */
	ERR_TRANSFER_REGISTRATION_FAILED_NO_DEPOSIT_ACCOUNT("2008", "pinp.err.transfer.registration-failed.no-deposit-account"),

	/** 이체 등록 실패(전문 미개시 상태) */
	ERR_TRANSFER_REGISTRATION_FAILED_PROFESSIONAL_UNDISCLOSED_STATE("2009", "pinp.err.transfer.registration-failed.professional-undisclosed-state"),

	/** 이체 등록 실패(모계좌정보 없음) */
	ERR_TRANSFER_REGISTRATION_FAILED_NO_ACCOUNT("2010", "pinp.err.transfer.registration-failed.no-account"),

	/** 사용 내역 조회 실패 */
	ERR_SEARCH_USE_LIST_FAIL("2100", "pinp.err.search.use-list.fail"),

	/** 충전 내역 조회 실패 */
	ERR_SEARCH_charging_list_fail("2200", "pinp.err.search.charging-list.fail"),

	/** 관리자 요청 실패 */
	ERR_ADMIN_REQEUST_FAIL("2300", "pinp.err.admin-reqeust.fail"),

	/** 현재 사용중인 카드 */
	ERR_CARD_IN_USE("2301", "pinp.err.card-in-use"),

	/** 가맴정 연계 오류 */
	ERR_MERCHANT_LINKAGE("3000", "pinp.err.merchant-linkage"),

	/** 핀플넷 로그인 필요 */
	ERR_LOGIN_REQUIRED("3001", "pinp.err.login-required"),

	/** 제로페이 연계 오류 */
	ERR_ZEROPAY_PERISTALSIS("4000", "pinp.err.zeropay.peristalsis"),

	/** 사용된 QR */
	ERR_ZEROPAY_USED_QRCODE("4001", "pinp.err.zeropay.used-qrcode"),

	/** QR 조회 결과 없음 */
	ERR_ZEROPAY_NOT_FOUND_QRCODE("4002", "pinp.err.zeropay.not-found-qrcode"),

	/** QR 응답 결과 없음 */
	ERR_ZEROPAY_NO_RESPONSE_QRCODE("4003", "pinp.err.zeropay.no-response-qrcode"),

	/** 미등록 가맹점 */
	ERR_ZEROPAY_UNREGISTERED_FRANCHISEE("4004", "pinp.err.zeropay.unregistered-franchisee"),

	/** ARS 오류 */
	ERR_ARS("5000", "pinp.err.ars"),

	/** ARS 인증번호 없음 */
	ERR_ARS_NO_VERIFICATION_CODE("5001", "pinp.err.ars.no-verification-code"),

	/** ARS 인증요청 중복 요청 */
	ERR_ARS_DUPLICATE_REQUEST("5002", "pinp.err.ars.duplicate-request"),

	/** ARS 인증요청 정보 없음 */
	ERR_ARS_NO_INFORMATION("5003", "pinp.err.ars.no-information"),

	/** 필수파라미터 없음 */
	ERR_ARS_NONE_PARAMETER("5101", "pinp.err.ars.none.parameter"),

	/** 인증번호 불일치 */
	ERR_ARS_AUTHENTICATION_NUMBER_MISMATCH("5102", "pinp.err.ars.authentication.number.mismatch"),

	/** 전화연결실패 - 없는번호 */
	ERR_ARS_NONE_PHONENUMBER("5110", "pinp.err.ars.none.phonenumber"),

	/** 전화연결실패 - 전화 안받음(수신거부) */
	ERR_ARS_REJECT_CALL("5111", "pinp.err.ars.reject.call"),

	/** 전화연결실패 - 전화 안받음(Timeout) */
	ERR_ARS_TIMEOUT("5112", "pinp.err.ars.timeout"),

	/** 전화연결실패 - 착신전화 고객 */
	ERR_ARS_INCOMING_CALL("5113", "pinp.err.ars.incoming.call"),

	/** 인증 취소 - 고객의 통화종료 */
	ERR_ARS_CANCEL_CALL("5120", "pinp.err.ars.cancel.call"),

	/** 인증 취소 - 인증 허용시간 초과 */
	ERR_ARS_TIMEOVER("5123", "pinp.err.ars.timeover"),

	/** 인증 취소 - 아무 입력이 없었음 */
	ERR_ARS_NOT_INPUT("5124", "pinp.err.ars.not-input"),

	/** KT법인폰 미인증 */
	ERR_ARS_UNCERTIFIED_KT("5131", "pinp.err.ars.uncertified-kt"),

	/** 본인인증 실패 공통 */
	ERR_ARS_AUTHENTICATION_FAIL("5132", "pinp.err.ars.authentication.fail"),

	/** 검증실패(검증 전문 오류) */
	ERR_ARS_ERR_TRANSMITTED_TEXT("5135", "pinp.err.ars.err-transmitted-text"),

	/** 검증요청 재전송 횟수 초과 */
	ERR_ARS_AUTHENTICATION_NUMBER_OVER("5136", "pinp.err.ars.authentication-number.over"),

	/** 검증실패(요청정보 없음) */
	ERR_ARS_NO_REQUEST("5137", "pinp.err.ars.no-request"),

	/** 본인인증 실패 기타 */
	ERR_ARS_AUTHENTICATION_FAIL_ETC("5139", "pinp.err.ars.authentication.fail-etc"),

	/** 실패 기타 */
	ERR_ARS_FAIL_ETC("5199", "pinp.err.ars.fail-etc"),

	/** 충전권 오류 */
	ERR_RECHARGE_VOUCHER("8400", "pinp.err.recharge-voucher"),

	/** 조회 결과 없음 */
	ERR_SEARCH_NO_RESULT("8401", "pinp.err.search.no-result"),

	/** 등록 실패 */
	ERR_REGIST_FAIL("8402", "pinp.err.regist.fail"),

	/** 처리 불가 */
	ERR_UNABLE_TO_PROCESS("8403", "pinp.err.unable-to-process"),

	/** [RestClientException] Socket Timeout */
	ERR_SOCKETTIMEOUT("9995", "common.err.sockettimeout"),

	/** 카드 비밀번호 확인 시 불일치 */
	ERR_CARD_PASSWORD_MISMATCH("9996", "member.validation.cardPw.check"),

	/** [RestClientException] API 통신 오류  */
	ERR_RESTCLIENT("9997", "common.err.restclient"),

	/** [JsonProcessingException] JSON 동작 오류 */
	ERR_JSONPROCESSING("9998", "common.err.jsonprocessing"),

	/** [ERROR] 알 수 없는 오류 */
	ERR_UNKNOWN("9999", "common.err.unknown")
	;
	
	/**
	 * 결과 코드
	 */
	private String code;

	/**
	 * 결과 메시지
	 */
	private String message;

	PinApiResultEnum(String code, String message) {

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

	/**
	 * ResultCodeEnum 에서 결과 코드로 Enum value 찾는 Function
	 * @param code	찾고 싶은 결과 코드
	 * @return		PinApiResultEnum 값
	 */
	public static PinApiResultEnum findByCode(String code) {

		for(PinApiResultEnum resultCodeEnum : values()) {

			if(resultCodeEnum.getCode().equals(code)) {

				return resultCodeEnum;
			}
		}

		return null;
	}

	/**
	 * ResultCodeEnum 에서 결과 코드로 Enum value 찾아 결과 메시지 리턴하는 Function
	 * @param code	찾고 싶은 결과 코드
	 * @return		결과 메시지
	 */
	public static String findByCodeMessage(String code) {

		for(PinApiResultEnum resultCodeEnum : values()) {

			if(resultCodeEnum.getCode().equals(code)) {

				return resultCodeEnum.getMessage();
			}
		}

		return null;
	}
}
