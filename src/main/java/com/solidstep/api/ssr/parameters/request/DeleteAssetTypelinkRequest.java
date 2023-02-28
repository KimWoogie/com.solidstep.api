package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class DeleteAssetTypelinkRequest extends SSRRequest{

	private String alinkNoArray;
	
	public DeleteAssetTypelinkRequest() {
		super.apiId = "deleteAssetTypelink";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAlinkNoArray() {
		return alinkNoArray;
	}

	public void setAlinkNoArray(String alinkNoArray) {
		this.alinkNoArray = alinkNoArray;
	}

}
