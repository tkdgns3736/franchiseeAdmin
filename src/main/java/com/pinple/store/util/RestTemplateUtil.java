package com.pinple.store.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import javax.naming.AuthenticationException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pinple.store.common.vo.ResponseVO;

@Component
public class RestTemplateUtil {
	
	/**
	 * logger 객체
	 */
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * objectMapper 객체
	 */
	@Autowired
	private ObjectMapper objectMapper;
	/**
	 * restTemplate 객체
	 */
	@Autowired
	private ResponseVO responseVO;
	
	public ResponseVO requsetPost(String path, Map<String, Object> paramMap) {

		String requestURL = path;

		try {
			//인증서 무시
			sslTrustAllCerts();
			
			String params = objectMapper.writeValueAsString(paramMap);

			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

			HttpEntity<String> entity = new HttpEntity<>(params, httpHeaders);

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> responseEntity = restTemplate.exchange(requestURL, HttpMethod.POST, entity, String.class);
			if(responseEntity == null || StringUtils.isEmpty(responseEntity.getBody())) {

				throw new RestClientException(null);
			}
			
			log.info("### path"+" ::: " +requestURL);
			responseVO = parseRespovesVO(responseEntity.getBody());

		} catch (RestClientException e) {
			e.printStackTrace();

			responseVO.setResultCode("9999");

		} catch (JsonProcessingException e) {
			e.printStackTrace();

			responseVO.setResultCode("9999");

		} catch (Exception e) {
			e.printStackTrace();

			responseVO.setResultCode("9999");;

		}

		return responseVO;
	}
	
	private ResponseVO parseRespovesVO(String jsonStr) throws JsonMappingException, JsonProcessingException {

		Map<String, Object> _params = objectMapper.readValue(jsonStr, Map.class);

		Map<String, Object> params = new HashMap<>();
		for(Map.Entry<String, Object> ele : _params.entrySet()) {

			log.info("### " + ele.getKey() + " ::: " + ele.getValue());
			if(ele.getKey().equals("storeSeq")) {

				responseVO.setStoreSeq(ele.getValue().toString());
			} else if(ele.getKey().equals("result")) {

				responseVO.setResult(ele.getValue().toString());
			} else if(ele.getKey().equals("resultCode")) {

				responseVO.setResultCode(ele.getValue().toString());
			} else {

				params.put(ele.getKey(), ele.getValue());
			}
		}
		log.info("######### " + "parseRespovesVO End ");
		responseVO.setParams(params);

		return responseVO;
	}
	//ssl 인증서 무시 코드
	public static void sslTrustAllCerts(){
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			    public X509Certificate[] getAcceptedIssuers() {
			    	return null;
			    }
		
			    public void checkClientTrusted(X509Certificate[] certs, String authType) {
		
			    }
			
			    public void checkServerTrusted(X509Certificate[] certs, String authType) {
			
			    }
			}
		};
		
		SSLContext sc;
		try {
			sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
	}
		
//	public static Map<String, Object> httpPostBodyConnection(String UrlData, Map<String, Object> Param) throws JsonProcessingException{
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//	
//		String ParamData ="";
//	
//		//ParamData = objectMapper.writeValueAsString(this.Param);
//		
//		//http 요청 시 필요한 url 주소를 변수 선언
//		String totalUrl = "";
//		totalUrl = UrlData.trim().toString();
//		//http 통신을 하기위한 객체 선언 실시
//		URL url = null;
//		HttpURLConnection conn = null;
//		BufferedReader br = null;
//
//		try {
//			//ssl 무시 코드
//			sslTrustAllCerts();
//			//파라미터로 들어온 url을 사용해 connection 실시
//			url = new URL(totalUrl);	
//			conn = (HttpURLConnection) url.openConnection();
//	        
//			//http 요청에 필요한 타입 정의 실시
//			conn.setRequestMethod("POST");
//			conn.setRequestProperty("Content-Type", "application/json; utf-8"); //post body json으로 던지기 위함
//			conn.setRequestProperty("Accept", "application/json");
//			conn.setDoOutput(true); //OutputStream을 사용해서 post body 데이터 전송
//			try (OutputStream os = conn.getOutputStream()){
//				byte request_data[] = String.valueOf(ParamData).getBytes("utf-8");
//				os.write(request_data);
//				os.close();
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}										        	            
//	        
//			//http 요청 실시
//			conn.connect();
//			System.out.println("http 요청 방식 : "+"POST BODY JSON");
//			System.out.println("http 요청 타입 : "+"application/json");
//			System.out.println("http 요청 주소 : "+UrlData);
//			System.out.println("http 요청 데이터 : "+ParamData);
//			System.out.println("");
//	        
//			  // 응답 내용(BODY) 구하기        
//	        try (InputStream in = conn.getInputStream();    
//	                ByteArrayOutputStream out = new ByteArrayOutputStream()) {
//	            
//	            byte[] buf = new byte[1024 * 8];
//	            int length = 0;
//	            while ((length = in.read(buf)) != -1) {
//	                out.write(buf, 0, length);
//	            } 
//	            //json to mapper
//	            String sJson = new String(out.toByteArray(), "UTF-8");
//	            ObjectMapper mapper = new ObjectMapper();
//	               
//	            
//	            
//	            map = mapper.readValue(sJson, Map.class);
//	            
//	        }
//	            // 접속 해제
//	            conn.disconnect();
// 
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally { 
//			//http 요청 및 응답 완료 후 BufferedReader를 닫아줍니다
//			try {
//				if (br != null) {
//					br.close();	
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return map;	 		
//	}
//
//
//
	
}
