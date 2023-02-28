package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetAuditListByAuditNameRequest extends SSRRequest{

	private String auditName;
	private String auditGroupNoArray;
	private String limit;
	private String offset;
	
	public GetAuditListByAuditNameRequest() {
		super.apiId = "getAuditListByAuditName";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getAuditGroupNoArray() {
		return auditGroupNoArray;
	}

	public void setAuditGroupNoArray(String auditGroupNoArray) {
		this.auditGroupNoArray = auditGroupNoArray;
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