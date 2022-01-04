package dev.norska.tl.api;

import org.bukkit.inventory.ItemStack;

import dev.norska.tl.TreasureLocator;
import dev.norska.tl.inner.TreasureLocatorItem;

public class TreasureLocatorAPI {
	
	/** 
	* Check if an ItemStack is a Treasure Locator Item.
	* @param ItemStack
	* @return Boolean
	*/
	
	public static Boolean isTreasureLocatorItem(ItemStack itemstack) {
		return null;
	}
	
	/** 
	* Get a Treasure Locator Item and access it's settings (should be checked with #isTreasureLocatorItem first).
	* You can get the instance of TreasureLocator with TreasureLocator.getInstance();.
	* @param TreasureLocator Instance, ItemStack
	* @return TreasureLocatorItem
	*/
	
	public static TreasureLocatorItem getTreasureLocatorItem(TreasureLocator instance, String identifier) {
		return null;
	}
	
	/** 
	* Get the identifier of a Treasure Locator Item (should be checked with #isTreasureLocatorItem first).
	* @param ItemStack
	* @return String
	*/
	
	public static String getTreasureLocatorIdentifier(ItemStack itemstack) {
		return null;
	}
}
