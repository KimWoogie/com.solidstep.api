package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetAuditStatusTotalResponse extends SSRResponse{

	private String alinkNos;
	private String alinkCount;
	private String analyzeDoneAlinkCount;
	private String analyzeDoneAlinkNos;
	private String analyzeDoneAssetCount;
	private String analyzeFailAlinkCount;
	private String analyzeFailAlinkNos;
	private String analyzeFailAssetCount;
	private String assetCount;
	private String auditAgentGroupNames;
	private String auditEndEpoch;
	private String auditGroupNo;
	private String auditName;
	private String auditRegDate;
	private String auditRegEpoch;
	private String auditStartEpoch;
	private String gatherDoneAlinkCount;
	private String gatherDoneAlinkNos;
	private String gatherDoneAssetCount;
	private String gatherFailAlinkCount;
	private String gatherFailAlinkNos;
	private String gatherFailAssetCount;
	private String gatherIngAlinkCount;
	private String gatherIngAlinkNos;
	private String gatherIngAssetCount;
	private String isOneshot;
	private String isRegister;
	private String notAuditableAlinkCount;
	private String notAuditableAlinkNos;
	private String reportDoneAlinkCount;
	private String reportDoneAlinkNos;
	private String reportDoneAssetCount;
	private String templateInfo;
	private String typeNames;
	
	public GetAuditStatusTotalResponse() {
		super.apiId = "getAuditStatusTotal";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAlinkNos() {
		return alinkNos;
	}

	public void setAlinkNos(String alinkNos) {
		this.alinkNos = alinkNos;
	}

	public String getAlinkCount() {
		return alinkCount;
	}

	public void setAlinkCount(String alinkCount) {
		this.alinkCount = alinkCount;
	}

	public String getAnalyzeDoneAlinkCount() {
		return analyzeDoneAlinkCount;
	}

	public void setAnalyzeDoneAlinkCount(String analyzeDoneAlinkCount) {
		this.analyzeDoneAlinkCount = analyzeDoneAlinkCount;
	}

	public String getAnalyzeDoneAlinkNos() {
		return analyzeDoneAlinkNos;
	}

	public void setAnalyzeDoneAlinkNos(String analyzeDoneAlinkNos) {
		this.analyzeDoneAlinkNos = analyzeDoneAlinkNos;
	}

	public String getAnalyzeDoneAssetCount() {
		return analyzeDoneAssetCount;
	}

	public void setAnalyzeDoneAssetCount(String analyzeDoneAssetCount) {
		this.analyzeDoneAssetCount = analyzeDoneAssetCount;
	}

	public String getAnalyzeFailAlinkCount() {
		return analyzeFailAlinkCount;
	}

	public void setAnalyzeFailAlinkCount(String analyzeFailAlinkCount) {
		this.analyzeFailAlinkCount = analyzeFailAlinkCount;
	}

	public String getAnalyzeFailAlinkNos() {
		return analyzeFailAlinkNos;
	}

	public void setAnalyzeFailAlinkNos(String analyzeFailAlinkNos) {
		this.analyzeFailAlinkNos = analyzeFailAlinkNos;
	}

	public String getAnalyzeFailAssetCount() {
		return analyzeFailAssetCount;
	}

	public void setAnalyzeFailAssetCount(String analyzeFailAssetCount) {
		this.analyzeFailAssetCount = analyzeFailAssetCount;
	}

	public String getAssetCount() {
		return assetCount;
	}

	public void setAssetCount(String assetCount) {
		this.assetCount = assetCount;
	}

	public String getAuditAgentGroupNames() {
		return auditAgentGroupNames;
	}

	public void setAuditAgentGroupNames(String auditAgentGroupNames) {
		this.auditAgentGroupNames = auditAgentGroupNames;
	}

	public String getAuditEndEpoch() {
		return auditEndEpoch;
	}

	public void setAuditEndEpoch(String auditEndEpoch) {
		this.auditEndEpoch = auditEndEpoch;
	}

	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getAuditRegDate() {
		return auditRegDate;
	}

	public void setAuditRegDate(String auditRegDate) {
		this.auditRegDate = auditRegDate;
	}

	public String getAuditRegEpoch() {
		return auditRegEpoch;
	}

	public void setAuditRegEpoch(String auditRegEpoch) {
		this.auditRegEpoch = auditRegEpoch;
	}

	public String getAuditStartEpoch() {
		return auditStartEpoch;
	}

	public void setAuditStartEpoch(String auditStartEpoch) {
		this.auditStartEpoch = auditStartEpoch;
	}

	public String getGatherDoneAlinkCount() {
		return gatherDoneAlinkCount;
	}

	public void setGatherDoneAlinkCount(String gatherDoneAlinkCount) {
		this.gatherDoneAlinkCount = gatherDoneAlinkCount;
	}

	public String getGatherDoneAlinkNos() {
		return gatherDoneAlinkNos;
	}

	public void setGatherDoneAlinkNos(String gatherDoneAlinkNos) {
		this.gatherDoneAlinkNos = gatherDoneAlinkNos;
	}

	public String getGatherDoneAssetCount() {
		return gatherDoneAssetCount;
	}

	public void setGatherDoneAssetCount(String gatherDoneAssetCount) {
		this.gatherDoneAssetCount = gatherDoneAssetCount;
	}

	public String getGatherFailAlinkCount() {
		return gatherFailAlinkCount;
	}

	public void setGatherFailAlinkCount(String gatherFailAlinkCount) {
		this.gatherFailAlinkCount = gatherFailAlinkCount;
	}

	public String getGatherFailAlinkNos() {
		return gatherFailAlinkNos;
	}

	public void setGatherFailAlinkNos(String gatherFailAlinkNos) {
		this.gatherFailAlinkNos = gatherFailAlinkNos;
	}

	public String getGatherFailAssetCount() {
		return gatherFailAssetCount;
	}

	public void setGatherFailAssetCount(String gatherFailAssetCount) {
		this.gatherFailAssetCount = gatherFailAssetCount;
	}

	public String getGatherIngAlinkCount() {
		return gatherIngAlinkCount;
	}

	public void setGatherIngAlinkCount(String gatherIngAlinkCount) {
		this.gatherIngAlinkCount = gatherIngAlinkCount;
	}

	public String getGatherIngAlinkNos() {
		return gatherIngAlinkNos;
	}

	public void setGatherIngAlinkNos(String gatherIngAlinkNos) {
		this.gatherIngAlinkNos = gatherIngAlinkNos;
	}

	public String getGatherIngAssetCount() {
		return gatherIngAssetCount;
	}

	public void setGatherIngAssetCount(String gatherIngAssetCount) {
		this.gatherIngAssetCount = gatherIngAssetCount;
	}

	public String getIsOneshot() {
		return isOneshot;
	}

	public void setIsOneshot(String isOneshot) {
		this.isOneshot = isOneshot;
	}

	public String getIsRegister() {
		return isRegister;
	}

	public void setIsRegister(String isRegister) {
		this.isRegister = isRegister;
	}

	public String getNotAuditableAlinkCount() {
		return notAuditableAlinkCount;
	}

	public void setNotAuditableAlinkCount(String notAuditableAlinkCount) {
		this.notAuditableAlinkCount = notAuditableAlinkCount;
	}

	public String getNotAuditableAlinkNos() {
		return notAuditableAlinkNos;
	}

	public void setNotAuditableAlinkNos(String notAuditableAlinkNos) {
		this.notAuditableAlinkNos = notAuditableAlinkNos;
	}

	public String getReportDoneAlinkCount() {
		return reportDoneAlinkCount;
	}

	public void setReportDoneAlinkCount(String reportDoneAlinkCount) {
		this.reportDoneAlinkCount = reportDoneAlinkCount;
	}

	public String getReportDoneAlinkNos() {
		return reportDoneAlinkNos;
	}

	public void setReportDoneAlinkNos(String reportDoneAlinkNos) {
		this.reportDoneAlinkNos = reportDoneAlinkNos;
	}

	public String getReportDoneAssetCount() {
		return reportDoneAssetCount;
	}

	public void setReportDoneAssetCount(String reportDoneAssetCount) {
		this.reportDoneAssetCount = reportDoneAssetCount;
	}

	public String getTemplateInfo() {
		return templateInfo;
	}

	public void setTemplateInfo(String templateInfo) {
		this.templateInfo = templateInfo;
	}

	public String getTypeNames() {
		return typeNames;
	}

	public void setTypeNames(String typeNames) {
		this.typeNames = typeNames;
	}

}