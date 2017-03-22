package com.saichanthrakumar.microservices.gorden.exception;

import lombok.NoArgsConstructor;

/**
 * @author SAI CHANTHRA KUMAR
 *
 */
@NoArgsConstructor
public class InvalidInputFormatException extends GordenException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInputFormatException(Throwable e) {
		super(e);
	}

}
