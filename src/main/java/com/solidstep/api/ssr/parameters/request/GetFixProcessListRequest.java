package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetFixProcessListRequest extends SSRRequest{

	private String agentGroupNoArray;
	private String alinkNoArray;
	private String approvalDate;
	private String approvalStatus;
	private String approvalUserId;
	private String approvalUserName;
	private String assetNoArray;
	private String hostname;
	private String itemCodeArray;
	private String oldDecision;
	private String regDate;
	private String requestToDate;
	private String requestType;
	private String requestUserId;
	private String requestUserName;
	private String limit;
	private String offset;
	
	public GetFixProcessListRequest() {
		super.apiId = "getFixProcessList";
		super.apiJsonResultKey = "fixProcessList";
	}
	
	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}

	@Override
	public String getApiId() {
		return super.apiId;
	}
	
	public String getAgentGroupNoArray() {
		return agentGroupNoArray;
	}

	public void setAgentGroupNoArray(String agentGroupNoArray) {
		this.agentGroupNoArray = agentGroupNoArray;
	}

	public String getAlinkNoArray() {
		return alinkNoArray;
	}

	public void setAlinkNoArray(String alinkNoArray) {
		this.alinkNoArray = alinkNoArray;
	}

	public String getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getApprovalUserId() {
		return approvalUserId;
	}

	public void setApprovalUserId(String approvalUserId) {
		this.approvalUserId = approvalUserId;
	}

	public String getApprovalUserName() {
		return approvalUserName;
	}

	public void setApprovalUserName(String approvalUserName) {
		this.approvalUserName = approvalUserName;
	}

	public String getAssetNoArray() {
		return assetNoArray;
	}

	public void setAssetNoArray(String assetNoArray) {
		this.assetNoArray = assetNoArray;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getItemCodeArray() {
		return itemCodeArray;
	}

	public void setItemCodeArray(String itemCodeArray) {
		this.itemCodeArray = itemCodeArray;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getOldDecision() {
		return oldDecision;
	}

	public void setOldDecision(String oldDecision) {
		this.oldDecision = oldDecision;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getRequestToDate() {
		return requestToDate;
	}

	public void setRequestToDate(String requestToDate) {
		this.requestToDate = requestToDate;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getRequestUserName() {
		return requestUserName;
	}

	public void setRequestUserName(String requestUserName) {
		this.requestUserName = requestUserName;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
	
}