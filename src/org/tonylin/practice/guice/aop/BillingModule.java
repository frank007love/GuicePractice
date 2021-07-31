package org.tonylin.practice.guice.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class BillingModule extends AbstractModule {
	@Override
	protected void configure() {
		bindInterceptor(Matchers.any(),
				Matchers.annotatedWith(ValidCreditCard.class), 
				new CreditCardInterceptor());
	}
}

