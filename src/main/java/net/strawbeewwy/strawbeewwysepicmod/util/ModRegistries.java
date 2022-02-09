package net.strawbeewwy.strawbeewwysepicmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicMod;
import net.strawbeewwy.strawbeewwysepicmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        StrawbeewwysEpicMod.LOGGER.info("Registering Fuels for " + StrawbeewwysEpicMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }
}
