/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: EncryptionHtmlMessageConverter.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.utils;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.bouncycastle.util.encoders.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.nhance.constants.Constants;
import com.nhance.dto.BaseDTO;
import com.thinkways.kms.KMS;
import com.thinkways.kms.security.KMSSecurityException;

/**
 * The Class EncryptionHtmlMessageConverter.
 */
public class EncryptionHtmlMessageConverter extends AbstractHttpMessageConverter<Object> {

	/** The kms handler. */
	private KMS kmsHandler;

	/** The is secured. */
	private boolean isSecured = false;

	/**
	 * Sets the logger.
	 * 
	 * @param kmsHandler
	 *            the new logger
	 */
	public void setKmsHandler(KMS kmsHandler) {
		this.kmsHandler = kmsHandler;
	}

	/* (non-Javadoc)
	 * @see org.springframework.http.converter.AbstractHttpMessageConverter#readInternal(java.lang.Class, org.springframework.http.HttpInputMessage)
	 */
	@Override
	protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		try {

			byte[] payload = IOUtils.toByteArray(inputMessage.getBody()) ;
			HttpHeaders httpHeaders = inputMessage.getHeaders();
			String applicationId = httpHeaders.getFirst("applicationId");
			byte[] encPayload = null;

			if (isSecured) {

				encPayload = Base64.decode(payload) ;

				payload = kmsHandler.desOperation(applicationId, Constants.KEY_VERSION, Constants.KEY_OWNER, encPayload , false);

			}

			BaseDTO baseDTO = (BaseDTO) new JSONAdaptor().fromJSON(new String(payload), clazz);
			baseDTO.setApplicationId(applicationId);
			baseDTO.setEncPayload(payload);

			return baseDTO;

		} catch (IOException ex) {
			throw new HttpMessageNotReadableException("Could not read JSON: " + ex.getMessage(), ex);
		} catch (KMSSecurityException e) {
			throw new HttpMessageNotReadableException("Could not decrypt Payload: " + e.getMessage(), e);
		}
	}

	/* (non-Javadoc)
	 * @see org.springframework.http.converter.AbstractHttpMessageConverter#writeInternal(java.lang.Object, org.springframework.http.HttpOutputMessage)
	 */
	@Override
	protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

		String jsonString = new JSONAdaptor().toJSON(object) ;

		System.out.println(jsonString);

		byte[] payload = null ;
		byte[] encPayload = null;

		BaseDTO baseDTO = ((BaseDTO) object);

		if (isSecured) {

			try {

				encPayload = kmsHandler.desOperation(baseDTO.getApplicationId(), Constants.KEY_VERSION, Constants.KEY_OWNER, jsonString.getBytes() , true);

				payload = Base64.encode(encPayload);

			} catch (KMSSecurityException e) {
				throw new HttpMessageNotWritableException("Could not encrypt Payload: " + e.getMessage(), e);
			}
		} else {
			payload = jsonString.getBytes() ;
		}

		baseDTO.setEncPayload(payload);
		IOUtils.write(payload, outputMessage.getBody());
	}

	/* (non-Javadoc)
	 * @see org.springframework.http.converter.AbstractHttpMessageConverter#supports(java.lang.Class)
	 */
	@Override
	protected boolean supports(Class<?> clazz) {
		return true;
	}

}

