/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: CustomerController.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhance.dto.BaseDTO;
import com.nhance.exception.ErrorConstants;

/**
 * The Class CustomerController.
 */
@Controller
@RequestMapping("/rest/cust")
public class CustomerController extends BaseController{

	/**
	 * Activation.
	 *
	 * @param baseDTO the base dto
	 * @return the base dto
	 * @throws Exception the exception
	 */
	@RequestMapping(value = "test", method = RequestMethod.POST)
	public @ResponseBody BaseDTO activation( @RequestBody BaseDTO baseDTO ) throws Exception {
		try {
//		} catch (NHanceException e) {
//			e.printStackTrace();
			//getErrorResponse(baseDTO, e.getErrorCode());
		} catch (Exception ex) {
			ex.printStackTrace();
			getErrorResponse(baseDTO, ErrorConstants.SERVICE_ERROR);
		}	
		return baseDTO;
	}
}
