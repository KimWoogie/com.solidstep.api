package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetResultAuditSummaryResponse extends SSRResponse {

	private String alinkNo;
	private String altCount;
	private String assetNo;
	private String atemplateNo;
	private String auditGroupNo;
	private String auditName;
	private String exceptCount;
	private String failCount;
	private String gatherStartEpoch;
	private String hostname;
	private String isMannualAudit;
	private String itemCount;
	private String mannualCount;
	private String naCount;
	private String passCount;
	private String score;
	
	public GetResultAuditSummaryResponse() {
		super.apiId = "getResultAuditSummary";
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

	public String getAltCount() {
		return altCount;
	}

	public void setAltCount(String altCount) {
		this.altCount = altCount;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
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

	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getExceptCount() {
		return exceptCount;
	}

	public void setExceptCount(String exceptCount) {
		this.exceptCount = exceptCount;
	}

	public String getFailCount() {
		return failCount;
	}

	public void setFailCount(String failCount) {
		this.failCount = failCount;
	}

	public String getGatherStartEpoch() {
		return gatherStartEpoch;
	}

	public void setGatherStartEpoch(String gatherStartEpoch) {
		this.gatherStartEpoch = gatherStartEpoch;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIsMannualAudit() {
		return isMannualAudit;
	}

	public void setIsMannualAudit(String isMannualAudit) {
		this.isMannualAudit = isMannualAudit;
	}

	public String getItemCount() {
		return itemCount;
	}

	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}

	public String getMannualCount() {
		return mannualCount;
	}

	public void setMannualCount(String mannualCount) {
		this.mannualCount = mannualCount;
	}

	public String getNaCount() {
		return naCount;
	}

	public void setNaCount(String naCount) {
		this.naCount = naCount;
	}

	public String getPassCount() {
		return passCount;
	}

	public void setPassCount(String passCount) {
		this.passCount = passCount;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}