package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetAuditListByAuditNameResponse extends SSRResponse{

	private String auditName;			// API문서에는 없으나, 결과로 날아오고 있다.
	private String agentGroupNoArray;
	private String atemplateNo;
	private String auditGroupNo;
	private String createdUserNo;
	private String endEpoch;
	private String fixToEpoch;
	private String groupName;
	private String isEnable;
	private String isOneshot;
	private String isPi;
	private String isRegister;
	private String modifyEpoch;
	private String nowCreateReport;
	private String regEpoch;
	private String ssDbType;
	private String ssNetworkType;
	private String ssOsType;
	private String ssWebType;
	private String startEpoch;
	private String templateName;
	
	public GetAuditListByAuditNameResponse() {
		super.apiId = "getAuditListByAuditName";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAgentGroupNoArray() {
		return agentGroupNoArray;
	}

	public void setAgentGroupNoArray(String agentGroupNoArray) {
		this.agentGroupNoArray = agentGroupNoArray;
	}

	public String getAtemplateNo() {
		return atemplateNo;
	}

	public void setAtemplateNo(String atemplateNo) {
		this.atemplateNo = atemplateNo;
	}

	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getCreatedUserNo() {
		return createdUserNo;
	}

	public void setCreatedUserNo(String createdUserNo) {
		this.createdUserNo = createdUserNo;
	}

	public String getEndEpoch() {
		return endEpoch;
	}

	public void setEndEpoch(String endEpoch) {
		this.endEpoch = endEpoch;
	}

	public String getFixToEpoch() {
		return fixToEpoch;
	}

	public void setFixToEpoch(String fixToEpoch) {
		this.fixToEpoch = fixToEpoch;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getIsOneshot() {
		return isOneshot;
	}

	public void setIsOneshot(String isOneshot) {
		this.isOneshot = isOneshot;
	}

	public String getIsPi() {
		return isPi;
	}

	public void setIsPi(String isPi) {
		this.isPi = isPi;
	}

	public String getIsRegister() {
		return isRegister;
	}

	public void setIsRegister(String isRegister) {
		this.isRegister = isRegister;
	}

	public String getModifyEpoch() {
		return modifyEpoch;
	}

	public void setModifyEpoch(String modifyEpoch) {
		this.modifyEpoch = modifyEpoch;
	}

	public String getNowCreateReport() {
		return nowCreateReport;
	}

	public void setNowCreateReport(String nowCreateReport) {
		this.nowCreateReport = nowCreateReport;
	}

	public String getRegEpoch() {
		return regEpoch;
	}

	public void setRegEpoch(String regEpoch) {
		this.regEpoch = regEpoch;
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

	public String getSsWebType() {
		return ssWebType;
	}

	public void setSsWebType(String ssWebType) {
		this.ssWebType = ssWebType;
	}

	public String getStartEpoch() {
		return startEpoch;
	}

	public void setStartEpoch(String startEpoch) {
		this.startEpoch = startEpoch;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

}