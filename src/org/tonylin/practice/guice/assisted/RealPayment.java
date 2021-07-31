package org.tonylin.practice.guice.assisted;

import java.util.Date;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class RealPayment implements Payment {
	private PaymentService mService = null;
	private Date mDate = null;
	
	@Inject
	public RealPayment(PaymentService service, @Assisted Date date){
		mService = service;
		mDate = date;
	}

	@Override
	public void pay() {
		System.out.println(mDate);
		mService.pay();
	}
	
}
