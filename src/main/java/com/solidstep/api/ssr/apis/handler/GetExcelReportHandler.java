package com.solidstep.api.ssr.apis.handler;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.solidstep.api.ssr.utils.StringUtils;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.constants.SSRExcelReportType;
import com.solidstep.api.ssr.domain.SSRApiResult;
import com.solidstep.api.ssr.parameters.request.GetExcelReportRequest;
import com.solidstep.api.ssr.parameters.response.GetExcelReportResponse;
import com.solidstep.api.ssr.utils.SSRApiUtils;

public class GetExcelReportHandler extends SSRApiHandler{

	@Override
	public SSRApiResult<GetExcelReportResponse> handle(Object ssrRequest) {
		GetExcelReportRequest getExcelReportRequest = (GetExcelReportRequest)ssrRequest;
		String apiResultString = this.ssrApiCall(getExcelReportRequest);
		JSONObject resultInfoGenerate = SSRApiUtils.resultInfoGenerate(apiResultString);
		String apiJsonResultKey = getExcelReportRequest.getApiJsonResultKey();
		List<Object> resultList = SSRApiUtils.listResultObjectMapping(GetExcelReportResponse.class, apiResultString, apiJsonResultKey);
		SSRApiResult<GetExcelReportResponse> result = new SSRApiResult<GetExcelReportResponse>(resultList);
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
		GetExcelReportRequest getExcelReportRequest = (GetExcelReportRequest)ssrRequest;
		if(StringUtils.isEmpty(getExcelReportRequest.getAtemplateNoArray())){
			logger.error("[atemplateNoArray] field is mandatory.");
			return false;
		}
		
		String reportType = getExcelReportRequest.getReportType();
		if(StringUtils.isEmpty(reportType)){
			logger.error("[reportType] field is mandatory.");
			return false;
		}
		
		switch(SSRExcelReportType.getSSRExcelReportType(reportType)){
		case ALL_REPORT :
		case SUMMURY_REPORT :
			if(StringUtils.isEmpty(getExcelReportRequest.getAuditGroupNoArray())){
				logger.error("[auditGroupNoArray] field is mandatory.");
				return false;
			}
			break;
		case GROUP_REPORT :
			if(StringUtils.isEmpty(getExcelReportRequest.getAuditGroupNoArray())){
				logger.error("[auditGroupNoArray] field is mandatory.");
				return false;
			}
			if(StringUtils.isEmpty(getExcelReportRequest.getAgentGroupNoArray())){
				logger.error("[agentGroupNoArray] field is mandatory.");
				return false;
			}
			break;
		case SEVERAL_REPORT :
			if(StringUtils.isEmpty(getExcelReportRequest.getAuditGroupNoArray())){
				logger.error("[auditGroupNoArray] field is mandatory.");
				return false;
			}
			if(StringUtils.isEmpty(getExcelReportRequest.getAgentGroupNoArray())){
				logger.error("[agentGroupNoArray] field is mandatory.");
				return false;
			}
			if(StringUtils.isEmpty(getExcelReportRequest.getAlinkNoArray())){
				logger.error("[alinkNoArray] field is mandatory.");
				return false;
			}
			break;
		default : 
			return false;
		}
		
		return true;
	}

}