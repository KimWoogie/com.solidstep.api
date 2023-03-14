package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetAuditTypeRequest extends SSRRequest{

	private String atypeNo;
	private String limit;
	private String offset;
	
	public GetAuditTypeRequest() {
		super.apiId = "getAuditType";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAtypeNo() {
		return atypeNo;
	}

	public void setAtypeNo(String atypeNo) {
		this.atypeNo = atypeNo;
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