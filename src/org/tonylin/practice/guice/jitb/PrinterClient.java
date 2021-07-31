package org.tonylin.practice.guice.jitb;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class PrinterClient {
	@Inject
	private IPrintService mPrintService = null;
	
	@Inject
	public PrinterClient(IPrintService aPrintService){
		
	}
	
	@Inject
	public void setPrintService(IPrintService aPrintService){
		mPrintService = aPrintService;
	}
	
	public void print(String ... strs){
		mPrintService.print(strs);
	}
	
	public IPrintService getPrintService(){
		return mPrintService;
	}

	
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new PrinterModule());
		
		injector.getInstance(PrinterClient.class).print("test1", "test2");
		
		System.out.println( injector.getInstance(PrinterClient.class).getPrintService() ==
				injector.getInstance(PrinterClient.class).getPrintService());
		
		Injector childInjector = injector.createChildInjector(new Module() {
			@Override
			public void configure(Binder arg0) {
				// Conflict with PrinterModule.
				//arg0.bind(IPrintService.class).to(WindowPrinter.class);
				
			}
		});
		
		//injector.createChildInjector(new PrinterModule());
		
		System.out.println( injector.getInstance(PrinterClient.class).getPrintService() ==
				childInjector.getInstance(PrinterClient.class).getPrintService());
		
		//System.out.println( Guice.createInjector(new PrinterModule()).getInstance(PrinterClient.class).getPrintService() ==
		//				Guice.createInjector(new PrinterModule()).getInstance(PrinterClient.class).getPrintService());
	}

}
