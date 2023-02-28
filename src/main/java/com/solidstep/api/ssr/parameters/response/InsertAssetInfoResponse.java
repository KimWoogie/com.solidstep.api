package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class InsertAssetInfoResponse extends SSRResponse{
	
	private String assetNo;
	
	public InsertAssetInfoResponse(){
		super.apiId = "insertAssetInfo";
	}

	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	
}