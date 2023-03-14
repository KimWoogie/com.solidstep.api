package com.solidstep.api.ssr.apis.handler;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.InsertAssetInfoRequest;
import com.solidstep.api.ssr.parameters.response.InsertAssetInfoResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class InsertAssetInfoHandler extends SSRApiHandler {
	
	@Override
	public SSRApiResult<InsertAssetInfoResponse> handle(Object ssrRequest) {
		InsertAssetInfoRequest insertAssetInfoRequest = (InsertAssetInfoRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(insertAssetInfoRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = insertAssetInfoRequest.getApiJsonResultKey();
		Object resultObject = SSRApiUtils.oneResultObjectMapping(InsertAssetInfoResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<InsertAssetInfoResponse> result = new SSRApiResult<InsertAssetInfoResponse>(resultObject);
		try {
			result.setIsOk(resultInfoGenerate.getInt(SSRApiConstants.SSR_API_RESULT_INFO_KEY_ISOK));
			result.setDataCount(resultInfoGenerate.getInt(SSRApiConstants.SSR_API_RESULT_INFO_KEY_DATACOUNT));
			if(resultInfoGenerate.has(SSRApiConstants.SSR_API_RESULT_INFO_KEY_ERRINFO)){
				result.setErrInfo(resultInfoGenerate.getString(SSRApiConstants.SSR_API_RESULT_INFO_KEY_ERRINFO));
			}else{
				result.setErrInfo(SSRApiUtils.resultErrorInfo(apiResultString));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	protected boolean validate(Object ssrRequest){
		// TODO Auto-generated method stub
		return false;
	}
	
}