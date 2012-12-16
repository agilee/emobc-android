/**
* Copyright 2012 Neurowork Consulting S.L.
*
* This file is part of eMobc.
*
* ResultDelegate.java
* eMobc Android Framework
*
* eMobc is free software: you can redistribute it and/or modify
* it under the terms of the Affero GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* eMobc is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the Affero GNU General Public License
* along with eMobc. If not, see <http://www.gnu.org/licenses/>.
*
*/
package com.emobc.android.activities.generators;

import java.io.Serializable;

import com.paypal.android.MEP.PayPalResultDelegate;

/**
 * @author Jorge E. Villaverde
 * @since 0.1
 * @version 0.1
 */
public class ResultDelegate implements PayPalResultDelegate,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8615267132258885663L;

	@Override
	public void onPaymentCanceled(String arg0) {

	}

	@Override
	public void onPaymentFailed(String arg0, String arg1, String arg2, String arg3, String arg4) {

	}

	@Override
	public void onPaymentSucceeded(String arg0, String arg1) {

	}

}
