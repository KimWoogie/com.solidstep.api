package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class GetAdtTemplateInfoRequest extends SSRRequest{

	private String atemplateNo;
	private String isDefault;
	private String isEnable;
	private String isSave;
	private String mergeType;
	private String removeBaseTemplate;
	private String returnType;
	private String templateName;
	private String templateType;
	private String limit;
	private String offset;
	
	public GetAdtTemplateInfoRequest() {
		super.apiId = "getAdtTemplateInfo";
		super.apiJsonResultKey = "templateList";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAtemplateNo() {
		return atemplateNo;
	}

	public void setAtemplateNo(String atemplateNo) {
		this.atemplateNo = atemplateNo;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getIsSave() {
		return isSave;
	}

	public void setIsSave(String isSave) {
		this.isSave = isSave;
	}

	public String getMergeType() {
		return mergeType;
	}

	public void setMergeType(String mergeType) {
		this.mergeType = mergeType;
	}

	public String getRemoveBaseTemplate() {
		return removeBaseTemplate;
	}

	public void setRemoveBaseTemplate(String removeBaseTemplate) {
		this.removeBaseTemplate = removeBaseTemplate;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
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