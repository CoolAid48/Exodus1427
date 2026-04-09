package com.moulberry.exodus1427;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exodus1427 implements ModInitializer {
	public static final String MOD_ID = "exodus1427";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Exodus 14:27: And Moses stretched forth his hand over the sea, and the sea returned to his strength when the morning appeared");
        LOGGER.info("(Sea level set to 63 in superflat worlds)");
	}
}