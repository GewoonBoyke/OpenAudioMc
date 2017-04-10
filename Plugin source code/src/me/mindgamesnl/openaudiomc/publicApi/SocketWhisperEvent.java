package me.mindgamesnl.openaudiomc.publicApi;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SocketWhisperEvent extends Event {

	Player p;
	String data;
	
	public SocketWhisperEvent(Player player, String eventData) {
		this.p = player;
		this.data = eventData;
	}
	

	public Player getPlayer() {
		return p;
	}
	
	public String getData() {
		return data;
	}
	
	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
	    return handlers;
	}

	public static HandlerList getHandlerList() {
	    return handlers;
	}
	
}