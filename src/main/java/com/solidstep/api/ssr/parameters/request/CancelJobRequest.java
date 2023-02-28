package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class CancelJobRequest extends SSRRequest{
	
	private String jobNoArray;
	private String jobPlanNoArray;
	
	public CancelJobRequest() {
		super.apiId = "cancelJob";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getJobNoArray() {
		return jobNoArray;
	}

	public void setJobNoArray(String jobNoArray) {
		this.jobNoArray = jobNoArray;
	}

	public String getJobPlanNoArray() {
		return jobPlanNoArray;
	}

	public void setJobPlanNoArray(String jobPlanNoArray) {
		this.jobPlanNoArray = jobPlanNoArray;
	}

}