package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;


import java.util.List;

public class ModRingItem extends TrinketItem {


    public ModRingItem(Settings settings) {
        super(settings);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:1")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_1"));
            } else if (stack.getNbt().toString().contains("quality:2")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_2"));
            } else if (stack.getNbt().toString().contains("quality:3")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_3"));
            } else if (stack.getNbt().toString().contains("quality:4")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_4"));
            } else if (stack.getNbt().toString().contains("quality:5")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_5"));
            } else {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.qualityerror"));
            }
        }
    }
}
