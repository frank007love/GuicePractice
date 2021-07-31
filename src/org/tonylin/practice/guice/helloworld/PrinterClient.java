package org.tonylin.practice.guice.helloworld;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Scope;

public class PrinterClient {

	@Inject
	private IPrintService mPrintService = null;
	
	
	@Inject
	public void setPrintService(IPrintService aPrintService){
		mPrintService = aPrintService;
	}
	
	public IPrintService getPrintService(){
		return mPrintService;
	}
	
	public void print(String ... strs){
		mPrintService.print(strs);
	}
	
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new ConsolePrinterModule());
		PrinterClient printerClient1 = injector.getInstance(PrinterClient.class);
		printerClient1.print("test1", "test2");
	}

}
