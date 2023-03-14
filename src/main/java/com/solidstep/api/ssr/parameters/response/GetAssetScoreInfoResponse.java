package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetAssetScoreInfoResponse extends SSRResponse{

	private String assetNo;
	private String hostname;
	private String ip;
	private String isOnline;
	private String lastAnalyzeDate;
	private String lastAnalyzeEpoch;
	private String os;
	private String score;
	private String typeNames;
	
	public GetAssetScoreInfoResponse() {
		super.apiId = "getAssetScoreInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
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

	public String getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getLastAnalyzeDate() {
		return lastAnalyzeDate;
	}

	public void setLastAnalyzeDate(String lastAnalyzeDate) {
		this.lastAnalyzeDate = lastAnalyzeDate;
	}

	public String getLastAnalyzeEpoch() {
		return lastAnalyzeEpoch;
	}

	public void setLastAnalyzeEpoch(String lastAnalyzeEpoch) {
		this.lastAnalyzeEpoch = lastAnalyzeEpoch;
	}
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getTypeNames() {
		return typeNames;
	}

	public void setTypeNames(String typeNames) {
		this.typeNames = typeNames;
	}

}