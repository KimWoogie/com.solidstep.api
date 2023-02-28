package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetResultAuditSummaryRequest;
import com.solidstep.api.ssr.parameters.response.GetResultAuditSummaryResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetResultAuditSummaryHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetResultAuditSummaryResponse> handle(Object ssrRequest) {
		GetResultAuditSummaryRequest getResultAuditSummaryRequest = (GetResultAuditSummaryRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getResultAuditSummaryRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getResultAuditSummaryRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetResultAuditSummaryResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetResultAuditSummaryResponse> result = new SSRApiResult<GetResultAuditSummaryResponse>(resultList);
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
		GetResultAuditSummaryRequest getResultAuditSummaryRequest = (GetResultAuditSummaryRequest)ssrRequest;
		if(StringUtils.isEmpty(getResultAuditSummaryRequest.getAtemplateNoArray())){
			logger.error("[atemplateNoArray] field is mandatory.");
			return false;
		}
		
		if(StringUtils.isEmpty(getResultAuditSummaryRequest.getAuditGroupNoArray())){
			logger.error("[auditGroupNoArray] field is mandatory.");
			return false;
		}
 
		return true;
	}

}