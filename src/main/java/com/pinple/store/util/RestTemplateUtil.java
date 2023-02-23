package com.pinple.store.util;


import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

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
	
	public ResponseVO requsetPost(String path, Object object) {


		String requestURL = path;

		try {
			//인증서 무시
			sslTrustAllCerts();
			
			String params = objectMapper.writeValueAsString(object);

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
			
}
