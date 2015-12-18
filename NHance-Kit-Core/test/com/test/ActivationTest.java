/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: {Class}
*
* Date Author Changes
* @Date @User Created
*/
package com.test;

import com.nhance.dto.BaseDTO;

/**
 * The Class ActivationTest.
 */
public class ActivationTest extends TxnBaseTest {
	
	/**
	 * Test success.
	 */
	public void testSuccess() {
		
		try {
			
			BaseDTO request = new BaseDTO();
			request.setVersionNumber("1.0.1");
			
			String url = "http://localhost:8080/NHance-Kit-Core/rest/cust/test" ;
			
			sendRequest(request,url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		ActivationTest test = new ActivationTest();
		
		test.testSuccess();
		
	}
	
}
