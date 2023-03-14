package com.solidstep.api.ssr.exception;

public class SSRApiRuntimeException extends RuntimeException{

	private static final long serialVersionUID = -7755046795546372552L;

	public SSRApiRuntimeException(String message){
		throw new RuntimeException(message);
	}
	
}
