package com.solidstep.api.ssr.constants;

public class SSRApiConstants {

	public static final String SSR_API_AUTHORIZATION_DELIMITER = ":";
	public static final String SSR_API_AUTHORIZATION_HEADER_KEY = "Authorization";
	public static final String SSR_API_AUTHORIZATION_HEADER_VALUE_PREFIX = "Basic ";
	
	public static final String SSR_API_URL_SCHEME = "https";
	public static final String SSR_API_URL_HOST = "솔리드 스텝 도메인";
	public static final String SSR_API_ENDPOINT_URL = "솔리드 스텝 API endpoint URL";
	
	public static final String SSR_API_DEFAULT_CHARSET = "UTF-8";
	public static final String SSR_API_ID = "apiId";
	public static final String SSR_API_JSON_RESULT_KEY = "apiJsonResultKey";
	
	public static final String SSR_API_RESULT_INFO_KEY = "info";
	public static final String SSR_API_RESULT_INFO_KEY_ISOK = "isOk";
	public static final String SSR_API_RESULT_INFO_KEY_DATACOUNT = "dataCount";
	public static final String SSR_API_RESULT_INFO_KEY_ERRINFO = "errInfo";
	public static final String SSR_API_RESULT_INFO_KEY_ARESULT_RE_USE = "aresultReUse";
	public static final String SSR_API_RESULT_INFO_KEY_JOB_INFO_COUNT = "jobInfoCount";
	public static final String SSR_API_RESULT_INFO_KEY_JOB_PLANCOUNT = "jobPlancount";
	public static final String SSR_API_RESULT_INFO_KEY_MODDATA_RE_USE = "moddataReUse";
	public static final String SSR_API_RESULT_DEFAULT_LIST_KEY = "list";
	
	public static final String SSR_API_PARAMETER_KEY_LIMIT = "limit";
	public static final String SSR_API_PARAMETER_KEY_OFFSET = "offset";
	
	public static final int SSR_API_RESULT_DEFAULT_LIMITS = 100;
	public static final int SSR_API_RESULT_DEFAULT_OFFSET = 0;
	public static final int SSR_API_RESULT_MAX_LIMITS = 10000;
	
	public static final String OBJECT_REFLECTION_GETTER_PREFIX = "get";
	public static final String OBJECT_REFLECTION_SETTER_PREFIX = "set";
	
	public static final String SSR_EPOCH_TIME_POSTPIX = "Epoch";
	
	public static final String SSR_LEFT_LINE_DELIMITER = String.valueOf((char)0x01); 
	public static final String SSR_RIGHT_LINE_DELIMITER = String.valueOf((char)0x02);
			
}