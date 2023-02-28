package com.solidstep.api.ssr.domain;

import java.util.List;

@SuppressWarnings("unchecked")
public class SSRApiResult<T> {
	
	private int isOk;
	private String errInfo;
	private int dataCount;
	private String aresultReUse;
	private int jobInfoCount;
	private int jobPlancount;
	private int moddataReUse;
	private boolean success = false;
	private List<T> listData;
	private T oneData;
	
	public SSRApiResult(){}
	
	public SSRApiResult(List<Object> listData){
		this.listData = (List<T>) listData;
	}
	
	public SSRApiResult(Object oneData){
		this.oneData = (T) oneData;
	}
	
	public int getIsOk() {
		return isOk;
	}

	public void setIsOk(int isOk) {
		this.isOk = isOk;
	}

	public String getErrInfo() {
		return errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public int getDataCount() {
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}

	public List<T> getListData() {
		return listData;
	}

	public void setListData(List<Object> listData) {
		this.listData = (List<T>) listData;
	}

	public T getOneData() {
		return oneData;
	}

	public void setOneData(Object oneData) {
		this.oneData = (T) oneData;
	}

	public boolean isSuccess() {
		if(isOk == 1){
			return true;
		}
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public String getAresultReUse() {
		return aresultReUse;
	}
	
	public void setAresultReUse(String aresultReUse) {
		this.aresultReUse = aresultReUse;
	}
	
	public int getJobInfoCount() {
		return jobInfoCount;
	}
	
	public void setJobInfoCount(int jobInfoCount) {
		this.jobInfoCount = jobInfoCount;
	}
	
	public int getJobPlancount() {
		return jobPlancount;
	}
	
	public void setJobPlancount(int jobPlancount) {
		this.jobPlancount = jobPlancount;
	}

	public int getModdataReUse() {
		return moddataReUse;
	}

	public void setModdataReUse(int moddataReUse) {
		this.moddataReUse = moddataReUse;
	}

}