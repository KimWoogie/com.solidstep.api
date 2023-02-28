package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetAgentGroupInfoResponse extends SSRResponse{

	private String agentGroupNo;
	private String authUserNos;
	private String createdUserNo;
	private String groupEngName;
	private String groupName;
	private String groupType;
	private String isActive;
	private String isEnable;
	private String isInstallgroup;
	private String isSuper;
	private String linkInfo;
	private String parentAgentGroupNo;
	
	public GetAgentGroupInfoResponse() {
		super.apiId = "getAgentGroupInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAgentGroupNo() {
		return agentGroupNo;
	}

	public void setAgentGroupNo(String agentGroupNo) {
		this.agentGroupNo = agentGroupNo;
	}
	
	public String getAuthUserNos() {
		return authUserNos;
	}

	public void setAuthUserNos(String authUserNos) {
		this.authUserNos = authUserNos;
	}

	public String getCreatedUserNo() {
		return createdUserNo;
	}

	public void setCreatedUserNo(String createdUserNo) {
		this.createdUserNo = createdUserNo;
	}

	public String getGroupEngName() {
		return groupEngName;
	}

	public void setGroupEngName(String groupEngName) {
		this.groupEngName = groupEngName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getIsInstallgroup() {
		return isInstallgroup;
	}

	public void setIsInstallgroup(String isInstallgroup) {
		this.isInstallgroup = isInstallgroup;
	}

	public String getIsSuper() {
		return isSuper;
	}

	public void setIsSuper(String isSuper) {
		this.isSuper = isSuper;
	}

	public String getLinkInfo() {
		return linkInfo;
	}

	public void setLinkInfo(String linkInfo) {
		this.linkInfo = linkInfo;
	}

	public String getParentAgentGroupNo() {
		return parentAgentGroupNo;
	}

	public void setParentAgentGroupNo(String parentAgentGroupNo) {
		this.parentAgentGroupNo = parentAgentGroupNo;
	}

}