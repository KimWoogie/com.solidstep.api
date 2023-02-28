package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class MoveAgentGroupRequest extends SSRRequest{

	private String orgAgentGroupNoArray;
	private String agentGroupNo;
	private String alinkNoArray;
	
	public MoveAgentGroupRequest() {
		super.apiId = "moveAgentGroup";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getOrgAgentGroupNoArray() {
		return orgAgentGroupNoArray;
	}

	public void setOrgAgentGroupNoArray(String orgAgentGroupNoArray) {
		this.orgAgentGroupNoArray = orgAgentGroupNoArray;
	}

	public String getAgentGroupNo() {
		return agentGroupNo;
	}

	public void setAgentGroupNo(String agentGroupNo) {
		this.agentGroupNo = agentGroupNo;
	}

	public String getAlinkNoArray() {
		return alinkNoArray;
	}

	public void setAlinkNoArray(String alinkNoArray) {
		this.alinkNoArray = alinkNoArray;
	}

}