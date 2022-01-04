package dev.norska.tl;

import org.bukkit.plugin.java.JavaPlugin;

public class TreasureLocator extends JavaPlugin{
	
	private static TreasureLocator instance;
	
	 public TreasureLocator() {
	     instance = this;
	 }

	 public static TreasureLocator getInstance() {
	     return instance;
	 }
    
}
