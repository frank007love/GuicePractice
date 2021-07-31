package org.tonylin.practice.guice.provider;

import com.google.inject.Singleton;

public class WindowPrinter implements IPrintService {

	@Override
	public void print(String... strs) {
		System.out.println("Window printer:");
		for( String str : strs ){
			System.out.println(str);
		}
	}
}
