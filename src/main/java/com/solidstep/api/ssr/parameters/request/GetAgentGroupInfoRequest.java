package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetAgentGroupInfoRequest extends SSRRequest{

	private String agentGroupNoArray;
	private String agentGroupName;
	private String isEnable;
	private String groupType;
	private String limit;
	private String offset;
	
	public GetAgentGroupInfoRequest() {
		super.apiId = "getAgentGroupInfo";
		super.apiJsonResultKey = "agentGroupInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAgentGroupNoArray() {
		return agentGroupNoArray;
	}

	public void setAgentGroupNoArray(String agentGroupNoArray) {
		this.agentGroupNoArray = agentGroupNoArray;
	}

	public String getAgentGroupName() {
		return agentGroupName;
	}

	public void setAgentGroupName(String agentGroupName) {
		this.agentGroupName = agentGroupName;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

}