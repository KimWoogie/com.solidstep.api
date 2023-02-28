package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class InsertAuditTypeRequest extends SSRRequest{

	private String ssDbType;
	private String ssNetworkType;
	private String ssOsType;
	private String ssTag;
	private String ssWebType;
	private String typeClass;
	private String typeComment;
	private String typeName;
	
	public InsertAuditTypeRequest() {
		super.apiId = "insertAuditType";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getSsDbType() {
		return ssDbType;
	}

	public void setSsDbType(String ssDbType) {
		this.ssDbType = ssDbType;
	}

	public String getSsNetworkType() {
		return ssNetworkType;
	}

	public void setSsNetworkType(String ssNetworkType) {
		this.ssNetworkType = ssNetworkType;
	}

	public String getSsOsType() {
		return ssOsType;
	}

	public void setSsOsType(String ssOsType) {
		this.ssOsType = ssOsType;
	}

	public String getSsTag() {
		return ssTag;
	}

	public void setSsTag(String ssTag) {
		this.ssTag = ssTag;
	}

	public String getSsWebType() {
		return ssWebType;
	}

	public void setSsWebType(String ssWebType) {
		this.ssWebType = ssWebType;
	}

	public String getTypeClass() {
		return typeClass;
	}

	public void setTypeClass(String typeClass) {
		this.typeClass = typeClass;
	}

	public String getTypeComment() {
		return typeComment;
	}

	public void setTypeComment(String typeComment) {
		this.typeComment = typeComment;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}