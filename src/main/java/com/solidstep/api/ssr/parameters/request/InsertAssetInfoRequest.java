package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class InsertAssetInfoRequest extends SSRRequest{
	
	private String hostname;
	private String description;
	private String ip;
	private String ipAll;
	private String os;
	private String osDetail;
	
	public InsertAssetInfoRequest(){
		super.apiId = "insertAssetInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}
	
	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIpAll() {
		return ipAll;
	}

	public void setIpAll(String ipAll) {
		this.ipAll = ipAll;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsDetail() {
		return osDetail;
	}

	public void setOsDetail(String osDetail) {
		this.osDetail = osDetail;
	}
	
}