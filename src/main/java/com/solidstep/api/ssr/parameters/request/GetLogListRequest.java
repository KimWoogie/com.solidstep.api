package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetLogListRequest extends SSRRequest{

	private String alinkNoArray;
	private String assetNoArray;
	private String dsAllLogSearchInfo;
	private String dsDescription;
	private String dsHostname;
	private String dsIp;
	private String dsOmitLogSearchInfo;
	private String dsOsDetail;
	private String endDate;
	private String needData;
	private String startDate;
	private String limit;
	private String offset;
	
	public GetLogListRequest() {
		super.apiId = "getLogList";
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

	public String getDsAllLogSearchInfo() {
		return dsAllLogSearchInfo;
	}

	public void setDsAllLogSearchInfo(String dsAllLogSearchInfo) {
		this.dsAllLogSearchInfo = dsAllLogSearchInfo;
	}

	public String getDsDescription() {
		return dsDescription;
	}

	public void setDsDescription(String dsDescription) {
		this.dsDescription = dsDescription;
	}

	public String getDsHostname() {
		return dsHostname;
	}

	public void setDsHostname(String dsHostname) {
		this.dsHostname = dsHostname;
	}

	public String getDsIp() {
		return dsIp;
	}

	public void setDsIp(String dsIp) {
		this.dsIp = dsIp;
	}

	public String getDsOmitLogSearchInfo() {
		return dsOmitLogSearchInfo;
	}

	public void setDsOmitLogSearchInfo(String dsOmitLogSearchInfo) {
		this.dsOmitLogSearchInfo = dsOmitLogSearchInfo;
	}

	public String getDsOsDetail() {
		return dsOsDetail;
	}

	public void setDsOsDetail(String dsOsDetail) {
		this.dsOsDetail = dsOsDetail;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNeedData() {
		return needData;
	}

	public void setNeedData(String needData) {
		this.needData = needData;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
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