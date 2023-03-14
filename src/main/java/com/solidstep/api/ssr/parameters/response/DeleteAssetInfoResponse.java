package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class DeleteAssetInfoResponse extends SSRResponse{

	public DeleteAssetInfoResponse() {
		super.apiId = "deleteAssetInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

}
