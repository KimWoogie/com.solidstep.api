package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetJobListByAuditNoRequest;
import com.solidstep.api.ssr.parameters.response.GetJobListByAuditNoResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetJobListByAuditNoHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetJobListByAuditNoResponse> handle(Object ssrRequest) {
		GetJobListByAuditNoRequest getJobListByAuditNoRequest = (GetJobListByAuditNoRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getJobListByAuditNoRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getJobListByAuditNoRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetJobListByAuditNoResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetJobListByAuditNoResponse> result = new SSRApiResult<GetJobListByAuditNoResponse>(resultList);
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
		GetJobListByAuditNoRequest getJobListByAuditNoRequest = (GetJobListByAuditNoRequest)ssrRequest;
		if(StringUtils.isEmpty(getJobListByAuditNoRequest.getAuditGroupNo())){
			logger.error("[auditGroupNo] field is mandatory.");
			return false;
		}
		return true;
	}

}