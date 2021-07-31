package org.tonylin.practice.guice.provider;

import javax.inject.Singleton;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class PrinterClient {
	@Inject
	private IPrintService mPrinterService;
	
	public void print(String ... strs){
		mPrinterService.print(strs);
	}
	
	public IPrintService getPrintService(){
		return mPrinterService;
	}

	public static void main(String[] args) {
		System.setProperty("print_mode", "window");
		Injector injector = Guice.createInjector(new PrinterModule());
		
		injector.getInstance(PrinterClient.class).print("test1", "test2");
		
		System.out.println( injector.getInstance(PrinterClient.class).getPrintService() ==
				injector.getInstance(PrinterClient.class).getPrintService());
		
		//
	}

}
