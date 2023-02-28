package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetJobListByAuditNoRequest extends SSRRequest{

	private String auditGroupNo;
	
	public GetJobListByAuditNoRequest() {
		super.apiId = "getJobListByAuditNo";
		super.apiJsonResultKey = "jobList";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

}