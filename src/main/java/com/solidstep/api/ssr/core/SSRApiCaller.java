package com.solidstep.api.ssr.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.exception.SSRApiRuntimeException;

public class SSRApiCaller {

	public static String apiCall(String apiId, List<Map<String, Object>> parameters, String principle, String credential, String ssrApiUrlScheme, String ssrApiUrlDomain, String ssrApiUrlPath){
		if(apiId == null){
			throw new SSRApiRuntimeException("[apiId]field is mandatory. please set up [apiId].");
		}
		
		if(principle == null){
			throw new SSRApiRuntimeException("[principle]field is mandatory. please set up [principle].");
		}
		
		if(credential == null){
			throw new SSRApiRuntimeException("[credential]field is mandatory. please set up [credential].");
		}
		
		String apiResultString = null;
		String solidStepAuthenticationToken = principle.concat(SSRApiConstants.SSR_API_AUTHORIZATION_DELIMITER).concat(credential);
		ByteArrayOutputStream byteArrayOutputStream = null;
		CloseableHttpResponse closeableHttpResponse = null;
		CloseableHttpClient closeableHttpClient = null;
		HttpGet httpGet = null;
		try {
			String encodeToString = Base64.getEncoder().encodeToString(solidStepAuthenticationToken.getBytes(SSRApiConstants.SSR_API_DEFAULT_CHARSET));
			closeableHttpClient = HttpClients.createDefault();
			URIBuilder uriBuilder = new URIBuilder();
			uriBuilder
			.setScheme(ssrApiUrlScheme)
			.setHost(ssrApiUrlDomain)
			.setPath(ssrApiUrlPath)
			.setParameter(SSRApiConstants.SSR_API_ID, apiId)
			;
			
			int parameterSize = parameters.size();
			if(parameterSize > 0){
				for(Map<String, Object> paramMap : parameters){
					for(Iterator<Entry<String, Object>> i = paramMap.entrySet().iterator();i.hasNext();) {
						Entry<String, Object> e = i.next();
						String key = e.getKey();
						Object value = e.getValue();
						uriBuilder.setParameter(key, (String) value);
					}
				}
			}

			URI build = uriBuilder.build();
			httpGet = new HttpGet(build);
			httpGet.addHeader(SSRApiConstants.SSR_API_AUTHORIZATION_HEADER_KEY, SSRApiConstants.SSR_API_AUTHORIZATION_HEADER_VALUE_PREFIX + encodeToString);
			closeableHttpResponse = closeableHttpClient.execute(httpGet);
			HttpEntity entity = closeableHttpResponse.getEntity();
			byteArrayOutputStream = new ByteArrayOutputStream();
			entity.writeTo(byteArrayOutputStream);
			apiResultString = new String(byteArrayOutputStream.toByteArray(), SSRApiConstants.SSR_API_DEFAULT_CHARSET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} finally {
			try {
				if(byteArrayOutputStream != null){
					byteArrayOutputStream.close();
				}
				if(closeableHttpResponse != null){
					closeableHttpResponse.close();
				}
				if(closeableHttpClient != null){
					closeableHttpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return apiResultString;
	}
	
	public static File downloadApiCall(){
		
		return null;
	}
	
}