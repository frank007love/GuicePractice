package org.tonylin.practice.guice.jitb;

import com.google.inject.ImplementedBy;
import com.google.inject.Singleton;

@ImplementedBy(ConsolePrinter.class)
public interface IPrintService {
	void print(String ... strs);
}

