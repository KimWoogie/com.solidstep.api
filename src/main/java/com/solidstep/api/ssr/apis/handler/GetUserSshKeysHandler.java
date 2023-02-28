package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetUserSshKeysRequest;
import com.solidstep.api.ssr.parameters.response.GetUserSshKeysResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetUserSshKeysHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetUserSshKeysResponse> handle(Object ssrRequest) {
		GetUserSshKeysRequest getUserSshKeysRequest = (GetUserSshKeysRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getUserSshKeysRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getUserSshKeysRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetUserSshKeysResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetUserSshKeysResponse> result = new SSRApiResult<GetUserSshKeysResponse>(resultList);
		try {
			result.setIsOk(resultInfoGenerate.getInt(SSRApiConstants.SSR_API_RESULT_INFO_KEY_ISOK));
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
	protected boolean validate(Object ssrRequest) {
		return true;
	}

}