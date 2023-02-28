package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class InsertAuditTypeResponse extends SSRResponse{

	private String atypeNo;
	
	public InsertAuditTypeResponse() {
		super.apiId = "insertAuditType";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAtypeNo() {
		return atypeNo;
	}

	public void setAtypeNo(String atypeNo) {
		this.atypeNo = atypeNo;
	}

}