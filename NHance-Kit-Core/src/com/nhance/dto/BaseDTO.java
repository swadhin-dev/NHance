/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: BaseDTO.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.dto;

/**
 * The Class BaseDTO.
 */
public class BaseDTO {

	/** The application id. */
	private String applicationId;
	
	/** The default locale. */
	private String defaultLocale;
	
	/** The transaction type. */
	private Integer transactionType;
	
	/** The status. */
	private Integer status;
	
	/** The message description. */
	private String messageDescription;
	
	/** The version number. */
	private String versionNumber;
	
	/** The success response. */
	private String successResponse;
	
	/** The enc payload. */
	private byte[] encPayload;
	
	/** The request id. */
	private Long requestID;

	/**
	 * Gets the application id.
	 * 
	 * @return the application id
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * Sets the application id.
	 * 
	 * @param applicationId
	 *            the new application id
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * Gets the transaction type.
	 * 
	 * @return the transaction type
	 */
	public Integer getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the transaction type.
	 * 
	 * @param transactionType
	 *            the new transaction type
	 */
	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Gets the status.
	 * 
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 * 
	 * @param status
	 *            the new status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Gets the message description.
	 * 
	 * @return the message description
	 */
	public String getMessageDescription() {
		return messageDescription;
	}

	/**
	 * Sets the message description.
	 * 
	 * @param messageDescription
	 *            the new message description
	 */
	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}

	/**
	 * Gets the default locale.
	 * 
	 * @return the default locale
	 */
	public String getDefaultLocale() {
		return defaultLocale;
	}

	/**
	 * Sets the default locale.
	 * 
	 * @param defaultLocale
	 *            the new default locale
	 */
	public void setDefaultLocale(String defaultLocale) {
		this.defaultLocale = defaultLocale;
	}
	
	/**
	 * Gets the success response.
	 * 
	 * @return the success response
	 */
	public String getSuccessResponse() {
		return successResponse;
	}

	/**
	 * Sets the success response.
	 * 
	 * @param successResponse
	 *            the new success response
	 */
	public void setSuccessResponse(String successResponse) {
		this.successResponse = successResponse;
	}
	
	/**
	 * Gets the version number.
	 * 
	 * @return the version number
	 */
	public String getVersionNumber() {
		return versionNumber;
	}

	/**
	 * Sets the version number.
	 * 
	 * @param versionNumber
	 *            the new version number
	 */
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	/**
	 * Gets the enc payload.
	 * 
	 * @return the enc payload
	 */
	public byte[] getEncPayload() {
		return encPayload;
	}

	/**
	 * Sets the enc payload.
	 * 
	 * @param encPayload
	 *            the new enc payload
	 */
	public void setEncPayload(byte[] encPayload) {
		this.encPayload = encPayload;
	}

	/**
	 * Gets the request id.
	 * 
	 * @return the request id
	 */
	public Long getRequestID() {
		return requestID;
	}

	/**
	 * Sets the request id.
	 * 
	 * @param requestID
	 *            the new request id
	 */
	public void setRequestID(Long requestID) {
		this.requestID = requestID;
	}
}
