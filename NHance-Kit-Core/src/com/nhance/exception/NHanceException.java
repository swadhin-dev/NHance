/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: NHanceException.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.exception;

/**
 * The Class NHanceException.
 */
public class NHanceException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The error code. */
	private Integer errorCode;
	
	/** The error message. */
	private String errorMessage;

    /**
	 * Instantiates a new eOT exception.
	 * 
	 * @param errorCode
	 *            the error code
	 */
    public NHanceException(Integer errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
	 * Instantiates a new eOT exception.
	 * 
	 * @param errorMessage
	 *            the error message
	 */
    public NHanceException(String errorMessage) {
    	this.errorMessage = errorMessage;
    }
    
	/**
	 * Gets the error code.
	 * 
	 * @return the error code
	 */
	public Integer getErrorCode() {
		return errorCode;
	}

	/**
	 * Gets the error message.
	 * 
	 * @return the error message
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

}
