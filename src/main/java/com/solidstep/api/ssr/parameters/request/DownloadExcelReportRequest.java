package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class DownloadExcelReportRequest extends SSRRequest{

	private String agentGroupNo;
	private String alinkNo;
	private String atemplateNo;
	private String auditGroupNo;
	private String reportType;
	
	public DownloadExcelReportRequest() {
		super.apiId = "downloadExcelReport";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAgentGroupNo() {
		return agentGroupNo;
	}

	public void setAgentGroupNo(String agentGroupNo) {
		this.agentGroupNo = agentGroupNo;
	}

	public String getAlinkNo() {
		return alinkNo;
	}

	public void setAlinkNo(String alinkNo) {
		this.alinkNo = alinkNo;
	}

	public String getAtemplateNo() {
		return atemplateNo;
	}

	public void setAtemplateNo(String atemplateNo) {
		this.atemplateNo = atemplateNo;
	}

	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}