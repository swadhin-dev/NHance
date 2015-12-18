/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: BaseController.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import com.nhance.constants.Constants;
import com.nhance.dto.BaseDTO;

/**
 * The Class BaseController.
 */
public class BaseController {
	
	/** The message source. */
	@Autowired
	private MessageSource messageSource;

	/**
	 * Gets the error response.
	 *
	 * @param transactionBaseDTO the transaction base dto
	 * @param errorCode the error code
	 * @return the error response
	 */
	protected BaseDTO getErrorResponse(BaseDTO transactionBaseDTO,String errorCode) {

		transactionBaseDTO.setStatus(Constants.MOB_RESP_STATUS_FAILURE);
		transactionBaseDTO.setMessageDescription(messageSource.getMessage("ERROR_"+errorCode, null, new Locale(transactionBaseDTO.getDefaultLocale())));

		return transactionBaseDTO;
	}
}
