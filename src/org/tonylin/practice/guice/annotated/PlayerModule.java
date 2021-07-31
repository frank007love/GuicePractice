package org.tonylin.practice.guice.annotated;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

public class PlayerModule implements Module {

	@Override
	public void configure(Binder aBinder) {
		aBinder.bind(IPlayer.class).annotatedWith(Names.named(Battle.PLAYER_ME))
			.to(RealPlayer.class);
		aBinder.bind(IPlayer.class).annotatedWith(Names.named(Battle.PLAYER_COMPETITOR))
			.to(Computer.class);
	}
}
