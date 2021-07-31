package org.tonylin.practice.guice.helloworld;

import com.google.inject.Binder;
import com.google.inject.Module;

public class ConsolePrinterModule implements Module {
	@Override
	public void configure(Binder binder) {
		binder.bind(IPrintService.class).to(ConsolePrinter.class);
	}
}

