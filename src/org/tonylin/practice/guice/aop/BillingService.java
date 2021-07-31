package org.tonylin.practice.guice.aop;

public class BillingService implements IBillingService {
	@Override
	@ValidCreditCard
	public IChargeResult charge(String amount, CreditCard creditCard) {
		
		return null;
	}
}

