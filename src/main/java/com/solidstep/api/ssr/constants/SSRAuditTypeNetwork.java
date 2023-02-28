package com.solidstep.api.ssr.constants;

import java.util.HashMap;

public class SSRAuditTypeNetwork {

	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	static{
		dataMap.put("1","30");		//Cisco
		dataMap.put("2","31");		//Juniper
		dataMap.put("4","32");		//Alteon
		dataMap.put("8","33");		//3Com
		dataMap.put("16","34");		//Alcatel
		dataMap.put("32","35");		//Extreme
		dataMap.put("16384","94");	//Unknown
	};
	
}