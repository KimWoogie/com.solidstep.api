package com.solidstep.api.ssr.constants;

import java.util.HashMap;

public class SSRAuditTypeWas {

	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	static{
		dataMap.put("16","24");		//Tomcat
		dataMap.put("32","25");		//WebLogic
		dataMap.put("64","26");		//Jeus
		dataMap.put("128","27");		//WebSphere
		dataMap.put("256","28");		//JBoss
		dataMap.put("2048","60");	//Jrun
		dataMap.put("8192","43");	//Resin
		dataMap.put("16384","91");	//Unknown
	};
	
}