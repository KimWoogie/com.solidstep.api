package com.solidstep.api.ssr.apis;

import com.solidstep.api.ssr.apis.handler.CancelJobHandler;
import com.solidstep.api.ssr.apis.handler.DeleteAgentGroupHandler;
import com.solidstep.api.ssr.apis.handler.DeleteAssetInfoHandler;
import com.solidstep.api.ssr.apis.handler.DeleteAssetTypelinkHandler;
import com.solidstep.api.ssr.apis.handler.DownloadExcelReportHandler;
import com.solidstep.api.ssr.apis.handler.GenerateReportHandler;
import com.solidstep.api.ssr.apis.handler.GetAdtTemplateInfoHandler;
import com.solidstep.api.ssr.apis.handler.GetAgentGroupInfoHandler;
import com.solidstep.api.ssr.apis.handler.GetAssetInfoHandler;
import com.solidstep.api.ssr.apis.handler.GetAssetScoreInfoHandler;
import com.solidstep.api.ssr.apis.handler.GetAuditListByAuditNameHandler;
import com.solidstep.api.ssr.apis.handler.GetAuditProgressHandler;
import com.solidstep.api.ssr.apis.handler.GetAuditStatusTotalHandler;
import com.solidstep.api.ssr.apis.handler.GetAuditTypeHandler;
import com.solidstep.api.ssr.apis.handler.GetExcelReportHandler;
import com.solidstep.api.ssr.apis.handler.GetFixProcessListHandler;
import com.solidstep.api.ssr.apis.handler.GetJobListByAuditNoHandler;
import com.solidstep.api.ssr.apis.handler.GetLogListHandler;
import com.solidstep.api.ssr.apis.handler.GetResultAuditHandler;
import com.solidstep.api.ssr.apis.handler.GetResultAuditSummaryHandler;
import com.solidstep.api.ssr.apis.handler.GetUserInfoHandler;
import com.solidstep.api.ssr.apis.handler.GetUserSshKeysHandler;
import com.solidstep.api.ssr.apis.handler.InsertAgentGroupHandler;
import com.solidstep.api.ssr.apis.handler.InsertAssetInfoHandler;
import com.solidstep.api.ssr.apis.handler.InsertAssetTypeLinkHandler;
import com.solidstep.api.ssr.apis.handler.InsertAuditTypeHandler;
import com.solidstep.api.ssr.apis.handler.MoveAgentGroupHandler;
import com.solidstep.api.ssr.apis.handler.StartAuditHandler;
import com.solidstep.api.ssr.apis.handler.UpdateAuditOptionsHandler;
import com.solidstep.api.ssr.apis.handler.UpdateRemoteRunOptionsHandler;
import com.solidstep.api.ssr.exception.SSRApiRuntimeException;

public enum SSRApis {

	/**
	 * 자산 APIS
	 */
	getAssetInfo(GetAssetInfoHandler.class)                         /* 자산 조회				*/
	,insertAssetInfo(InsertAssetInfoHandler.class)                  /* 자산 추가				*/
	,insertAssetTypeLink(InsertAssetTypeLinkHandler.class)          /* 진단 대상 추가			*/
	,deleteAssetInfo(DeleteAssetInfoHandler.class)                  /* 자산 삭제				*/
	,deleteAssetTypelink(DeleteAssetTypelinkHandler.class)          /* 진단 대상 삭제			*/
	,getAuditType(GetAuditTypeHandler.class)                        /* 진단 대상 타입 조회		*/
	,insertAuditType(InsertAuditTypeHandler.class)                  /* 진단 대상 타입 추가		*/
                                                                             /* 진단 대상 타입 삭제		*/
	,getAgentGroupInfo(GetAgentGroupInfoHandler.class)              /* 자산그룹 조회			*/
	,getUserInfo(GetUserInfoHandler.class)                          /* 사용자 조회			*/
	,getUserSshKeys(GetUserSshKeysHandler.class)                    /* 인증서 조회			*/
	,updateRemoteRunOptions(UpdateRemoteRunOptionsHandler.class)    /* 원격 진단 옵션 설정		*/
	,insertAgentGroup(InsertAgentGroupHandler.class)                /* 사용자 그룹 추가		*/
	,deleteAgentGroup(DeleteAgentGroupHandler.class)                /* 사용자 그룹 삭제		*/
	,moveAgentGroup(MoveAgentGroupHandler.class)                    /* 진단 대상 그룹 이동		*/
	,getLogList(GetLogListHandler.class)                            /* Agent 로그 조회		*/
	,getAssetScoreInfo(GetAssetScoreInfoHandler.class)              /* 자산 점수 조회			*/

	/**
	 * 진단 조회 APIS
	 */
	,getAuditListByAuditName(GetAuditListByAuditNameHandler.class)  /* 진단 조회 (목록 조회)	*/    
	,getJobListByAuditNo(GetJobListByAuditNoHandler.class)          /* 진단 작업 조회			*/    
	,getAuditStatusTotal(GetAuditStatusTotalHandler.class)          /* 진단 현황 통계			*/    
	,getExcelReport(GetExcelReportHandler.class)                    /* 보고서 조회			*/    
	,getFixProcessList(GetFixProcessListHandler.class)              /* 진단 조치 이력 조회		*/
	
	/**
	 * 진단 진행사항 (자산별, 진단별) APIS
	 */
	,getAuditProgress(GetAuditProgressHandler.class)                /* 진단 진행 사항 조회		*/
	
	/**
	 * 진단 결과 조회 APIS
	 */
	,getResultAudit(GetResultAuditHandler.class)                    /* 진단 결과 조회			*/
	,getResultAuditSummary(GetResultAuditSummaryHandler.class)      /* 진단 결과 조회 요약		*/
	
	/**
	 * 진단 템플릿 조회 APIS
	 */
	,getAdtTemplateInfo(GetAdtTemplateInfoHandler.class)            /* 진단 템플릿 조회		*/
	
	/**
	 * 진단 상세 APIS
	 */
	,updateAuditOptions(UpdateAuditOptionsHandler.class)            /* 진단 옵션(계정 등) 설정	*/
	,startAudit(StartAuditHandler.class)                            /* 진단 실행				*/
	,cancelJob(CancelJobHandler.class)                              /* 진단 작업 취소			*/
	,generateReport(GenerateReportHandler.class)                    /* 새로운 템플릿으로 보고서 생성	*/    
	,downloadExcelReport(DownloadExcelReportHandler.class)          /* 보고서 다운로드		*/
	;
	
	private Class<? extends SSRApiHandler> clazz;
	
	private SSRApis( Class<? extends SSRApiHandler> clazz) {
		this.clazz = clazz;
	}
	
	public SSRApiHandler getHandler() {
		SSRApiHandler handler = null;
		try {
			handler = clazz.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new SSRApiRuntimeException(e.getMessage());
		}
		return handler;
	}
}