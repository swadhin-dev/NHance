/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: DateUtil.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class DateUtil.
 */
public class DateUtil {

	/**
	 * Format date and time.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String formatDateAndTime(Date date){
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sd.format(date);
	}
	
	/**
	 * Format date.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String formatDate(Date date){

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		return sd.format(date);
	}

	/**
	 * String to date time.
	 * 
	 * @param date
	 *            the date
	 * @return the date
	 */
	public static Date stringToDateTime(String date){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		try {
			return sd.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * String to date.
	 * 
	 * @param date
	 *            the date
	 * @return the date
	 */
	public static Date stringToDate(String date){
		Date formattedDate = null;
		try {
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
			formattedDate = sd.parse(date);
		} catch (ParseException e) {
			System.out.println("<<<<error >>>>"+e.getMessage());
			e.printStackTrace();
		}
		return formattedDate;
	}

	/**
	 * Format date.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String formatDate(String date){
		/* Function to change the date format from mm-dd-yy to yy-mm-dd*/
		String invDt1[] = date.toString().split("-");
		String invDt = invDt1[2]+"-"+invDt1[1]+"-"+invDt1[0];
		System.out.println("<<<<date>>>> "+invDt);
		return invDt;
	}

	/**
	 * Format date to str.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String formatDateToStr(Date date){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		return sd.format(date);
	}

	/**
	 * Date and time.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String dateAndTime(Date date){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return sd.format(date);
	}
	
	/**
	 * Formatted date and time.
	 * 
	 * @param date
	 *            the date
	 * @return the string
	 */
	public static String formattedDateAndTime(Date date){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return sd.format(date);
	}
	
	/**
	 * String to date time seconds.
	 * 
	 * @param date
	 *            the date
	 * @return the date
	 */
	public static Date stringToDateTimeSeconds(String date){
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			return sd.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
