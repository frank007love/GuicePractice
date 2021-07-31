package org.tonylin.practice.guice.assisted;

import com.google.inject.ImplementedBy;


public class CreditCardPaymentService implements PaymentService {

	@Override
	public void pay() {
		System.out.println("CreditCardPaymentService pay!");
	}

}
