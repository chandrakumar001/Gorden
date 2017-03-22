package com.saichanthrakumar.microservices.gorden.exception;

import lombok.NoArgsConstructor;

/**
 * @author SAI CHANTHRA KUMAR
 * Exception Customized for GordenException
 */
@NoArgsConstructor
public class GordenException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GordenException(String str) {
		super(str);
	}

	public GordenException(Throwable e) {
		super(e);
	}
	
}
