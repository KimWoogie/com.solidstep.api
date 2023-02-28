package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class StartAuditResponse extends SSRResponse{

	public StartAuditResponse() {
		super.apiId = "startAudit";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}
