package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class UpdateRemoteRunOptionsResponse extends SSRResponse{

	private String updatedAssetNo;
	
	public UpdateRemoteRunOptionsResponse() {
		super.apiId = "updateRemoteRunOptions";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getUpdatedAssetNo() {
		return updatedAssetNo;
	}

	public void setUpdatedAssetNo(String updatedAssetNo) {
		this.updatedAssetNo = updatedAssetNo;
	}

}