package dev.norska.tl.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import dev.norska.tl.inner.TreasureLocatorItem;

public class TreasureLocatorUseEvent extends Event implements Cancellable{

    private final Player player;
    private final TreasureLocatorItem treasureLocator;
    private boolean isCancelled;

    public TreasureLocatorUseEvent(Player player, TreasureLocatorItem treasureLocator) {
        this.player = player;
        this.treasureLocator = treasureLocator;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public TreasureLocatorItem getTreasureLocator() {
        return this.treasureLocator;
    }

}
