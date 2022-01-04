package dev.norska.tl.inner;

import java.util.List;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import lombok.Setter;

public class TreasureLocatorItem {
	
	@Getter @Setter private String typeName, duringSearchParticleEffect, onFinishParticleEffect;
	
	@Getter @Setter private int radius, visibility, detectionSpeed, duringSearchParticleAmount, onFinishParticleAmount, hologramUpdateLine, removeAfter, cooldown;
	
	@Getter @Setter private List<String> detects, hologramLayout;
	
	@Getter @Setter private ItemStack item;

	@Getter @Setter private Double hologramX, hologramY, hologramZ;
	
	@Getter @Setter private Boolean dropIfNothingFound;
	
}
