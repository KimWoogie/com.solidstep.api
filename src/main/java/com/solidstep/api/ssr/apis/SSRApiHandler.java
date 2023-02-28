package com.solidstep.api.ssr.apis;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.core.SSRApiCaller;
import com.solidstep.api.ssr.exception.SSRApiRuntimeException;
import com.solidstep.api.ssr.parameters.SSRRequest;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public abstract class SSRApiHandler {

	public Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	public abstract Object handle(Object ssrRequest);
	
	protected abstract boolean validate(Object ssrRequest);
	
	public String ssrApiCall(SSRRequest ssrRequest){
		
		SSRApiUtils.initialize(ssrRequest);
		
		if(validate(ssrRequest)){
			if(logger.isDebugEnabled()){
				logger.debug("[SSR API validated.] infomation : " + ssrRequest.toString());
			}
		}else{
			logger.error("[[It was occurred when calling SSR API.] infomation : " + ssrRequest.toString());
			throw new SSRApiRuntimeException("[[It was occurred when calling SSR API.] infomation : "+ssrRequest.toString());
		}
		
		if(logger.isDebugEnabled()){
			logger.debug("[SSR API Called. API ID : "+ssrRequest.getApiId()+"]");
			logger.debug("[SSR API request parameters. : "+ssrRequest.toString()+"]");
		}
		
		String apiId = ssrRequest.getApiId();
		String principle = ssrRequest.getPrinciple();
		String credential = ssrRequest.getCredential();
		String[] exceptFieldNames = new String[2];
		exceptFieldNames[0] = SSRApiConstants.SSR_API_ID;
		exceptFieldNames[1] = SSRApiConstants.SSR_API_JSON_RESULT_KEY;
		List<Map<String,Object>> extractParametersOnRequestObject = SSRApiUtils.exceptFieldsOfObject(ssrRequest, exceptFieldNames);
		String apiCallResult = SSRApiCaller.apiCall(
				apiId
				, extractParametersOnRequestObject
				, principle
				, credential
				, SSRApiConstants.SSR_API_URL_SCHEME
				, SSRApiConstants.SSR_API_URL_HOST
				, SSRApiConstants.SSR_API_ENDPOINT_URL
				);
		return apiCallResult;
	}
}