package com.solidstep.api.ssr.constants;

import java.util.HashMap;

public class SSRAuditTypeOs {

	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	static{
		dataMap.put("1","1");		//Windows
		dataMap.put("2","2");		//AIX
		dataMap.put("4","3");		//HP-UX
		dataMap.put("8","4");		//Linux
		dataMap.put("16","5");		//Solaris
		dataMap.put("16384","91");	//Unknown
	};
	
}