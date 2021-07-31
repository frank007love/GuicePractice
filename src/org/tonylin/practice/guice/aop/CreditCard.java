package org.tonylin.practice.guice.aop;

public class CreditCard {
	private String mNumber;
	
	public CreditCard(String number){
		mNumber = number;
	}
	
	public String getNumber(){
		return mNumber;
	}
}
