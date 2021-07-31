package org.tonylin.practice.guice.provider;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class PrinterModule implements Module {
	
	@Override
	public void configure(Binder binder) {
		binder.bind(IPrintService.class).toProvider(PrinterServiceProvider.class);
	}
}



//@Override
//public void configure(Binder binder) {
//	binder.bind(IPrintService.class).toProvider(PrinterServiceProvider.class).
//	in(Singleton.class);
//}


