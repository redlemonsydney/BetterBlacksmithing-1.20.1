package net.redlemon.better_blacksmithing;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBlacksmithing implements ModInitializer {
	public static final String MOD_ID = "better_blacksmithing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Better Blacksmithing");
	}
}