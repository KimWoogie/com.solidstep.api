package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetAgentGroupInfoRequest;
import com.solidstep.api.ssr.parameters.response.GetAgentGroupInfoResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetAgentGroupInfoHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetAgentGroupInfoResponse> handle(Object ssrRequest) {
		GetAgentGroupInfoRequest getAgentGroupInfoRequest = (GetAgentGroupInfoRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getAgentGroupInfoRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getAgentGroupInfoRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetAgentGroupInfoResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetAgentGroupInfoResponse> result = new SSRApiResult<GetAgentGroupInfoResponse>(resultList);
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
	protected boolean validate(Object ssrRequest) {
		return true;
	}

}