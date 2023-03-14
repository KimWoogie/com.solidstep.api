package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetUserSshKeysResponse extends SSRResponse{

	private String list;
	
	public GetUserSshKeysResponse() {
		super.apiId = "getUserSshKeys";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

}