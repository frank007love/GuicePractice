package org.tonylin.practice.guice.helloworld;


public class ConsolePrinter implements IPrintService {

	@Override
	public void print(String... strs) {
		for( String str : strs ){
			System.out.println(str);
		}
	}
}
