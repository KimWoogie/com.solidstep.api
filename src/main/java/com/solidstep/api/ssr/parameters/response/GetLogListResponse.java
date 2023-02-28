package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetLogListResponse extends SSRResponse{

	private String agentLogNo;
	private String assetNo;
	private String assetRegEpoch;
	private String data;
	private String dataPrefix;
	private String description;
	private String hostname;
	private String ip;
	private String jobNo;
	private String logCategory;
	private String logType;
	private String os;
	
	public GetLogListResponse() {
		super.apiId = "getLogList";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAgentLogNo() {
		return agentLogNo;
	}

	public void setAgentLogNo(String agentLogNo) {
		this.agentLogNo = agentLogNo;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getAssetRegEpoch() {
		return assetRegEpoch;
	}

	public void setAssetRegEpoch(String assetRegEpoch) {
		this.assetRegEpoch = assetRegEpoch;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataPrefix() {
		return dataPrefix;
	}

	public void setDataPrefix(String dataPrefix) {
		this.dataPrefix = dataPrefix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getLogCategory() {
		return logCategory;
	}

	public void setLogCategory(String logCategory) {
		this.logCategory = logCategory;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}