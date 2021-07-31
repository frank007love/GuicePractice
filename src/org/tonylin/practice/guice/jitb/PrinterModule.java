package org.tonylin.practice.guice.jitb;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class PrinterModule implements Module {
	@Override
	public void configure(Binder binder) {
		binder.bind(IPrintService.class).to(ConsolePrinter.class);
	}
}
