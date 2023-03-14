package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetExcelReportRequest extends SSRRequest{

	private String agentGroupNoArray;
	private String alinkNoArray;
	private String atemplateNoArray;
	private String auditGroupNoArray;
	private String reportType;
	private String limit;
	private String offset;
	
	public GetExcelReportRequest() {
		super.apiId = "getExcelReport";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
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

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
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