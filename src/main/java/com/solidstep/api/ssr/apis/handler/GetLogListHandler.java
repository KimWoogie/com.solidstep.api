package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetLogListRequest;
import com.solidstep.api.ssr.parameters.response.GetLogListResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetLogListHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetLogListResponse> handle(Object ssrRequest) {
		GetLogListRequest getLogListRequest = (GetLogListRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getLogListRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getLogListRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetLogListResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetLogListResponse> result = new SSRApiResult<GetLogListResponse>(resultList);
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
		GetLogListRequest getLogListRequest = (GetLogListRequest)ssrRequest;
		if(StringUtils.isEmpty(getLogListRequest.getNeedData())){
			logger.error("[needData] field is mandatory.");
			return false;
		}
		
		return true;
	}

}