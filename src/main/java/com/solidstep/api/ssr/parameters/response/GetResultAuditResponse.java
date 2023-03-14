package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetResultAuditResponse extends SSRResponse{

	private String alinkNo;
	private String atemplateNo;
	private String auditGroupNo;
	private String auditName;
	private String hostname;
	private String commentInfo;
	private String conf;
	private String decision;
	private String enableFlag;
	private String fix;
	private String fixHtml;
	private String fixToDate;
	private String fixToEpoch;
	private String iiUserInfo;
	private String inchargeInfo;
	private String itemCode;
	private String itemRegEpoch;
	private String score;
	private String ssDbType;
	private String ssNetworkType;
	private String ssOsType;
	private String ssWebType;
	private String standard;
	private String status;
	private String title;
	private String userClass;
	private String userCode;
	private String userLevel;
	
	public GetResultAuditResponse() {
		super.apiId = "getResultAudit";
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

	public String getCommentInfo() {
		return commentInfo;
	}

	public void setCommentInfo(String commentInfo) {
		this.commentInfo = commentInfo;
	}

	public String getConf() {
		return conf;
	}

	public void setConf(String conf) {
		this.conf = conf;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getFix() {
		return fix;
	}

	public void setFix(String fix) {
		this.fix = fix;
	}

	public String getFixHtml() {
		return fixHtml;
	}

	public void setFixHtml(String fixHtml) {
		this.fixHtml = fixHtml;
	}

	public String getFixToEpoch() {
		return fixToEpoch;
	}

	public void setFixToEpoch(String fixToEpoch) {
		this.fixToEpoch = fixToEpoch;
	}

	public String getIiUserInfo() {
		return iiUserInfo;
	}

	public void setIiUserInfo(String iiUserInfo) {
		this.iiUserInfo = iiUserInfo;
	}

	public String getInchargeInfo() {
		return inchargeInfo;
	}

	public void setInchargeInfo(String inchargeInfo) {
		this.inchargeInfo = inchargeInfo;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemRegEpoch() {
		return itemRegEpoch;
	}

	public void setItemRegEpoch(String itemRegEpoch) {
		this.itemRegEpoch = itemRegEpoch;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
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

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserClass() {
		return userClass;
	}

	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getFixToDate() {
		return fixToDate;
	}

	public void setFixToDate(String fixToDate) {
		this.fixToDate = fixToDate;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

}