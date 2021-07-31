package org.tonylin.practice.guice.annotated;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GameCenter {

	public static void main(String[] args) {
		Injector container = Guice.createInjector(new PlayerModule());
		Battle battle = container.getInstance(Battle.class);
		System.out.println(battle.getPlayer());
		System.out.println(battle.getCompetitor());
	}

}
