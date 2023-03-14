package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class DeleteAgentGroupResponse extends SSRResponse{

	public DeleteAgentGroupResponse() {
		super.apiId = "deleteAgentGroup";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}