package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class UpdateAuditOptionsRequest extends SSRRequest {

	private String alinkNoArray;
	private String isPiAudit;
	private String optionInfo;
	
	public UpdateAuditOptionsRequest() {
		super.apiId = "updateAuditOptions";
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

	public String getIsPiAudit() {
		return isPiAudit;
	}

	public void setIsPiAudit(String isPiAudit) {
		this.isPiAudit = isPiAudit;
	}

	public String getOptionInfo() {
		return optionInfo;
	}

	public void setOptionInfo(String optionInfo) {
		this.optionInfo = optionInfo;
	}

}