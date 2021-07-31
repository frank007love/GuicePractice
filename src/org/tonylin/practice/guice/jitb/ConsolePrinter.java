package org.tonylin.practice.guice.jitb;

import com.google.inject.Singleton;

@Singleton
public class ConsolePrinter implements IPrintService {

	@Override
	public void print(String... strs) {
		System.out.println("Console printer:");
		for( String str : strs ){
			System.out.println(str);
		}
	}
}
