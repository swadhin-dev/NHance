/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: TxnBaseTest.java
*
* Date Author Changes
* 16 Dec, 2015 Swadhin Created
*/

package com.test;

import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.nhance.dto.BaseDTO;
import com.nhance.utils.JSONAdaptor;

/**
 * The Class TxnBaseTest.
 */
public class TxnBaseTest  {
	

	
	/**
	 * Send request.
	 * 
	 * @param request
	 *            the request
	 * @param url
	 *            the url
	 * @throws Exception
	 *             the exception
	 */
	public void sendRequest( BaseDTO request,String url) throws Exception {
		
		JSONAdaptor adaptor = new JSONAdaptor() ;
		String payload = adaptor.toJSON(request);
		
		System.out.println(payload);
		
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Length", "" + payload.length());
		connection.setRequestProperty("Content-Type", "application/json");
		
		connection.setRequestProperty("applicationId", "b2d703e83fff487c");

		connection.setConnectTimeout(5000);
		connection.setReadTimeout(300000);

		connection.getOutputStream().write(payload.getBytes());
		connection.getOutputStream().flush();

		System.out.println("Response Code: " + connection.getResponseCode());
		System.out.println("Response Message: " + connection.getResponseMessage());

		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		int byteRead = 0;
		while ((byteRead = connection.getInputStream().read()) != -1) {
			buffer.write(byteRead);
		}
		
	}

}
