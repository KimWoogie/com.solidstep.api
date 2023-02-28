package com.solidstep.api.ssr.parameters.response;

import com.solidstep.api.ssr.parameters.SSRResponse;

public class GetResultAuditCommentInfoResponse extends SSRResponse{

	private String adetailCommentNo;
	private String requestUserNo;
	private String requestUserName;
	private String requestUserEmail;
	private String requestType;
	private String requestToEpoch;
	private String requestComment;
	private String laterProcUserNos;
	private String laterProcUserNames;
	private String laterProcUserEmails;
	private String laterProcExpEpoch;
	private String attachPath;
	private String attachName;
	private String approvalUserNo;
	private String approvalUserName;
	private String approvalUserEmail;
	private String approvalStatus;
	private String approvalComment;
	private String approvalEpoch;
	private String regEpoch;
	private String oldDecision;
	private String withAuditExcept;
	private String requestDateType;
	private String requestNo;
	private String atemplateNos;
	private String assetNo;
	private String vitemNo;
	private String itemCode;
	private String auditGroupNo;
	private String seq;
	private String alinkNo;
	private String userCode;
	private String atemplateNo;
	
	public GetResultAuditCommentInfoResponse() {
		super.apiId = "getResultAudit";
	}
	
	@Override
	public String getApiId() {
		return super.apiId;
	}

	public String getAdetailCommentNo() {
		return adetailCommentNo;
	}

	public void setAdetailCommentNo(String adetailCommentNo) {
		this.adetailCommentNo = adetailCommentNo;
	}

	public String getRequestUserNo() {
		return requestUserNo;
	}

	public void setRequestUserNo(String requestUserNo) {
		this.requestUserNo = requestUserNo;
	}

	public String getRequestUserName() {
		return requestUserName;
	}

	public void setRequestUserName(String requestUserName) {
		this.requestUserName = requestUserName;
	}

	public String getRequestUserEmail() {
		return requestUserEmail;
	}

	public void setRequestUserEmail(String requestUserEmail) {
		this.requestUserEmail = requestUserEmail;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestToEpoch() {
		return requestToEpoch;
	}

	public void setRequestToEpoch(String requestToEpoch) {
		this.requestToEpoch = requestToEpoch;
	}

	public String getRequestComment() {
		return requestComment;
	}

	public void setRequestComment(String requestComment) {
		this.requestComment = requestComment;
	}

	public String getLaterProcUserNos() {
		return laterProcUserNos;
	}

	public void setLaterProcUserNos(String laterProcUserNos) {
		this.laterProcUserNos = laterProcUserNos;
	}

	public String getLaterProcUserNames() {
		return laterProcUserNames;
	}

	public void setLaterProcUserNames(String laterProcUserNames) {
		this.laterProcUserNames = laterProcUserNames;
	}

	public String getLaterProcUserEmails() {
		return laterProcUserEmails;
	}

	public void setLaterProcUserEmails(String laterProcUserEmails) {
		this.laterProcUserEmails = laterProcUserEmails;
	}

	public String getLaterProcExpEpoch() {
		return laterProcExpEpoch;
	}

	public void setLaterProcExpEpoch(String laterProcExpEpoch) {
		this.laterProcExpEpoch = laterProcExpEpoch;
	}

	public String getAttachPath() {
		return attachPath;
	}

	public void setAttachPath(String attachPath) {
		this.attachPath = attachPath;
	}

	public String getAttachName() {
		return attachName;
	}

	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}

	public String getApprovalUserNo() {
		return approvalUserNo;
	}

	public void setApprovalUserNo(String approvalUserNo) {
		this.approvalUserNo = approvalUserNo;
	}

	public String getApprovalUserName() {
		return approvalUserName;
	}

	public void setApprovalUserName(String approvalUserName) {
		this.approvalUserName = approvalUserName;
	}

	public String getApprovalUserEmail() {
		return approvalUserEmail;
	}

	public void setApprovalUserEmail(String approvalUserEmail) {
		this.approvalUserEmail = approvalUserEmail;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getApprovalComment() {
		return approvalComment;
	}

	public void setApprovalComment(String approvalComment) {
		this.approvalComment = approvalComment;
	}

	public String getApprovalEpoch() {
		return approvalEpoch;
	}

	public void setApprovalEpoch(String approvalEpoch) {
		this.approvalEpoch = approvalEpoch;
	}

	public String getRegEpoch() {
		return regEpoch;
	}

	public void setRegEpoch(String regEpoch) {
		this.regEpoch = regEpoch;
	}

	public String getOldDecision() {
		return oldDecision;
	}

	public void setOldDecision(String oldDecision) {
		this.oldDecision = oldDecision;
	}

	public String getWithAuditExcept() {
		return withAuditExcept;
	}

	public void setWithAuditExcept(String withAuditExcept) {
		this.withAuditExcept = withAuditExcept;
	}

	public String getRequestDateType() {
		return requestDateType;
	}

	public void setRequestDateType(String requestDateType) {
		this.requestDateType = requestDateType;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getAtemplateNos() {
		return atemplateNos;
	}

	public void setAtemplateNos(String atemplateNos) {
		this.atemplateNos = atemplateNos;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getVitemNo() {
		return vitemNo;
	}

	public void setVitemNo(String vitemNo) {
		this.vitemNo = vitemNo;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getAuditGroupNo() {
		return auditGroupNo;
	}

	public void setAuditGroupNo(String auditGroupNo) {
		this.auditGroupNo = auditGroupNo;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getAlinkNo() {
		return alinkNo;
	}

	public void setAlinkNo(String alinkNo) {
		this.alinkNo = alinkNo;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getAtemplateNo() {
		return atemplateNo;
	}

	public void setAtemplateNo(String atemplateNo) {
		this.atemplateNo = atemplateNo;
	}
	
}