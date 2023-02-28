package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetAssetScoreInfoRequest;
import com.solidstep.api.ssr.parameters.response.GetAssetScoreInfoResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetAssetScoreInfoHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetAssetScoreInfoResponse> handle(Object ssrRequest) {
		GetAssetScoreInfoRequest getAssetScoreInfoRequest = (GetAssetScoreInfoRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getAssetScoreInfoRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getAssetScoreInfoRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetAssetScoreInfoResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetAssetScoreInfoResponse> result = new SSRApiResult<GetAssetScoreInfoResponse>(resultList);
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
		GetAssetScoreInfoRequest getAssetScoreInfoRequest = (GetAssetScoreInfoRequest)ssrRequest;
		if(StringUtils.isEmpty(getAssetScoreInfoRequest.getAtemplateNo())){
			logger.error("[atemplateNo] field is mandatory.");
			return false;
		}
		return true;
	}

}