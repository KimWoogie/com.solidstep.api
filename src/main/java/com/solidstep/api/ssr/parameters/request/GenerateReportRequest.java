package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GenerateReportRequest extends SSRRequest{

	private String newTemplateInfo;
	
	public GenerateReportRequest() {
		super.apiId = "generateReport";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getNewTemplateInfo() {
		return newTemplateInfo;
	}

	public void setNewTemplateInfo(String newTemplateInfo) {
		this.newTemplateInfo = newTemplateInfo;
	}

}