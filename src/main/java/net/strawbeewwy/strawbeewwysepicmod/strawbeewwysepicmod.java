package net.strawbeewwy.strawbeewwysepicmod;

import net.fabricmc.api.ModInitializer;
import net.strawbeewwy.strawbeewwysepicmod.block.ModBlocks;
import net.strawbeewwy.strawbeewwysepicmod.item.ModItems;
import net.strawbeewwy.strawbeewwysepicmod.painting.ModPaintings;
import net.strawbeewwy.strawbeewwysepicmod.util.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class strawbeewwysepicmod implements ModInitializer {
	public static final String MOD_ID = "strawbeewwysepicmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();

		ModRegistries.registerModStuffs();

	}
}
