package org.tonylin.practice.guice.provider;

import com.google.inject.Provider;


public class PrinterServiceProvider implements Provider<IPrintService> {

	@Override
	public IPrintService get() {
		String mode = System.getProperty("print_mode");
		if( mode != null && mode.equals("window") )
			return new WindowPrinter();
		return new ConsolePrinter();
	}
}

