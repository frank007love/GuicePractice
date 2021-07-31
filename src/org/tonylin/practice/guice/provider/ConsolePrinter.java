package org.tonylin.practice.guice.provider;

import com.google.inject.Singleton;

public class ConsolePrinter implements IPrintService {

	@Override
	public void print(String... strs) {
		System.out.println("Console printer:");
		for( String str : strs ){
			System.out.println(str);
		}
	}
}
