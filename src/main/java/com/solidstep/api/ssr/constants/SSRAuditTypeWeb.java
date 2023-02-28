package com.solidstep.api.ssr.constants;

import java.util.HashMap;

public class SSRAuditTypeWeb {

	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	static{
		dataMap.put("1","20");		//Apache
		dataMap.put("2","21");		//IIS
		dataMap.put("4","22");		//WebtoB
		dataMap.put("8","23");		//OHS
		dataMap.put("1024","29");	//Iplanet
		dataMap.put("4096","38");	//Nginx
		dataMap.put("16384","91");	//Unknown
	};
	
}