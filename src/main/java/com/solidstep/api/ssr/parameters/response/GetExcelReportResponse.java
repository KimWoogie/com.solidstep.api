package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetExcelReportResponse extends SSRResponse{

	private String agentGroupNo;
	private String alinkNo;
	private String atemplateNo;
	private String auditGroupNo;
	private String reportPath;
	        
	public GetExcelReportResponse() {
		super.apiId = "getExcelReport";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
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

	public String getReportPath() {
		return reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

}