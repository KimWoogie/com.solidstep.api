package com.solidstep.api.ssr.core;

import com.solidstep.api.ssr.apis.SSRApiHandler;
import com.solidstep.api.ssr.apis.SSRApis;

public class SSRApiFactory {
	
	public static SSRApiFactory INSTANCE = new SSRApiFactory();
	
	private SSRApiFactory (){}
	
	public SSRApiHandler createHandler(SSRApis ssrApis){
		SSRApiHandler handler = ssrApis.getHandler();
		return handler;
	}
}