package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class DeleteAssetInfoRequest extends SSRRequest{

	private String assetNoArray;
	
	public DeleteAssetInfoRequest() {
		super.apiId = "deleteAssetInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAssetNoArray() {
		return assetNoArray;
	}

	public void setAssetNoArray(String assetNoArray) {
		this.assetNoArray = assetNoArray;
	}

}
