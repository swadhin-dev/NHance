/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: Constants.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.constants;

/**
 * The Interface Constants.
 */
public interface Constants {

	/** The KE y_ version. */
	String KEY_VERSION = "1.0";
	
	/** The KE y_ owner. */
	String KEY_OWNER = "eot";
	
	/** The PI n_ has h_ algorithm. */
	String PIN_HASH_ALGORITHM = "SHA-1";
	
	/** The MOBREQUES t_ statu s_ logged. */
	int MOBREQUEST_STATUS_LOGGED = 0;
	
	/** The MOBREQUES t_ statu s_ success. */
	int MOBREQUEST_STATUS_SUCCESS = 1;
	
	/** The MOBREQUES t_ statu s_ failure. */
	int MOBREQUEST_STATUS_FAILURE = 2;
	
	/** The MO b_ res p_ statu s_ success. */
	int MOB_RESP_STATUS_SUCCESS = 0 ;
	
	/** The MO b_ res p_ statu s_ failure. */
	int MOB_RESP_STATUS_FAILURE = 1 ;
	
	/** The MO b_ updat e_ status. */
	int MOB_UPDATE_STATUS = 2 ;
	
	/** The ACTIVATIO n_ req. */
	int ACTIVATION_REQ = 10;
	
	/** The CHANG e_ pi n_ req. */
	int CHANGE_PIN_REQ = 15;
	
	/** The CHANG e_ tx n_ pi n_ req. */
	int CHANGE_TXN_PIN_REQ = 20;
	
	/** The PROFIL e_ updat e_ req. */
	int PROFILE_UPDATE_REQ = 25;
	
	/** The BA l_ en q_ req. */
	int BAL_ENQ_REQ = 30;
	
	/** The MINISTATEMEN t_ req. */
	int MINISTATEMENT_REQ = 35;
	
	/** The AD d_ car d_ req. */
	int ADD_CARD_REQ = 40;
	
	/** The CONFIR m_ car d_ req. */
	int CONFIRM_CARD_REQ = 45;
	
	/** The DELET e_ car d_ req. */
	int DELETE_CARD_REQ = 50;
	
	/** The TRANSFE r_ direc t_ req. */
	int TRANSFER_DIRECT_REQ = 55;
	
	/** The SE t_ defaul t_ ac c_ req. */
	int SET_DEFAULT_ACC_REQ = 60;
	
	/** The RESE t_ pi n_ req. */
	int RESET_PIN_REQ = 65;
	
	/** The REACTIVATIO n_ req. */
	int REACTIVATION_REQ = 70;
	
	/** The RESE t_ tx n_ pi n_ req. */
	int RESET_TXN_PIN_REQ = 75;
	
	/** The MOBIL e_ topu p_ req. */
	int MOBILE_TOPUP_REQ = 80;
	
	/** The GE t_ custome r_ account s_ req. */
	int GET_CUSTOMER_ACCOUNTS_REQ = 85;
	
	/** The SAL e_ req. */
	int SALE_REQ = 90;
	
	/** The GI m_ channel. */
	String EOT_CHANNEL = "1";
	
	/** The RE f_ typ e_ customer. */
	int REF_TYPE_CUSTOMER = 0;
	
	/** The RE f_ typ e_ merchant. */
	int REF_TYPE_MERCHANT = 1;
	
	/** The RE f_ typ e_ sol e_ merchant. */
	int REF_TYPE_SOLE_MERCHANT = 2;
	
	/** The CUSTOME r_ statu s_ new. */
	int CUSTOMER_STATUS_NEW = 10;
	
	/** The CUSTOME r_ statu s_ active. */
	int CUSTOMER_STATUS_ACTIVE = 20;
	
	/** The CUSTOME r_ statu s_ inactive. */
	int CUSTOMER_STATUS_INACTIVE = 30;
	
	/** The CUSTOME r_ statu s_ deactivated. */
	int CUSTOMER_STATUS_DEACTIVATED = 40;
	
	/** The AP p_ statu s_ new. */
	int APP_STATUS_NEW = 10;
	
	/** The AP p_ statu s_ downloaded. */
	int APP_STATUS_DOWNLOADED = 20;
	
	/** The AP p_ statu s_ activatio n_ s c_ debited. */
	int APP_STATUS_ACTIVATION_SC_DEBITED = 30;
	
	/** The AP p_ statu s_ activated. */
	int APP_STATUS_ACTIVATED = 40;
	
	/** The AP p_ statu s_ rese t_ pi n_ verified. */
	int APP_STATUS_RESET_PIN_VERIFIED = 50;
	
	/** The AP p_ statu s_ rese t_ pi n_ s c_ debited. */
	int APP_STATUS_RESET_PIN_SC_DEBITED = 60;
	
	/** The AP p_ statu s_ ne w_ pi n_ sent. */
	int APP_STATUS_NEW_PIN_SENT = 70;
	
	/** The AP p_ statu s_ blocked. */
	int APP_STATUS_BLOCKED = 80;
	
	/** The AP p_ statu s_ deactivated. */
	int APP_STATUS_DEACTIVATED = 90;
	
	/** The ALIA s_ typ e_ mobil e_ acc. */
	Integer ALIAS_TYPE_MOBILE_ACC = 1;
	
	/** The ALIA s_ typ e_ car d_ acc. */
	Integer ALIAS_TYPE_CARD_ACC = 2;
	
	/** The ALIA s_ typ e_ ban k_ acc. */
	Integer ALIAS_TYPE_BANK_ACC = 3;
	
	/** The ALIA s_ typ e_ other. */
	Integer ALIAS_TYPE_OTHER = 0;
	
	/** The TYP e_ mobil e_ wallet. */
	String TYPE_MOBILE_WALLET = "1";
	
	/** The OT p_ typ e_ we b_ user. */
	int OTP_TYPE_WEB_USER = 1;
	
	/** The OT p_ typ e_ customer. */
	int OTP_TYPE_CUSTOMER = 2;
	
	/** The CAR d_ statu s_ no t_ confirmed. */
	int CARD_STATUS_NOT_CONFIRMED = 1 ;
	
	/** The CAR d_ statu s_ confirmed. */
	int CARD_STATUS_CONFIRMED = 2 ;
	
	/** The CAR d_ statu s_ deleted. */
	int CARD_STATUS_DELETED = 3 ;
	
	/** The INACTIV e_ ban k_ status. */
	int INACTIVE_BANK_STATUS = 0 ;
	
	/** The ACTIVE. */
	int ACTIVE = 2 ;
	
	/** The INACTIVE. */
	int INACTIVE = 3 ;
	
	
}
