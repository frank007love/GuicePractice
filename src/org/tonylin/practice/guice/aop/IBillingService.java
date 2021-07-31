package org.tonylin.practice.guice.aop;

public interface IBillingService {
	IChargeResult charge(String amount, CreditCard creditCard);
}
