package org.tonylin.practice.guice.aop;

public class CreditCardUtil {

	static public void verify(CreditCard creditCard) throws CreditCardException {
		String number = creditCard.getNumber();
		if( number.length() != 24 ){
			throw new CreditCardException("Number format is incorrect.");
		}
	}
	
}
