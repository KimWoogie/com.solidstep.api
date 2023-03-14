package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetJobListByAuditNoResponse extends SSRResponse{

	private String auditName;
	private String auditGroupNo;
	private String jobInfo;
	private String jobNoneByReuse;
	private String jobPlan;
	
	public GetJobListByAuditNoResponse() {
		super.apiId = "getJobListByAuditNo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getJobInfo() {
		return jobInfo;
	}

	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}

	public String getJobNoneByReuse() {
		return jobNoneByReuse;
	}

	public void setJobNoneByReuse(String jobNoneByReuse) {
		this.jobNoneByReuse = jobNoneByReuse;
	}

	public String getJobPlan() {
		return jobPlan;
	}

	public void setJobPlan(String jobPlan) {
		this.jobPlan = jobPlan;
	}

}