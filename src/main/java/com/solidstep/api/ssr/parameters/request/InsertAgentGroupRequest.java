package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class InsertAgentGroupRequest extends SSRRequest{

	private String groupEngName;
	private String groupName;
	private String isInstallgroup;
	private String isSuper;
	
	public InsertAgentGroupRequest() {
		super.apiId = "insertAgentGroup";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
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

}