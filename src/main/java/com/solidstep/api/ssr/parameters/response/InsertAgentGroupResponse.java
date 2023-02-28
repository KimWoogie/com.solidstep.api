package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class InsertAgentGroupResponse extends SSRResponse{

	public InsertAgentGroupResponse() {
		super.apiId = "insertAgentGroup";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}