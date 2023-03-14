package com.solidstep.api.ssr.constants;

import java.util.HashMap;

public class SSRAuditTypeDb {
	
	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	static{
		dataMap.put("1","10");		//Oracle
		dataMap.put("2","11");		//Mssql
		dataMap.put("4","12");		//Mysql
		dataMap.put("8","13");		//Sybase
		dataMap.put("16","14");		//Tibero
		dataMap.put("32","15");		//Db2
		dataMap.put("64","16");		//Postgresql
		dataMap.put("128","17");		//Altibase
		dataMap.put("256","18");		//Mariadb
		dataMap.put("512","19");		//Infomix
		dataMap.put("16384","92");	//Unknown
	};
	
}