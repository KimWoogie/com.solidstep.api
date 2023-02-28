package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetAssetScoreInfoRequest extends SSRRequest{

	private String alinkNoArray;
	private String assetNoArray;
	private String atemplateNo;
	private String description;
	private String hostname;
	private String importance;
	private String ip;
	private String ipAll;
	private String osArray;
	private String osDetail;
	private String regDate;
	private String typeClass;
	private String typeNameArray;
	private String limit;
	private String offset;
	
	public GetAssetScoreInfoRequest() {
		super.apiId = "getAssetScoreInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAlinkNoArray() {
		return alinkNoArray;
	}

	public void setAlinkNoArray(String alinkNoArray) {
		this.alinkNoArray = alinkNoArray;
	}

	public String getAssetNoArray() {
		return assetNoArray;
	}

	public void setAssetNoArray(String assetNoArray) {
		this.assetNoArray = assetNoArray;
	}

	public String getAtemplateNo() {
		return atemplateNo;
	}

	public void setAtemplateNo(String atemplateNo) {
		this.atemplateNo = atemplateNo;
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

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
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

	public String getOsArray() {
		return osArray;
	}

	public void setOsArray(String osArray) {
		this.osArray = osArray;
	}

	public String getOsDetail() {
		return osDetail;
	}

	public void setOsDetail(String osDetail) {
		this.osDetail = osDetail;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getTypeClass() {
		return typeClass;
	}

	public void setTypeClass(String typeClass) {
		this.typeClass = typeClass;
	}

	public String getTypeNameArray() {
		return typeNameArray;
	}

	public void setTypeNameArray(String typeNameArray) {
		this.typeNameArray = typeNameArray;
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