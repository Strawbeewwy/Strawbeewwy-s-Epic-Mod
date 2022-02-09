package net.strawbeewwy.strawbeewwysepicmod.painting;

import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicMod;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingMotive MARATHON = registerPainting("marathon", new PaintingMotive(16, 16));
    public static final PaintingMotive FAMILY = registerPainting("family", new PaintingMotive(16, 32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(StrawbeewwysEpicMod.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        StrawbeewwysEpicMod.LOGGER.info("Registering Paintings for " + StrawbeewwysEpicMod.MOD_ID);
    }
}
