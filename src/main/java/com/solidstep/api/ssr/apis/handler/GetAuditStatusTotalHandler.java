package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetAuditStatusTotalRequest;
import com.solidstep.api.ssr.parameters.response.GetAuditStatusTotalResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetAuditStatusTotalHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetAuditStatusTotalResponse> handle(Object ssrRequest) {
		GetAuditStatusTotalRequest getAuditStatusTotalRequest = (GetAuditStatusTotalRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getAuditStatusTotalRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getAuditStatusTotalRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetAuditStatusTotalResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetAuditStatusTotalResponse> result = new SSRApiResult<GetAuditStatusTotalResponse>(resultList);
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
		GetAuditStatusTotalRequest getAuditStatusTotalRequest = (GetAuditStatusTotalRequest)ssrRequest;
		if(StringUtils.isEmpty(getAuditStatusTotalRequest.getAuditGroupNoArray())){
			logger.error("[auditGroupNoArray] field is mandatory.");
			return false;
		}
		return true;
	}

}