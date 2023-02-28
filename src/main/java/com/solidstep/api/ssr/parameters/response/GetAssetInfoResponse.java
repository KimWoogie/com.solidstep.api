package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetAssetInfoResponse extends SSRResponse{
	
	private String agentGroupNames;
	private String agentGroupNoArray;
	private String alinkNo;
	private String alinkRegEpoch;
	private String assetNo;
	private String assetRegEpoch;
	private String atypeNo;
	private String auditCheckInfo;
	private String auditOptions;
	private String connectionInterval;
	private String cpuAgentRate;
	private String cpuGearValue;
	private String cpuRate;
	private String description;
	private String hddAgentRate;
	private String hddRate;
	private String healthCheck;
	private String hostname;
	private String importance;
	private String ip;
	private String ipAll;
	private String isAuditable;
	private String lastAuditEpoch;
	private String lastPingEpoch;
	private String logLimitDay;
	private String logLimitSize;
	private String os;
	private String osDetail;
	private String piOptions;
	private String piSchedule;
	private String procCount;
	private String remoteRunConnectionType;
	private String remoteRunFilePath;
	private String remoteRunId;
	private String remoteRunIp;
	private String remoteRunPassword;
	private String remoteRunRootPassword;
	private String remoteRunType1;
	private String remoteRunType1Port;
	private String remoteRunType2Port;
	private String saVersion;
	private String scoreTemplateNo;
	private String ssDbType;
	private String ssNetworkType;
	private String ssOsType;
	private String ssTag;
	private String ssWebType;
	private String typeClass;
	private String typeName;
	private String useRemoteRun;
	private String linkDetail;
	
	public GetAssetInfoResponse(){
		super.apiId = "getAssetInfo";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAgentGroupNames() {
		return agentGroupNames;
	}

	public void setAgentGroupNames(String agentGroupNames) {
		this.agentGroupNames = agentGroupNames;
	}

	public String getAgentGroupNoArray() {
		return agentGroupNoArray;
	}

	public void setAgentGroupNoArray(String agentGroupNoArray) {
		this.agentGroupNoArray = agentGroupNoArray;
	}

	public String getAlinkNo() {
		return alinkNo;
	}

	public void setAlinkNo(String alinkNo) {
		this.alinkNo = alinkNo;
	}

	public String getAlinkRegEpoch() {
		return alinkRegEpoch;
	}

	public void setAlinkRegEpoch(String alinkRegEpoch) {
		this.alinkRegEpoch = alinkRegEpoch;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getAssetRegEpoch() {
		return assetRegEpoch;
	}

	public void setAssetRegEpoch(String assetRegEpoch) {
		this.assetRegEpoch = assetRegEpoch;
	}

	public String getAtypeNo() {
		return atypeNo;
	}

	public void setAtypeNo(String atypeNo) {
		this.atypeNo = atypeNo;
	}

	public String getAuditCheckInfo() {
		return auditCheckInfo;
	}

	public void setAuditCheckInfo(String auditCheckInfo) {
		this.auditCheckInfo = auditCheckInfo;
	}

	public String getAuditOptions() {
		return auditOptions;
	}

	public void setAuditOptions(String auditOptions) {
		this.auditOptions = auditOptions;
	}

	public String getConnectionInterval() {
		return connectionInterval;
	}

	public void setConnectionInterval(String connectionInterval) {
		this.connectionInterval = connectionInterval;
	}

	public String getCpuAgentRate() {
		return cpuAgentRate;
	}

	public void setCpuAgentRate(String cpuAgentRate) {
		this.cpuAgentRate = cpuAgentRate;
	}

	public String getCpuGearValue() {
		return cpuGearValue;
	}

	public void setCpuGearValue(String cpuGearValue) {
		this.cpuGearValue = cpuGearValue;
	}

	public String getCpuRate() {
		return cpuRate;
	}

	public void setCpuRate(String cpuRate) {
		this.cpuRate = cpuRate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHddAgentRate() {
		return hddAgentRate;
	}

	public void setHddAgentRate(String hddAgentRate) {
		this.hddAgentRate = hddAgentRate;
	}

	public String getHddRate() {
		return hddRate;
	}

	public void setHddRate(String hddRate) {
		this.hddRate = hddRate;
	}

	public String getHealthCheck() {
		return healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIpAll() {
		return ipAll;
	}

	public void setIpAll(String ipAll) {
		this.ipAll = ipAll;
	}

	public String getIsAuditable() {
		return isAuditable;
	}

	public void setIsAuditable(String isAuditable) {
		this.isAuditable = isAuditable;
	}

	public String getLastAuditEpoch() {
		return lastAuditEpoch;
	}

	public void setLastAuditEpoch(String lastAuditEpoch) {
		this.lastAuditEpoch = lastAuditEpoch;
	}

	public String getLastPingEpoch() {
		return lastPingEpoch;
	}

	public void setLastPingEpoch(String lastPingEpoch) {
		this.lastPingEpoch = lastPingEpoch;
	}

	public String getLogLimitDay() {
		return logLimitDay;
	}

	public void setLogLimitDay(String logLimitDay) {
		this.logLimitDay = logLimitDay;
	}

	public String getLogLimitSize() {
		return logLimitSize;
	}

	public void setLogLimitSize(String logLimitSize) {
		this.logLimitSize = logLimitSize;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsDetail() {
		return osDetail;
	}

	public void setOsDetail(String osDetail) {
		this.osDetail = osDetail;
	}

	public String getPiOptions() {
		return piOptions;
	}

	public void setPiOptions(String piOptions) {
		this.piOptions = piOptions;
	}

	public String getPiSchedule() {
		return piSchedule;
	}

	public void setPiSchedule(String piSchedule) {
		this.piSchedule = piSchedule;
	}

	public String getProcCount() {
		return procCount;
	}

	public void setProcCount(String procCount) {
		this.procCount = procCount;
	}

	public String getRemoteRunConnectionType() {
		return remoteRunConnectionType;
	}

	public void setRemoteRunConnectionType(String remoteRunConnectionType) {
		this.remoteRunConnectionType = remoteRunConnectionType;
	}

	public String getRemoteRunFilePath() {
		return remoteRunFilePath;
	}

	public void setRemoteRunFilePath(String remoteRunFilePath) {
		this.remoteRunFilePath = remoteRunFilePath;
	}

	public String getRemoteRunId() {
		return remoteRunId;
	}

	public void setRemoteRunId(String remoteRunId) {
		this.remoteRunId = remoteRunId;
	}

	public String getRemoteRunIp() {
		return remoteRunIp;
	}

	public void setRemoteRunIp(String remoteRunIp) {
		this.remoteRunIp = remoteRunIp;
	}

	public String getRemoteRunPassword() {
		return remoteRunPassword;
	}

	public void setRemoteRunPassword(String remoteRunPassword) {
		this.remoteRunPassword = remoteRunPassword;
	}

	public String getRemoteRunRootPassword() {
		return remoteRunRootPassword;
	}

	public void setRemoteRunRootPassword(String remoteRunRootPassword) {
		this.remoteRunRootPassword = remoteRunRootPassword;
	}

	public String getRemoteRunType1() {
		return remoteRunType1;
	}

	public void setRemoteRunType1(String remoteRunType1) {
		this.remoteRunType1 = remoteRunType1;
	}

	public String getRemoteRunType1Port() {
		return remoteRunType1Port;
	}

	public void setRemoteRunType1Port(String remoteRunType1Port) {
		this.remoteRunType1Port = remoteRunType1Port;
	}

	public String getRemoteRunType2Port() {
		return remoteRunType2Port;
	}

	public void setRemoteRunType2Port(String remoteRunType2Port) {
		this.remoteRunType2Port = remoteRunType2Port;
	}

	public String getSaVersion() {
		return saVersion;
	}

	public void setSaVersion(String saVersion) {
		this.saVersion = saVersion;
	}

	public String getScoreTemplateNo() {
		return scoreTemplateNo;
	}

	public void setScoreTemplateNo(String scoreTemplateNo) {
		this.scoreTemplateNo = scoreTemplateNo;
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

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getUseRemoteRun() {
		return useRemoteRun;
	}

	public void setUseRemoteRun(String useRemoteRun) {
		this.useRemoteRun = useRemoteRun;
	}

	public String getLinkDetail() {
		return linkDetail;
	}

	public void setLinkDetail(String linkDetail) {
		this.linkDetail = linkDetail;
	}
	
}