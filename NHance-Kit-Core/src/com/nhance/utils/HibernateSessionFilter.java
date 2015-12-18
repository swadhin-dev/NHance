/* Copyright © EasOfTech 2015. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with EasOfTech.
*
* Id: HibernateSessionFilter.java
*
* Date Author Changes
* 17 Dec, 2015 Swadhin Created
*/
package com.nhance.utils;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.CleanupFailureDataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.OpenSessionInViewFilter;

/**
 * The Class HibernateSessionFilter.
 */
public class HibernateSessionFilter extends OpenSessionInViewFilter {

	/* (non-Javadoc)
	 * @see org.springframework.orm.hibernate3.support.OpenSessionInViewFilter#setSingleSession(boolean)
	 */
	@Override
	public void setSingleSession(boolean singleSession) {
		super.setSingleSession(true);
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.orm.hibernate3.support.OpenSessionInViewFilter#getSession(org.hibernate.SessionFactory)
	 */
	@Override
	protected Session getSession(SessionFactory sessionFactory) throws DataAccessResourceFailureException {
		Session session = SessionFactoryUtils.getSession(sessionFactory, true);
		//set the FlushMode to auto in order to save objects.
		session.setFlushMode(FlushMode.AUTO);
		return session;
	}


	/* (non-Javadoc)
	 * @see org.springframework.orm.hibernate3.support.OpenSessionInViewFilter#closeSession(org.hibernate.Session, org.hibernate.SessionFactory)
	 */
	@Override
	protected void closeSession(Session session, SessionFactory sessionFactory) {
		try{
			if (session != null && session.isOpen() && session.isConnected()) {
				try {
					session.flush();
				} catch (HibernateException e) {
					throw new CleanupFailureDataAccessException("Failed to flush session before close: " + e.getMessage(), e);
				} catch(Exception e){}
			}
		} finally{
			super.closeSession(session, sessionFactory);
		}
	}
}