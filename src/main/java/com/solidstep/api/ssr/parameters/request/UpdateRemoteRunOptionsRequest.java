package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class UpdateRemoteRunOptionsRequest extends SSRRequest{

	private String assetNo;
	private String remoteRunConnectionType;
	private String remoteRunFilePath;
	private String remoteRunId;
	private String remoteRunIp;
	private String remoteRunPassword;
	private String remoteRunRootPassword;
	private String remoteRunType1;
	private String remoteRunType1Port;
	private String remoteRunType2;
	private String remoteRunType2Port;
	private String useRemoteRun;
	
	public UpdateRemoteRunOptionsRequest() {
		super.apiId = "updateRemoteRunOptions";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getRemoteRunConnectionType() {
		return remoteRunConnectionType;
	}

	public void setRemoteRunConnectionType(String remoteRunConnectionType) {
		this.remoteRunConnectionType = remoteRunConnectionType;
	}

	public String getRemoteRunFilePath() {
		return remoteRunFilePath;
	}

	public void setRemoteRunFilePath(String remoteRunFilePath) {
		this.remoteRunFilePath = remoteRunFilePath;
	}

	public String getRemoteRunId() {
		return remoteRunId;
	}

	public void setRemoteRunId(String remoteRunId) {
		this.remoteRunId = remoteRunId;
	}

	public String getRemoteRunIp() {
		return remoteRunIp;
	}

	public void setRemoteRunIp(String remoteRunIp) {
		this.remoteRunIp = remoteRunIp;
	}

	public String getRemoteRunPassword() {
		return remoteRunPassword;
	}

	public void setRemoteRunPassword(String remoteRunPassword) {
		this.remoteRunPassword = remoteRunPassword;
	}

	public String getRemoteRunRootPassword() {
		return remoteRunRootPassword;
	}

	public void setRemoteRunRootPassword(String remoteRunRootPassword) {
		this.remoteRunRootPassword = remoteRunRootPassword;
	}

	public String getRemoteRunType1() {
		return remoteRunType1;
	}

	public void setRemoteRunType1(String remoteRunType1) {
		this.remoteRunType1 = remoteRunType1;
	}

	public String getRemoteRunType1Port() {
		return remoteRunType1Port;
	}

	public void setRemoteRunType1Port(String remoteRunType1Port) {
		this.remoteRunType1Port = remoteRunType1Port;
	}

	public String getRemoteRunType2() {
		return remoteRunType2;
	}

	public void setRemoteRunType2(String remoteRunType2) {
		this.remoteRunType2 = remoteRunType2;
	}

	public String getRemoteRunType2Port() {
		return remoteRunType2Port;
	}

	public void setRemoteRunType2Port(String remoteRunType2Port) {
		this.remoteRunType2Port = remoteRunType2Port;
	}

	public String getUseRemoteRun() {
		return useRemoteRun;
	}

	public void setUseRemoteRun(String useRemoteRun) {
		this.useRemoteRun = useRemoteRun;
	}

}