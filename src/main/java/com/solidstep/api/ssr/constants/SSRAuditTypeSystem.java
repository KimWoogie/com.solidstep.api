package com.solidstep.api.ssr.constants;

import java.util.HashMap;

public class SSRAuditTypeSystem {

	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	static{
		dataMap.put("1","OS");		//OS
		dataMap.put("2","WB");		//WEB -> WEB + WAS
		dataMap.put("4","DB");		//DB
		dataMap.put("8","NW");		//NETWORK
	};
	
}