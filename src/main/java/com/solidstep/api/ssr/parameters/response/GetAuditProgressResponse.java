package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetAuditProgressResponse extends SSRResponse{

	private String alinkNo;			// API 문서에는 없지만 응답결과로 전달된다.
	private String cmd;
	private String alinkAll;
	private String auditGroupNo;
	private String endEpoch;
	private String jobResult;
	private String startEpoch;
	
	public GetAuditProgressResponse() {
		super.apiId = "getAuditProgress";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAlinkNo() {
		return alinkNo;
	}

	public void setAlinkNo(String alinkNo) {
		this.alinkNo = alinkNo;
	}
	
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getAlinkAll() {
		return alinkAll;
	}

	public void setAlinkAll(String alinkAll) {
		this.alinkAll = alinkAll;
	}

	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getEndEpoch() {
		return endEpoch;
	}

	public void setEndEpoch(String endEpoch) {
		this.endEpoch = endEpoch;
	}

	public String getJobResult() {
		return jobResult;
	}

	public void setJobResult(String jobResult) {
		this.jobResult = jobResult;
	}

	public String getStartEpoch() {
		return startEpoch;
	}

	public void setStartEpoch(String startEpoch) {
		this.startEpoch = startEpoch;
	}

}