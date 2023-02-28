package com.solidstep.api.ssr.parameters;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.solidstep.api.ssr.constants.SSRApiConstants;

public abstract class SSRRequest {

	protected String apiId = null;
	
	protected String apiJsonResultKey = SSRApiConstants.SSR_API_RESULT_DEFAULT_LIST_KEY;
	
	protected String principle = null;
	
	protected String credential = null;
	
	public abstract String getApiJsonResultKey();
	
	public abstract String getApiId();
	
	public String getPrinciple() {
		return principle;
	}

	public void setPrinciple(String principle) {
		this.principle = principle;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

	public String toStringJson() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	public String toStringMultiline() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public String toStringNoClassName() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
	}

	public String toStringNoFieldNames() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_FIELD_NAMES_STYLE);
	}

	public String toStringShortPrefix() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String toStringSimple() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
	}
	
}