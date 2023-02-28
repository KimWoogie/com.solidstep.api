package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class CancelJobResponse extends SSRResponse{

	public CancelJobResponse() {
		super.apiId = "cancelJob";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}