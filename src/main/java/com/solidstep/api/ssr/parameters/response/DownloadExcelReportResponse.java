package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class DownloadExcelReportResponse extends SSRResponse{

	public DownloadExcelReportResponse() {
		super.apiId = "downloadExcelReport";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}