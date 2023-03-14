package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class DeleteAgentGroupRequest extends SSRRequest{

	private String agentGroupNo;
	
	public DeleteAgentGroupRequest() {
		super.apiId = "deleteAgentGroup";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAgentGroupNo() {
		return agentGroupNo;
	}

	public void setAgentGroupNo(String agentGroupNo) {
		this.agentGroupNo = agentGroupNo;
	}

}