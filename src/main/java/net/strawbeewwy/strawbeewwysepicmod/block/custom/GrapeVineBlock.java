package net.strawbeewwy.strawbeewwysepicmod.block.custom;

import net.strawbeewwy.strawbeewwysepicmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class GrapeVineBlock extends CropBlock {
    public GrapeVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GRAPE_SEEDS;
    }
}
