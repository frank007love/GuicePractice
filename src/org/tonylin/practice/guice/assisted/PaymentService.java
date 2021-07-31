package org.tonylin.practice.guice.assisted;

import com.google.inject.ImplementedBy;

@ImplementedBy(CreditCardPaymentService.class)
public interface PaymentService {
	void pay();
}
