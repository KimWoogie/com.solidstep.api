package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetAuditProgressRequest;
import com.solidstep.api.ssr.parameters.response.GetAuditProgressResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetAuditProgressHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetAuditProgressResponse> handle(Object ssrRequest) {
		GetAuditProgressRequest getAuditProgressRequest = (GetAuditProgressRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getAuditProgressRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getAuditProgressRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetAuditProgressResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetAuditProgressResponse> result = new SSRApiResult<GetAuditProgressResponse>(resultList);
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
		GetAuditProgressRequest getAuditProgressRequest = (GetAuditProgressRequest)ssrRequest;
		if(StringUtils.isEmpty(getAuditProgressRequest.getAlinkNoArray())){
			logger.error("[alinkNoArray] field is mandatory.");
			return false;
		}
		return true;
	}

}
