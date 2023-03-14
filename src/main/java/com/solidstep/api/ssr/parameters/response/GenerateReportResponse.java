package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GenerateReportResponse extends SSRResponse{

	public GenerateReportResponse() {
		super.apiId = "generateReport";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}