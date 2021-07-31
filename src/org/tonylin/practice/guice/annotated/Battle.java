package org.tonylin.practice.guice.annotated;

import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Battle {

	static final String PLAYER_ME = "PLAYER_ME";
	static final String PLAYER_COMPETITOR = "PLAYER_COMPETITOR";
	
	@Inject @Named(Battle.PLAYER_ME)
	private IPlayer mMe = null;
	
	@Inject @Named(Battle.PLAYER_COMPETITOR)
	private IPlayer mCompetitor = null; 
	
	public IPlayer getPlayer(){
		return mMe;
	}
	
	public IPlayer getCompetitor(){
		return mCompetitor;
	}
}


