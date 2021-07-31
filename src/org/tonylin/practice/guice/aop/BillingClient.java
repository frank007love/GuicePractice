package org.tonylin.practice.guice.aop;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BillingClient {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BillingModule());
		BillingService billingService = injector.getInstance(BillingService.class);
		billingService.charge("1000", new CreditCard("1234-5678-6666-0001-5555"));
		try {
			billingService.charge("1000", new CreditCard("1234-5678-6666-0001"));
		} catch( Throwable e ){
			e.printStackTrace();
		}
	}
}
