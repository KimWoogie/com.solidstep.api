package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class InsertAssetTypeLinkRequest extends SSRRequest{
	
	private String assetNo;
	private String atypeNo;
	
	public InsertAssetTypeLinkRequest() {
		super.apiId = "insertAssetTypeLink";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getAtypeNo() {
		return atypeNo;
	}

	public void setAtypeNo(String atypeNo) {
		this.atypeNo = atypeNo;
	}

}
