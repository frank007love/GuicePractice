package org.tonylin.practice.guice.provider;

import com.google.inject.ImplementedBy;
import com.google.inject.ProvidedBy;

@ImplementedBy(ConsolePrinter.class)

@ProvidedBy(PrinterServiceProvider.class)
public interface IPrintService {
	void print(String ... strs);
}

