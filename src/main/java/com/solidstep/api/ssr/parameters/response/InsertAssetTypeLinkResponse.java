package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class InsertAssetTypeLinkResponse extends SSRResponse{

	private String alinkNo;
	
	public InsertAssetTypeLinkResponse() {
		super.apiId = "insertAssetTypeLink";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAlinkNo() {
		return alinkNo;
	}

	public void setAlinkNo(String alinkNo) {
		this.alinkNo = alinkNo;
	}

}
