package org.tonylin.practice.guice.assisted;

import java.util.Date;

public interface PaymentFactory {
	Payment create(Date date);
}
