package com.solidstep.api.ssr.parameters.request;

import com.solidstep.api.ssr.parameters.SSRRequest;

public class StartAuditRequest extends SSRRequest{

	private String auditName;
	private String auditTargetInfo;
	private String auditType;
	private String endDate;
	private String fixType;
	private String fixToDate;
	private String isOneshot;
	private String isPiAudit;
	private String isScheduled;
	private String scheduleEndDate;
	private String schedulePeriod;
	private String scheduleStartDate;
	private String scheduleType;
	private String sendEmailUser;
	private String startDate;
	private String usePreviousData;
	
	public StartAuditRequest() {
		super.apiId = "startAudit";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	@Override
	public String getApiJsonResultKey() {
		return super.apiJsonResultKey;
	}
	
	public String getAuditName() {
		return auditName;
	}

	public void setAuditName(String auditName) {
		this.auditName = auditName;
	}

	public String getAuditTargetInfo() {
		return auditTargetInfo;
	}

	public void setAuditTargetInfo(String auditTargetInfo) {
		this.auditTargetInfo = auditTargetInfo;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFixType() {
		return fixType;
	}

	public void setFixType(String fixType) {
		this.fixType = fixType;
	}

	public String getFixToDate() {
		return fixToDate;
	}

	public void setFixToDate(String fixToDate) {
		this.fixToDate = fixToDate;
	}

	public String getIsOneshot() {
		return isOneshot;
	}

	public void setIsOneshot(String isOneshot) {
		this.isOneshot = isOneshot;
	}

	public String getIsPiAudit() {
		return isPiAudit;
	}

	public void setIsPiAudit(String isPiAudit) {
		this.isPiAudit = isPiAudit;
	}

	public String getIsScheduled() {
		return isScheduled;
	}

	public void setIsScheduled(String isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getScheduleEndDate() {
		return scheduleEndDate;
	}

	public void setScheduleEndDate(String scheduleEndDate) {
		this.scheduleEndDate = scheduleEndDate;
	}

	public String getSchedulePeriod() {
		return schedulePeriod;
	}

	public void setSchedulePeriod(String schedulePeriod) {
		this.schedulePeriod = schedulePeriod;
	}

	public String getScheduleStartDate() {
		return scheduleStartDate;
	}

	public void setScheduleStartDate(String scheduleStartDate) {
		this.scheduleStartDate = scheduleStartDate;
	}

	public String getScheduleType() {
		return scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public String getSendEmailUser() {
		return sendEmailUser;
	}

	public void setSendEmailUser(String sendEmailUser) {
		this.sendEmailUser = sendEmailUser;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUsePreviousData() {
		return usePreviousData;
	}

	public void setUsePreviousData(String usePreviousData) {
		this.usePreviousData = usePreviousData;
	}

}