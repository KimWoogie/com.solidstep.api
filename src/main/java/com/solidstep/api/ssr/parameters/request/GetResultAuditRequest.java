package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetResultAuditRequest extends SSRRequest{

	private String auditGroupNo;
	private String alinkNoArray;
	private String atemplateNoArray;
	private String ItemCodeArray;
	private String selectReturn;
	private String simpleReturn;
	private String limit;
	private String offset;
	
	public GetResultAuditRequest() {
		super.apiId = "getResultAudit";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getAlinkNoArray() {
		return alinkNoArray;
	}

	public void setAlinkNoArray(String alinkNoArray) {
		this.alinkNoArray = alinkNoArray;
	}

	public String getAtemplateNoArray() {
		return atemplateNoArray;
	}

	public void setAtemplateNoArray(String atemplateNoArray) {
		this.atemplateNoArray = atemplateNoArray;
	}

	public String getItemCodeArray() {
		return ItemCodeArray;
	}

	public void setItemCodeArray(String itemCodeArray) {
		ItemCodeArray = itemCodeArray;
	}

	public String getSelectReturn() {
		return selectReturn;
	}

	public void setSelectReturn(String selectReturn) {
		this.selectReturn = selectReturn;
	}

	public String getSimpleReturn() {
		return simpleReturn;
	}

	public void setSimpleReturn(String simpleReturn) {
		this.simpleReturn = simpleReturn;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

}