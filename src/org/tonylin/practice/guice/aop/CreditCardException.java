package org.tonylin.practice.guice.aop;

public class CreditCardException extends Exception {
	private static final long serialVersionUID = 8594560974798365695L;

	public CreditCardException(String msg){
		super(msg);
	}
}
