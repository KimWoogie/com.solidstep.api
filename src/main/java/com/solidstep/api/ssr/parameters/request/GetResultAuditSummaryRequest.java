package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetResultAuditSummaryRequest extends SSRRequest{

	private String atemplateNoArray;
	private String auditGroupNoArray;
	private String limit;
	private String offset;
	
	public GetResultAuditSummaryRequest() {
		super.apiId = "getResultAuditSummary";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAtemplateNoArray() {
		return atemplateNoArray;
	}

	public void setAtemplateNoArray(String atemplateNoArray) {
		this.atemplateNoArray = atemplateNoArray;
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