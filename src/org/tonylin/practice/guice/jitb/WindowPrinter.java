package org.tonylin.practice.guice.jitb;

public class WindowPrinter implements IPrintService {

	@Override
	public void print(String... strs) {
		System.out.println("Console printer:");
		for( String str : strs ){
			System.out.println(str);
		}
	}
}
