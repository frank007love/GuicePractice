package org.tonylin.practice.guice.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CreditCardInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		CreditCard creditCard = getCreditCardArgument(arg0.getArguments());
		verify(creditCard);
		return arg0.proceed();
	}
	
	private CreditCard getCreditCardArgument(Object[] objects){
		for( Object object : objects ){
			if( object instanceof CreditCard )
				return (CreditCard)object;
		}
		return null;
	}
	
	private void verify(CreditCard creditCard) throws Throwable {
		CreditCardUtil.verify(creditCard);
	}
}
