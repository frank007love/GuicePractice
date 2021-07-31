package org.tonylin.practice.guice.assisted;

import java.util.Date;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.assistedinject.FactoryProvider;

public class PaymentClient {

	@Inject
	private PaymentFactory factroy = null;
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				bind(PaymentService.class).to(CreditCardPaymentService.class);
				install(new FactoryModuleBuilder().implement( 
						Payment.class, RealPayment.class).build(PaymentFactory.class));

			}
		});
		PaymentFactory paymentFactory = injector.getInstance(PaymentFactory.class);
		Payment payment = paymentFactory.create(new Date());
		payment.pay();
	}

}
